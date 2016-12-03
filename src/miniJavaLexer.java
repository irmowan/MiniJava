// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
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
		INT_VAL=41, LETTER=42, DIGIT=43, SIGN=44, WS=45, COMMENT=46, LINE_COMMENT=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BOOLEAN", "CLASS", "ELSE", "EXTENDS", "FALSE", "IF", 
		"INT", "LENGTH", "MAIN", "NEW", "PUBLIC", "RETURN", "STATIC", "STRING", 
		"THIS", "TRUE", "VOID", "WHILE", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", 
		"L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI", "ID", "INT_VAL", "LETTER", 
		"DIGIT", "SIGN", "WS", "COMMENT", "LINE_COMMENT"
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
		"DIGIT", "SIGN", "WS", "COMMENT", "LINE_COMMENT"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0144\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3)\7)\u010d\n)\f)\16)\u0110\13)\3*\5*\u0113\n*\3*\3*\3*\7"+
		"*\u0118\n*\f*\16*\u011b\13*\5*\u011d\n*\3+\3+\3,\3,\3-\3-\3.\6.\u0126"+
		"\n.\r.\16.\u0127\3.\3.\3/\3/\3/\3/\7/\u0130\n/\f/\16/\u0133\13/\3/\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u013e\n\60\f\60\16\60\u0141\13\60\3"+
		"\60\3\60\3\u0131\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\b\3"+
		"\2\63;\5\2C\\aac|\3\2\62;\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u014b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3"+
		"\2\2\2\5t\3\2\2\2\7v\3\2\2\2\t~\3\2\2\2\13\u0084\3\2\2\2\r\u0089\3\2\2"+
		"\2\17\u0091\3\2\2\2\21\u0097\3\2\2\2\23\u009a\3\2\2\2\25\u009e\3\2\2\2"+
		"\27\u00a5\3\2\2\2\31\u00aa\3\2\2\2\33\u00ae\3\2\2\2\35\u00b5\3\2\2\2\37"+
		"\u00bc\3\2\2\2!\u00c3\3\2\2\2#\u00ca\3\2\2\2%\u00cf\3\2\2\2\'\u00d4\3"+
		"\2\2\2)\u00d9\3\2\2\2+\u00df\3\2\2\2-\u00e1\3\2\2\2/\u00e3\3\2\2\2\61"+
		"\u00e5\3\2\2\2\63\u00e8\3\2\2\2\65\u00eb\3\2\2\2\67\u00ed\3\2\2\29\u00ef"+
		"\3\2\2\2;\u00f1\3\2\2\2=\u00f4\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C"+
		"\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u00ff\3\2\2\2I\u0101\3\2\2\2K\u0103\3\2"+
		"\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2\2\2S\u0112\3\2\2\2U\u011e"+
		"\3\2\2\2W\u0120\3\2\2\2Y\u0122\3\2\2\2[\u0125\3\2\2\2]\u012b\3\2\2\2_"+
		"\u0139\3\2\2\2ab\7U\2\2bc\7{\2\2cd\7u\2\2de\7v\2\2ef\7g\2\2fg\7o\2\2g"+
		"h\7\60\2\2hi\7q\2\2ij\7w\2\2jk\7v\2\2kl\7\60\2\2lm\7r\2\2mn\7t\2\2no\7"+
		"k\2\2op\7p\2\2pq\7v\2\2qr\7n\2\2rs\7p\2\2s\4\3\2\2\2tu\7,\2\2u\6\3\2\2"+
		"\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g\2\2{|\7c\2\2|}\7p\2\2}\b\3"+
		"\2\2\2~\177\7e\2\2\177\u0080\7n\2\2\u0080\u0081\7c\2\2\u0081\u0082\7u"+
		"\2\2\u0082\u0083\7u\2\2\u0083\n\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\f\3\2\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7z\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7f\2\2\u008f\u0090\7u\2\2\u0090\16\3\2\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2"+
		"\u0095\u0096\7g\2\2\u0096\20\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7"+
		"h\2\2\u0099\22\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7v\2\2\u009d\24\3\2\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\26\3\2\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7y\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7w\2\2\u00b0"+
		"\u00b1\7d\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7e\2\2"+
		"\u00b4\34\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7"+
		"v\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7p\2\2\u00bb\36"+
		"\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7e\2\2\u00c2 \3\2\2\2\u00c3"+
		"\u00c4\7U\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2"+
		"\u00c7\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7v"+
		"\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7u\2\2\u00ce$\3"+
		"\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7w\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7x\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7f\2\2\u00d8(\3\2\2\2\u00d9\u00da\7y\2\2\u00da"+
		"\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2"+
		"\u00de*\3\2\2\2\u00df\u00e0\7?\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2"+
		".\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00ea"+
		"\64\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee"+
		"8\3\2\2\2\u00ef\u00f0\7#\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3"+
		"\7(\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7~\2\2\u00f6>\3"+
		"\2\2\2\u00f7\u00f8\7*\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7+\2\2\u00faB\3\2"+
		"\2\2\u00fb\u00fc\7]\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7_\2\2\u00feF\3\2\2"+
		"\2\u00ff\u0100\7}\2\2\u0100H\3\2\2\2\u0101\u0102\7\177\2\2\u0102J\3\2"+
		"\2\2\u0103\u0104\7.\2\2\u0104L\3\2\2\2\u0105\u0106\7\60\2\2\u0106N\3\2"+
		"\2\2\u0107\u0108\7=\2\2\u0108P\3\2\2\2\u0109\u010e\5U+\2\u010a\u010d\5"+
		"U+\2\u010b\u010d\5W,\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fR\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0113\5Y-\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2"+
		"\2\u0113\u011c\3\2\2\2\u0114\u011d\7\62\2\2\u0115\u0119\t\2\2\2\u0116"+
		"\u0118\5W,\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2"+
		"\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0114"+
		"\3\2\2\2\u011c\u0115\3\2\2\2\u011dT\3\2\2\2\u011e\u011f\t\3\2\2\u011f"+
		"V\3\2\2\2\u0120\u0121\t\4\2\2\u0121X\3\2\2\2\u0122\u0123\t\5\2\2\u0123"+
		"Z\3\2\2\2\u0124\u0126\t\6\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\b.\2\2\u012a\\\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7,\2\2\u012d"+
		"\u0131\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\61\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\b/\2\2\u0138^\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b"+
		"\7\61\2\2\u013b\u013f\3\2\2\2\u013c\u013e\n\7\2\2\u013d\u013c\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b\60\2\2\u0143`\3\2\2\2\13\2"+
		"\u010c\u010e\u0112\u0119\u011c\u0127\u0131\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}