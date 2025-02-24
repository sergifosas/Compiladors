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
            tipusChar = 'U'; // 'U' para tipos definidos por el usuario
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
assignacio returns [Vector<Long> trad]
    @init 	{
	    $trad=new Vector<Long>(100);
    }
    : id=ID ASSIGN expr {
    if (!TS.existeix($id.text)) {

        TS.inserir($id.text, new Registre($id.text, $expr.tipus));
        System.out.println("DEBUG: Primera assignació -> " + $id.text + " és de tipus " + $expr.tipus);
    } else {
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
            }
        }
    }
};

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

// Condicional (corregit segons enunciat)
condicional returns [Vector<Long> trad]
    : IF cond=expr_booleana THEN bloc_sentencies
              (ELSEIF cond2=expr_booleana THEN bloc_sentencies)*
              (ELSE bloc_sentencies)?
              ENDIF {
    if ($cond.tipus != 'B') {
        System.out.println("Error: La condició de l'IF ha de ser booleana, però s'ha trobat '" + $cond.tipus + "'.");
        errorSemantico = true;
    }
   if ($cond2.tipus != null && $cond2.tipus != 'B') {
         System.out.println("Error: La condició d'un ELSEIF ha de ser booleana, però s'ha trobat '" + $cond2.tipus + "'.");
         errorSemantico = true;
    }
    };


// Bucles (corregits segons enunciat)
bucle_mentre returns [Vector<Long> trad]
    : WHILE cond=expr_booleana DO bloc_sentencies END_WHILE {
    if ($cond.tipus != 'B') {
        System.out.println("Error: La condició del WHILE ha de ser booleana, però s'ha trobat '" + $cond.tipus + "'.");
        errorSemantico = true;
    }
};

number returns [char tipus]
    : n=NUMBER { $tipus = 'I'; }
;

bucle_per returns [Vector<Long> trad]
    : FOR ID IN RANG LPAREN num1=number (COMMA num2=number)? RPAREN DO bloc_sentencies END_FOR {
    if ($num1.tipus != 'I' || ($num2.text != null && $num2.tipus != 'I')) {
        System.out.println("Error: Els límits del FOR han de ser enters");
        errorSemantico = true;
    }
};

// Crida a acció (com una funció)
crida_accio returns [Vector<Long> trad]
    : ID LPAREN (expr (COMMA expr)*)? RPAREN;

// Instruccions d'entrada/sortida (corregides)
instruccio_io returns [Vector<Long> trad]
    : READ LPAREN ID (COLON tipus_basic)? RPAREN
              | WRITE LPAREN expr (COMMA expr)* RPAREN
              | WRITELN LPAREN (expr (COMMA expr)*)? RPAREN ;

// Tipus bàsics
tipus_basic : INTEGER | REAL | BOOLEAN;


// Palabras clave
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

// Operadores y símbolos
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

// Identificadores y Literales
ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9]+;
REAL_NUMBER: [0-9]+('.'[0-9]+)?([eE][-+]?[0-9]+)?;
BOOLEAN_LITERAL: 'cert' | 'fals';
STRING: '"' .*? '"';

// Espacios y Comentarios
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

