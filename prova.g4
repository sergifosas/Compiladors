grammar prova;

@header {
    import java.io.*;
    import java.util.Vector;
}

@parser::members{
    SymTable<Registre> TS = new SymTable<>(1000);
    boolean errorSemantico = false;
    Bytecode x;
    Long saltLinia;

    public void notifyErrorListeners(Token offendingToken, String msg) {
        super.notifyErrorListeners(offendingToken, msg, null);
        errorSemantico = true;
    }
}

inici : programa;

// Regla d'inici del programa
programa
    @init {

        x=new Bytecode("compilat");
        saltLinia=x.addConstant("S","\n");
        Vector<Long> trad = new Vector<Long>(10);
    }
    : bloc_tipus? bloc_funcions? PROGRAM ID bloc_variables? bloc_sentencies+ END_PROGRAM
    {    if (!errorSemantico) {
             trad.add(x.RETURN);
             x.addMainCode(10L,10L,trad);
             x.write();
         }
    };

// Bloc de declaració de tipus
bloc_tipus returns [Vector<Long> trad]
    @init {
	    $trad=new Vector<Long>(100);
    }
    : TYPE declaracio_tipus+ END_TYPE;

declaracio_tipus returns [Vector<Long> trad]
    @init {
	    $trad=new Vector<Long>(100);
    }
: ID COLON (VECTOR tipus_basic COLON NUMBER SEMICOLON |
                             TUPLE LBRACKET camp (COMMA camp)* RBRACKET END_TUPLE);

camp returns [Vector<Long> trad]
    @init {
 	    $trad=new Vector<Long>(100);
     }
 : ID COLON tipus_basic;

// Bloc de declaració de variables
bloc_variables : VAR declaracio_variable* END_VAR;

declaracio_variable
    : ID COLON (tipus_basic | ID) SEMICOLON
    {
        char tipusChar = '?'; // Valor por defecto
        if ($tipus_basic.text != null) {
            switch ($tipus_basic.text) {
                case "enter": tipusChar = 'I'; break;
                case "real": tipusChar = 'R'; break;
                case "boolea": tipusChar = 'B'; break;
                default: tipusChar = '?'; break;
            }
        } else if ($ID.text != null) {
            // Si es un ID, asumimos que es un tipo definido por el usuario
            tipusChar = 'U';
        }

        if (!TS.existeix($ID.text)) {
            TS.inserir($ID.text, new Registre($ID.text, tipusChar));
            System.out.println("DEBUG: Declaració -> " + $ID.text + " és de tipus " + tipusChar);
        } else {
            System.out.println("Error: Variable " + $ID.text + " ja declarada.");
            errorSemantico = true;
        }
    };


// Bloc de declaració d'accions i funcions
bloc_funcions : (accio | funcio)+;

accio returns [Vector<Long> trad]
    @init {
	    $trad=new Vector<Long>(100);
    }
    : ACTION id=ID LPAREN parametres? RPAREN bloc_variables? bloc_sentencies END_ACTION
    {
    if (TS.existeix($id.text)) {
                notifyErrorListeners($id, "Nom  utilitzat.");
            } else {
                TS.inserir($id.text, new Registre("funcio", 'V'));
            }
    };

funcio returns [Vector<Long> trad]
    @init {
	    $trad=new Vector<Long>(100);
    }
    : FUNC id=ID LPAREN parametres? RPAREN RETURN tipus_basic
         bloc_variables? bloc_sentencies
         RETURN expr tipus_basic SEMICOLON END_FUNC {

    if (TS.existeix($id.text)) {
          notifyErrorListeners($id, "Error: Nom ja utilitzat.", null);
    } else {
    TS.inserir($id.text, new Registre("funcio", $tipus_basic.text.charAt(0)));
    }
};

parametres returns [Vector<Long> trad]
    @init {
	    $trad=new Vector<Long>(100);
    }
    : parametre (COMMA parametre)*;

parametre returns [Vector<Long> trad]
        @init {
    	    $trad=new Vector<Long>(100);
        }
     : (ENT | ENTSOR)? ID COLON tipus_basic;

// Bloc de sentències
bloc_sentencies returns [Vector<Long> trad]
    @init {
        $trad=new Vector<Long>(100);
    }: (sentencia)+;

