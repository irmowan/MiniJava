// Generated from miniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOLEAN=3, CLASS=4, ELSE=5, EXTENDS=6, FALSE=7, IF=8, 
		INT=9, LENGTH=10, MAIN=11, NEW=12, PUBLIC=13, RETURN=14, STATIC=15, STRING=16, 
		THIS=17, TRUE=18, VOID=19, WHILE=20, ASSIGN=21, GT=22, LT=23, GE=24, LE=25, 
		PLUS=26, MINUS=27, BANG=28, AND=29, OR=30, L_PAREN=31, R_PAREN=32, L_BRACK=33, 
		R_BRACK=34, L_BRACE=35, R_BRACE=36, COMMA=37, DOT=38, SEMI=39, ID=40, 
		INT_VAL=41, LETTER=42, DIGIT=43, WS=44, COMMENT=45, LINE_COMMENT=46;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDec = 2, RULE_varDec = 3, 
		RULE_methodDec = 4, RULE_type = 5, RULE_statement = 6, RULE_expr = 7;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDec", "varDec", "methodDec", "type", "statement", 
		"expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'System.out.println'", "'*'", "'boolean'", "'class'", "'else'", 
		"'extends'", "'false'", "'if'", "'int'", "'length'", "'main'", "'new'", 
		"'public'", "'return'", "'static'", "'String'", "'this'", "'true'", "'void'", 
		"'while'", "'='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'!'", "'&&'", 
		"'||'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BOOLEAN", "CLASS", "ELSE", "EXTENDS", "FALSE", "IF", 
		"INT", "LENGTH", "MAIN", "NEW", "PUBLIC", "RETURN", "STATIC", "STRING", 
		"THIS", "TRUE", "VOID", "WHILE", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", 
		"L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI", "ID", "INT_VAL", "LETTER", 
		"DIGIT", "WS", "COMMENT", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "miniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(miniJavaParser.EOF, 0); }
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(17);
				classDec();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(miniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miniJavaParser.ID, i);
		}
		public TerminalNode PUBLIC() { return getToken(miniJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(miniJavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(miniJavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(miniJavaParser.MAIN, 0); }
		public TerminalNode STRING() { return getToken(miniJavaParser.STRING, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(CLASS);
			setState(26);
			match(ID);
			setState(27);
			match(L_BRACE);
			setState(28);
			match(PUBLIC);
			setState(29);
			match(STATIC);
			setState(30);
			match(VOID);
			setState(31);
			match(MAIN);
			setState(32);
			match(L_PAREN);
			setState(33);
			match(STRING);
			setState(34);
			match(L_BRACK);
			setState(35);
			match(R_BRACK);
			setState(36);
			match(ID);
			setState(37);
			match(R_PAREN);
			setState(38);
			match(L_BRACE);
			setState(39);
			statement();
			setState(40);
			match(R_BRACE);
			setState(41);
			match(R_BRACE);
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

	public static class ClassDecContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(miniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miniJavaParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(miniJavaParser.EXTENDS, 0); }
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public List<MethodDecContext> methodDec() {
			return getRuleContexts(MethodDecContext.class);
		}
		public MethodDecContext methodDec(int i) {
			return getRuleContext(MethodDecContext.class,i);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassDec(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(CLASS);
			setState(44);
			match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(45);
				match(EXTENDS);
				setState(46);
				match(ID);
				}
			}

			setState(49);
			match(L_BRACE);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				varDec();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(56);
				methodDec();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(R_BRACE);
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

	public static class VarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitVarDec(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			match(ID);
			setState(66);
			match(SEMI);
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

	public static class MethodDecContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(miniJavaParser.PUBLIC, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(miniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miniJavaParser.ID, i);
		}
		public TerminalNode RETURN() { return getToken(miniJavaParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodDec(this);
		}
	}

	public final MethodDecContext methodDec() throws RecognitionException {
		MethodDecContext _localctx = new MethodDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(PUBLIC);
			setState(69);
			type();
			setState(70);
			match(ID);
			setState(71);
			match(L_PAREN);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(72);
				type();
				setState(73);
				match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74);
					match(COMMA);
					setState(75);
					type();
					setState(76);
					match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(R_PAREN);
			setState(86);
			match(L_BRACE);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					varDec();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << L_BRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(RETURN);
			setState(100);
			expr(0);
			setState(101);
			match(SEMI);
			setState(102);
			match(R_BRACE);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(miniJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(miniJavaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(INT);
				setState(105);
				match(L_BRACK);
				setState(106);
				match(R_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(miniJavaParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miniJavaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(miniJavaParser.WHILE, 0); }
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(L_BRACE);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << L_BRACE) | (1L << ID))) != 0)) {
					{
					{
					setState(113);
					statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IF);
				setState(121);
				match(L_PAREN);
				setState(122);
				expr(0);
				setState(123);
				match(R_PAREN);
				setState(124);
				statement();
				setState(125);
				match(ELSE);
				setState(126);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(WHILE);
				setState(129);
				match(L_PAREN);
				setState(130);
				expr(0);
				setState(131);
				match(R_PAREN);
				setState(132);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__0);
				setState(135);
				match(L_PAREN);
				setState(136);
				expr(0);
				setState(137);
				match(R_PAREN);
				setState(138);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(ID);
				setState(141);
				match(ASSIGN);
				setState(142);
				expr(0);
				setState(143);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(ID);
				setState(146);
				match(L_BRACK);
				setState(147);
				expr(0);
				setState(148);
				match(R_BRACK);
				setState(149);
				match(ASSIGN);
				setState(150);
				expr(0);
				setState(151);
				match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(miniJavaParser.INT_VAL, 0); }
		public TerminalNode TRUE() { return getToken(miniJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(miniJavaParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public TerminalNode THIS() { return getToken(miniJavaParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(miniJavaParser.NEW, 0); }
		public TerminalNode INT() { return getToken(miniJavaParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LENGTH() { return getToken(miniJavaParser.LENGTH, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				match(INT_VAL);
				}
				break;
			case 2:
				{
				setState(157);
				match(TRUE);
				}
				break;
			case 3:
				{
				setState(158);
				match(FALSE);
				}
				break;
			case 4:
				{
				setState(159);
				match(ID);
				}
				break;
			case 5:
				{
				setState(160);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(161);
				match(NEW);
				setState(162);
				match(INT);
				setState(163);
				match(L_BRACK);
				setState(164);
				expr(0);
				setState(165);
				match(R_BRACK);
				}
				break;
			case 7:
				{
				setState(167);
				match(NEW);
				setState(168);
				match(ID);
				setState(169);
				match(L_PAREN);
				setState(170);
				match(R_PAREN);
				}
				break;
			case 8:
				{
				setState(171);
				match(BANG);
				setState(172);
				expr(2);
				}
				break;
			case 9:
				{
				setState(173);
				match(L_PAREN);
				setState(174);
				expr(0);
				setState(175);
				match(R_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << AND))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(181);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183);
						match(L_BRACK);
						setState(184);
						expr(0);
						setState(185);
						match(R_BRACK);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(188);
						match(DOT);
						setState(189);
						match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(191);
						match(DOT);
						setState(192);
						match(ID);
						setState(193);
						match(L_PAREN);
						setState(202);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << TRUE) | (1L << BANG) | (1L << L_PAREN) | (1L << ID) | (1L << INT_VAL))) != 0)) {
							{
							setState(194);
							expr(0);
							setState(199);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(195);
								match(COMMA);
								setState(196);
								expr(0);
								}
								}
								setState(201);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(204);
						match(R_PAREN);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6"+
		"\5\6V\n\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\7\bu\n"+
		"\b\f\b\16\bx\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c8"+
		"\n\t\f\t\16\t\u00cb\13\t\5\t\u00cd\n\t\3\t\7\t\u00d0\n\t\f\t\16\t\u00d3"+
		"\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\3\6\2\4\4\31\31\34\35\37\37\u00eb"+
		"\2\22\3\2\2\2\4\33\3\2\2\2\6-\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fp\3\2\2\2"+
		"\16\u009b\3\2\2\2\20\u00b3\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3"+
		"\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3"+
		"\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7\6\2\2\34\35\7*\2\2\35\36\7%"+
		"\2\2\36\37\7\17\2\2\37 \7\21\2\2 !\7\25\2\2!\"\7\r\2\2\"#\7!\2\2#$\7\22"+
		"\2\2$%\7#\2\2%&\7$\2\2&\'\7*\2\2\'(\7\"\2\2()\7%\2\2)*\5\16\b\2*+\7&\2"+
		"\2+,\7&\2\2,\5\3\2\2\2-.\7\6\2\2.\61\7*\2\2/\60\7\b\2\2\60\62\7*\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\7%\2\2\64\66\5\b\5\2\65\64"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:"+
		"<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2"+
		"@A\7&\2\2A\7\3\2\2\2BC\5\f\7\2CD\7*\2\2DE\7)\2\2E\t\3\2\2\2FG\7\17\2\2"+
		"GH\5\f\7\2HI\7*\2\2IU\7!\2\2JK\5\f\7\2KR\7*\2\2LM\7\'\2\2MN\5\f\7\2NO"+
		"\7*\2\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR"+
		"\3\2\2\2UJ\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\"\2\2X\\\7%\2\2Y[\5\b\5\2Z"+
		"Y\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2_a\5\16"+
		"\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\20"+
		"\2\2fg\5\20\t\2gh\7)\2\2hi\7&\2\2i\13\3\2\2\2jk\7\13\2\2kl\7#\2\2lq\7"+
		"$\2\2mq\7\5\2\2nq\7\13\2\2oq\7*\2\2pj\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3"+
		"\2\2\2q\r\3\2\2\2rv\7%\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw"+
		"\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u009c\7&\2\2z{\7\n\2\2{|\7!\2\2|}\5\20\t"+
		"\2}~\7\"\2\2~\177\5\16\b\2\177\u0080\7\7\2\2\u0080\u0081\5\16\b\2\u0081"+
		"\u009c\3\2\2\2\u0082\u0083\7\26\2\2\u0083\u0084\7!\2\2\u0084\u0085\5\20"+
		"\t\2\u0085\u0086\7\"\2\2\u0086\u0087\5\16\b\2\u0087\u009c\3\2\2\2\u0088"+
		"\u0089\7\3\2\2\u0089\u008a\7!\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\""+
		"\2\2\u008c\u008d\7)\2\2\u008d\u009c\3\2\2\2\u008e\u008f\7*\2\2\u008f\u0090"+
		"\7\27\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7)\2\2\u0092\u009c\3\2\2\2"+
		"\u0093\u0094\7*\2\2\u0094\u0095\7#\2\2\u0095\u0096\5\20\t\2\u0096\u0097"+
		"\7$\2\2\u0097\u0098\7\27\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7)\2\2\u009a"+
		"\u009c\3\2\2\2\u009br\3\2\2\2\u009bz\3\2\2\2\u009b\u0082\3\2\2\2\u009b"+
		"\u0088\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u0093\3\2\2\2\u009c\17\3\2\2"+
		"\2\u009d\u009e\b\t\1\2\u009e\u00b4\7+\2\2\u009f\u00b4\7\24\2\2\u00a0\u00b4"+
		"\7\t\2\2\u00a1\u00b4\7*\2\2\u00a2\u00b4\7\23\2\2\u00a3\u00a4\7\16\2\2"+
		"\u00a4\u00a5\7\13\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8"+
		"\7$\2\2\u00a8\u00b4\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab\7*\2\2\u00ab"+
		"\u00ac\7!\2\2\u00ac\u00b4\7\"\2\2\u00ad\u00ae\7\36\2\2\u00ae\u00b4\5\20"+
		"\t\4\u00af\u00b0\7!\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7\"\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u009d\3\2\2\2\u00b3\u009f\3\2\2\2\u00b3\u00a0\3\2"+
		"\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3"+
		"\u00a9\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00d1\3\2"+
		"\2\2\u00b5\u00b6\f\17\2\2\u00b6\u00b7\t\2\2\2\u00b7\u00d0\5\20\t\20\u00b8"+
		"\u00b9\f\16\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc\7"+
		"$\2\2\u00bc\u00d0\3\2\2\2\u00bd\u00be\f\r\2\2\u00be\u00bf\7(\2\2\u00bf"+
		"\u00d0\7\f\2\2\u00c0\u00c1\f\f\2\2\u00c1\u00c2\7(\2\2\u00c2\u00c3\7*\2"+
		"\2\u00c3\u00cc\7!\2\2\u00c4\u00c9\5\20\t\2\u00c5\u00c6\7\'\2\2\u00c6\u00c8"+
		"\5\20\t\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c4"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\7\"\2\2\u00cf"+
		"\u00b5\3\2\2\2\u00cf\u00b8\3\2\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00c0\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\21\3\2\2\2\u00d3\u00d1\3\2\2\2\22\26\61\67=RU\\bpv\u009b\u00b3\u00c9"+
		"\u00cc\u00cf\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}