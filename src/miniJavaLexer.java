// Generated from miniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, BOOLEAN=4, CLASS=5, ELSE=6, EXTENDS=7, FALSE=8, 
		IF=9, INT=10, LENGTH=11, MAIN=12, NEW=13, PUBLIC=14, RETURN=15, STATIC=16, 
		STRING=17, THIS=18, TRUE=19, VOID=20, WHILE=21, ASSIGN=22, GT=23, LT=24, 
		GE=25, LE=26, PLUS=27, MINUS=28, BANG=29, AND=30, OR=31, L_PAREN=32, R_PAREN=33, 
		L_BRACK=34, R_BRACK=35, L_BRACE=36, R_BRACE=37, COMMA=38, DOT=39, SEMI=40, 
		ID=41, INT_VAL=42, LETTER=43, DIGIT=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "BOOLEAN", "CLASS", "ELSE", "EXTENDS", "FALSE", 
		"IF", "INT", "LENGTH", "MAIN", "NEW", "PUBLIC", "RETURN", "STATIC", "STRING", 
		"THIS", "TRUE", "VOID", "WHILE", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", 
		"L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI", "ID", "INT_VAL", "LETTER", 
		"DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'System.out.println'", "'*'", null, "'boolean'", "'class'", "'else'", 
		"'extends'", "'false'", "'if'", "'int'", "'length'", "'main'", "'new'", 
		"'public'", "'return'", "'static'", "'String'", "'this'", "'true'", "'void'", 
		"'while'", "'='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'!'", "'&&'", 
		"'||'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "BOOLEAN", "CLASS", "ELSE", "EXTENDS", "FALSE", 
		"IF", "INT", "LENGTH", "MAIN", "NEW", "PUBLIC", "RETURN", "STATIC", "STRING", 
		"THIS", "TRUE", "VOID", "WHILE", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", 
		"L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI", "ID", "INT_VAL", "LETTER", 
		"DIGIT"
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


	public miniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0120\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4r\n\4\r\4\16\4s\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3*\7*\u010e\n*\f*\16*\u0111\13*\3+\3+\3+\7+\u0116\n+\f+\16"+
		"+\u0119\13+\5+\u011b\n+\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.\3\2\6\5\2\13\f\17\17\"\"\3\2\63;\5\2C\\aac|\3\2\62;\u0124\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5n\3\2\2\2\7q\3\2\2\2\tw\3\2\2\2\13"+
		"\177\3\2\2\2\r\u0085\3\2\2\2\17\u008a\3\2\2\2\21\u0092\3\2\2\2\23\u0098"+
		"\3\2\2\2\25\u009b\3\2\2\2\27\u009f\3\2\2\2\31\u00a6\3\2\2\2\33\u00ab\3"+
		"\2\2\2\35\u00af\3\2\2\2\37\u00b6\3\2\2\2!\u00bd\3\2\2\2#\u00c4\3\2\2\2"+
		"%\u00cb\3\2\2\2\'\u00d0\3\2\2\2)\u00d5\3\2\2\2+\u00da\3\2\2\2-\u00e0\3"+
		"\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2\2\65\u00e9\3\2\2"+
		"\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0\3\2\2\2=\u00f2\3\2\2\2?\u00f5"+
		"\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I"+
		"\u0100\3\2\2\2K\u0102\3\2\2\2M\u0104\3\2\2\2O\u0106\3\2\2\2Q\u0108\3\2"+
		"\2\2S\u010a\3\2\2\2U\u011a\3\2\2\2W\u011c\3\2\2\2Y\u011e\3\2\2\2[\\\7"+
		"U\2\2\\]\7{\2\2]^\7u\2\2^_\7v\2\2_`\7g\2\2`a\7o\2\2ab\7\60\2\2bc\7q\2"+
		"\2cd\7w\2\2de\7v\2\2ef\7\60\2\2fg\7r\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk"+
		"\7v\2\2kl\7n\2\2lm\7p\2\2m\4\3\2\2\2no\7,\2\2o\6\3\2\2\2pr\t\2\2\2qp\3"+
		"\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\4\2\2v\b\3\2\2\2wx"+
		"\7d\2\2xy\7q\2\2yz\7q\2\2z{\7n\2\2{|\7g\2\2|}\7c\2\2}~\7p\2\2~\n\3\2\2"+
		"\2\177\u0080\7e\2\2\u0080\u0081\7n\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0084\7u\2\2\u0084\f\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\16\3\2\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7z\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7f\2\2\u0090\u0091\7u\2\2\u0091\20\3\2\2\2\u0092"+
		"\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2"+
		"\u0096\u0097\7g\2\2\u0097\22\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7"+
		"h\2\2\u009a\24\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7v\2\2\u009e\26\3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2"+
		"\7p\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\30\3\2\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7y\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7d\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7e\2\2"+
		"\u00b5\36\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7"+
		"v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc "+
		"\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7e\2\2\u00c3\"\3\2\2\2\u00c4"+
		"\u00c5\7U\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7k\2\2"+
		"\u00c8\u00c9\7p\2\2\u00c9\u00ca\7i\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7v\2"+
		"\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7u\2\2\u00cf&\3\2"+
		"\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7f\2\2\u00d9*\3\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc"+
		"\7j\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df"+
		",\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\60"+
		"\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7"+
		"\u00e8\7?\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7?\2\2\u00eb"+
		"\66\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef"+
		":\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4"+
		"\7(\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7~\2\2\u00f6\u00f7\7~\2\2\u00f7@\3"+
		"\2\2\2\u00f8\u00f9\7*\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7+\2\2\u00fbD\3\2"+
		"\2\2\u00fc\u00fd\7]\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7_\2\2\u00ffH\3\2\2"+
		"\2\u0100\u0101\7}\2\2\u0101J\3\2\2\2\u0102\u0103\7\177\2\2\u0103L\3\2"+
		"\2\2\u0104\u0105\7.\2\2\u0105N\3\2\2\2\u0106\u0107\7\60\2\2\u0107P\3\2"+
		"\2\2\u0108\u0109\7=\2\2\u0109R\3\2\2\2\u010a\u010f\5W,\2\u010b\u010e\5"+
		"W,\2\u010c\u010e\5Y-\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110T\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u011b\7\62\2\2\u0113\u0117\t\3\2\2\u0114\u0116\5"+
		"Y-\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u0112\3\2"+
		"\2\2\u011a\u0113\3\2\2\2\u011bV\3\2\2\2\u011c\u011d\t\4\2\2\u011dX\3\2"+
		"\2\2\u011e\u011f\t\5\2\2\u011fZ\3\2\2\2\b\2s\u010d\u010f\u0117\u011a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}