sentencia returns [Vector<Long> trad]
@init {
	    $trad=new Vector<Long>(100);
    }
          : assignacio SEMICOLON
          {
            $trad = $assignacio.trad;
          }
          | condicional{
            $trad = $condicional.trad;
          }
          | bucle_mentre{
            $trad = $bucle_mentre.trad;
          }
          | bucle_per {
            $trad = $bucle_per.trad;
           }
          | crida_accio SEMICOLON { $trad = $crida_accio.trad;}
          | crida_funcio SEMICOLON {$trad = $crida_funcio.trad;}
          | instruccio_io SEMICOLON {$trad = $instruccio_io.trad;};

// Assignació
// Assignació
assignacio returns [Vector<Long> trad]
@init {
    $trad = new Vector<Long>(100);
}
: id=ID ASSIGN expr {
    if (!TS.existeix($id.text)) {
        // Si la variable no existeix, la declarem automàticament
        TS.inserir($id.text, new Registre($id.text, $expr.tipus));
        System.out.println("DEBUG: Primera assignació -> " + $id.text + " és de tipus " + $expr.tipus);
    }

    Registre r = TS.obtenir($id.text);

    if (r == null) {
        System.out.println("Error: Variable " + $id.text + " no declarada.");
        errorSemantico = true;
    } else {
        char tipusVar = r.getTipus();
        char tipusExpr = $expr.tipus;

        System.out.println("DEBUG: Assignació -> " + $id.text + " (" + tipusVar + ") := " + $expr.text + " (" + tipusExpr + ")");

        if (tipusExpr == 'R' && tipusVar == 'I') {
            System.out.println("Error: No es pot assignar un real (" + $expr.text + ") a la variable " + $id.text + " de tipus enter.");
            errorSemantico = true;
        }
        else if (tipusExpr != tipusVar && !(tipusExpr == 'I' && tipusVar == 'R')) {
            System.out.println("Error: Tipus incompatibles en l'assignació. No es pot assignar " + tipusExpr + " a " + tipusVar);
            errorSemantico = true;
        } else {

            $trad = $expr.trad;

            if (tipusVar == 'R') {
                $trad.add(x.FSTORE);
            } else if (tipusVar == 'I' || tipusVar == 'B') {
                $trad.add(x.ISTORE);
            }

            $trad.add(new Long(r.getAdreca()));
        }
    }
}
;


expr_booleana returns [char tipus, Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
	Vector<Long> trad2 = new Vector<Long>(100);
	Vector<Long> tradAlt = new Vector<Long>(100);
	Vector<Vector<Long>> vectorSentencies = new Vector<>();
	Vector<Long> exprAlt = new Vector<Long>(100);
	Vector<Long> tradEnd = new Vector<Long>(100);
    }

    : NOT e=expr_booleana
      {
        if ($e.tipus != 'B') {
            System.out.println("Error: NOT només s'aplica a booleans, trobat '" + $e.tipus + "'.");
            errorSemantico = true;
        } else {
            $tipus = 'B';
        }
      }

    | eb1=expr_booleana op=(EQ | NEQ) eb2=expr_booleana
      {
        if ($eb1.tipus != 'B' || $eb2.tipus != 'B') {
            System.out.println("Error: EQ i NEQ només s'apliquen a booleans, però s'ha trobat '" + $eb1.tipus + "' i '" + $eb2.tipus + "'.");
            errorSemantico = true;
        } else {
            $tipus = 'B';
        }
      }

    | e1=expr op=(EQ | NEQ | LT | LEQ | GT | GEQ) e2=expr
      {
        if ($e1.tipus != 'I' || $e2.tipus != 'I') {
            System.out.println("Error: Comparació numèrica només per a enters, però s'ha trobat '" + $e1.tipus + "' i '" + $e2.tipus + "'.");
            errorSemantico = true;
        } else {
            $tipus = 'B';
        }
      }

    | eb1=expr_booleana op=(AND | OR) eb2=expr_booleana
      {
        if ($eb1.tipus != 'B' || $eb2.tipus != 'B') {
            System.out.println("Error: AND i OR només s'apliquen a booleans, però s'ha trobat '" + $eb1.tipus + "' i '" + $eb2.tipus + "'.");
            errorSemantico = true;
        } else {
            $tipus = 'B';
        }
      }

    | LPAREN e=expr_booleana RPAREN
      {
        $tipus = $e.tipus;
      }

    | BOOLEAN_LITERAL
      {
        $tipus = 'B';
      }

    | f=crida_funcio
      {
        if ($f.tipus != 'B') {
            System.out.println("Error: La funció '" + $f.text + "' ha de retornar un valor booleà.");
            errorSemantico = true;
        } else {
            $tipus = 'B';
        }
      }

    | id=ID
      {
        //$tipus = obtenirTipus($id.text);
        //if ($tipus != 'B') {
        //    System.out.println("Error: La variable '" + $id.text + "' ha de ser booleana.");
        //    errorSemantico = true;
        //}
      }
