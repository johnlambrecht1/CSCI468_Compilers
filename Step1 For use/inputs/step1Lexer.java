// Generated from C:/Users/John's Computer/OneDrive/Compilers/Project/CSCI468_Compilers\step1.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class step1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, KEYWORD=2, PROGRAM=3, BEGIN=4, END=5, FUNCTION=6, READ=7, WRITE=8, 
		IF=9, ELSE=10, ENDIF=11, WHILE=12, ENDWHILE=13, CONTINUE=14, BREAK=15, 
		RETURN=16, INT=17, VOID=18, STRING=19, FLOAT=20, OPERATOR=21, STRINGLITERAL=22, 
		FLOATLITERAL=23, INTLITERAL=24, IDENTIFIER=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "KEYWORD", "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", 
			"WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", 
			"RETURN", "INT", "VOID", "STRING", "FLOAT", "OPERATOR", "STRINGLITERAL", 
			"FLOATLITERAL", "INTLITERAL", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", "'READ'", 
			"'WRITE'", "'IF'", "'ELSE'", "'ENDIF'", "'WHILE'", "'ENDWHILE'", "'CONTINUE'", 
			"'BREAK'", "'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "KEYWORD", "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", 
			"WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", 
			"RETURN", "INT", "VOID", "STRING", "FLOAT", "OPERATOR", "STRINGLITERAL", 
			"FLOATLITERAL", "INTLITERAL", "IDENTIFIER", "WS"
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


	public step1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "step1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0102\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d1\n\26\3\27\3\27\3\27\7\27\u00d6\n\27\f\27\16\27\u00d9"+
		"\13\27\3\27\3\27\3\30\6\30\u00de\n\30\r\30\16\30\u00df\3\30\3\30\6\30"+
		"\u00e4\n\30\r\30\16\30\u00e5\3\30\3\30\6\30\u00ea\n\30\r\30\16\30\u00eb"+
		"\5\30\u00ee\n\30\3\31\6\31\u00f1\n\31\r\31\16\31\u00f2\3\32\3\32\7\32"+
		"\u00f7\n\32\f\32\16\32\u00fa\13\32\3\33\6\33\u00fd\n\33\r\33\16\33\u00fe"+
		"\3\33\3\33\3=\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\3\2\t\3\2\f\f\5\2*/\61\61=@\3\2$$\3\2\62;\4\2C\\c|\5\2\62;C\\c"+
		"|\5\2\13\f\17\17\"\"\2\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3"+
		"\67\3\2\2\2\5V\3\2\2\2\7X\3\2\2\2\t`\3\2\2\2\13f\3\2\2\2\rj\3\2\2\2\17"+
		"s\3\2\2\2\21x\3\2\2\2\23~\3\2\2\2\25\u0081\3\2\2\2\27\u0086\3\2\2\2\31"+
		"\u008c\3\2\2\2\33\u0092\3\2\2\2\35\u009b\3\2\2\2\37\u00a4\3\2\2\2!\u00aa"+
		"\3\2\2\2#\u00b1\3\2\2\2%\u00b5\3\2\2\2\'\u00ba\3\2\2\2)\u00c1\3\2\2\2"+
		"+\u00d0\3\2\2\2-\u00d2\3\2\2\2/\u00ed\3\2\2\2\61\u00f0\3\2\2\2\63\u00f4"+
		"\3\2\2\2\65\u00fc\3\2\2\2\678\7/\2\289\7/\2\29=\3\2\2\2:<\13\2\2\2;:\3"+
		"\2\2\2<?\3\2\2\2=>\3\2\2\2=;\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\t\2\2\2AB\3"+
		"\2\2\2BC\b\2\2\2C\4\3\2\2\2DW\5\7\4\2EW\5\t\5\2FW\5\13\6\2GW\5\r\7\2H"+
		"W\5\17\b\2IW\5\21\t\2JW\5\23\n\2KW\5\25\13\2LW\5\27\f\2MW\5\31\r\2NW\5"+
		"\33\16\2OW\5\35\17\2PW\5\37\20\2QW\5!\21\2RW\5#\22\2SW\5%\23\2TW\5\'\24"+
		"\2UW\5)\25\2VD\3\2\2\2VE\3\2\2\2VF\3\2\2\2VG\3\2\2\2VH\3\2\2\2VI\3\2\2"+
		"\2VJ\3\2\2\2VK\3\2\2\2VL\3\2\2\2VM\3\2\2\2VN\3\2\2\2VO\3\2\2\2VP\3\2\2"+
		"\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\6\3\2\2\2XY\7R\2"+
		"\2YZ\7T\2\2Z[\7Q\2\2[\\\7I\2\2\\]\7T\2\2]^\7C\2\2^_\7O\2\2_\b\3\2\2\2"+
		"`a\7D\2\2ab\7G\2\2bc\7I\2\2cd\7K\2\2de\7P\2\2e\n\3\2\2\2fg\7G\2\2gh\7"+
		"P\2\2hi\7F\2\2i\f\3\2\2\2jk\7H\2\2kl\7W\2\2lm\7P\2\2mn\7E\2\2no\7V\2\2"+
		"op\7K\2\2pq\7Q\2\2qr\7P\2\2r\16\3\2\2\2st\7T\2\2tu\7G\2\2uv\7C\2\2vw\7"+
		"F\2\2w\20\3\2\2\2xy\7Y\2\2yz\7T\2\2z{\7K\2\2{|\7V\2\2|}\7G\2\2}\22\3\2"+
		"\2\2~\177\7K\2\2\177\u0080\7H\2\2\u0080\24\3\2\2\2\u0081\u0082\7G\2\2"+
		"\u0082\u0083\7N\2\2\u0083\u0084\7U\2\2\u0084\u0085\7G\2\2\u0085\26\3\2"+
		"\2\2\u0086\u0087\7G\2\2\u0087\u0088\7P\2\2\u0088\u0089\7F\2\2\u0089\u008a"+
		"\7K\2\2\u008a\u008b\7H\2\2\u008b\30\3\2\2\2\u008c\u008d\7Y\2\2\u008d\u008e"+
		"\7J\2\2\u008e\u008f\7K\2\2\u008f\u0090\7N\2\2\u0090\u0091\7G\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0093\7G\2\2\u0093\u0094\7P\2\2\u0094\u0095\7F\2\2\u0095"+
		"\u0096\7Y\2\2\u0096\u0097\7J\2\2\u0097\u0098\7K\2\2\u0098\u0099\7N\2\2"+
		"\u0099\u009a\7G\2\2\u009a\34\3\2\2\2\u009b\u009c\7E\2\2\u009c\u009d\7"+
		"Q\2\2\u009d\u009e\7P\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1"+
		"\7P\2\2\u00a1\u00a2\7W\2\2\u00a2\u00a3\7G\2\2\u00a3\36\3\2\2\2\u00a4\u00a5"+
		"\7D\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7C\2\2\u00a8"+
		"\u00a9\7M\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7G\2\2\u00ac"+
		"\u00ad\7V\2\2\u00ad\u00ae\7W\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7P\2\2"+
		"\u00b0\"\3\2\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b4\7V"+
		"\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7X\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8"+
		"\7K\2\2\u00b8\u00b9\7F\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7U\2\2\u00bb\u00bc"+
		"\7V\2\2\u00bc\u00bd\7T\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7P\2\2\u00bf"+
		"\u00c0\7I\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7H\2\2\u00c2\u00c3\7N\2\2\u00c3"+
		"\u00c4\7Q\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\7V\2\2\u00c6*\3\2\2\2\u00c7"+
		"\u00c8\7>\2\2\u00c8\u00d1\7?\2\2\u00c9\u00ca\7@\2\2\u00ca\u00d1\7?\2\2"+
		"\u00cb\u00cc\7#\2\2\u00cc\u00d1\7?\2\2\u00cd\u00ce\7<\2\2\u00ce\u00d1"+
		"\7?\2\2\u00cf\u00d1\t\3\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0"+
		"\u00cb\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1,\3\2\2\2"+
		"\u00d2\u00d7\7$\2\2\u00d3\u00d4\13\2\2\2\u00d4\u00d6\n\4\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db.\3\2\2\2\u00dc"+
		"\u00de\t\5\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\60\2\2\u00e2"+
		"\u00e4\t\5\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ee\3\2\2\2\u00e7\u00e9\7\60\2\2\u00e8"+
		"\u00ea\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00dd\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ee\60\3\2\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\62"+
		"\3\2\2\2\u00f4\u00f8\t\6\2\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\64\3\2\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\t\b\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b\33\2\2\u0101\66\3\2\2\2\17\2=V\u00d0\u00d7\u00df\u00e5\u00eb"+
		"\u00ed\u00f2\u00f6\u00f8\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}