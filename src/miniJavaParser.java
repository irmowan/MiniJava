// Generated from src/miniJava.g4 by ANTLR 4.5.3
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
		T__0=1, WS=2, BOOLEAN=3, CLASS=4, ELSE=5, EXTENDS=6, FLASE=7, IF=8, INT=9, 
		LENGTH=10, MAIN=11, NEW=12, PUBLIC=13, RETURN=14, STATIC=15, STRING=16, 
		THIS=17, TRUE=18, VOID=19, WHILE=20, ASSIGN=21, GT=22, LT=23, GE=24, LE=25, 
		PLUS=26, MINUS=27, BANG=28, AND=29, OR=30, L_PAREN=31, R_PAREN=32, L_BRACK=33, 
		R_BRACK=34, L_BRACE=35, R_BRACE=36, COMMA=37, DOT=38, SEMI=39, U_LETTER=40, 
		L_LETTER=41, LETTER=42, DIGIT=43, ID=44;
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, "'boolean'", "'class'", "'else'", "'extends'", 
		"'false'", "'if'", "'int'", "'length'", "'main'", "'new'", "'public'", 
		"'return'", "'static'", "'string'", "'this'", "'true'", "'void'", "'while'", 
		"'='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'!'", "'&&'", "'||'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "BOOLEAN", "CLASS", "ELSE", "EXTENDS", "FLASE", "IF", 
		"INT", "LENGTH", "MAIN", "NEW", "PUBLIC", "RETURN", "STATIC", "STRING", 
		"THIS", "TRUE", "VOID", "WHILE", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", 
		"L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI", "U_LETTER", "L_LETTER", 
		"LETTER", "DIGIT", "ID"
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
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7.\2\2\6\3\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}