;

expr returns [char tipus, Vector<Long> trad]
    : NEG e=expr {
        if ($e.tipus != 'I' && $e.tipus != 'R') {
            System.out.println("Error: L'operació de negació només s'aplica a enters o reals.");
            errorSemantico = true;
        }
        $tipus = $e.tipus;
    }
    | e1=expr op=(MULT | DIV | INT_DIV | MOD) e2=expr  {
        if (($e1.tipus == 'I' || $e1.tipus == 'R') && ($e2.tipus == 'I' || $e2.tipus == 'R')) {
            $tipus = ($e1.tipus == 'R' || $e2.tipus == 'R') ? 'R' : 'I';
        } else {
            System.out.println("Error: Operació no vàlida entre tipus diferents.");
            errorSemantico = true;
        }
    }
    | e1=expr op=(PLUS | MINUS) e2=expr {
        if ($e1.tipus != $e2.tipus && !($e1.tipus == 'I' && $e2.tipus == 'R') && !($e1.tipus == 'R' && $e2.tipus == 'I')) {
            System.out.println("Error: No es poden sumar o restar tipus diferents.");
            errorSemantico = true;
        }
        $tipus = ($e1.tipus == 'R' || $e2.tipus == 'R') ? 'R' : 'I';
    }
    | LPAREN e=expr RPAREN  { $tipus = $e.tipus; }
    | ID  {
        if (!TS.existeix($ID.text)) {
            System.out.println("Error: Variable no declarada.");
            errorSemantico = true;
        } else {
            Registre r = TS.obtenir($ID.text);
            $tipus = r.tipus;
        }
    }
    | NUMBER{ $tipus = 'I'; }
    | REAL_NUMBER{ $tipus = 'R'; }
    | crida_funcio{ $tipus = 'R'; }
    | vector_access { $tipus = 'I'; }
    | tuple_access  { $tipus = 'I'; }
    | STRING { $tipus = 'S'; }
    ;

// Accés a vectors
vector_access : ID LBRACKET expr RBRACKET;

// Accés a tuples
tuple_access : ID DOT ID;

// Crida a funció
crida_funcio returns [char tipus, Vector<Long> trad]
    : ID LPAREN (expr (COMMA expr)*)? RPAREN {
        // Aquí hauries d'assignar el tipus en funció de la funció cridada
        //$tipus = $ID.getTipus();
    }
;

