// Generated from /home/diana/IdeaProjects/BigAssLang/src/main/java/antlr/ass.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, ASSIGN=4, PLUS=5, MULTIPLY=6, DIVISION=7, MINUS=8, 
		POINT=9, COMMA=10, LEFT_SQUARE_BRACKET=11, RIGHT_SQUARE_BRACKET=12, LEFT_ROUND_BRACKET=13, 
		RIGHT_ROUND_BRACKET=14, LEFT_CURVY_BRACKET=15, RIGHT_CURVY_BRACKET=16, 
		LOWERCASE=17, UPPERCASE=18, ZERO=19, NATURAL=20, DIGIT=21, WS=22, NEWLINE=23, 
		AYE=24, GTFO=25, DOLLAR_SIGN=26, FUNKK=27, DROP=28, IF=29, ELSE=30, EQUAL=31, 
		GREATER=32, LESS=33, GREATER_OR_EQUAL=34, LESS_OR_EQUAL=35, NOT_EQUAL=36, 
		LOGICAL_AND=37, LOGICAL_OR=38, INVERSION=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "ASSIGN", "PLUS", "MULTIPLY", "DIVISION", "MINUS", 
			"POINT", "COMMA", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "LEFT_ROUND_BRACKET", 
			"RIGHT_ROUND_BRACKET", "LEFT_CURVY_BRACKET", "RIGHT_CURVY_BRACKET", "LOWERCASE", 
			"UPPERCASE", "ZERO", "NATURAL", "DIGIT", "WS", "NEWLINE", "AYE", "GTFO", 
			"DOLLAR_SIGN", "FUNKK", "DROP", "IF", "ELSE", "EQUAL", "GREATER", "LESS", 
			"GREATER_OR_EQUAL", "LESS_OR_EQUAL", "NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", 
			"INVERSION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INT'", "'FLOAT'", "'BOOL'", "'='", "'+'", "'*'", "'/'", "'-'", 
			"'.'", "','", "'['", "']'", "'('", "')'", "'{'", "'}'", null, null, "'0'", 
			null, null, null, null, "'AYE'", "'GTFO'", "'$'", "'FUNKK'", "'DROP'", 
			"'IF'", "'ELSE'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", 
			"'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "ASSIGN", "PLUS", "MULTIPLY", "DIVISION", 
			"MINUS", "POINT", "COMMA", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", 
			"LEFT_ROUND_BRACKET", "RIGHT_ROUND_BRACKET", "LEFT_CURVY_BRACKET", "RIGHT_CURVY_BRACKET", 
			"LOWERCASE", "UPPERCASE", "ZERO", "NATURAL", "DIGIT", "WS", "NEWLINE", 
			"AYE", "GTFO", "DOLLAR_SIGN", "FUNKK", "DROP", "IF", "ELSE", "EQUAL", 
			"GREATER", "LESS", "GREATER_OR_EQUAL", "LESS_OR_EQUAL", "NOT_EQUAL", 
			"LOGICAL_AND", "LOGICAL_OR", "INVERSION"
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


	public assLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ass.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\6\27\u0086\n\27\r\27\16\27\u0087\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\b\3\2c|\3\2C\\\3\2\63;\3\2\62;\4\2"+
		"\13\13\"\"\4\2\f\f\17\17\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3"+
		"\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31"+
		"p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2%|\3"+
		"\2\2\2\'~\3\2\2\2)\u0080\3\2\2\2+\u0082\3\2\2\2-\u0085\3\2\2\2/\u008b"+
		"\3\2\2\2\61\u008d\3\2\2\2\63\u0091\3\2\2\2\65\u0096\3\2\2\2\67\u0098\3"+
		"\2\2\29\u009e\3\2\2\2;\u00a3\3\2\2\2=\u00a6\3\2\2\2?\u00ab\3\2\2\2A\u00ae"+
		"\3\2\2\2C\u00b0\3\2\2\2E\u00b2\3\2\2\2G\u00b5\3\2\2\2I\u00b8\3\2\2\2K"+
		"\u00bb\3\2\2\2M\u00be\3\2\2\2O\u00c1\3\2\2\2QR\7K\2\2RS\7P\2\2ST\7V\2"+
		"\2T\4\3\2\2\2UV\7H\2\2VW\7N\2\2WX\7Q\2\2XY\7C\2\2YZ\7V\2\2Z\6\3\2\2\2"+
		"[\\\7D\2\2\\]\7Q\2\2]^\7Q\2\2^_\7N\2\2_\b\3\2\2\2`a\7?\2\2a\n\3\2\2\2"+
		"bc\7-\2\2c\f\3\2\2\2de\7,\2\2e\16\3\2\2\2fg\7\61\2\2g\20\3\2\2\2hi\7/"+
		"\2\2i\22\3\2\2\2jk\7\60\2\2k\24\3\2\2\2lm\7.\2\2m\26\3\2\2\2no\7]\2\2"+
		"o\30\3\2\2\2pq\7_\2\2q\32\3\2\2\2rs\7*\2\2s\34\3\2\2\2tu\7+\2\2u\36\3"+
		"\2\2\2vw\7}\2\2w \3\2\2\2xy\7\177\2\2y\"\3\2\2\2z{\t\2\2\2{$\3\2\2\2|"+
		"}\t\3\2\2}&\3\2\2\2~\177\7\62\2\2\177(\3\2\2\2\u0080\u0081\t\4\2\2\u0081"+
		"*\3\2\2\2\u0082\u0083\t\5\2\2\u0083,\3\2\2\2\u0084\u0086\t\6\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\27\2\2\u008a.\3\2\2\2\u008b\u008c"+
		"\t\7\2\2\u008c\60\3\2\2\2\u008d\u008e\7C\2\2\u008e\u008f\7[\2\2\u008f"+
		"\u0090\7G\2\2\u0090\62\3\2\2\2\u0091\u0092\7I\2\2\u0092\u0093\7V\2\2\u0093"+
		"\u0094\7H\2\2\u0094\u0095\7Q\2\2\u0095\64\3\2\2\2\u0096\u0097\7&\2\2\u0097"+
		"\66\3\2\2\2\u0098\u0099\7H\2\2\u0099\u009a\7W\2\2\u009a\u009b\7P\2\2\u009b"+
		"\u009c\7M\2\2\u009c\u009d\7M\2\2\u009d8\3\2\2\2\u009e\u009f\7F\2\2\u009f"+
		"\u00a0\7T\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7R\2\2\u00a2:\3\2\2\2\u00a3"+
		"\u00a4\7K\2\2\u00a4\u00a5\7H\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7G\2\2\u00a7"+
		"\u00a8\7N\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7G\2\2\u00aa>\3\2\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\u00ad\7?\2\2\u00ad@\3\2\2\2\u00ae\u00af\7@\2\2\u00af"+
		"B\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1D\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4F\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b7H\3"+
		"\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7?\2\2\u00baJ\3\2\2\2\u00bb\u00bc"+
		"\7(\2\2\u00bc\u00bd\7(\2\2\u00bdL\3\2\2\2\u00be\u00bf\7~\2\2\u00bf\u00c0"+
		"\7~\2\2\u00c0N\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2P\3\2\2\2\4\2\u0087\3\b"+
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