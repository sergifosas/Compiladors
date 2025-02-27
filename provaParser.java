// Generated from prova.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.Vector;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class provaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, END_PROGRAM=2, TYPE=3, END_TYPE=4, VAR=5, END_VAR=6, FUNC=7, 
		END_FUNC=8, ACTION=9, END_ACTION=10, IF=11, THEN=12, ELSEIF=13, ELSE=14, 
		ENDIF=15, WHILE=16, END_WHILE=17, FOR=18, IN=19, DO=20, END_FOR=21, READ=22, 
		WRITE=23, WRITELN=24, RETURN=25, BOOLEAN=26, INTEGER=27, REAL=28, VECTOR=29, 
		TUPLE=30, END_TUPLE=31, RANG=32, ENT=33, ENTSOR=34, NEG=35, ASSIGN=36, 
		PLUS=37, MINUS=38, MULT=39, DIV=40, INT_DIV=41, MOD=42, EQ=43, NEQ=44, 
		LT=45, LEQ=46, GT=47, GEQ=48, AND=49, OR=50, NOT=51, DOT=52, COMMA=53, 
		SEMICOLON=54, COLON=55, LPAREN=56, RPAREN=57, LBRACKET=58, RBRACKET=59, 
		ID=60, NUMBER=61, REAL_NUMBER=62, BOOLEAN_LITERAL=63, STRING=64, WS=65, 
		LINE_COMMENT=66, BLOCK_COMMENT=67;
	public static final int
		RULE_inici = 0, RULE_programa = 1, RULE_bloc_tipus = 2, RULE_declaracio_tipus = 3, 
		RULE_camp = 4, RULE_bloc_variables = 5, RULE_declaracio_variable = 6, 
		RULE_bloc_funcions = 7, RULE_accio = 8, RULE_funcio = 9, RULE_parametres = 10, 
		RULE_parametre = 11, RULE_bloc_sentencies = 12, RULE_sentencia = 13, RULE_assignacio = 14, 
		RULE_expr_booleana = 15, RULE_expr = 16, RULE_vector_access = 17, RULE_tuple_access = 18, 
		RULE_crida_funcio = 19, RULE_condicional = 20, RULE_bucle_mentre = 21, 
		RULE_number = 22, RULE_bucle_per = 23, RULE_crida_accio = 24, RULE_instruccio_io = 25, 
		RULE_tipus_basic = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici", "programa", "bloc_tipus", "declaracio_tipus", "camp", "bloc_variables", 
			"declaracio_variable", "bloc_funcions", "accio", "funcio", "parametres", 
			"parametre", "bloc_sentencies", "sentencia", "assignacio", "expr_booleana", 
			"expr", "vector_access", "tuple_access", "crida_funcio", "condicional", 
			"bucle_mentre", "number", "bucle_per", "crida_accio", "instruccio_io", 
			"tipus_basic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fprograma'", "'tipus'", "'ftipus'", "'variables'", 
			"'fvariables'", "'funcio'", "'ffuncio'", "'accio'", "'faccio'", "'si'", 
			"'llavors'", "'altrasi'", "'altrament'", "'fsi'", "'mentre'", "'fmentre'", 
			"'per'", "'en'", "'fer'", "'fper'", "'llegir'", "'escriure'", "'escriureln'", 
			"'retorna'", "'boolea'", "'enter'", "'real'", "'vector'", "'tupla'", 
			"'ftupla'", "'rang'", "'ent'", "'entsor'", "'~'", "':='", "'+'", "'-'", 
			"'*'", "'/'", "'\\'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'&'", "'|'", "'no'", "'.'", "','", "';'", "':'", "'('", "')'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "END_PROGRAM", "TYPE", "END_TYPE", "VAR", "END_VAR", 
			"FUNC", "END_FUNC", "ACTION", "END_ACTION", "IF", "THEN", "ELSEIF", "ELSE", 
			"ENDIF", "WHILE", "END_WHILE", "FOR", "IN", "DO", "END_FOR", "READ", 
			"WRITE", "WRITELN", "RETURN", "BOOLEAN", "INTEGER", "REAL", "VECTOR", 
			"TUPLE", "END_TUPLE", "RANG", "ENT", "ENTSOR", "NEG", "ASSIGN", "PLUS", 
			"MINUS", "MULT", "DIV", "INT_DIV", "MOD", "EQ", "NEQ", "LT", "LEQ", "GT", 
			"GEQ", "AND", "OR", "NOT", "DOT", "COMMA", "SEMICOLON", "COLON", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "ID", "NUMBER", "REAL_NUMBER", "BOOLEAN_LITERAL", 
			"STRING", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "prova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymTable<Registre> TS = new SymTable<>(1000);
	    boolean errorSemantico = false;
	    Bytecode x;
	    Long saltLinia;

	    public void notifyErrorListeners(Token offendingToken, String msg) {
	        super.notifyErrorListeners(offendingToken, msg, null);
	        errorSemantico = true;
	    }

	public provaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IniciContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterInici(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitInici(this);
		}
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			programa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(provaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode END_PROGRAM() { return getToken(provaParser.END_PROGRAM, 0); }
		public Bloc_tipusContext bloc_tipus() {
			return getRuleContext(Bloc_tipusContext.class,0);
		}
		public Bloc_funcionsContext bloc_funcions() {
			return getRuleContext(Bloc_funcionsContext.class,0);
		}
		public Bloc_variablesContext bloc_variables() {
			return getRuleContext(Bloc_variablesContext.class,0);
		}
		public List<Bloc_sentenciesContext> bloc_sentencies() {
			return getRuleContexts(Bloc_sentenciesContext.class);
		}
		public Bloc_sentenciesContext bloc_sentencies(int i) {
			return getRuleContext(Bloc_sentenciesContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);


		        x=new Bytecode("compilat");
		        saltLinia=x.addConstant("S","\n");
		        Vector<Long> trad = new Vector<Long>(10);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(56);
				bloc_tipus();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNC || _la==ACTION) {
				{
				setState(59);
				bloc_funcions();
				}
			}

			setState(62);
			match(PROGRAM);
			setState(63);
			match(ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(64);
				bloc_variables();
				}
			}

			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				bloc_sentencies();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504636536832L) != 0) );
			setState(72);
			match(END_PROGRAM);
			    if (!errorSemantico) {
			             trad.add(x.RETURN);
			             x.addMainCode(10L,10L,trad);
			             x.write();
			         }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloc_tipusContext extends ParserRuleContext {
		public Vector<Long> trad;
		public TerminalNode TYPE() { return getToken(provaParser.TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(provaParser.END_TYPE, 0); }
		public List<Declaracio_tipusContext> declaracio_tipus() {
			return getRuleContexts(Declaracio_tipusContext.class);
		}
		public Declaracio_tipusContext declaracio_tipus(int i) {
			return getRuleContext(Declaracio_tipusContext.class,i);
		}
		public Bloc_tipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_tipus(this);
		}
	}

	public final Bloc_tipusContext bloc_tipus() throws RecognitionException {
		Bloc_tipusContext _localctx = new Bloc_tipusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloc_tipus);

			    ((Bloc_tipusContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TYPE);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				declaracio_tipus();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(81);
			match(END_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracio_tipusContext extends ParserRuleContext {
		public Vector<Long> trad;
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public List<TerminalNode> COLON() { return getTokens(provaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(provaParser.COLON, i);
		}
		public TerminalNode VECTOR() { return getToken(provaParser.VECTOR, 0); }
		public Tipus_basicContext tipus_basic() {
			return getRuleContext(Tipus_basicContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(provaParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(provaParser.SEMICOLON, 0); }
		public TerminalNode TUPLE() { return getToken(provaParser.TUPLE, 0); }
		public TerminalNode LBRACKET() { return getToken(provaParser.LBRACKET, 0); }
		public List<CampContext> camp() {
			return getRuleContexts(CampContext.class);
		}
		public CampContext camp(int i) {
			return getRuleContext(CampContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(provaParser.RBRACKET, 0); }
		public TerminalNode END_TUPLE() { return getToken(provaParser.END_TUPLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(provaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(provaParser.COMMA, i);
		}
		public Declaracio_tipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDeclaracio_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDeclaracio_tipus(this);
		}
	}

	public final Declaracio_tipusContext declaracio_tipus() throws RecognitionException {
		Declaracio_tipusContext _localctx = new Declaracio_tipusContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracio_tipus);

			    ((Declaracio_tipusContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(84);
			match(COLON);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				setState(85);
				match(VECTOR);
				setState(86);
				tipus_basic();
				setState(87);
				match(COLON);
				setState(88);
				match(NUMBER);
				setState(89);
				match(SEMICOLON);
				}
				break;
			case TUPLE:
				{
				setState(91);
				match(TUPLE);
				setState(92);
				match(LBRACKET);
				setState(93);
				camp();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(94);
					match(COMMA);
					setState(95);
					camp();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(RBRACKET);
				setState(102);
				match(END_TUPLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CampContext extends ParserRuleContext {
		public Vector<Long> trad;
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(provaParser.COLON, 0); }
		public Tipus_basicContext tipus_basic() {
			return getRuleContext(Tipus_basicContext.class,0);
		}
		public CampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_camp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCamp(this);
		}
	}

	public final CampContext camp() throws RecognitionException {
		CampContext _localctx = new CampContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_camp);

		 	    ((CampContext)_localctx).trad = new Vector<Long>(100);
		     
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(COLON);
			setState(108);
			tipus_basic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloc_variablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(provaParser.VAR, 0); }
		public TerminalNode END_VAR() { return getToken(provaParser.END_VAR, 0); }
		public List<Declaracio_variableContext> declaracio_variable() {
			return getRuleContexts(Declaracio_variableContext.class);
		}
		public Declaracio_variableContext declaracio_variable(int i) {
			return getRuleContext(Declaracio_variableContext.class,i);
		}
		public Bloc_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_variables(this);
		}
	}

	public final Bloc_variablesContext bloc_variables() throws RecognitionException {
		Bloc_variablesContext _localctx = new Bloc_variablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloc_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VAR);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(111);
				declaracio_variable();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(END_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracio_variableContext extends ParserRuleContext {
		public Token ID;
		public Tipus_basicContext tipus_basic;
		public List<TerminalNode> ID() { return getTokens(provaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(provaParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(provaParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(provaParser.SEMICOLON, 0); }
		public Tipus_basicContext tipus_basic() {
			return getRuleContext(Tipus_basicContext.class,0);
		}
		public Declaracio_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDeclaracio_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDeclaracio_variable(this);
		}
	}

	public final Declaracio_variableContext declaracio_variable() throws RecognitionException {
		Declaracio_variableContext _localctx = new Declaracio_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracio_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((Declaracio_variableContext)_localctx).ID = match(ID);
			setState(120);
			match(COLON);
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case REAL:
				{
				setState(121);
				((Declaracio_variableContext)_localctx).tipus_basic = tipus_basic();
				}
				break;
			case ID:
				{
				setState(122);
				((Declaracio_variableContext)_localctx).ID = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(SEMICOLON);

			        char tipusChar = '?'; // Valor por defecto
			        if ((((Declaracio_variableContext)_localctx).tipus_basic!=null?_input.getText(((Declaracio_variableContext)_localctx).tipus_basic.start,((Declaracio_variableContext)_localctx).tipus_basic.stop):null) != null) {
			            switch ((((Declaracio_variableContext)_localctx).tipus_basic!=null?_input.getText(((Declaracio_variableContext)_localctx).tipus_basic.start,((Declaracio_variableContext)_localctx).tipus_basic.stop):null)) {
			                case "enter": tipusChar = 'I'; break;
			                case "real": tipusChar = 'R'; break;
			                case "boolea": tipusChar = 'B'; break;
			                default: tipusChar = '?'; break;
			            }
			        } else if ((((Declaracio_variableContext)_localctx).ID!=null?((Declaracio_variableContext)_localctx).ID.getText():null) != null) {
			            // Si es un ID, asumimos que es un tipo definido por el usuario
			            tipusChar = 'U';
			        }

			        if (!TS.existeix((((Declaracio_variableContext)_localctx).ID!=null?((Declaracio_variableContext)_localctx).ID.getText():null))) {
			            TS.inserir((((Declaracio_variableContext)_localctx).ID!=null?((Declaracio_variableContext)_localctx).ID.getText():null), new Registre((((Declaracio_variableContext)_localctx).ID!=null?((Declaracio_variableContext)_localctx).ID.getText():null), tipusChar));
			            System.out.println("DEBUG: Declaració -> " + (((Declaracio_variableContext)_localctx).ID!=null?((Declaracio_variableContext)_localctx).ID.getText():null) + " és de tipus " + tipusChar);
			        } else {
			            System.out.println("Error: Variable " + (((Declaracio_variableContext)_localctx).ID!=null?((Declaracio_variableContext)_localctx).ID.getText():null) + " ja declarada.");
			            errorSemantico = true;
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloc_funcionsContext extends ParserRuleContext {
		public List<AccioContext> accio() {
			return getRuleContexts(AccioContext.class);
		}
		public AccioContext accio(int i) {
			return getRuleContext(AccioContext.class,i);
		}
		public List<FuncioContext> funcio() {
			return getRuleContexts(FuncioContext.class);
		}
		public FuncioContext funcio(int i) {
			return getRuleContext(FuncioContext.class,i);
		}
		public Bloc_funcionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_funcions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_funcions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_funcions(this);
		}
	}

	public final Bloc_funcionsContext bloc_funcions() throws RecognitionException {
		Bloc_funcionsContext _localctx = new Bloc_funcionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloc_funcions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTION:
					{
					setState(128);
					accio();
					}
					break;
				case FUNC:
					{
					setState(129);
					funcio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC || _la==ACTION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccioContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token id;
		public TerminalNode ACTION() { return getToken(provaParser.ACTION, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public Bloc_sentenciesContext bloc_sentencies() {
			return getRuleContext(Bloc_sentenciesContext.class,0);
		}
		public TerminalNode END_ACTION() { return getToken(provaParser.END_ACTION, 0); }
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public Bloc_variablesContext bloc_variables() {
			return getRuleContext(Bloc_variablesContext.class,0);
		}
		public AccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitAccio(this);
		}
	}

	public final AccioContext accio() throws RecognitionException {
		AccioContext _localctx = new AccioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_accio);

			    ((AccioContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ACTION);
			setState(135);
			((AccioContext)_localctx).id = match(ID);
			setState(136);
			match(LPAREN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921530376650752L) != 0)) {
				{
				setState(137);
				parametres();
				}
			}

			setState(140);
			match(RPAREN);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(141);
				bloc_variables();
				}
			}

			setState(144);
			bloc_sentencies();
			setState(145);
			match(END_ACTION);

			    if (TS.existeix((((AccioContext)_localctx).id!=null?((AccioContext)_localctx).id.getText():null))) {
			                notifyErrorListeners(((AccioContext)_localctx).id, "Nom  utilitzat.");
			            } else {
			                TS.inserir((((AccioContext)_localctx).id!=null?((AccioContext)_localctx).id.getText():null), new Registre("funcio", 'V'));
			            }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncioContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token id;
		public Tipus_basicContext tipus_basic;
		public TerminalNode FUNC() { return getToken(provaParser.FUNC, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public List<TerminalNode> RETURN() { return getTokens(provaParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(provaParser.RETURN, i);
		}
		public List<Tipus_basicContext> tipus_basic() {
			return getRuleContexts(Tipus_basicContext.class);
		}
		public Tipus_basicContext tipus_basic(int i) {
			return getRuleContext(Tipus_basicContext.class,i);
		}
		public Bloc_sentenciesContext bloc_sentencies() {
			return getRuleContext(Bloc_sentenciesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(provaParser.SEMICOLON, 0); }
		public TerminalNode END_FUNC() { return getToken(provaParser.END_FUNC, 0); }
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public Bloc_variablesContext bloc_variables() {
			return getRuleContext(Bloc_variablesContext.class,0);
		}
		public FuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitFuncio(this);
		}
	}

	public final FuncioContext funcio() throws RecognitionException {
		FuncioContext _localctx = new FuncioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcio);

			    ((FuncioContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FUNC);
			setState(149);
			((FuncioContext)_localctx).id = match(ID);
			setState(150);
			match(LPAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921530376650752L) != 0)) {
				{
				setState(151);
				parametres();
				}
			}

			setState(154);
			match(RPAREN);
			setState(155);
			match(RETURN);
			setState(156);
			((FuncioContext)_localctx).tipus_basic = tipus_basic();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(157);
				bloc_variables();
				}
			}

			setState(160);
			bloc_sentencies();
			setState(161);
			match(RETURN);
			setState(162);
			expr(0);
			setState(163);
			((FuncioContext)_localctx).tipus_basic = tipus_basic();
			setState(164);
			match(SEMICOLON);
			setState(165);
			match(END_FUNC);


			    if (TS.existeix((((FuncioContext)_localctx).id!=null?((FuncioContext)_localctx).id.getText():null))) {
			          notifyErrorListeners(((FuncioContext)_localctx).id, "Error: Nom ja utilitzat.", null);
			    } else {
			    TS.inserir((((FuncioContext)_localctx).id!=null?((FuncioContext)_localctx).id.getText():null), new Registre("funcio", (((FuncioContext)_localctx).tipus_basic!=null?_input.getText(((FuncioContext)_localctx).tipus_basic.start,((FuncioContext)_localctx).tipus_basic.stop):null).charAt(0)));
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametresContext extends ParserRuleContext {
		public Vector<Long> trad;
		public List<ParametreContext> parametre() {
			return getRuleContexts(ParametreContext.class);
		}
		public ParametreContext parametre(int i) {
			return getRuleContext(ParametreContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(provaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(provaParser.COMMA, i);
		}
		public ParametresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterParametres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitParametres(this);
		}
	}

	public final ParametresContext parametres() throws RecognitionException {
		ParametresContext _localctx = new ParametresContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametres);

			    ((ParametresContext)_localctx).trad = new Vector<Long>(100);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			parametre();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				parametre();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametreContext extends ParserRuleContext {
		public Vector<Long> trad;
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(provaParser.COLON, 0); }
		public Tipus_basicContext tipus_basic() {
			return getRuleContext(Tipus_basicContext.class,0);
		}
		public TerminalNode ENT() { return getToken(provaParser.ENT, 0); }
		public TerminalNode ENTSOR() { return getToken(provaParser.ENTSOR, 0); }
		public ParametreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterParametre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitParametre(this);
		}
	}

	public final ParametreContext parametre() throws RecognitionException {
		ParametreContext _localctx = new ParametreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametre);

		    	    ((ParametreContext)_localctx).trad = new Vector<Long>(100);
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENT || _la==ENTSOR) {
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==ENT || _la==ENTSOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(179);
			match(ID);
			setState(180);
			match(COLON);
			setState(181);
			tipus_basic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloc_sentenciesContext extends ParserRuleContext {
		public Vector<Long> trad;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Bloc_sentenciesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_sentencies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_sentencies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_sentencies(this);
		}
	}

	public final Bloc_sentenciesContext bloc_sentencies() throws RecognitionException {
		Bloc_sentenciesContext _localctx = new Bloc_sentenciesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloc_sentencies);

		        ((Bloc_sentenciesContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					sentencia();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Vector<Long> trad;
		public AssignacioContext assignacio;
		public CondicionalContext condicional;
		public Bucle_mentreContext bucle_mentre;
		public Bucle_perContext bucle_per;
		public Crida_accioContext crida_accio;
		public Crida_funcioContext crida_funcio;
		public Instruccio_ioContext instruccio_io;
		public AssignacioContext assignacio() {
			return getRuleContext(AssignacioContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(provaParser.SEMICOLON, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Bucle_mentreContext bucle_mentre() {
			return getRuleContext(Bucle_mentreContext.class,0);
		}
		public Bucle_perContext bucle_per() {
			return getRuleContext(Bucle_perContext.class,0);
		}
		public Crida_accioContext crida_accio() {
			return getRuleContext(Crida_accioContext.class,0);
		}
		public Crida_funcioContext crida_funcio() {
			return getRuleContext(Crida_funcioContext.class,0);
		}
		public Instruccio_ioContext instruccio_io() {
			return getRuleContext(Instruccio_ioContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentencia);

			    ((SentenciaContext)_localctx).trad = new Vector<Long>(100);
		    
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((SentenciaContext)_localctx).assignacio = assignacio();
				setState(189);
				match(SEMICOLON);

				            ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).assignacio.trad;
				          
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				((SentenciaContext)_localctx).condicional = condicional();

				            ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).condicional.trad;
				          
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				((SentenciaContext)_localctx).bucle_mentre = bucle_mentre();

				            ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).bucle_mentre.trad;
				          
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				((SentenciaContext)_localctx).bucle_per = bucle_per();

				            ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).bucle_per.trad;
				           
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				((SentenciaContext)_localctx).crida_accio = crida_accio();
				setState(202);
				match(SEMICOLON);
				 ((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).crida_accio.trad;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				((SentenciaContext)_localctx).crida_funcio = crida_funcio();
				setState(206);
				match(SEMICOLON);
				((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).crida_funcio.trad;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				((SentenciaContext)_localctx).instruccio_io = instruccio_io();
				setState(210);
				match(SEMICOLON);
				((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).instruccio_io.trad;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignacioContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token id;
		public ExprContext expr;
		public TerminalNode ASSIGN() { return getToken(provaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public AssignacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterAssignacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitAssignacio(this);
		}
	}

	public final AssignacioContext assignacio() throws RecognitionException {
		AssignacioContext _localctx = new AssignacioContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignacio);

		    ((AssignacioContext)_localctx).trad =  new Vector<Long>(100);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((AssignacioContext)_localctx).id = match(ID);
			setState(216);
			match(ASSIGN);
			setState(217);
			((AssignacioContext)_localctx).expr = expr(0);

			    if (!TS.existeix((((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null))) {
			        // Si la variable no existeix, la declarem automàticament
			        TS.inserir((((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null), new Registre((((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null), ((AssignacioContext)_localctx).expr.tipus));
			        System.out.println("DEBUG: Primera assignació -> " + (((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null) + " és de tipus " + ((AssignacioContext)_localctx).expr.tipus);
			    }

			    Registre r = TS.obtenir((((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null));

			    if (r == null) {
			        System.out.println("Error: Variable " + (((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null) + " no declarada.");
			        errorSemantico = true;
			    } else {
			        char tipusVar = r.getTipus();
			        char tipusExpr = ((AssignacioContext)_localctx).expr.tipus;

			        System.out.println("DEBUG: Assignació -> " + (((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null) + " (" + tipusVar + ") := " + (((AssignacioContext)_localctx).expr!=null?_input.getText(((AssignacioContext)_localctx).expr.start,((AssignacioContext)_localctx).expr.stop):null) + " (" + tipusExpr + ")");

			        if (tipusExpr == 'R' && tipusVar == 'I') {
			            System.out.println("Error: No es pot assignar un real (" + (((AssignacioContext)_localctx).expr!=null?_input.getText(((AssignacioContext)_localctx).expr.start,((AssignacioContext)_localctx).expr.stop):null) + ") a la variable " + (((AssignacioContext)_localctx).id!=null?((AssignacioContext)_localctx).id.getText():null) + " de tipus enter.");
			            errorSemantico = true;
			        }
			        else if (tipusExpr != tipusVar && !(tipusExpr == 'I' && tipusVar == 'R')) {
			            System.out.println("Error: Tipus incompatibles en l'assignació. No es pot assignar " + tipusExpr + " a " + tipusVar);
			            errorSemantico = true;
			        } else {

			            ((AssignacioContext)_localctx).trad =  ((AssignacioContext)_localctx).expr.trad;

			            if (tipusVar == 'R') {
			                _localctx.trad.add(x.FSTORE);
			            } else if (tipusVar == 'I' || tipusVar == 'B') {
			                _localctx.trad.add(x.ISTORE);
			            }

			            _localctx.trad.add(new Long(r.getAdreca()));
			        }
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_booleanaContext extends ParserRuleContext {
		public char tipus;
		public Vector<Long> trad;
		public Expr_booleanaContext eb1;
		public Expr_booleanaContext e;
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public Crida_funcioContext f;
		public Token id;
		public Expr_booleanaContext eb2;
		public TerminalNode NOT() { return getToken(provaParser.NOT, 0); }
		public List<Expr_booleanaContext> expr_booleana() {
			return getRuleContexts(Expr_booleanaContext.class);
		}
		public Expr_booleanaContext expr_booleana(int i) {
			return getRuleContext(Expr_booleanaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(provaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(provaParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(provaParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(provaParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(provaParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(provaParser.GEQ, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(provaParser.BOOLEAN_LITERAL, 0); }
		public Crida_funcioContext crida_funcio() {
			return getRuleContext(Crida_funcioContext.class,0);
		}
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode AND() { return getToken(provaParser.AND, 0); }
		public TerminalNode OR() { return getToken(provaParser.OR, 0); }
		public Expr_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr_booleana(this);
		}
	}

	public final Expr_booleanaContext expr_booleana() throws RecognitionException {
		return expr_booleana(0);
	}

	private Expr_booleanaContext expr_booleana(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_booleanaContext _localctx = new Expr_booleanaContext(_ctx, _parentState);
		Expr_booleanaContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr_booleana, _p);

			((Expr_booleanaContext)_localctx).trad = new Vector<Long>(100);
			Vector<Long> trad2 = new Vector<Long>(100);
			Vector<Long> tradAlt = new Vector<Long>(100);
			Vector<Vector<Long>> vectorSentencies = new Vector<>();
			Vector<Long> exprAlt = new Vector<Long>(100);
			Vector<Long> tradEnd = new Vector<Long>(100);
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(221);
				match(NOT);
				setState(222);
				((Expr_booleanaContext)_localctx).e = expr_booleana(8);

				        if (((Expr_booleanaContext)_localctx).e.tipus != 'B') {
				            System.out.println("Error: NOT només s'aplica a booleans, trobat '" + ((Expr_booleanaContext)_localctx).e.tipus + "'.");
				            errorSemantico = true;
				        } else {
				            ((Expr_booleanaContext)_localctx).tipus =  'B';
				        }
				      
				}
				break;
			case 2:
				{
				setState(225);
				((Expr_booleanaContext)_localctx).e1 = expr(0);
				setState(226);
				((Expr_booleanaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 554153860399104L) != 0)) ) {
					((Expr_booleanaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				((Expr_booleanaContext)_localctx).e2 = expr(0);

				        if (((Expr_booleanaContext)_localctx).e1.tipus != 'I' || ((Expr_booleanaContext)_localctx).e2.tipus != 'I') {
				            System.out.println("Error: Comparació numèrica només per a enters, però s'ha trobat '" + ((Expr_booleanaContext)_localctx).e1.tipus + "' i '" + ((Expr_booleanaContext)_localctx).e2.tipus + "'.");
				            errorSemantico = true;
				        } else {
				            ((Expr_booleanaContext)_localctx).tipus =  'B';
				        }
				      
				}
				break;
			case 3:
				{
				setState(230);
				match(LPAREN);
				setState(231);
				((Expr_booleanaContext)_localctx).e = expr_booleana(0);
				setState(232);
				match(RPAREN);

				        ((Expr_booleanaContext)_localctx).tipus =  ((Expr_booleanaContext)_localctx).e.tipus;
				      
				}
				break;
			case 4:
				{
				setState(235);
				match(BOOLEAN_LITERAL);

				        ((Expr_booleanaContext)_localctx).tipus =  'B';
				      
				}
				break;
			case 5:
				{
				setState(237);
				((Expr_booleanaContext)_localctx).f = crida_funcio();

				        if (((Expr_booleanaContext)_localctx).f.tipus != 'B') {
				            System.out.println("Error: La funció '" + (((Expr_booleanaContext)_localctx).f!=null?_input.getText(((Expr_booleanaContext)_localctx).f.start,((Expr_booleanaContext)_localctx).f.stop):null) + "' ha de retornar un valor booleà.");
				            errorSemantico = true;
				        } else {
				            ((Expr_booleanaContext)_localctx).tipus =  'B';
				        }
				      
				}
				break;
			case 6:
				{
				setState(240);
				((Expr_booleanaContext)_localctx).id = match(ID);

				        //((Expr_booleanaContext)_localctx).tipus =  obtenirTipus((((Expr_booleanaContext)_localctx).id!=null?((Expr_booleanaContext)_localctx).id.getText():null));
				        //if (_localctx.tipus != 'B') {
				        //    System.out.println("Error: La variable '" + (((Expr_booleanaContext)_localctx).id!=null?((Expr_booleanaContext)_localctx).id.getText():null) + "' ha de ser booleana.");
				        //    errorSemantico = true;
				        //}
				      
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_booleanaContext(_parentctx, _parentState);
						_localctx.eb1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleana);
						setState(244);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(245);
						((Expr_booleanaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((Expr_booleanaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						((Expr_booleanaContext)_localctx).eb2 = expr_booleana(8);

						                  if (((Expr_booleanaContext)_localctx).eb1.tipus != 'B' || ((Expr_booleanaContext)_localctx).eb2.tipus != 'B') {
						                      System.out.println("Error: EQ i NEQ només s'apliquen a booleans, però s'ha trobat '" + ((Expr_booleanaContext)_localctx).eb1.tipus + "' i '" + ((Expr_booleanaContext)_localctx).eb2.tipus + "'.");
						                      errorSemantico = true;
						                  } else {
						                      ((Expr_booleanaContext)_localctx).tipus =  'B';
						                  }
						                
						}
						break;
					case 2:
						{
						_localctx = new Expr_booleanaContext(_parentctx, _parentState);
						_localctx.eb1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleana);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250);
						((Expr_booleanaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((Expr_booleanaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						((Expr_booleanaContext)_localctx).eb2 = expr_booleana(6);

						                  if (((Expr_booleanaContext)_localctx).eb1.tipus != 'B' || ((Expr_booleanaContext)_localctx).eb2.tipus != 'B') {
						                      System.out.println("Error: AND i OR només s'apliquen a booleans, però s'ha trobat '" + ((Expr_booleanaContext)_localctx).eb1.tipus + "' i '" + ((Expr_booleanaContext)_localctx).eb2.tipus + "'.");
						                      errorSemantico = true;
						                  } else {
						                      ((Expr_booleanaContext)_localctx).tipus =  'B';
						                  }
						                
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public char tipus;
		public Vector<Long> trad;
		public ExprContext e1;
		public ExprContext e;
		public Token ID;
		public Token op;
		public ExprContext e2;
		public TerminalNode NEG() { return getToken(provaParser.NEG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(provaParser.NUMBER, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(provaParser.REAL_NUMBER, 0); }
		public Crida_funcioContext crida_funcio() {
			return getRuleContext(Crida_funcioContext.class,0);
		}
		public Vector_accessContext vector_access() {
			return getRuleContext(Vector_accessContext.class,0);
		}
		public Tuple_accessContext tuple_access() {
			return getRuleContext(Tuple_accessContext.class,0);
		}
		public TerminalNode STRING() { return getToken(provaParser.STRING, 0); }
		public TerminalNode MULT() { return getToken(provaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(provaParser.DIV, 0); }
		public TerminalNode INT_DIV() { return getToken(provaParser.INT_DIV, 0); }
		public TerminalNode MOD() { return getToken(provaParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(provaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(provaParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(260);
				match(NEG);
				setState(261);
				((ExprContext)_localctx).e = expr(11);

				        if (((ExprContext)_localctx).e.tipus != 'I' && ((ExprContext)_localctx).e.tipus != 'R') {
				            System.out.println("Error: L'operació de negació només s'aplica a enters o reals.");
				            errorSemantico = true;
				        }
				        ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e.tipus;
				    
				}
				break;
			case 2:
				{
				setState(264);
				match(LPAREN);
				setState(265);
				((ExprContext)_localctx).e = expr(0);
				setState(266);
				match(RPAREN);
				 ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).e.tipus; 
				}
				break;
			case 3:
				{
				setState(269);
				((ExprContext)_localctx).ID = match(ID);

				        if (!TS.existeix((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))) {
				            System.out.println("Error: Variable no declarada.");
				            errorSemantico = true;
				        } else {
				            Registre r = TS.obtenir((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				            ((ExprContext)_localctx).tipus =  r.tipus;
				        }
				    
				}
				break;
			case 4:
				{
				setState(271);
				match(NUMBER);
				 ((ExprContext)_localctx).tipus =  'I'; 
				}
				break;
			case 5:
				{
				setState(273);
				match(REAL_NUMBER);
				 ((ExprContext)_localctx).tipus =  'R'; 
				}
				break;
			case 6:
				{
				setState(275);
				crida_funcio();
				 ((ExprContext)_localctx).tipus =  'R'; 
				}
				break;
			case 7:
				{
				setState(278);
				vector_access();
				 ((ExprContext)_localctx).tipus =  'I'; 
				}
				break;
			case 8:
				{
				setState(281);
				tuple_access();
				 ((ExprContext)_localctx).tipus =  'I'; 
				}
				break;
			case 9:
				{
				setState(284);
				match(STRING);
				 ((ExprContext)_localctx).tipus =  'S'; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(289);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						((ExprContext)_localctx).e2 = expr(11);

						                  if ((((ExprContext)_localctx).e1.tipus == 'I' || ((ExprContext)_localctx).e1.tipus == 'R') && (((ExprContext)_localctx).e2.tipus == 'I' || ((ExprContext)_localctx).e2.tipus == 'R')) {
						                      ((ExprContext)_localctx).tipus =  (((ExprContext)_localctx).e1.tipus == 'R' || ((ExprContext)_localctx).e2.tipus == 'R') ? 'R' : 'I';
						                  } else {
						                      System.out.println("Error: Operació no vàlida entre tipus diferents.");
						                      errorSemantico = true;
						                  }
						              
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						((ExprContext)_localctx).e2 = expr(10);

						                  if (((ExprContext)_localctx).e1.tipus != ((ExprContext)_localctx).e2.tipus && !(((ExprContext)_localctx).e1.tipus == 'I' && ((ExprContext)_localctx).e2.tipus == 'R') && !(((ExprContext)_localctx).e1.tipus == 'R' && ((ExprContext)_localctx).e2.tipus == 'I')) {
						                      System.out.println("Error: No es poden sumar o restar tipus diferents.");
						                      errorSemantico = true;
						                  }
						                  ((ExprContext)_localctx).tipus =  (((ExprContext)_localctx).e1.tipus == 'R' || ((ExprContext)_localctx).e2.tipus == 'R') ? 'R' : 'I';
						              
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vector_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(provaParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(provaParser.RBRACKET, 0); }
		public Vector_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterVector_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitVector_access(this);
		}
	}

	public final Vector_accessContext vector_access() throws RecognitionException {
		Vector_accessContext _localctx = new Vector_accessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vector_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(ID);
			setState(304);
			match(LBRACKET);
			setState(305);
			expr(0);
			setState(306);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_accessContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(provaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(provaParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(provaParser.DOT, 0); }
		public Tuple_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterTuple_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitTuple_access(this);
		}
	}

	public final Tuple_accessContext tuple_access() throws RecognitionException {
		Tuple_accessContext _localctx = new Tuple_accessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tuple_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ID);
			setState(309);
			match(DOT);
			setState(310);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Crida_funcioContext extends ParserRuleContext {
		public char tipus;
		public Vector<Long> trad;
		public Token ID;
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(provaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(provaParser.COMMA, i);
		}
		public Crida_funcioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crida_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCrida_funcio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCrida_funcio(this);
		}
	}

	public final Crida_funcioContext crida_funcio() throws RecognitionException {
		Crida_funcioContext _localctx = new Crida_funcioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_crida_funcio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((Crida_funcioContext)_localctx).ID = match(ID);
			setState(313);
			match(LPAREN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 773849089L) != 0)) {
				{
				setState(314);
				expr(0);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(315);
					match(COMMA);
					setState(316);
					expr(0);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(RPAREN);

			        // Aquí hauries d'assignar el tipus en funció de la funció cridada
			        //((Crida_funcioContext)_localctx).tipus =  ((Crida_funcioContext)_localctx).ID.getTipus();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Expr_booleanaContext cond;
		public Bloc_sentenciesContext s1;
		public Expr_booleanaContext expr_booleana;
		public List<Expr_booleanaContext> cond2 = new ArrayList<Expr_booleanaContext>();
		public Bloc_sentenciesContext s2;
		public Bloc_sentenciesContext s3;
		public TerminalNode IF() { return getToken(provaParser.IF, 0); }
		public List<TerminalNode> THEN() { return getTokens(provaParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(provaParser.THEN, i);
		}
		public TerminalNode ENDIF() { return getToken(provaParser.ENDIF, 0); }
		public List<Expr_booleanaContext> expr_booleana() {
			return getRuleContexts(Expr_booleanaContext.class);
		}
		public Expr_booleanaContext expr_booleana(int i) {
			return getRuleContext(Expr_booleanaContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(provaParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(provaParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(provaParser.ELSE, 0); }
		public List<Bloc_sentenciesContext> bloc_sentencies() {
			return getRuleContexts(Bloc_sentenciesContext.class);
		}
		public Bloc_sentenciesContext bloc_sentencies(int i) {
			return getRuleContext(Bloc_sentenciesContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicional);

		    ((CondicionalContext)_localctx).trad =  new Vector<Long>(100);
		    Vector<Long> tradCondicio = new Vector<Long>(100);
		    Vector<Vector<Long>> vectorSentencies = new Vector<>();
		    Vector<Long> tradFinal = new Vector<Long>(100);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(IF);
			setState(328);
			((CondicionalContext)_localctx).cond = expr_booleana(0);
			setState(329);
			match(THEN);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504636536832L) != 0)) {
				{
				{
				setState(330);
				((CondicionalContext)_localctx).s1 = bloc_sentencies();
				tradCondicio.addAll(((CondicionalContext)_localctx).s1.trad);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(338);
				match(ELSEIF);
				setState(339);
				((CondicionalContext)_localctx).expr_booleana = expr_booleana(0);
				((CondicionalContext)_localctx).cond2.add(((CondicionalContext)_localctx).expr_booleana);
				setState(340);
				match(THEN);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504636536832L) != 0)) {
					{
					{
					setState(341);
					((CondicionalContext)_localctx).s2 = bloc_sentencies();
					Vector<Long> subVector = new Vector<>(); subVector.addAll(((CondicionalContext)_localctx).s2.trad); vectorSentencies.add(subVector);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(354);
				match(ELSE);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504636536832L) != 0)) {
					{
					{
					setState(355);
					((CondicionalContext)_localctx).s3 = bloc_sentencies();
					tradFinal.addAll(((CondicionalContext)_localctx).s3.trad);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(365);
			match(ENDIF);


			    if (((CondicionalContext)_localctx).cond.tipus != 'B') {
			        System.out.println("Error: La condició de l'IF ha de ser booleana, però s'ha trobat '" + ((CondicionalContext)_localctx).cond.tipus + "'.");
			        errorSemantico = true;
			    }

			    for (ExprContext ctx : ((CondicionalContext)_localctx).cond2) {
			        if (ctx.tipus != 'B') {
			            System.out.println("Error: La condició d'un ELSEIF ha de ser booleana, però s'ha trobat '" + ctx.tipus + "'.");
			            errorSemantico = true;
			        }
			    }

			    // Càlcul de salts
			    Long distFinal = 0L;
			    for (int i = 0; i < vectorSentencies.size(); i++) {
			        distFinal += vectorSentencies.get(i).size() + 3L;
			        distFinal += ((CondicionalContext)_localctx).cond2.get(i).trad.size();
			    }

			    // Generació de codi intermitg IF
			    ((CondicionalContext)_localctx).trad =  ((CondicionalContext)_localctx).cond.trad;
			    _localctx.trad.add(x.IFEQ);
			    Long salt = tradCondicio.size() + 6L;
			    _localctx.trad.add(x.nByte(salt, 2));
			    _localctx.trad.add(x.nByte(salt, 1));

			    _localctx.trad.addAll(tradCondicio);

			    // Processament ELSEIF
			    for (int i = 0; i < ((CondicionalContext)_localctx).cond2.size(); i++) {
			        _localctx.trad.add(x.GOTO);
			        salt = distFinal + (3L * (((CondicionalContext)_localctx).cond2.size() - i));
			        _localctx.trad.add(x.nByte(salt, 2));
			        _localctx.trad.add(x.nByte(salt, 1));

			        _localctx.trad.addAll(((CondicionalContext)_localctx).cond2.get(i).trad);
			        _localctx.trad.add(x.IFEQ);
			        salt = vectorSentencies.get(i).size() + 6L;
			        _localctx.trad.add(x.nByte(salt, 2));
			        _localctx.trad.add(x.nByte(salt, 1));

			        _localctx.trad.addAll(vectorSentencies.get(i));

			        distFinal -= 3 + vectorSentencies.get(i).size() + ((CondicionalContext)_localctx).cond2.get(i).trad.size();
			    }

			    // GOTO final per a ELSE
			    _localctx.trad.add(x.GOTO);
			    salt = tradFinal.size() + 3L;
			    _localctx.trad.add(x.nByte(salt, 2));
			    _localctx.trad.add(x.nByte(salt, 1));

			    _localctx.trad.addAll(tradFinal);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bucle_mentreContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Expr_booleanaContext cond;
		public Bloc_sentenciesContext sent;
		public TerminalNode WHILE() { return getToken(provaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(provaParser.DO, 0); }
		public TerminalNode END_WHILE() { return getToken(provaParser.END_WHILE, 0); }
		public Expr_booleanaContext expr_booleana() {
			return getRuleContext(Expr_booleanaContext.class,0);
		}
		public List<Bloc_sentenciesContext> bloc_sentencies() {
			return getRuleContexts(Bloc_sentenciesContext.class);
		}
		public Bloc_sentenciesContext bloc_sentencies(int i) {
			return getRuleContext(Bloc_sentenciesContext.class,i);
		}
		public Bucle_mentreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_mentre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBucle_mentre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBucle_mentre(this);
		}
	}

	public final Bucle_mentreContext bucle_mentre() throws RecognitionException {
		Bucle_mentreContext _localctx = new Bucle_mentreContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bucle_mentre);

		    ((Bucle_mentreContext)_localctx).trad =  new Vector<Long>(100);
		    Vector<Long> tradSentencies = new Vector<Long>(100);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(WHILE);
			setState(369);
			((Bucle_mentreContext)_localctx).cond = expr_booleana(0);
			setState(370);
			match(DO);
			setState(374); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(371);
				((Bucle_mentreContext)_localctx).sent = bloc_sentencies();
				tradSentencies.addAll(((Bucle_mentreContext)_localctx).sent.trad);
				}
				}
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504636536832L) != 0) );
			setState(378);
			match(END_WHILE);

			    // Validació de tipus: la condició ha de ser booleana
			    if (((Bucle_mentreContext)_localctx).cond.tipus != 'B') {
			        System.out.println("Error: La condició del WHILE ha de ser booleana, però s'ha trobat '" + ((Bucle_mentreContext)_localctx).cond.tipus + "'.");
			        errorSemantico = true;
			    } else {

			        Long iniciBucle = (long) _localctx.trad.size();

			        // condició while
			        _localctx.trad.addAll(((Bucle_mentreContext)_localctx).cond.trad);
			        _localctx.trad.add(x.IFEQ);

			        // Calcula el salt -> condició és falsa
			        Long saltSortida = tradSentencies.size() + 6L;
			        _localctx.trad.add(x.nByte(saltSortida, 2));
			        _localctx.trad.add(x.nByte(saltSortida, 1));


			        _localctx.trad.addAll(tradSentencies);

			        // GOTO sortida bucle
			        Long saltInici = 0L - _localctx.trad.size();
			        _localctx.trad.add(x.GOTO);
			        _localctx.trad.add(x.nByte(saltInici, 2));
			        _localctx.trad.add(x.nByte(saltInici, 1));
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public char tipus;
		public Token n;
		public TerminalNode NUMBER() { return getToken(provaParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((NumberContext)_localctx).n = match(NUMBER);
			 ((NumberContext)_localctx).tipus =  'I'; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bucle_perContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token id;
		public NumberContext num1;
		public NumberContext num2;
		public Bloc_sentenciesContext s;
		public TerminalNode FOR() { return getToken(provaParser.FOR, 0); }
		public TerminalNode IN() { return getToken(provaParser.IN, 0); }
		public TerminalNode RANG() { return getToken(provaParser.RANG, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(provaParser.DO, 0); }
		public TerminalNode END_FOR() { return getToken(provaParser.END_FOR, 0); }
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(provaParser.COMMA, 0); }
		public List<Bloc_sentenciesContext> bloc_sentencies() {
			return getRuleContexts(Bloc_sentenciesContext.class);
		}
		public Bloc_sentenciesContext bloc_sentencies(int i) {
			return getRuleContext(Bloc_sentenciesContext.class,i);
		}
		public Bucle_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBucle_per(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBucle_per(this);
		}
	}

	public final Bucle_perContext bucle_per() throws RecognitionException {
		Bucle_perContext _localctx = new Bucle_perContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bucle_per);

		    ((Bucle_perContext)_localctx).trad =  new Vector<Long>(100);
		    Vector<Long> tradSentencies = new Vector<Long>(100);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(FOR);
			setState(385);
			((Bucle_perContext)_localctx).id = match(ID);
			setState(386);
			match(IN);
			setState(387);
			match(RANG);
			setState(388);
			match(LPAREN);
			setState(389);
			((Bucle_perContext)_localctx).num1 = number();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(390);
				match(COMMA);
				setState(391);
				((Bucle_perContext)_localctx).num2 = number();
				}
			}

			setState(394);
			match(RPAREN);
			setState(395);
			match(DO);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504636536832L) != 0)) {
				{
				{
				setState(396);
				((Bucle_perContext)_localctx).s = bloc_sentencies();
				tradSentencies.addAll(((Bucle_perContext)_localctx).s.trad);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(END_FOR);

			    // Validació de tipus dels límits del bucle
			    if (((Bucle_perContext)_localctx).num1.tipus != 'I' || ((((Bucle_perContext)_localctx).num2!=null?_input.getText(((Bucle_perContext)_localctx).num2.start,((Bucle_perContext)_localctx).num2.stop):null) != null && ((Bucle_perContext)_localctx).num2.tipus != 'I')) {
			        System.out.println("Error: Els límits del FOR han de ser enters.");
			        errorSemantico = true;
			    } else if (!TS.existeix((((Bucle_perContext)_localctx).id!=null?((Bucle_perContext)_localctx).id.getText():null))) {
			        System.out.println("Error: Variable '" + (((Bucle_perContext)_localctx).id!=null?((Bucle_perContext)_localctx).id.getText():null) + "' no declarada.");
			        notifyErrorListeners(((Bucle_perContext)_localctx).id, "Error: Variable '" + (((Bucle_perContext)_localctx).id!=null?((Bucle_perContext)_localctx).id.getText():null) + "' no declarada.", null);
			    } else {
			        Registre r = TS.obtenir((((Bucle_perContext)_localctx).id!=null?((Bucle_perContext)_localctx).id.getText():null));

			        if (r.getTipus() != 'I') {
			            notifyErrorListeners(((Bucle_perContext)_localctx).id, "Error: La variable '" + (((Bucle_perContext)_localctx).id!=null?((Bucle_perContext)_localctx).id.getText():null) + "' ha de ser de tipus enter.", null);
			        } else {
			            // Init variable del for
			            Long adrecaTemp = x.addConstant("I", (((Bucle_perContext)_localctx).num1!=null?_input.getText(((Bucle_perContext)_localctx).num1.start,((Bucle_perContext)_localctx).num1.stop):null));
			            _localctx.trad.add(x.LDC_W);
			            _localctx.trad.add(x.nByte(adrecaTemp, 2));
			            _localctx.trad.add(x.nByte(adrecaTemp, 1));
			            _localctx.trad.add(x.ISTORE);
			            _localctx.trad.add(new Long(r.getAdreca()));


			            Long iniciBucle = (long) _localctx.trad.size();

			            // carrega i superior
			            _localctx.trad.add(x.ILOAD);
			            _localctx.trad.add(new Long(r.getAdreca()));

			            adrecaTemp = x.addConstant("I", (((Bucle_perContext)_localctx).num2!=null?_input.getText(((Bucle_perContext)_localctx).num2.start,((Bucle_perContext)_localctx).num2.stop):null) != null ? (((Bucle_perContext)_localctx).num2!=null?_input.getText(((Bucle_perContext)_localctx).num2.start,((Bucle_perContext)_localctx).num2.stop):null) : "1");
			            _localctx.trad.add(x.LDC_W);
			            _localctx.trad.add(x.nByte(adrecaTemp, 2));
			            _localctx.trad.add(x.nByte(adrecaTemp, 1));

			            // Comparació
			            _localctx.trad.add(x.IF_ICMPGE);
			            Long saltSortida = tradSentencies.size() + 6L;
			            _localctx.trad.add(x.nByte(saltSortida, 2));
			            _localctx.trad.add(x.nByte(saltSortida, 1));

			            _localctx.trad.addAll(tradSentencies);

			            // Increment de la variable
			            _localctx.trad.add(x.ILOAD);
			            _localctx.trad.add(new Long(r.getAdreca()));

			            adrecaTemp = x.addConstant("I", "1");
			            _localctx.trad.add(x.LDC_W);
			            _localctx.trad.add(x.nByte(adrecaTemp, 2));
			            _localctx.trad.add(x.nByte(adrecaTemp, 1));

			            _localctx.trad.add(x.IADD);
			            _localctx.trad.add(x.ISTORE);
			            _localctx.trad.add(new Long(r.getAdreca()));

			            // Tornar a inici
			            Long saltInici = 0L - (_localctx.trad.size() - iniciBucle);
			            _localctx.trad.add(x.GOTO);
			            _localctx.trad.add(x.nByte(saltInici, 2));
			            _localctx.trad.add(x.nByte(saltInici, 1));
			        }
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Crida_accioContext extends ParserRuleContext {
		public Vector<Long> trad;
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(provaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(provaParser.COMMA, i);
		}
		public Crida_accioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crida_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterCrida_accio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitCrida_accio(this);
		}
	}

	public final Crida_accioContext crida_accio() throws RecognitionException {
		Crida_accioContext _localctx = new Crida_accioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_crida_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(ID);
			setState(408);
			match(LPAREN);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 773849089L) != 0)) {
				{
				setState(409);
				expr(0);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(410);
					match(COMMA);
					setState(411);
					expr(0);
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(419);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruccio_ioContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token ID;
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode READ() { return getToken(provaParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(provaParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(provaParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(provaParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(provaParser.COLON, 0); }
		public Tipus_basicContext tipus_basic() {
			return getRuleContext(Tipus_basicContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(provaParser.WRITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(provaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(provaParser.COMMA, i);
		}
		public TerminalNode WRITELN() { return getToken(provaParser.WRITELN, 0); }
		public Instruccio_ioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccio_io; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterInstruccio_io(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitInstruccio_io(this);
		}
	}

	public final Instruccio_ioContext instruccio_io() throws RecognitionException {
		Instruccio_ioContext _localctx = new Instruccio_ioContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instruccio_io);

		    ((Instruccio_ioContext)_localctx).trad =  new Vector<Long>(100);

		int _la;
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(READ);
				setState(422);
				match(LPAREN);
				setState(423);
				((Instruccio_ioContext)_localctx).ID = match(ID);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(424);
					match(COLON);
					setState(425);
					tipus_basic();
					}
				}

				setState(428);
				match(RPAREN);

				    if (!TS.existeix((((Instruccio_ioContext)_localctx).ID!=null?((Instruccio_ioContext)_localctx).ID.getText():null))) {
				        System.out.println("Error: Variable '" + (((Instruccio_ioContext)_localctx).ID!=null?((Instruccio_ioContext)_localctx).ID.getText():null) + "' no declarada.");
				        notifyErrorListeners(((Instruccio_ioContext)_localctx).ID, "Error: Variable '" + (((Instruccio_ioContext)_localctx).ID!=null?((Instruccio_ioContext)_localctx).ID.getText():null) + "' no declarada.", null);
				    } else {
				        Registre r = TS.obtenir((((Instruccio_ioContext)_localctx).ID!=null?((Instruccio_ioContext)_localctx).ID.getText():null));
				        switch (r.getTipus()) {
				            case 'R':
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mGetFloat,2));
				                _localctx.trad.add(x.nByte(x.mGetFloat,1));
				                _localctx.trad.add(x.FSTORE);
				                _localctx.trad.add(new Long(r.getAdreca()));
				                break;
				            case 'I':
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mGetInt,2));
				                _localctx.trad.add(x.nByte(x.mGetInt,1));
				                _localctx.trad.add(x.ISTORE);
				                _localctx.trad.add(new Long(r.getAdreca()));
				                break;
				            case 'B':
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mGetBoolean,2));
				                _localctx.trad.add(x.nByte(x.mGetBoolean,1));
				                _localctx.trad.add(x.ISTORE);
				                _localctx.trad.add(new Long(r.getAdreca()));
				                break;
				        }
				    }

				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(WRITE);
				setState(431);
				match(LPAREN);
				setState(432);
				((Instruccio_ioContext)_localctx).e1 = expr(0);

				    ((Instruccio_ioContext)_localctx).trad =  ((Instruccio_ioContext)_localctx).e1.trad;
				    _localctx.trad.add(x.INVOKESTATIC);
				    switch (((Instruccio_ioContext)_localctx).e1.tipus) {
				        case 'R':
				            _localctx.trad.add(x.nByte(x.mPutFloat,2));
				            _localctx.trad.add(x.nByte(x.mPutFloat,1));
				            break;
				        case 'I':
				            _localctx.trad.add(x.nByte(x.mPutInt,2));
				            _localctx.trad.add(x.nByte(x.mPutInt,1));
				            break;
				        case 'B':
				            _localctx.trad.add(x.nByte(x.mPutBoolean,2));
				            _localctx.trad.add(x.nByte(x.mPutBoolean,1));
				            break;
				    }

				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(434);
					match(COMMA);
					setState(435);
					((Instruccio_ioContext)_localctx).e2 = expr(0);

					    _localctx.trad.addAll(((Instruccio_ioContext)_localctx).e2.trad);
					    _localctx.trad.add(x.INVOKESTATIC);
					    switch (((Instruccio_ioContext)_localctx).e2.tipus) {
					        case 'R':
					            _localctx.trad.add(x.nByte(x.mPutFloat,2));
					            _localctx.trad.add(x.nByte(x.mPutFloat,1));
					            break;
					        case 'I':
					            _localctx.trad.add(x.nByte(x.mPutInt,2));
					            _localctx.trad.add(x.nByte(x.mPutInt,1));
					            break;
					        case 'B':
					            _localctx.trad.add(x.nByte(x.mPutBoolean,2));
					            _localctx.trad.add(x.nByte(x.mPutBoolean,1));
					            break;
					    }

					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				match(RPAREN);
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(WRITELN);
				setState(446);
				match(LPAREN);
				setState(447);
				((Instruccio_ioContext)_localctx).e1 = expr(0);

				    ((Instruccio_ioContext)_localctx).trad =  ((Instruccio_ioContext)_localctx).e1.trad;
				    _localctx.trad.add(x.INVOKESTATIC);
				    switch (((Instruccio_ioContext)_localctx).e1.tipus) {
				        case 'R':
				            _localctx.trad.add(x.nByte(x.mPutFloat,2));
				            _localctx.trad.add(x.nByte(x.mPutFloat,1));
				            break;
				        case 'I':
				            _localctx.trad.add(x.nByte(x.mPutInt,2));
				            _localctx.trad.add(x.nByte(x.mPutInt,1));
				            break;
				        case 'B':
				            _localctx.trad.add(x.nByte(x.mPutBoolean,2));
				            _localctx.trad.add(x.nByte(x.mPutBoolean,1));
				            break;
				    }
				    // Afegim salt de línia
				    Long saltLinia = x.addConstant("S", "\n");
				    _localctx.trad.add(x.LDC_W);
				    _localctx.trad.add(x.nByte(saltLinia,2));
				    _localctx.trad.add(x.nByte(saltLinia,1));
				    _localctx.trad.add(x.INVOKESTATIC);
				    _localctx.trad.add(x.nByte(x.mPutString,2));
				    _localctx.trad.add(x.nByte(x.mPutString,1));

				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(449);
					match(COMMA);
					setState(450);
					((Instruccio_ioContext)_localctx).e2 = expr(0);

					    _localctx.trad.addAll(((Instruccio_ioContext)_localctx).e2.trad);
					    _localctx.trad.add(x.INVOKESTATIC);
					    switch (((Instruccio_ioContext)_localctx).e2.tipus) {
					        case 'R':
					            _localctx.trad.add(x.nByte(x.mPutFloat,2));
					            _localctx.trad.add(x.nByte(x.mPutFloat,1));
					            break;
					        case 'I':
					            _localctx.trad.add(x.nByte(x.mPutInt,2));
					            _localctx.trad.add(x.nByte(x.mPutInt,1));
					            break;
					        case 'B':
					            _localctx.trad.add(x.nByte(x.mPutBoolean,2));
					            _localctx.trad.add(x.nByte(x.mPutBoolean,1));
					            break;
					    }
					    // Salt de línia després de cada element
					    _localctx.trad.add(x.LDC_W);
					    _localctx.trad.add(x.nByte(saltLinia,2));
					    _localctx.trad.add(x.nByte(saltLinia,1));
					    _localctx.trad.add(x.INVOKESTATIC);
					    _localctx.trad.add(x.nByte(x.mPutString,2));
					    _localctx.trad.add(x.nByte(x.mPutString,1));

					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipus_basicContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(provaParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(provaParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(provaParser.BOOLEAN, 0); }
		public Tipus_basicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipus_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterTipus_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitTipus_basic(this);
		}
	}

	public final Tipus_basicContext tipus_basic() throws RecognitionException {
		Tipus_basicContext _localctx = new Tipus_basicContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipus_basic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_booleana_sempred((Expr_booleanaContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_booleana_sempred(Expr_booleanaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u01d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0004"+
		"\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u0002N\b\u0002\u000b\u0002\f\u0002O\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005q\b\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u0083"+
		"\b\u0007\u000b\u0007\f\u0007\u0084\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u008b\b\b\u0001\b\u0001\b\u0003\b\u008f\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0099\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u009f\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ac\b\n\n"+
		"\n\f\n\u00af\t\n\u0001\u000b\u0003\u000b\u00b2\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u00b9\b\f\u000b\f\f\f\u00ba"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d6"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f3\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ff\b\u000f\n"+
		"\u000f\f\u000f\u0102\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u011f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u012b\b\u0010\n\u0010\f\u0010\u012e\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u013e\b\u0013\n\u0013\f\u0013\u0141\t\u0013\u0003\u0013\u0143"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u014e\b\u0014\n"+
		"\u0014\f\u0014\u0151\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0159\b\u0014\n\u0014\f\u0014"+
		"\u015c\t\u0014\u0005\u0014\u015e\b\u0014\n\u0014\f\u0014\u0161\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0167\b\u0014"+
		"\n\u0014\f\u0014\u016a\t\u0014\u0003\u0014\u016c\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u0177\b\u0015\u000b\u0015\f\u0015\u0178"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0189\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0190\b\u0017\n\u0017"+
		"\f\u0017\u0193\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u019d\b\u0018"+
		"\n\u0018\f\u0018\u01a0\t\u0018\u0003\u0018\u01a2\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01ab\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u01b7\b\u0019\n\u0019\f\u0019\u01ba\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u01c6\b\u0019\n\u0019\f\u0019\u01c9"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01cd\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0000\u0002\u001e \u001b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"024\u0000\u0007\u0001\u0000!\"\u0001\u0000+0\u0001\u0000+,\u0001\u0000"+
		"12\u0001\u0000\'*\u0001\u0000%&\u0001\u0000\u001a\u001c\u01ef\u00006\u0001"+
		"\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000"+
		"\u0000\u0006S\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nn\u0001"+
		"\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000"+
		"\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000"+
		"\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000"+
		"\u0000\u0000\u0018\u00b8\u0001\u0000\u0000\u0000\u001a\u00d5\u0001\u0000"+
		"\u0000\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00f2\u0001\u0000"+
		"\u0000\u0000 \u011e\u0001\u0000\u0000\u0000\"\u012f\u0001\u0000\u0000"+
		"\u0000$\u0134\u0001\u0000\u0000\u0000&\u0138\u0001\u0000\u0000\u0000("+
		"\u0147\u0001\u0000\u0000\u0000*\u0170\u0001\u0000\u0000\u0000,\u017d\u0001"+
		"\u0000\u0000\u0000.\u0180\u0001\u0000\u0000\u00000\u0197\u0001\u0000\u0000"+
		"\u00002\u01cc\u0001\u0000\u0000\u00004\u01ce\u0001\u0000\u0000\u00006"+
		"7\u0003\u0002\u0001\u00007\u0001\u0001\u0000\u0000\u00008:\u0003\u0004"+
		"\u0002\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001"+
		"\u0000\u0000\u0000;=\u0003\u000e\u0007\u0000<;\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?A\u0005<\u0000\u0000@B\u0003\n\u0005\u0000A@\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CE\u0003\u0018"+
		"\f\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0002\u0000\u0000IJ\u0006\u0001\uffff\uffff\u0000J\u0003\u0001\u0000"+
		"\u0000\u0000KM\u0005\u0003\u0000\u0000LN\u0003\u0006\u0003\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0004\u0000"+
		"\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0005<\u0000\u0000Th\u00057\u0000"+
		"\u0000UV\u0005\u001d\u0000\u0000VW\u00034\u001a\u0000WX\u00057\u0000\u0000"+
		"XY\u0005=\u0000\u0000YZ\u00056\u0000\u0000Zi\u0001\u0000\u0000\u0000["+
		"\\\u0005\u001e\u0000\u0000\\]\u0005:\u0000\u0000]b\u0003\b\u0004\u0000"+
		"^_\u00055\u0000\u0000_a\u0003\b\u0004\u0000`^\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005;\u0000"+
		"\u0000fg\u0005\u001f\u0000\u0000gi\u0001\u0000\u0000\u0000hU\u0001\u0000"+
		"\u0000\u0000h[\u0001\u0000\u0000\u0000i\u0007\u0001\u0000\u0000\u0000"+
		"jk\u0005<\u0000\u0000kl\u00057\u0000\u0000lm\u00034\u001a\u0000m\t\u0001"+
		"\u0000\u0000\u0000nr\u0005\u0005\u0000\u0000oq\u0003\f\u0006\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0006\u0000\u0000v\u000b\u0001\u0000\u0000\u0000wx\u0005"+
		"<\u0000\u0000x{\u00057\u0000\u0000y|\u00034\u001a\u0000z|\u0005<\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u00056\u0000\u0000~\u007f\u0006\u0006\uffff\uffff\u0000"+
		"\u007f\r\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081"+
		"\u0083\u0003\u0012\t\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u000f"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u0005"+
		"<\u0000\u0000\u0088\u008a\u00058\u0000\u0000\u0089\u008b\u0003\u0014\n"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u00059\u0000\u0000"+
		"\u008d\u008f\u0003\n\u0005\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0003\u0018\f\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092\u0093"+
		"\u0006\b\uffff\uffff\u0000\u0093\u0011\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u0007\u0000\u0000\u0095\u0096\u0005<\u0000\u0000\u0096\u0098\u0005"+
		"8\u0000\u0000\u0097\u0099\u0003\u0014\n\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u00059\u0000\u0000\u009b\u009c\u0005\u0019\u0000"+
		"\u0000\u009c\u009e\u00034\u001a\u0000\u009d\u009f\u0003\n\u0005\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1"+
		"\u00a2\u0005\u0019\u0000\u0000\u00a2\u00a3\u0003 \u0010\u0000\u00a3\u00a4"+
		"\u00034\u001a\u0000\u00a4\u00a5\u00056\u0000\u0000\u00a5\u00a6\u0005\b"+
		"\u0000\u0000\u00a6\u00a7\u0006\t\uffff\uffff\u0000\u00a7\u0013\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ad\u0003\u0016\u000b\u0000\u00a9\u00aa\u00055\u0000"+
		"\u0000\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u0015\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0007\u0000\u0000"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005<\u0000\u0000"+
		"\u00b4\u00b5\u00057\u0000\u0000\u00b5\u00b6\u00034\u001a\u0000\u00b6\u0017"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u001a\r\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u0019\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000\u00bd\u00be\u0005"+
		"6\u0000\u0000\u00be\u00bf\u0006\r\uffff\uffff\u0000\u00bf\u00d6\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0003(\u0014\u0000\u00c1\u00c2\u0006\r"+
		"\uffff\uffff\u0000\u00c2\u00d6\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003"+
		"*\u0015\u0000\u00c4\u00c5\u0006\r\uffff\uffff\u0000\u00c5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0003.\u0017\u0000\u00c7\u00c8\u0006\r"+
		"\uffff\uffff\u0000\u00c8\u00d6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"0\u0018\u0000\u00ca\u00cb\u00056\u0000\u0000\u00cb\u00cc\u0006\r\uffff"+
		"\uffff\u0000\u00cc\u00d6\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003&\u0013"+
		"\u0000\u00ce\u00cf\u00056\u0000\u0000\u00cf\u00d0\u0006\r\uffff\uffff"+
		"\u0000\u00d0\u00d6\u0001\u0000\u0000\u0000\u00d1\u00d2\u00032\u0019\u0000"+
		"\u00d2\u00d3\u00056\u0000\u0000\u00d3\u00d4\u0006\r\uffff\uffff\u0000"+
		"\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c0\u0001\u0000\u0000\u0000\u00d5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c6\u0001\u0000\u0000\u0000\u00d5\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d6\u001b\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d8"+
		"\u00d9\u0005$\u0000\u0000\u00d9\u00da\u0003 \u0010\u0000\u00da\u00db\u0006"+
		"\u000e\uffff\uffff\u0000\u00db\u001d\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0006\u000f\uffff\uffff\u0000\u00dd\u00de\u00053\u0000\u0000\u00de\u00df"+
		"\u0003\u001e\u000f\b\u00df\u00e0\u0006\u000f\uffff\uffff\u0000\u00e0\u00f3"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003 \u0010\u0000\u00e2\u00e3\u0007"+
		"\u0001\u0000\u0000\u00e3\u00e4\u0003 \u0010\u0000\u00e4\u00e5\u0006\u000f"+
		"\uffff\uffff\u0000\u00e5\u00f3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"8\u0000\u0000\u00e7\u00e8\u0003\u001e\u000f\u0000\u00e8\u00e9\u00059\u0000"+
		"\u0000\u00e9\u00ea\u0006\u000f\uffff\uffff\u0000\u00ea\u00f3\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005?\u0000\u0000\u00ec\u00f3\u0006\u000f\uffff"+
		"\uffff\u0000\u00ed\u00ee\u0003&\u0013\u0000\u00ee\u00ef\u0006\u000f\uffff"+
		"\uffff\u0000\u00ef\u00f3\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005<\u0000"+
		"\u0000\u00f1\u00f3\u0006\u000f\uffff\uffff\u0000\u00f2\u00dc\u0001\u0000"+
		"\u0000\u0000\u00f2\u00e1\u0001\u0000\u0000\u0000\u00f2\u00e6\u0001\u0000"+
		"\u0000\u0000\u00f2\u00eb\u0001\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u0100\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\n\u0007\u0000\u0000\u00f5\u00f6\u0007\u0002\u0000"+
		"\u0000\u00f6\u00f7\u0003\u001e\u000f\b\u00f7\u00f8\u0006\u000f\uffff\uffff"+
		"\u0000\u00f8\u00ff\u0001\u0000\u0000\u0000\u00f9\u00fa\n\u0005\u0000\u0000"+
		"\u00fa\u00fb\u0007\u0003\u0000\u0000\u00fb\u00fc\u0003\u001e\u000f\u0006"+
		"\u00fc\u00fd\u0006\u000f\uffff\uffff\u0000\u00fd\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fe\u00f4\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u001f\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0006\u0010\uffff"+
		"\uffff\u0000\u0104\u0105\u0005#\u0000\u0000\u0105\u0106\u0003 \u0010\u000b"+
		"\u0106\u0107\u0006\u0010\uffff\uffff\u0000\u0107\u011f\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u00058\u0000\u0000\u0109\u010a\u0003 \u0010\u0000\u010a"+
		"\u010b\u00059\u0000\u0000\u010b\u010c\u0006\u0010\uffff\uffff\u0000\u010c"+
		"\u011f\u0001\u0000\u0000\u0000\u010d\u010e\u0005<\u0000\u0000\u010e\u011f"+
		"\u0006\u0010\uffff\uffff\u0000\u010f\u0110\u0005=\u0000\u0000\u0110\u011f"+
		"\u0006\u0010\uffff\uffff\u0000\u0111\u0112\u0005>\u0000\u0000\u0112\u011f"+
		"\u0006\u0010\uffff\uffff\u0000\u0113\u0114\u0003&\u0013\u0000\u0114\u0115"+
		"\u0006\u0010\uffff\uffff\u0000\u0115\u011f\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0003\"\u0011\u0000\u0117\u0118\u0006\u0010\uffff\uffff\u0000\u0118"+
		"\u011f\u0001\u0000\u0000\u0000\u0119\u011a\u0003$\u0012\u0000\u011a\u011b"+
		"\u0006\u0010\uffff\uffff\u0000\u011b\u011f\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005@\u0000\u0000\u011d\u011f\u0006\u0010\uffff\uffff\u0000\u011e"+
		"\u0103\u0001\u0000\u0000\u0000\u011e\u0108\u0001\u0000\u0000\u0000\u011e"+
		"\u010d\u0001\u0000\u0000\u0000\u011e\u010f\u0001\u0000\u0000\u0000\u011e"+
		"\u0111\u0001\u0000\u0000\u0000\u011e\u0113\u0001\u0000\u0000\u0000\u011e"+
		"\u0116\u0001\u0000\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u012c\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\n\n\u0000\u0000\u0121\u0122\u0007\u0004\u0000\u0000\u0122\u0123"+
		"\u0003 \u0010\u000b\u0123\u0124\u0006\u0010\uffff\uffff\u0000\u0124\u012b"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\n\t\u0000\u0000\u0126\u0127\u0007"+
		"\u0005\u0000\u0000\u0127\u0128\u0003 \u0010\n\u0128\u0129\u0006\u0010"+
		"\uffff\uffff\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0120\u0001"+
		"\u0000\u0000\u0000\u012a\u0125\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d!\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0005<\u0000\u0000\u0130\u0131\u0005:\u0000\u0000"+
		"\u0131\u0132\u0003 \u0010\u0000\u0132\u0133\u0005;\u0000\u0000\u0133#"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135\u0136\u0005"+
		"4\u0000\u0000\u0136\u0137\u0005<\u0000\u0000\u0137%\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005<\u0000\u0000\u0139\u0142\u00058\u0000\u0000\u013a"+
		"\u013f\u0003 \u0010\u0000\u013b\u013c\u00055\u0000\u0000\u013c\u013e\u0003"+
		" \u0010\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u00059\u0000"+
		"\u0000\u0145\u0146\u0006\u0013\uffff\uffff\u0000\u0146\'\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u000b\u0000\u0000\u0148\u0149\u0003\u001e\u000f"+
		"\u0000\u0149\u014f\u0005\f\u0000\u0000\u014a\u014b\u0003\u0018\f\u0000"+
		"\u014b\u014c\u0006\u0014\uffff\uffff\u0000\u014c\u014e\u0001\u0000\u0000"+
		"\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u015f\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005\r\u0000\u0000\u0153\u0154\u0003\u001e\u000f\u0000"+
		"\u0154\u015a\u0005\f\u0000\u0000\u0155\u0156\u0003\u0018\f\u0000\u0156"+
		"\u0157\u0006\u0014\uffff\uffff\u0000\u0157\u0159\u0001\u0000\u0000\u0000"+
		"\u0158\u0155\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u0152\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160\u016b\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0162\u0168\u0005\u000e\u0000\u0000\u0163\u0164\u0003\u0018\f\u0000\u0164"+
		"\u0165\u0006\u0014\uffff\uffff\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u0163\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016b\u0162\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u000f\u0000\u0000"+
		"\u016e\u016f\u0006\u0014\uffff\uffff\u0000\u016f)\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005\u0010\u0000\u0000\u0171\u0172\u0003\u001e\u000f\u0000"+
		"\u0172\u0176\u0005\u0014\u0000\u0000\u0173\u0174\u0003\u0018\f\u0000\u0174"+
		"\u0175\u0006\u0015\uffff\uffff\u0000\u0175\u0177\u0001\u0000\u0000\u0000"+
		"\u0176\u0173\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0011\u0000\u0000"+
		"\u017b\u017c\u0006\u0015\uffff\uffff\u0000\u017c+\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0005=\u0000\u0000\u017e\u017f\u0006\u0016\uffff\uffff\u0000"+
		"\u017f-\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0012\u0000\u0000\u0181"+
		"\u0182\u0005<\u0000\u0000\u0182\u0183\u0005\u0013\u0000\u0000\u0183\u0184"+
		"\u0005 \u0000\u0000\u0184\u0185\u00058\u0000\u0000\u0185\u0188\u0003,"+
		"\u0016\u0000\u0186\u0187\u00055\u0000\u0000\u0187\u0189\u0003,\u0016\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u00059\u0000\u0000\u018b"+
		"\u0191\u0005\u0014\u0000\u0000\u018c\u018d\u0003\u0018\f\u0000\u018d\u018e"+
		"\u0006\u0017\uffff\uffff\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f"+
		"\u018c\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0005\u0015\u0000\u0000\u0195\u0196\u0006\u0017\uffff\uffff\u0000"+
		"\u0196/\u0001\u0000\u0000\u0000\u0197\u0198\u0005<\u0000\u0000\u0198\u01a1"+
		"\u00058\u0000\u0000\u0199\u019e\u0003 \u0010\u0000\u019a\u019b\u00055"+
		"\u0000\u0000\u019b\u019d\u0003 \u0010\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u0199\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u00059\u0000\u0000\u01a41\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0005\u0016\u0000\u0000\u01a6\u01a7\u00058\u0000\u0000\u01a7\u01aa"+
		"\u0005<\u0000\u0000\u01a8\u01a9\u00057\u0000\u0000\u01a9\u01ab\u00034"+
		"\u001a\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u00059\u0000"+
		"\u0000\u01ad\u01cd\u0006\u0019\uffff\uffff\u0000\u01ae\u01af\u0005\u0017"+
		"\u0000\u0000\u01af\u01b0\u00058\u0000\u0000\u01b0\u01b1\u0003 \u0010\u0000"+
		"\u01b1\u01b8\u0006\u0019\uffff\uffff\u0000\u01b2\u01b3\u00055\u0000\u0000"+
		"\u01b3\u01b4\u0003 \u0010\u0000\u01b4\u01b5\u0006\u0019\uffff\uffff\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bc\u00059\u0000\u0000\u01bc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0018\u0000\u0000\u01be"+
		"\u01bf\u00058\u0000\u0000\u01bf\u01c0\u0003 \u0010\u0000\u01c0\u01c7\u0006"+
		"\u0019\uffff\uffff\u0000\u01c1\u01c2\u00055\u0000\u0000\u01c2\u01c3\u0003"+
		" \u0010\u0000\u01c3\u01c4\u0006\u0019\uffff\uffff\u0000\u01c4\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c1\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u00059\u0000\u0000\u01cb\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cc\u01a5\u0001\u0000\u0000\u0000\u01cc\u01ae\u0001\u0000"+
		"\u0000\u0000\u01cc\u01bd\u0001\u0000\u0000\u0000\u01cd3\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0007\u0006\u0000\u0000\u01cf5\u0001\u0000\u0000\u0000"+
		")9<AFObhr{\u0082\u0084\u008a\u008e\u0098\u009e\u00ad\u00b1\u00ba\u00d5"+
		"\u00f2\u00fe\u0100\u011e\u012a\u012c\u013f\u0142\u014f\u015a\u015f\u0168"+
		"\u016b\u0178\u0188\u0191\u019e\u01a1\u01aa\u01b8\u01c7\u01cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}