// Condicional
condicional returns [Vector<Long> trad]
@init {
    $trad = new Vector<Long>(100);
    Vector<Long> tradCondicio = new Vector<Long>(100);
    Vector<Vector<Long>> vectorSentencies = new Vector<>();
    Vector<Long> tradFinal = new Vector<Long>(100);
}
: IF cond=expr_booleana THEN (s1=bloc_sentencies {tradCondicio.addAll($s1.trad);})*
  (ELSEIF cond2+=expr_booleana THEN (s2=bloc_sentencies {Vector<Long> subVector = new Vector<>(); subVector.addAll($s2.trad); vectorSentencies.add(subVector);})*)*
  (ELSE (s3=bloc_sentencies {tradFinal.addAll($s3.trad);})*)? ENDIF
{

    if ($cond.tipus != 'B') {
        System.out.println("Error: La condició de l'IF ha de ser booleana, però s'ha trobat '" + $cond.tipus + "'.");
        errorSemantico = true;
    }

    for (ExprContext ctx : $cond2) {
        if (ctx.tipus != 'B') {
            System.out.println("Error: La condició d'un ELSEIF ha de ser booleana, però s'ha trobat '" + ctx.tipus + "'.");
            errorSemantico = true;
        }
    }

    // Càlcul de salts
    Long distFinal = 0L;
    for (int i = 0; i < vectorSentencies.size(); i++) {
        distFinal += vectorSentencies.get(i).size() + 3L;
        distFinal += $cond2.get(i).trad.size();
    }

    // Generació de codi intermitg IF
    $trad = $cond.trad;
    $trad.add(x.IFEQ);
    Long salt = tradCondicio.size() + 6L;
    $trad.add(x.nByte(salt, 2));
    $trad.add(x.nByte(salt, 1));

    $trad.addAll(tradCondicio);

    // Processament ELSEIF
    for (int i = 0; i < $cond2.size(); i++) {
        $trad.add(x.GOTO);
        salt = distFinal + (3L * ($cond2.size() - i));
        $trad.add(x.nByte(salt, 2));
        $trad.add(x.nByte(salt, 1));

        $trad.addAll($cond2.get(i).trad);
        $trad.add(x.IFEQ);
        salt = vectorSentencies.get(i).size() + 6L;
        $trad.add(x.nByte(salt, 2));
        $trad.add(x.nByte(salt, 1));

        $trad.addAll(vectorSentencies.get(i));

        distFinal -= 3 + vectorSentencies.get(i).size() + $cond2.get(i).trad.size();
    }

    // GOTO final per a ELSE
    $trad.add(x.GOTO);
    salt = tradFinal.size() + 3L;
    $trad.add(x.nByte(salt, 2));
    $trad.add(x.nByte(salt, 1));

    $trad.addAll(tradFinal);
}
;


// Bucle
bucle_mentre returns [Vector<Long> trad]
@init {
    $trad = new Vector<Long>(100);
    Vector<Long> tradSentencies = new Vector<Long>(100);
}
: WHILE cond=expr_booleana DO (sent=bloc_sentencies {tradSentencies.addAll($sent.trad);})+ END_WHILE
{
    // Validació de tipus: la condició ha de ser booleana
    if ($cond.tipus != 'B') {
        System.out.println("Error: La condició del WHILE ha de ser booleana, però s'ha trobat '" + $cond.tipus + "'.");
        errorSemantico = true;
    } else {

        Long iniciBucle = (long) $trad.size();

        // condició while
        $trad.addAll($cond.trad);
        $trad.add(x.IFEQ);

        // Calcula el salt -> condició és falsa
        Long saltSortida = tradSentencies.size() + 6L;
        $trad.add(x.nByte(saltSortida, 2));
        $trad.add(x.nByte(saltSortida, 1));


        $trad.addAll(tradSentencies);

        // GOTO sortida bucle
        Long saltInici = 0L - $trad.size();
        $trad.add(x.GOTO);
        $trad.add(x.nByte(saltInici, 2));
        $trad.add(x.nByte(saltInici, 1));
    }
};


number returns [char tipus]
    : n=NUMBER { $tipus = 'I'; }
;

