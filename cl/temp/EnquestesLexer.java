// Generated from Enquestes.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnquestesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIG=1, LINK=2, EOA=3, COMMA=4, LPAR=5, RPAR=6, LBRA=7, RBRA=8, QMARK=9, 
		QUEST=10, ANSW=11, ALT=12, ITEM=13, ENQUE=14, END=15, NUM=16, ID=17, WORD=18, 
		SPACE=19, NEWLINE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ASSIG", "LINK", "EOA", "COMMA", "LPAR", "RPAR", "LBRA", "RBRA", "QMARK", 
		"QUEST", "ANSW", "ALT", "ITEM", "ENQUE", "END", "NUM", "ID", "WORD", "SPACE", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'->'", "';'", "','", "'('", "')'", "'['", "']'", "'?'", 
		"'PREGUNTA'", "'RESPOSTA'", "'ALTERNATIVA'", "'ITEM'", "'ENQUESTA'", "'END'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIG", "LINK", "EOA", "COMMA", "LPAR", "RPAR", "LBRA", "RBRA", 
		"QMARK", "QUEST", "ANSW", "ALT", "ITEM", "ENQUE", "END", "NUM", "ID", 
		"WORD", "SPACE", "NEWLINE"
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


	public EnquestesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enquestes.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\6\21p\n\21"+
		"\r\21\16\21q\3\22\3\22\7\22v\n\22\f\22\16\22y\13\22\3\22\3\22\3\23\6\23"+
		"~\n\23\r\23\16\23\177\3\24\3\24\3\24\3\24\3\25\5\25\u0087\n\25\3\25\3"+
		"\25\6\25\u008b\n\25\r\25\16\25\u008c\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3"+
		"\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0093\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\60\3\2\2\2\t\62"+
		"\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2"+
		"\2\25>\3\2\2\2\27G\3\2\2\2\31P\3\2\2\2\33\\\3\2\2\2\35a\3\2\2\2\37j\3"+
		"\2\2\2!o\3\2\2\2#s\3\2\2\2%}\3\2\2\2\'\u0081\3\2\2\2)\u008a\3\2\2\2+,"+
		"\7<\2\2,\4\3\2\2\2-.\7/\2\2./\7@\2\2/\6\3\2\2\2\60\61\7=\2\2\61\b\3\2"+
		"\2\2\62\63\7.\2\2\63\n\3\2\2\2\64\65\7*\2\2\65\f\3\2\2\2\66\67\7+\2\2"+
		"\67\16\3\2\2\289\7]\2\29\20\3\2\2\2:;\7_\2\2;\22\3\2\2\2<=\7A\2\2=\24"+
		"\3\2\2\2>?\7R\2\2?@\7T\2\2@A\7G\2\2AB\7I\2\2BC\7W\2\2CD\7P\2\2DE\7V\2"+
		"\2EF\7C\2\2F\26\3\2\2\2GH\7T\2\2HI\7G\2\2IJ\7U\2\2JK\7R\2\2KL\7Q\2\2L"+
		"M\7U\2\2MN\7V\2\2NO\7C\2\2O\30\3\2\2\2PQ\7C\2\2QR\7N\2\2RS\7V\2\2ST\7"+
		"G\2\2TU\7T\2\2UV\7P\2\2VW\7C\2\2WX\7V\2\2XY\7K\2\2YZ\7X\2\2Z[\7C\2\2["+
		"\32\3\2\2\2\\]\7K\2\2]^\7V\2\2^_\7G\2\2_`\7O\2\2`\34\3\2\2\2ab\7G\2\2"+
		"bc\7P\2\2cd\7S\2\2de\7W\2\2ef\7G\2\2fg\7U\2\2gh\7V\2\2hi\7C\2\2i\36\3"+
		"\2\2\2jk\7G\2\2kl\7P\2\2lm\7F\2\2m \3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2r\"\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\t\2\2\2{$\3\2\2\2|~\t"+
		"\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080&\3"+
		"\2\2\2\u0081\u0082\t\5\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\24\2\2\u0084"+
		"(\3\2\2\2\u0085\u0087\7\17\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u008b\7\f\2\2\u0089\u008b\7\17\2\2\u008a\u0086"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d*\3\2\2\2\t\2qw\177\u0086\u008a\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}