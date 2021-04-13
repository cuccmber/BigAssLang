// Generated from /home/diana/IdeaProjects/BigAssLang/src/main/java/antlr/ass.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_type = 1, RULE_arrayType = 2, RULE_varName = 3, RULE_value = 4, 
		RULE_arrayElement = 5, RULE_array = 6, RULE_intValue = 7, RULE_unsignedIntValue = 8, 
		RULE_floatValue = 9, RULE_boolValue = 10, RULE_getElement = 11, RULE_declare = 12, 
		RULE_assignmentLeftPart = 13, RULE_assignmentRightPart = 14, RULE_assign = 15, 
		RULE_cast = 16, RULE_statement = 17, RULE_bodyContent = 18, RULE_signature = 19, 
		RULE_attribute = 20, RULE_drop = 21, RULE_func = 22, RULE_funcCallAttribute = 23, 
		RULE_funcCall = 24, RULE_comparisonOperator = 25, RULE_logicalComparisonOperator = 26, 
		RULE_comparisonAtom = 27, RULE_comparisonStatement = 28, RULE_comparisonLogicalStatement = 29, 
		RULE_comparisonLogicalStatementWithBrackets = 30, RULE_ifBlock = 31, RULE_elifBlock = 32, 
		RULE_elseBlock = 33, RULE_ifClause = 34, RULE_arithmeticOperator = 35, 
		RULE_arithmeticAtom = 36, RULE_arithmeticAtomWithBrackets = 37, RULE_arithmeticExpression = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "type", "arrayType", "varName", "value", "arrayElement", "array", 
			"intValue", "unsignedIntValue", "floatValue", "boolValue", "getElement", 
			"declare", "assignmentLeftPart", "assignmentRightPart", "assign", "cast", 
			"statement", "bodyContent", "signature", "attribute", "drop", "func", 
			"funcCallAttribute", "funcCall", "comparisonOperator", "logicalComparisonOperator", 
			"comparisonAtom", "comparisonStatement", "comparisonLogicalStatement", 
			"comparisonLogicalStatementWithBrackets", "ifBlock", "elifBlock", "elseBlock", 
			"ifClause", "arithmeticOperator", "arithmeticAtom", "arithmeticAtomWithBrackets", 
			"arithmeticExpression"
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

	@Override
	public String getGrammarFileName() { return "ass.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public assParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(78);
				match(NEWLINE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				func();
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					match(NEWLINE);
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNKK );
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
		public TerminalNode INT() { return getToken(assParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(assParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(assParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(assParser.LEFT_SQUARE_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(assParser.RIGHT_SQUARE_BRACKET, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LEFT_SQUARE_BRACKET);
			setState(97);
			type();
			setState(98);
			match(RIGHT_SQUARE_BRACKET);
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

	public static class VarNameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCASE() { return getTokens(assParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(assParser.LOWERCASE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(assParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(assParser.UPPERCASE, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(assParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(assParser.ZERO, i);
		}
		public List<TerminalNode> NATURAL() { return getTokens(assParser.NATURAL); }
		public TerminalNode NATURAL(int i) {
			return getToken(assParser.NATURAL, i);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(LOWERCASE);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE) | (1L << UPPERCASE) | (1L << ZERO) | (1L << NATURAL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				intValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				floatValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				boolValue();
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

	public static class ArrayElementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayElement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				varName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				funcCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				array();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(assParser.LEFT_CURVY_BRACKET, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(assParser.RIGHT_CURVY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(assParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(assParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LEFT_CURVY_BRACKET);
			setState(120);
			arrayElement();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				arrayElement();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RIGHT_CURVY_BRACKET);
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

	public static class IntValueContext extends ParserRuleContext {
		public List<TerminalNode> ZERO() { return getTokens(assParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(assParser.ZERO, i);
		}
		public TerminalNode MINUS() { return getToken(assParser.MINUS, 0); }
		public List<TerminalNode> NATURAL() { return getTokens(assParser.NATURAL); }
		public TerminalNode NATURAL(int i) {
			return getToken(assParser.NATURAL, i);
		}
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intValue);
		int _la;
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ZERO);
				}
				break;
			case MINUS:
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(131);
					match(MINUS);
					}
				}

				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(134);
						match(NATURAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						_la = _input.LA(1);
						if ( !(_la==ZERO || _la==NATURAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
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

	public static class UnsignedIntValueContext extends ParserRuleContext {
		public List<TerminalNode> ZERO() { return getTokens(assParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(assParser.ZERO, i);
		}
		public List<TerminalNode> NATURAL() { return getTokens(assParser.NATURAL); }
		public TerminalNode NATURAL(int i) {
			return getToken(assParser.NATURAL, i);
		}
		public UnsignedIntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedIntValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitUnsignedIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntValueContext unsignedIntValue() throws RecognitionException {
		UnsignedIntValueContext _localctx = new UnsignedIntValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unsignedIntValue);
		int _la;
		try {
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(ZERO);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(148);
						match(NATURAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(151); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NATURAL) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==ZERO || _la==NATURAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FloatValueContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(assParser.POINT, 0); }
		public List<TerminalNode> ZERO() { return getTokens(assParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(assParser.ZERO, i);
		}
		public List<TerminalNode> NATURAL() { return getTokens(assParser.NATURAL); }
		public TerminalNode NATURAL(int i) {
			return getToken(assParser.NATURAL, i);
		}
		public TerminalNode MINUS() { return getToken(assParser.MINUS, 0); }
		public FloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floatValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(161);
				match(MINUS);
				}
			}

			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				{
				setState(164);
				match(ZERO);
				}
				break;
			case NATURAL:
				{
				setState(165);
				match(NATURAL);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NATURAL) {
					{
					{
					setState(166);
					_la = _input.LA(1);
					if ( !(_la==ZERO || _la==NATURAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(174);
			match(POINT);
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					_la = _input.LA(1);
					if ( !(_la==ZERO || _la==NATURAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
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

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode AYE() { return getToken(assParser.AYE, 0); }
		public TerminalNode GTFO() { return getToken(assParser.GTFO, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==AYE || _la==GTFO) ) {
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

	public static class GetElementContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(assParser.LEFT_SQUARE_BRACKET, 0); }
		public UnsignedIntValueContext unsignedIntValue() {
			return getRuleContext(UnsignedIntValueContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(assParser.RIGHT_SQUARE_BRACKET, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public GetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitGetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetElementContext getElement() throws RecognitionException {
		GetElementContext _localctx = new GetElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_getElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LEFT_SQUARE_BRACKET);
			setState(183);
			unsignedIntValue();
			setState(184);
			match(RIGHT_SQUARE_BRACKET);
			setState(185);
			varName();
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

	public static class DeclareContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(187);
				type();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				{
				setState(188);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
			varName();
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

	public static class AssignmentLeftPartContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public AssignmentLeftPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentLeftPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitAssignmentLeftPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentLeftPartContext assignmentLeftPart() throws RecognitionException {
		AssignmentLeftPartContext _localctx = new AssignmentLeftPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentLeftPart);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				declare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				varName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				getElement();
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

	public static class AssignmentRightPartContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public AssignmentRightPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentRightPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitAssignmentRightPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentRightPartContext assignmentRightPart() throws RecognitionException {
		AssignmentRightPartContext _localctx = new AssignmentRightPartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentRightPart);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				varName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				arithmeticExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				funcCall();
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

	public static class AssignContext extends ParserRuleContext {
		public AssignmentLeftPartContext assignmentLeftPart() {
			return getRuleContext(AssignmentLeftPartContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public AssignmentRightPartContext assignmentRightPart() {
			return getRuleContext(AssignmentRightPartContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			assignmentLeftPart();
			setState(207);
			match(ASSIGN);
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(208);
				cast();
				}
				break;
			}
			setState(211);
			assignmentRightPart();
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LEFT_ROUND_BRACKET);
			{
			setState(214);
			type();
			}
			setState(215);
			match(RIGHT_ROUND_BRACKET);
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
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfClauseContext ifClause() {
			return getRuleContext(IfClauseContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(217);
				declare();
				}
				break;
			case 2:
				{
				setState(218);
				assign();
				}
				break;
			case 3:
				{
				setState(219);
				ifClause();
				}
				break;
			case 4:
				{
				setState(220);
				funcCall();
				}
				break;
			}
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(NEWLINE);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class BodyContentContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContentContext bodyContent() throws RecognitionException {
		BodyContentContext _localctx = new BodyContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bodyContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_SQUARE_BRACKET) | (1L << LOWERCASE) | (1L << IF))) != 0)) {
				{
				{
				setState(228);
				statement();
				}
				}
				setState(233);
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

	public static class SignatureContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			varName();
			setState(235);
			match(LEFT_ROUND_BRACKET);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_SQUARE_BRACKET))) != 0)) {
				{
				{
				setState(236);
				attribute();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(RIGHT_ROUND_BRACKET);
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

	public static class AttributeContext extends ParserRuleContext {
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(assParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(assParser.COMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attribute);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					declare();
					setState(245);
					match(COMMA);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(252);
			declare();
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(assParser.DROP, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ComparisonLogicalStatementWithBracketsContext comparisonLogicalStatementWithBrackets() {
			return getRuleContext(ComparisonLogicalStatementWithBracketsContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(DROP);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_ROUND_BRACKET) | (1L << LEFT_CURVY_BRACKET) | (1L << LOWERCASE) | (1L << ZERO) | (1L << NATURAL) | (1L << AYE) | (1L << GTFO))) != 0)) {
				{
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(255);
					varName();
					}
					break;
				case 2:
					{
					setState(256);
					value();
					}
					break;
				case 3:
					{
					setState(257);
					array();
					}
					break;
				case 4:
					{
					setState(258);
					comparisonLogicalStatementWithBrackets();
					}
					break;
				case 5:
					{
					setState(259);
					arithmeticExpression();
					}
					break;
				case 6:
					{
					setState(260);
					funcCall();
					}
					break;
				}
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNKK() { return getToken(assParser.FUNKK, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
		}
		public List<TerminalNode> DOLLAR_SIGN() { return getTokens(assParser.DOLLAR_SIGN); }
		public TerminalNode DOLLAR_SIGN(int i) {
			return getToken(assParser.DOLLAR_SIGN, i);
		}
		public BodyContentContext bodyContent() {
			return getRuleContext(BodyContentContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FUNKK);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_SQUARE_BRACKET))) != 0)) {
				{
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case BOOL:
					{
					setState(266);
					type();
					}
					break;
				case LEFT_SQUARE_BRACKET:
					{
					setState(267);
					arrayType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(272);
			signature();
			setState(273);
			match(NEWLINE);
			setState(274);
			match(DOLLAR_SIGN);
			setState(275);
			match(NEWLINE);
			setState(276);
			bodyContent();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DROP) {
				{
				setState(277);
				drop();
				setState(278);
				match(NEWLINE);
				}
			}

			setState(282);
			match(DOLLAR_SIGN);
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

	public static class FuncCallAttributeContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FuncCallAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitFuncCallAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallAttributeContext funcCallAttribute() throws RecognitionException {
		FuncCallAttributeContext _localctx = new FuncCallAttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funcCallAttribute);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				funcCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				array();
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

	public static class FuncCallContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public List<FuncCallAttributeContext> funcCallAttribute() {
			return getRuleContexts(FuncCallAttributeContext.class);
		}
		public FuncCallAttributeContext funcCallAttribute(int i) {
			return getRuleContext(FuncCallAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(assParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(assParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			varName();
			setState(292);
			match(LEFT_ROUND_BRACKET);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_CURVY_BRACKET) | (1L << LOWERCASE) | (1L << ZERO) | (1L << NATURAL) | (1L << AYE) | (1L << GTFO))) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						funcCallAttribute();
						setState(294);
						match(COMMA);
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(301);
				funcCallAttribute();
				}
			}

			setState(304);
			match(RIGHT_ROUND_BRACKET);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(assParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(assParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(assParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(assParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(assParser.LESS_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(assParser.NOT_EQUAL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_OR_EQUAL) | (1L << LESS_OR_EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
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

	public static class LogicalComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LOGICAL_AND() { return getToken(assParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(assParser.LOGICAL_OR, 0); }
		public LogicalComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalComparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitLogicalComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalComparisonOperatorContext logicalComparisonOperator() throws RecognitionException {
		LogicalComparisonOperatorContext _localctx = new LogicalComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalComparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==LOGICAL_AND || _la==LOGICAL_OR) ) {
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

	public static class ComparisonAtomContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ComparisonAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitComparisonAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonAtomContext comparisonAtom() throws RecognitionException {
		ComparisonAtomContext _localctx = new ComparisonAtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparisonAtom);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				signature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				arithmeticExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				funcCall();
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

	public static class ComparisonStatementContext extends ParserRuleContext {
		public List<ComparisonAtomContext> comparisonAtom() {
			return getRuleContexts(ComparisonAtomContext.class);
		}
		public ComparisonAtomContext comparisonAtom(int i) {
			return getRuleContext(ComparisonAtomContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitComparisonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonStatementContext comparisonStatement() throws RecognitionException {
		ComparisonStatementContext _localctx = new ComparisonStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparisonStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			comparisonAtom();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_OR_EQUAL) | (1L << LESS_OR_EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				setState(319);
				comparisonOperator();
				setState(320);
				comparisonAtom();
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

	public static class ComparisonLogicalStatementContext extends ParserRuleContext {
		public List<ComparisonStatementContext> comparisonStatement() {
			return getRuleContexts(ComparisonStatementContext.class);
		}
		public ComparisonStatementContext comparisonStatement(int i) {
			return getRuleContext(ComparisonStatementContext.class,i);
		}
		public List<LogicalComparisonOperatorContext> logicalComparisonOperator() {
			return getRuleContexts(LogicalComparisonOperatorContext.class);
		}
		public LogicalComparisonOperatorContext logicalComparisonOperator(int i) {
			return getRuleContext(LogicalComparisonOperatorContext.class,i);
		}
		public ComparisonLogicalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonLogicalStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitComparisonLogicalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonLogicalStatementContext comparisonLogicalStatement() throws RecognitionException {
		ComparisonLogicalStatementContext _localctx = new ComparisonLogicalStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparisonLogicalStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			comparisonStatement();
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					logicalComparisonOperator();
					setState(326);
					comparisonStatement();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class ComparisonLogicalStatementWithBracketsContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public List<ComparisonLogicalStatementContext> comparisonLogicalStatement() {
			return getRuleContexts(ComparisonLogicalStatementContext.class);
		}
		public ComparisonLogicalStatementContext comparisonLogicalStatement(int i) {
			return getRuleContext(ComparisonLogicalStatementContext.class,i);
		}
		public List<ComparisonLogicalStatementWithBracketsContext> comparisonLogicalStatementWithBrackets() {
			return getRuleContexts(ComparisonLogicalStatementWithBracketsContext.class);
		}
		public ComparisonLogicalStatementWithBracketsContext comparisonLogicalStatementWithBrackets(int i) {
			return getRuleContext(ComparisonLogicalStatementWithBracketsContext.class,i);
		}
		public List<LogicalComparisonOperatorContext> logicalComparisonOperator() {
			return getRuleContexts(LogicalComparisonOperatorContext.class);
		}
		public LogicalComparisonOperatorContext logicalComparisonOperator(int i) {
			return getRuleContext(LogicalComparisonOperatorContext.class,i);
		}
		public ComparisonLogicalStatementWithBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonLogicalStatementWithBrackets; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitComparisonLogicalStatementWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonLogicalStatementWithBracketsContext comparisonLogicalStatementWithBrackets() throws RecognitionException {
		ComparisonLogicalStatementWithBracketsContext _localctx = new ComparisonLogicalStatementWithBracketsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comparisonLogicalStatementWithBrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LEFT_ROUND_BRACKET);
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(334);
				comparisonLogicalStatement();
				}
				break;
			case 2:
				{
				setState(335);
				comparisonLogicalStatementWithBrackets();
				}
				break;
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND || _la==LOGICAL_OR) {
				{
				{
				setState(338);
				logicalComparisonOperator();
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(339);
					comparisonLogicalStatement();
					}
					break;
				case 2:
					{
					setState(340);
					comparisonLogicalStatementWithBrackets();
					}
					break;
				}
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(RIGHT_ROUND_BRACKET);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(assParser.IF, 0); }
		public ComparisonLogicalStatementWithBracketsContext comparisonLogicalStatementWithBrackets() {
			return getRuleContext(ComparisonLogicalStatementWithBracketsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
		}
		public List<TerminalNode> DOLLAR_SIGN() { return getTokens(assParser.DOLLAR_SIGN); }
		public TerminalNode DOLLAR_SIGN(int i) {
			return getToken(assParser.DOLLAR_SIGN, i);
		}
		public BodyContentContext bodyContent() {
			return getRuleContext(BodyContentContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(IF);
			setState(351);
			comparisonLogicalStatementWithBrackets();
			setState(352);
			match(NEWLINE);
			setState(353);
			match(DOLLAR_SIGN);
			setState(354);
			match(NEWLINE);
			setState(355);
			bodyContent();
			setState(356);
			match(DOLLAR_SIGN);
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

	public static class ElifBlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(assParser.NEWLINE, 0); }
		public TerminalNode ELSE() { return getToken(assParser.ELSE, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(NEWLINE);
			setState(359);
			match(ELSE);
			setState(360);
			ifBlock();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(assParser.ELSE, 0); }
		public List<TerminalNode> DOLLAR_SIGN() { return getTokens(assParser.DOLLAR_SIGN); }
		public TerminalNode DOLLAR_SIGN(int i) {
			return getToken(assParser.DOLLAR_SIGN, i);
		}
		public BodyContentContext bodyContent() {
			return getRuleContext(BodyContentContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(NEWLINE);
			setState(363);
			match(ELSE);
			setState(364);
			match(NEWLINE);
			setState(365);
			match(DOLLAR_SIGN);
			setState(366);
			match(NEWLINE);
			setState(367);
			bodyContent();
			setState(368);
			match(DOLLAR_SIGN);
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

	public static class IfClauseContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClauseContext ifClause() throws RecognitionException {
		IfClauseContext _localctx = new IfClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			ifBlock();
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					elifBlock();
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(377);
				elseBlock();
				}
				break;
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(assParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(assParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(assParser.MULTIPLY, 0); }
		public TerminalNode DIVISION() { return getToken(assParser.DIVISION, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MULTIPLY) | (1L << DIVISION) | (1L << MINUS))) != 0)) ) {
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

	public static class ArithmeticAtomContext extends ParserRuleContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<GetElementContext> getElement() {
			return getRuleContexts(GetElementContext.class);
		}
		public GetElementContext getElement(int i) {
			return getRuleContext(GetElementContext.class,i);
		}
		public List<ArithmeticAtomWithBracketsContext> arithmeticAtomWithBrackets() {
			return getRuleContexts(ArithmeticAtomWithBracketsContext.class);
		}
		public ArithmeticAtomWithBracketsContext arithmeticAtomWithBrackets(int i) {
			return getRuleContext(ArithmeticAtomWithBracketsContext.class,i);
		}
		public List<ArithmeticOperatorContext> arithmeticOperator() {
			return getRuleContexts(ArithmeticOperatorContext.class);
		}
		public ArithmeticOperatorContext arithmeticOperator(int i) {
			return getRuleContext(ArithmeticOperatorContext.class,i);
		}
		public ArithmeticAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArithmeticAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAtomContext arithmeticAtom() throws RecognitionException {
		ArithmeticAtomContext _localctx = new ArithmeticAtomContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arithmeticAtom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASE:
				{
				setState(382);
				varName();
				}
				break;
			case MINUS:
			case ZERO:
			case NATURAL:
			case AYE:
			case GTFO:
				{
				setState(383);
				value();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				{
				setState(384);
				getElement();
				}
				break;
			case LEFT_ROUND_BRACKET:
				{
				setState(385);
				arithmeticAtomWithBrackets();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(388);
					arithmeticOperator();
					setState(393);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOWERCASE:
						{
						setState(389);
						varName();
						}
						break;
					case MINUS:
					case ZERO:
					case NATURAL:
					case AYE:
					case GTFO:
						{
						setState(390);
						value();
						}
						break;
					case LEFT_SQUARE_BRACKET:
						{
						setState(391);
						getElement();
						}
						break;
					case LEFT_ROUND_BRACKET:
						{
						setState(392);
						arithmeticAtomWithBrackets();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class ArithmeticAtomWithBracketsContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public List<ArithmeticAtomContext> arithmeticAtom() {
			return getRuleContexts(ArithmeticAtomContext.class);
		}
		public ArithmeticAtomContext arithmeticAtom(int i) {
			return getRuleContext(ArithmeticAtomContext.class,i);
		}
		public ArithmeticAtomWithBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAtomWithBrackets; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArithmeticAtomWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAtomWithBracketsContext arithmeticAtomWithBrackets() throws RecognitionException {
		ArithmeticAtomWithBracketsContext _localctx = new ArithmeticAtomWithBracketsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arithmeticAtomWithBrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LEFT_ROUND_BRACKET);
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				arithmeticAtom();
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_ROUND_BRACKET) | (1L << LOWERCASE) | (1L << ZERO) | (1L << NATURAL) | (1L << AYE) | (1L << GTFO))) != 0) );
			setState(405);
			match(RIGHT_ROUND_BRACKET);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<ArithmeticAtomWithBracketsContext> arithmeticAtomWithBrackets() {
			return getRuleContexts(ArithmeticAtomWithBracketsContext.class);
		}
		public ArithmeticAtomWithBracketsContext arithmeticAtomWithBrackets(int i) {
			return getRuleContext(ArithmeticAtomWithBracketsContext.class,i);
		}
		public List<ArithmeticAtomContext> arithmeticAtom() {
			return getRuleContexts(ArithmeticAtomContext.class);
		}
		public ArithmeticAtomContext arithmeticAtom(int i) {
			return getRuleContext(ArithmeticAtomContext.class,i);
		}
		public List<ArithmeticOperatorContext> arithmeticOperator() {
			return getRuleContexts(ArithmeticOperatorContext.class);
		}
		public ArithmeticOperatorContext arithmeticOperator(int i) {
			return getRuleContext(ArithmeticOperatorContext.class,i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(407);
				arithmeticAtomWithBrackets();
				}
				break;
			case 2:
				{
				setState(408);
				arithmeticAtom();
				}
				break;
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MULTIPLY) | (1L << DIVISION) | (1L << MINUS))) != 0)) {
				{
				{
				setState(411);
				arithmeticOperator();
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(412);
					arithmeticAtom();
					}
					break;
				case 2:
					{
					setState(413);
					arithmeticAtomWithBrackets();
					}
					break;
				}
				}
				}
				setState(420);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u01a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\6\2Y\n\2\r\2\16\2Z\6\2]\n\2\r\2\16\2^\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\5\6q\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7x\n\7\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\b"+
		"\3\b\3\t\3\t\5\t\u0087\n\t\3\t\6\t\u008a\n\t\r\t\16\t\u008b\3\t\7\t\u008f"+
		"\n\t\f\t\16\t\u0092\13\t\5\t\u0094\n\t\3\n\3\n\6\n\u0098\n\n\r\n\16\n"+
		"\u0099\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\5\n\u00a2\n\n\3\13\5\13\u00a5"+
		"\n\13\3\13\3\13\3\13\7\13\u00aa\n\13\f\13\16\13\u00ad\13\13\5\13\u00af"+
		"\n\13\3\13\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\5\16\u00c0\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00c7\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\21\3\21\3\21\5\21"+
		"\u00d4\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00e0"+
		"\n\23\3\23\6\23\u00e3\n\23\r\23\16\23\u00e4\3\24\7\24\u00e8\n\24\f\24"+
		"\16\24\u00eb\13\24\3\25\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\7\26\u00fa\n\26\f\26\16\26\u00fd\13\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0108\n\27\5\27\u010a"+
		"\n\27\3\30\3\30\3\30\5\30\u010f\n\30\5\30\u0111\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u011b\n\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0124\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u012b\n\32\f\32\16"+
		"\32\u012e\13\32\3\32\5\32\u0131\n\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u013f\n\35\3\36\3\36\3\36\3\36\5\36\u0145"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u014b\n\37\f\37\16\37\u014e\13\37\3 \3"+
		" \3 \5 \u0153\n \3 \3 \3 \5 \u0158\n \7 \u015a\n \f \16 \u015d\13 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\7$\u0177\n$\f$\16$\u017a\13$\3$\5$\u017d\n$\3%\3%\3&\3&\3&\3&\5&"+
		"\u0185\n&\3&\3&\3&\3&\3&\5&\u018c\n&\6&\u018e\n&\r&\16&\u018f\3\'\3\'"+
		"\6\'\u0194\n\'\r\'\16\'\u0195\3\'\3\'\3(\3(\5(\u019c\n(\3(\3(\3(\5(\u01a1"+
		"\n(\7(\u01a3\n(\f(\16(\u01a6\13(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\t\3\2\3\5\3\2\23\26\3\2\25"+
		"\26\3\2\32\33\3\2!&\3\2\'(\3\2\7\n\2\u01cc\2S\3\2\2\2\4`\3\2\2\2\6b\3"+
		"\2\2\2\bf\3\2\2\2\np\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20\u0093\3\2\2\2\22"+
		"\u00a1\3\2\2\2\24\u00a4\3\2\2\2\26\u00b6\3\2\2\2\30\u00b8\3\2\2\2\32\u00bf"+
		"\3\2\2\2\34\u00c6\3\2\2\2\36\u00ce\3\2\2\2 \u00d0\3\2\2\2\"\u00d7\3\2"+
		"\2\2$\u00df\3\2\2\2&\u00e9\3\2\2\2(\u00ec\3\2\2\2*\u00fb\3\2\2\2,\u0100"+
		"\3\2\2\2.\u010b\3\2\2\2\60\u0123\3\2\2\2\62\u0125\3\2\2\2\64\u0134\3\2"+
		"\2\2\66\u0136\3\2\2\28\u013e\3\2\2\2:\u0140\3\2\2\2<\u0146\3\2\2\2>\u014f"+
		"\3\2\2\2@\u0160\3\2\2\2B\u0168\3\2\2\2D\u016c\3\2\2\2F\u0174\3\2\2\2H"+
		"\u017e\3\2\2\2J\u0184\3\2\2\2L\u0191\3\2\2\2N\u019b\3\2\2\2PR\7\31\2\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\\\3\2\2\2US\3\2\2\2VX\5.\30"+
		"\2WY\7\31\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\V\3\2"+
		"\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\3\3\2\2\2`a\t\2\2\2a\5\3\2\2\2bc"+
		"\7\r\2\2cd\5\4\3\2de\7\16\2\2e\7\3\2\2\2fj\7\23\2\2gi\t\3\2\2hg\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mq\5\20\t\2nq\5\24"+
		"\13\2oq\5\26\f\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\13\3\2\2\2rx\5\n\6\2s"+
		"x\5\b\5\2tx\5\30\r\2ux\5\62\32\2vx\5\16\b\2wr\3\2\2\2ws\3\2\2\2wt\3\2"+
		"\2\2wu\3\2\2\2wv\3\2\2\2x\r\3\2\2\2yz\7\21\2\2z\177\5\f\7\2{|\7\f\2\2"+
		"|~\5\f\7\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\22\2\2\u0083\17\3\2\2\2"+
		"\u0084\u0094\7\25\2\2\u0085\u0087\7\n\2\2\u0086\u0085\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\7\26\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090"+
		"\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0084\3\2\2\2\u0093\u0086\3\2\2\2\u0094\21\3\2\2\2\u0095\u00a2"+
		"\7\25\2\2\u0096\u0098\7\26\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\3\2\2\2\u009b\u009d"+
		"\t\4\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0095\3\2"+
		"\2\2\u00a1\u0097\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a5\7\n\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ae\3\2\2\2\u00a6\u00af\7\25\2\2"+
		"\u00a7\u00ab\7\26\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\25\3\2\2"+
		"\2\u00b6\u00b7\t\5\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba"+
		"\5\22\n\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5\b\5\2\u00bc\31\3\2\2\2\u00bd"+
		"\u00c0\5\4\3\2\u00be\u00c0\5\6\4\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5\b\5\2\u00c2\33\3\2\2\2\u00c3\u00c7"+
		"\5\32\16\2\u00c4\u00c7\5\b\5\2\u00c5\u00c7\5\30\r\2\u00c6\u00c3\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00cf"+
		"\5\n\6\2\u00c9\u00cf\5\b\5\2\u00ca\u00cf\5\30\r\2\u00cb\u00cf\5N(\2\u00cc"+
		"\u00cf\5\16\b\2\u00cd\u00cf\5\62\32\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d3\7\6"+
		"\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\5\36\20\2\u00d6!\3\2\2\2\u00d7\u00d8\7\17\2"+
		"\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7\20\2\2\u00da#\3\2\2\2\u00db\u00e0"+
		"\5\32\16\2\u00dc\u00e0\5 \21\2\u00dd\u00e0\5F$\2\u00de\u00e0\5\62\32\2"+
		"\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\7\31\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5%\3"+
		"\2\2\2\u00e6\u00e8\5$\23\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\'\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ed\5\b\5\2\u00ed\u00f1\7\17\2\2\u00ee\u00f0\5*\26\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\20\2\2\u00f5)\3\2\2\2"+
		"\u00f6\u00f7\5\32\16\2\u00f7\u00f8\7\f\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5\32\16\2\u00ff+\3\2\2"+
		"\2\u0100\u0109\7\36\2\2\u0101\u0108\5\b\5\2\u0102\u0108\5\n\6\2\u0103"+
		"\u0108\5\16\b\2\u0104\u0108\5> \2\u0105\u0108\5N(\2\u0106\u0108\5\62\32"+
		"\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a-\3\2\2\2\u010b\u0110\7\35\2\2"+
		"\u010c\u010f\5\4\3\2\u010d\u010f\5\6\4\2\u010e\u010c\3\2\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\5(\25\2\u0113\u0114\7\31\2\2\u0114\u0115\7"+
		"\34\2\2\u0115\u0116\7\31\2\2\u0116\u011a\5&\24\2\u0117\u0118\5,\27\2\u0118"+
		"\u0119\7\31\2\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\34\2\2\u011d/\3\2\2\2\u011e\u0124"+
		"\5\b\5\2\u011f\u0124\5\n\6\2\u0120\u0124\5\30\r\2\u0121\u0124\5\62\32"+
		"\2\u0122\u0124\5\16\b\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123"+
		"\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\61\3\2\2"+
		"\2\u0125\u0126\5\b\5\2\u0126\u0130\7\17\2\2\u0127\u0128\5\60\31\2\u0128"+
		"\u0129\7\f\2\2\u0129\u012b\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0131\5\60\31\2\u0130\u012c\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\20\2\2\u0133\63\3\2\2\2\u0134"+
		"\u0135\t\6\2\2\u0135\65\3\2\2\2\u0136\u0137\t\7\2\2\u0137\67\3\2\2\2\u0138"+
		"\u013f\5\b\5\2\u0139\u013f\5\n\6\2\u013a\u013f\5\30\r\2\u013b\u013f\5"+
		"(\25\2\u013c\u013f\5N(\2\u013d\u013f\5\62\32\2\u013e\u0138\3\2\2\2\u013e"+
		"\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013d\3\2\2\2\u013f9\3\2\2\2\u0140\u0144\58\35\2\u0141\u0142"+
		"\5\64\33\2\u0142\u0143\58\35\2\u0143\u0145\3\2\2\2\u0144\u0141\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145;\3\2\2\2\u0146\u014c\5:\36\2\u0147\u0148\5"+
		"\66\34\2\u0148\u0149\5:\36\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d=\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014f\u0152\7\17\2\2\u0150\u0153\5<\37\2\u0151\u0153"+
		"\5> \2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u015b\3\2\2\2\u0154"+
		"\u0157\5\66\34\2\u0155\u0158\5<\37\2\u0156\u0158\5> \2\u0157\u0155\3\2"+
		"\2\2\u0157\u0156\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0154\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\20\2\2\u015f?\3\2\2\2\u0160\u0161"+
		"\7\37\2\2\u0161\u0162\5> \2\u0162\u0163\7\31\2\2\u0163\u0164\7\34\2\2"+
		"\u0164\u0165\7\31\2\2\u0165\u0166\5&\24\2\u0166\u0167\7\34\2\2\u0167A"+
		"\3\2\2\2\u0168\u0169\7\31\2\2\u0169\u016a\7 \2\2\u016a\u016b\5@!\2\u016b"+
		"C\3\2\2\2\u016c\u016d\7\31\2\2\u016d\u016e\7 \2\2\u016e\u016f\7\31\2\2"+
		"\u016f\u0170\7\34\2\2\u0170\u0171\7\31\2\2\u0171\u0172\5&\24\2\u0172\u0173"+
		"\7\34\2\2\u0173E\3\2\2\2\u0174\u0178\5@!\2\u0175\u0177\5B\"\2\u0176\u0175"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\5D#\2\u017c\u017b\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017dG\3\2\2\2\u017e\u017f\t\b\2\2\u017fI\3\2\2"+
		"\2\u0180\u0185\5\b\5\2\u0181\u0185\5\n\6\2\u0182\u0185\5\30\r\2\u0183"+
		"\u0185\5L\'\2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0183\3\2\2\2\u0185\u018d\3\2\2\2\u0186\u018b\5H%\2\u0187\u018c"+
		"\5\b\5\2\u0188\u018c\5\n\6\2\u0189\u018c\5\30\r\2\u018a\u018c\5L\'\2\u018b"+
		"\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u0186\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190K\3\2\2\2\u0191\u0193\7\17\2\2"+
		"\u0192\u0194\5J&\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\20\2\2"+
		"\u0198M\3\2\2\2\u0199\u019c\5L\'\2\u019a\u019c\5J&\2\u019b\u0199\3\2\2"+
		"\2\u019b\u019a\3\2\2\2\u019c\u01a4\3\2\2\2\u019d\u01a0\5H%\2\u019e\u01a1"+
		"\5J&\2\u019f\u01a1\5L\'\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5O\3\2\2\2\u01a6\u01a4\3\2\2\2\64SZ^jpw\177"+
		"\u0086\u008b\u0090\u0093\u0099\u009e\u00a1\u00a4\u00ab\u00ae\u00b4\u00bf"+
		"\u00c6\u00ce\u00d3\u00df\u00e4\u00e9\u00f1\u00fb\u0107\u0109\u010e\u0110"+
		"\u011a\u0123\u012c\u0130\u013e\u0144\u014c\u0152\u0157\u015b\u0178\u017c"+
		"\u0184\u018b\u018f\u0195\u019b\u01a0\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}