// Bucle per (for)
bucle_per returns [Vector<Long> trad]
@init {
    $trad = new Vector<Long>(100);
    Vector<Long> tradSentencies = new Vector<Long>(100);
}
: FOR id=ID IN RANG LPAREN num1=number (COMMA num2=number)? RPAREN DO (s=bloc_sentencies {tradSentencies.addAll($s.trad);})* END_FOR
{
    // Validació de tipus dels límits del bucle
    if ($num1.tipus != 'I' || ($num2.text != null && $num2.tipus != 'I')) {
        System.out.println("Error: Els límits del FOR han de ser enters.");
        errorSemantico = true;
    } else if (!TS.existeix($id.text)) {
        System.out.println("Error: Variable '" + $id.text + "' no declarada.");
        notifyErrorListeners($id, "Error: Variable '" + $id.text + "' no declarada.", null);
    } else {
        Registre r = TS.obtenir($id.text);

        if (r.getTipus() != 'I') {
            notifyErrorListeners($id, "Error: La variable '" + $id.text + "' ha de ser de tipus enter.", null);
        } else {
            // Init variable del for
            Long adrecaTemp = x.addConstant("I", $num1.text);
            $trad.add(x.LDC_W);
            $trad.add(x.nByte(adrecaTemp, 2));
            $trad.add(x.nByte(adrecaTemp, 1));
            $trad.add(x.ISTORE);
            $trad.add(new Long(r.getAdreca()));


            Long iniciBucle = (long) $trad.size();

            // carrega i superior
            $trad.add(x.ILOAD);
            $trad.add(new Long(r.getAdreca()));

            adrecaTemp = x.addConstant("I", $num2.text != null ? $num2.text : "1");
            $trad.add(x.LDC_W);
            $trad.add(x.nByte(adrecaTemp, 2));
            $trad.add(x.nByte(adrecaTemp, 1));

            // Comparació
            $trad.add(x.IF_ICMPGE);
            Long saltSortida = tradSentencies.size() + 6L;
            $trad.add(x.nByte(saltSortida, 2));
            $trad.add(x.nByte(saltSortida, 1));

            $trad.addAll(tradSentencies);

            // Increment de la variable
            $trad.add(x.ILOAD);
            $trad.add(new Long(r.getAdreca()));

            adrecaTemp = x.addConstant("I", "1");
            $trad.add(x.LDC_W);
            $trad.add(x.nByte(adrecaTemp, 2));
            $trad.add(x.nByte(adrecaTemp, 1));

            $trad.add(x.IADD);
            $trad.add(x.ISTORE);
            $trad.add(new Long(r.getAdreca()));

            // Tornar a inici
            Long saltInici = 0L - ($trad.size() - iniciBucle);
            $trad.add(x.GOTO);
            $trad.add(x.nByte(saltInici, 2));
            $trad.add(x.nByte(saltInici, 1));
        }
    }
};


// Crida a acció
crida_accio returns [Vector<Long> trad]
    : ID LPAREN (expr (COMMA expr)*)? RPAREN;

// Instruccions d'entrada/sortida
// Instruccions d'entrada/sortida
instruccio_io returns [Vector<Long> trad]
@init {
    $trad = new Vector<Long>(100);
}
: READ LPAREN ID (COLON tipus_basic)?  RPAREN
{
    if (!TS.existeix($ID.text)) {
        System.out.println("Error: Variable '" + $ID.text + "' no declarada.");
        notifyErrorListeners($ID, "Error: Variable '" + $ID.text + "' no declarada.", null);
    } else {
        Registre r = TS.obtenir($ID.text);
        switch (r.getTipus()) {
            case 'R':
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mGetFloat,2));
                $trad.add(x.nByte(x.mGetFloat,1));
                $trad.add(x.FSTORE);
                $trad.add(new Long(r.getAdreca()));
                break;
            case 'I':
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mGetInt,2));
                $trad.add(x.nByte(x.mGetInt,1));
                $trad.add(x.ISTORE);
                $trad.add(new Long(r.getAdreca()));
                break;
            case 'B':
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mGetBoolean,2));
                $trad.add(x.nByte(x.mGetBoolean,1));
                $trad.add(x.ISTORE);
                $trad.add(new Long(r.getAdreca()));
                break;
        }
    }
}

// WRITE i WRITELN
| WRITE LPAREN e1=expr {
    $trad = $e1.trad;
    $trad.add(x.INVOKESTATIC);
    switch ($e1.tipus) {
        case 'R':
            $trad.add(x.nByte(x.mPutFloat,2));
            $trad.add(x.nByte(x.mPutFloat,1));
            break;
        case 'I':
            $trad.add(x.nByte(x.mPutInt,2));
            $trad.add(x.nByte(x.mPutInt,1));
            break;
        case 'B':
            $trad.add(x.nByte(x.mPutBoolean,2));
            $trad.add(x.nByte(x.mPutBoolean,1));
            break;
    }
}(COMMA e2=expr {
    $trad.addAll($e2.trad);
    $trad.add(x.INVOKESTATIC);
    switch ($e2.tipus) {
        case 'R':
            $trad.add(x.nByte(x.mPutFloat,2));
            $trad.add(x.nByte(x.mPutFloat,1));
            break;
        case 'I':
            $trad.add(x.nByte(x.mPutInt,2));
            $trad.add(x.nByte(x.mPutInt,1));
            break;
        case 'B':
            $trad.add(x.nByte(x.mPutBoolean,2));
            $trad.add(x.nByte(x.mPutBoolean,1));
            break;
    }
})* RPAREN

