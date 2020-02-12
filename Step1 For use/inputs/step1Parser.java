// Generated from C:/Users/John's Computer/OneDrive/Compilers/Project/CSCI468_Compilers\step1.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class step1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, KEYWORD=2, PROGRAM=3, BEGIN=4, END=5, FUNCTION=6, READ=7, WRITE=8, 
		IF=9, ELSE=10, ENDIF=11, WHILE=12, ENDWHILE=13, CONTINUE=14, BREAK=15, 
		RETURN=16, INT=17, VOID=18, STRING=19, FLOAT=20, OPERATOR=21, STRINGLITERAL=22, 
		FLOATLITERAL=23, INTLITERAL=24, IDENTIFIER=25, WS=26;
	public static final int
		RULE_rg = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"rg"
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

	@Override
	public String getGrammarFileName() { return "step1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public step1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(step1Parser.PROGRAM, 0); }
		public TerminalNode OPERATOR() { return getToken(step1Parser.OPERATOR, 0); }
		public RgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof step1Listener ) ((step1Listener)listener).enterRg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof step1Listener ) ((step1Listener)listener).exitRg(this);
		}
	}

	public final RgContext rg() throws RecognitionException {
		RgContext _localctx = new RgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(PROGRAM);
			setState(3);
			match(OPERATOR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\b\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\2\2\3\2\2\2\2\6\2\4\3\2\2\2\4\5\7\5\2\2\5\6\7\27\2\2\6\3"+
		"\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}