// WRITELN
| WRITELN LPAREN e1=expr {
    $trad = $e1.trad;
    $trad.add(x.INVOKESTATIC);
    switch ($e1.tipus) {
        case 'R':
            $trad.add(x.nByte(x.mPutFloat,2));
            $trad.add(x.nByte(x.mPutFloat,1));
            break;
        case 'I':
            $trad.add(x.nByte(x.mPutInt,2));
            $trad.add(x.nByte(x.mPutInt,1));
            break;
        case 'B':
            $trad.add(x.nByte(x.mPutBoolean,2));
            $trad.add(x.nByte(x.mPutBoolean,1));
            break;
    }
    // Afegim salt de línia
    Long saltLinia = x.addConstant("S", "\n");
    $trad.add(x.LDC_W);
    $trad.add(x.nByte(saltLinia,2));
    $trad.add(x.nByte(saltLinia,1));
    $trad.add(x.INVOKESTATIC);
    $trad.add(x.nByte(x.mPutString,2));
    $trad.add(x.nByte(x.mPutString,1));
}(COMMA e2=expr {
    $trad.addAll($e2.trad);
    $trad.add(x.INVOKESTATIC);
    switch ($e2.tipus) {
        case 'R':
            $trad.add(x.nByte(x.mPutFloat,2));
            $trad.add(x.nByte(x.mPutFloat,1));
            break;
        case 'I':
            $trad.add(x.nByte(x.mPutInt,2));
            $trad.add(x.nByte(x.mPutInt,1));
            break;
        case 'B':
            $trad.add(x.nByte(x.mPutBoolean,2));
            $trad.add(x.nByte(x.mPutBoolean,1));
            break;
    }
    // Salt de línia després de cada element
    $trad.add(x.LDC_W);
    $trad.add(x.nByte(saltLinia,2));
    $trad.add(x.nByte(saltLinia,1));
    $trad.add(x.INVOKESTATIC);
    $trad.add(x.nByte(x.mPutString,2));
    $trad.add(x.nByte(x.mPutString,1));
})* RPAREN;

// Tipus bàsics
tipus_basic : INTEGER | REAL | BOOLEAN;


// Paraules clau
PROGRAM: 'programa';
END_PROGRAM: 'fprograma';
TYPE: 'tipus';
END_TYPE: 'ftipus';
VAR: 'variables';
END_VAR: 'fvariables';
FUNC: 'funcio';
END_FUNC: 'ffuncio';
ACTION: 'accio';
END_ACTION: 'faccio';
IF: 'si';
THEN: 'llavors';
ELSEIF: 'altrasi';
ELSE: 'altrament';
ENDIF: 'fsi';
WHILE: 'mentre';
END_WHILE: 'fmentre';
FOR: 'per';
IN: 'en';
DO: 'fer';
END_FOR: 'fper';
READ: 'llegir';
WRITE: 'escriure';
WRITELN: 'escriureln';
RETURN: 'retorna';
BOOLEAN: 'boolea';
INTEGER: 'enter';
REAL: 'real';
VECTOR: 'vector';
TUPLE: 'tupla';
END_TUPLE: 'ftupla';
RANG: 'rang';
ENT: 'ent';
ENTSOR: 'entsor';

// Operadors i simbols
NEG: '~';
ASSIGN: ':=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
INT_DIV: '\\';
MOD: '%';
EQ: '==';
NEQ: '!=';
LT: '<';
LEQ: '<=';
GT: '>';
GEQ: '>=' ;
AND: '&';
OR: '|';
NOT: 'no';
DOT: '.';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';

// Identificadores i literals
ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9]+;
REAL_NUMBER: [0-9]+('.'[0-9]+)?([eE][-+]?[0-9]+)?;
BOOLEAN_LITERAL: 'cert' | 'fals';
STRING: '"' .*? '"';

// Espais i comentaris
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

