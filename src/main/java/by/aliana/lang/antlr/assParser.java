// Generated from /home/diana/IdeaProjects/BigAssLang/src/main/java/by/aliana/lang/antlr/ass.g4 by ANTLR 4.9.1
package by.aliana.lang.antlr;
import by.aliana.lang.exception.CustomException;
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
		INT=1, FLOAT=2, BOOL=3, ASSIGN=4, PLUS=5, MULTIPLICATION=6, DIVISION=7, 
		MINUS=8, POINT=9, COMMA=10, LEFT_SQUARE_BRACKET=11, RIGHT_SQUARE_BRACKET=12, 
		LEFT_ROUND_BRACKET=13, RIGHT_ROUND_BRACKET=14, LEFT_CURVY_BRACKET=15, 
		RIGHT_CURVY_BRACKET=16, DOLLAR_SIGN=17, FUNKK=18, DROP=19, LOWERCASE=20, 
		UPPERCASE=21, ZERO=22, NATURAL=23, DIGIT=24, WS=25, NEWLINE=26, AYE=27, 
		GTFO=28, IF=29, ELSE=30, EQUAL=31, GREATER=32, LESS=33, GREATER_OR_EQUAL=34, 
		LESS_OR_EQUAL=35, NOT_EQUAL=36, LOGICAL_AND=37, LOGICAL_OR=38, INVERSION=39;
	public static final int
		RULE_prog = 0, RULE_type = 1, RULE_arrayType = 2, RULE_genericType = 3, 
		RULE_varName = 4, RULE_literal = 5, RULE_digitLiteral = 6, RULE_intValue = 7, 
		RULE_unsignedIntValue = 8, RULE_floatValue = 9, RULE_boolValue = 10, RULE_getElement = 11, 
		RULE_arrayElementValue = 12, RULE_array = 13, RULE_declare = 14, RULE_varAssignment = 15, 
		RULE_declarationAssignment = 16, RULE_arrayElementAssignment = 17, RULE_varAssignmentToArray = 18, 
		RULE_declarationAssignmentToArray = 19, RULE_arrayElementAssignmentToArray = 20, 
		RULE_assign = 21, RULE_castExpression = 22, RULE_varCast = 23, RULE_declarationCast = 24, 
		RULE_arrayElementCast = 25, RULE_cast = 26, RULE_statement = 27, RULE_bodyContent = 28, 
		RULE_signature = 29, RULE_attribute = 30, RULE_drop = 31, RULE_func = 32, 
		RULE_funcCallAttribute = 33, RULE_funcCall = 34, RULE_arithmeticUnit = 35, 
		RULE_unaryMinusUnit = 36, RULE_expression = 37, RULE_ifBlock = 38, RULE_elifBlock = 39, 
		RULE_elseBlock = 40, RULE_ifClause = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "type", "arrayType", "genericType", "varName", "literal", "digitLiteral", 
			"intValue", "unsignedIntValue", "floatValue", "boolValue", "getElement", 
			"arrayElementValue", "array", "declare", "varAssignment", "declarationAssignment", 
			"arrayElementAssignment", "varAssignmentToArray", "declarationAssignmentToArray", 
			"arrayElementAssignmentToArray", "assign", "castExpression", "varCast", 
			"declarationCast", "arrayElementCast", "cast", "statement", "bodyContent", 
			"signature", "attribute", "drop", "func", "funcCallAttribute", "funcCall", 
			"arithmeticUnit", "unaryMinusUnit", "expression", "ifBlock", "elifBlock", 
			"elseBlock", "ifClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INT'", "'FLOAT'", "'BOOL'", "'='", "'+'", "'*'", "'/'", "'-'", 
			"'.'", "','", "'['", "']'", "'('", "')'", "'{'", "'}'", "'$'", "'FUNKK'", 
			"'DROP'", null, null, "'0'", null, null, null, null, "'AYE'", "'GTFO'", 
			"'IF'", "'ELSE'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", 
			"'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "ASSIGN", "PLUS", "MULTIPLICATION", "DIVISION", 
			"MINUS", "POINT", "COMMA", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", 
			"LEFT_ROUND_BRACKET", "RIGHT_ROUND_BRACKET", "LEFT_CURVY_BRACKET", "RIGHT_CURVY_BRACKET", 
			"DOLLAR_SIGN", "FUNKK", "DROP", "LOWERCASE", "UPPERCASE", "ZERO", "NATURAL", 
			"DIGIT", "WS", "NEWLINE", "AYE", "GTFO", "IF", "ELSE", "EQUAL", "GREATER", 
			"LESS", "GREATER_OR_EQUAL", "LESS_OR_EQUAL", "NOT_EQUAL", "LOGICAL_AND", 
			"LOGICAL_OR", "INVERSION"
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
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) {
				return ((assVisitor<? extends T>)visitor).visitProg(this);
			}
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
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				func();
				setState(85);
				match(NEWLINE);
				}
				}
				setState(89); 
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
			setState(91);
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
			setState(93);
			match(LEFT_SQUARE_BRACKET);
			setState(94);
			type();
			setState(95);
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

	public static class GenericTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericType);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				type();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				arrayType();
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
		enterRule(_localctx, 8, RULE_varName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LOWERCASE);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
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
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				intValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				floatValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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

	public static class DigitLiteralContext extends ParserRuleContext {
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public DigitLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDigitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitLiteralContext digitLiteral() throws RecognitionException {
		DigitLiteralContext _localctx = new DigitLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_digitLiteral);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				intValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				floatValue();
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ZERO);
				}
				break;
			case MINUS:
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(118);
					match(MINUS);
					}
				}

				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(121);
						match(NATURAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
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
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(ZERO);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(135);
						match(NATURAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NATURAL) {
					{
					{
					setState(140);
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
					setState(145);
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
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(148);
				match(MINUS);
				}
			}

			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				{
				setState(151);
				match(ZERO);
				}
				break;
			case NATURAL:
				{
				setState(152);
				match(NATURAL);
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
			setState(161);
			match(POINT);
			setState(163); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(162);
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
				setState(165); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(167);
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
			setState(169);
			match(LEFT_SQUARE_BRACKET);
			setState(170);
			unsignedIntValue();
			setState(171);
			match(RIGHT_SQUARE_BRACKET);
			setState(172);
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

	public static class ArrayElementValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		public ArrayElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArrayElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementValueContext arrayElementValue() throws RecognitionException {
		ArrayElementValueContext _localctx = new ArrayElementValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayElementValue);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				varName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				funcCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
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
		public List<ArrayElementValueContext> arrayElementValue() {
			return getRuleContexts(ArrayElementValueContext.class);
		}
		public ArrayElementValueContext arrayElementValue(int i) {
			return getRuleContext(ArrayElementValueContext.class,i);
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
		enterRule(_localctx, 26, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LEFT_CURVY_BRACKET);
			setState(182);
			arrayElementValue();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				arrayElementValue();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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

	public static class DeclareContext extends ParserRuleContext {
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
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
		enterRule(_localctx, 28, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			genericType();
			setState(193);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			varName();
			setState(196);
			match(ASSIGN);
			setState(197);
			expression(0);
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

	public static class DeclarationAssignmentContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationAssignmentContext declarationAssignment() throws RecognitionException {
		DeclarationAssignmentContext _localctx = new DeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declarationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			declare();
			setState(200);
			match(ASSIGN);
			setState(201);
			expression(0);
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

	public static class ArrayElementAssignmentContext extends ParserRuleContext {
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayElementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArrayElementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementAssignmentContext arrayElementAssignment() throws RecognitionException {
		ArrayElementAssignmentContext _localctx = new ArrayElementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayElementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			getElement();
			setState(204);
			match(ASSIGN);
			setState(205);
			expression(0);
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

	public static class VarAssignmentToArrayContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarAssignmentToArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignmentToArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitVarAssignmentToArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentToArrayContext varAssignmentToArray() throws RecognitionException {
		VarAssignmentToArrayContext _localctx = new VarAssignmentToArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varAssignmentToArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			varName();
			setState(208);
			match(ASSIGN);
			setState(209);
			array();
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

	public static class DeclarationAssignmentToArrayContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DeclarationAssignmentToArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationAssignmentToArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDeclarationAssignmentToArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationAssignmentToArrayContext declarationAssignmentToArray() throws RecognitionException {
		DeclarationAssignmentToArrayContext _localctx = new DeclarationAssignmentToArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarationAssignmentToArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			declare();
			setState(212);
			match(ASSIGN);
			setState(213);
			array();
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

	public static class ArrayElementAssignmentToArrayContext extends ParserRuleContext {
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayElementAssignmentToArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementAssignmentToArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArrayElementAssignmentToArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementAssignmentToArrayContext arrayElementAssignmentToArray() throws RecognitionException {
		ArrayElementAssignmentToArrayContext _localctx = new ArrayElementAssignmentToArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayElementAssignmentToArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			getElement();
			setState(216);
			match(ASSIGN);
			setState(217);
			array();
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
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public DeclarationAssignmentContext declarationAssignment() {
			return getRuleContext(DeclarationAssignmentContext.class,0);
		}
		public ArrayElementAssignmentContext arrayElementAssignment() {
			return getRuleContext(ArrayElementAssignmentContext.class,0);
		}
		public VarAssignmentToArrayContext varAssignmentToArray() {
			return getRuleContext(VarAssignmentToArrayContext.class,0);
		}
		public DeclarationAssignmentToArrayContext declarationAssignmentToArray() {
			return getRuleContext(DeclarationAssignmentToArrayContext.class,0);
		}
		public ArrayElementAssignmentToArrayContext arrayElementAssignmentToArray() {
			return getRuleContext(ArrayElementAssignmentToArrayContext.class,0);
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
		enterRule(_localctx, 42, RULE_assign);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				varAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				declarationAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				arrayElementAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				varAssignmentToArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				declarationAssignmentToArray();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				arrayElementAssignmentToArray();
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LEFT_ROUND_BRACKET);
			setState(228);
			type();
			setState(229);
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

	public static class VarCastContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varCast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitVarCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarCastContext varCast() throws RecognitionException {
		VarCastContext _localctx = new VarCastContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			varName();
			setState(232);
			match(ASSIGN);
			setState(233);
			castExpression();
			setState(234);
			expression(0);
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

	public static class DeclarationCastContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationCast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDeclarationCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationCastContext declarationCast() throws RecognitionException {
		DeclarationCastContext _localctx = new DeclarationCastContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declarationCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			declare();
			setState(237);
			match(ASSIGN);
			setState(238);
			castExpression();
			setState(239);
			expression(0);
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

	public static class ArrayElementCastContext extends ParserRuleContext {
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assParser.ASSIGN, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayElementCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementCast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArrayElementCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementCastContext arrayElementCast() throws RecognitionException {
		ArrayElementCastContext _localctx = new ArrayElementCastContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayElementCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			getElement();
			setState(242);
			match(ASSIGN);
			setState(243);
			castExpression();
			setState(244);
			expression(0);
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
		public VarCastContext varCast() {
			return getRuleContext(VarCastContext.class,0);
		}
		public DeclarationCastContext declarationCast() {
			return getRuleContext(DeclarationCastContext.class,0);
		}
		public ArrayElementCastContext arrayElementCast() {
			return getRuleContext(ArrayElementCastContext.class,0);
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
		enterRule(_localctx, 52, RULE_cast);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				varCast();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				declarationCast();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				arrayElementCast();
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
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public IfClauseContext ifClause() {
			return getRuleContext(IfClauseContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
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
		enterRule(_localctx, 54, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(251);
				declare();
				}
				break;
			case 2:
				{
				setState(252);
				assign();
				}
				break;
			case 3:
				{
				setState(253);
				cast();
				}
				break;
			case 4:
				{
				setState(254);
				ifClause();
				}
				break;
			case 5:
				{
				setState(255);
				funcCall();
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

	public static class BodyContentContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(assParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(assParser.NEWLINE, i);
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
		enterRule(_localctx, 56, RULE_bodyContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_SQUARE_BRACKET) | (1L << LOWERCASE) | (1L << IF))) != 0)) {
				{
				{
				setState(258);
				statement();
				setState(259);
				match(NEWLINE);
				}
				}
				setState(265);
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
		enterRule(_localctx, 58, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			varName();
			setState(267);
			match(LEFT_ROUND_BRACKET);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_SQUARE_BRACKET))) != 0)) {
				{
				{
				setState(268);
				attribute();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
		enterRule(_localctx, 60, RULE_attribute);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					declare();
					setState(277);
					match(COMMA);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(284);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 62, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(DROP);
			setState(287);
			expression(0);
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
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
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
		enterRule(_localctx, 64, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FUNKK);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_SQUARE_BRACKET))) != 0)) {
				{
				setState(290);
				genericType();
				}
			}

			setState(293);
			signature();
			setState(294);
			match(NEWLINE);
			setState(295);
			match(DOLLAR_SIGN);
			setState(296);
			match(NEWLINE);
			setState(297);
			bodyContent();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DROP) {
				{
				setState(298);
				drop();
				setState(299);
				match(NEWLINE);
				}
			}

			setState(303);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 66, RULE_funcCallAttribute);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				funcCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
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
		enterRule(_localctx, 68, RULE_funcCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			varName();
			setState(313);
			match(LEFT_ROUND_BRACKET);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_CURVY_BRACKET) | (1L << LOWERCASE) | (1L << ZERO) | (1L << NATURAL) | (1L << AYE) | (1L << GTFO))) != 0)) {
				{
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						funcCallAttribute();
						setState(315);
						match(COMMA);
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(322);
				funcCallAttribute();
				}
			}

			setState(325);
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

	public static class ArithmeticUnitContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArithmeticUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArithmeticUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticUnitContext arithmeticUnit() throws RecognitionException {
		ArithmeticUnitContext _localctx = new ArithmeticUnitContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arithmeticUnit);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				getElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
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

	public static class UnaryMinusUnitContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public DigitLiteralContext digitLiteral() {
			return getRuleContext(DigitLiteralContext.class,0);
		}
		public GetElementContext getElement() {
			return getRuleContext(GetElementContext.class,0);
		}
		public UnaryMinusUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinusUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitUnaryMinusUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMinusUnitContext unaryMinusUnit() throws RecognitionException {
		UnaryMinusUnitContext _localctx = new UnaryMinusUnitContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryMinusUnit);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				varName();
				}
				break;
			case MINUS:
			case ZERO:
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				digitLiteral();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				getElement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndLogicExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND() { return getToken(assParser.LOGICAL_AND, 0); }
		public AndLogicExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitAndLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(assParser.MINUS, 0); }
		public UnaryMinusUnitContext unaryMinusUnit() {
			return getRuleContext(UnaryMinusUnitContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicExpressionWithBracketsContext extends ExpressionContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(assParser.LEFT_ROUND_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(assParser.RIGHT_ROUND_BRACKET, 0); }
		public LogicExpressionWithBracketsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitLogicExpressionWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(assParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(assParser.MINUS, 0); }
		public PlusMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InversionLogicExpressionContext extends ExpressionContext {
		public TerminalNode INVERSION() { return getToken(assParser.INVERSION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InversionLogicExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitInversionLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionMultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(assParser.DIVISION, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(assParser.MULTIPLICATION, 0); }
		public DivisionMultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitDivisionMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(assParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(assParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(assParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(assParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(assParser.LESS_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(assParser.NOT_EQUAL, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public ArithmeticUnitContext arithmeticUnit() {
			return getRuleContext(ArithmeticUnitContext.class,0);
		}
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrLogicExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_OR() { return getToken(assParser.LOGICAL_OR, 0); }
		public OrLogicExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assVisitor ) return ((assVisitor<? extends T>)visitor).visitOrLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new LogicExpressionWithBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(339);
				match(LEFT_ROUND_BRACKET);
				setState(340);
				expression(0);
				setState(341);
				match(RIGHT_ROUND_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(MINUS);
				setState(344);
				unaryMinusUnit();
				}
				break;
			case 3:
				{
				_localctx = new InversionLogicExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(INVERSION);
				setState(346);
				expression(7);
				}
				break;
			case 4:
				{
				_localctx = new ArithmeticExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				arithmeticUnit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionMultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(351);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICATION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(354);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(357);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_OR_EQUAL) | (1L << LESS_OR_EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new AndLogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(360);
						match(LOGICAL_AND);
						setState(361);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new OrLogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(363);
						match(LOGICAL_OR);
						setState(364);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(assParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 76, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(IF);
			setState(371);
			expression(0);
			setState(372);
			match(NEWLINE);
			setState(373);
			match(DOLLAR_SIGN);
			setState(374);
			match(NEWLINE);
			setState(375);
			bodyContent();
			setState(376);
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
		enterRule(_localctx, 78, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(NEWLINE);
			setState(379);
			match(ELSE);
			setState(380);
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
		enterRule(_localctx, 80, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(NEWLINE);
			setState(383);
			match(ELSE);
			setState(384);
			match(NEWLINE);
			setState(385);
			match(DOLLAR_SIGN);
			setState(386);
			match(NEWLINE);
			setState(387);
			bodyContent();
			setState(388);
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
		enterRule(_localctx, 82, RULE_ifClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			ifBlock();
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					elifBlock();
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(397);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0193\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\6\2Z\n\2\r\2\16\2[\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5f\n\5"+
		"\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\5\bv\n\b"+
		"\3\t\3\t\5\tz\n\t\3\t\6\t}\n\t\r\t\16\t~\3\t\7\t\u0082\n\t\f\t\16\t\u0085"+
		"\13\t\5\t\u0087\n\t\3\n\3\n\6\n\u008b\n\n\r\n\16\n\u008c\3\n\7\n\u0090"+
		"\n\n\f\n\16\n\u0093\13\n\5\n\u0095\n\n\3\13\5\13\u0098\n\13\3\13\3\13"+
		"\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\5\13\u00a2\n\13\3\13\3\13"+
		"\6\13\u00a6\n\13\r\13\16\13\u00a7\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\7\17\u00bc\n\17\f"+
		"\17\16\17\u00bf\13\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e4\n\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u00fc\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0103\n\35\3\36\3\36\3\36\7\36\u0108\n\36\f\36\16\36\u010b"+
		"\13\36\3\37\3\37\3\37\7\37\u0110\n\37\f\37\16\37\u0113\13\37\3\37\3\37"+
		"\3 \3 \3 \7 \u011a\n \f \16 \u011d\13 \3 \3 \3!\3!\3!\3\"\3\"\5\"\u0126"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0130\n\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\5#\u0139\n#\3$\3$\3$\3$\3$\7$\u0140\n$\f$\16$\u0143\13$\3$\5$\u0146"+
		"\n$\3$\3$\3%\3%\3%\3%\5%\u014e\n%\3&\3&\3&\5&\u0153\n&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u015f\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0170\n\'\f\'\16\'\u0173\13\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\7+\u018b\n"+
		"+\f+\16+\u018e\13+\3+\5+\u0191\n+\3+\2\3L,\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\t\3\2\3\5\3\2\26\31"+
		"\3\2\30\31\3\2\35\36\3\2\b\t\4\2\7\7\n\n\3\2!&\2\u01a3\2Y\3\2\2\2\4]\3"+
		"\2\2\2\6_\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fq\3\2\2\2\16u\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u0094\3\2\2\2\24\u0097\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3"+
		"\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36\u00c2\3\2\2\2 \u00c5\3\2\2"+
		"\2\"\u00c9\3\2\2\2$\u00cd\3\2\2\2&\u00d1\3\2\2\2(\u00d5\3\2\2\2*\u00d9"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00e5\3\2\2\2\60\u00e9\3\2\2\2\62\u00ee\3\2\2"+
		"\2\64\u00f3\3\2\2\2\66\u00fb\3\2\2\28\u0102\3\2\2\2:\u0109\3\2\2\2<\u010c"+
		"\3\2\2\2>\u011b\3\2\2\2@\u0120\3\2\2\2B\u0123\3\2\2\2D\u0138\3\2\2\2F"+
		"\u013a\3\2\2\2H\u014d\3\2\2\2J\u0152\3\2\2\2L\u015e\3\2\2\2N\u0174\3\2"+
		"\2\2P\u017c\3\2\2\2R\u0180\3\2\2\2T\u0188\3\2\2\2VW\5B\"\2WX\7\34\2\2"+
		"XZ\3\2\2\2YV\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\3\3\2\2\2]^\t\2"+
		"\2\2^\5\3\2\2\2_`\7\r\2\2`a\5\4\3\2ab\7\16\2\2b\7\3\2\2\2cf\5\4\3\2df"+
		"\5\6\4\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gk\7\26\2\2hj\t\3\2\2ih\3\2\2\2"+
		"jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\13\3\2\2\2mk\3\2\2\2nr\5\20\t\2or\5\24"+
		"\13\2pr\5\26\f\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\r\3\2\2\2sv\5\20\t\2t"+
		"v\5\24\13\2us\3\2\2\2ut\3\2\2\2v\17\3\2\2\2w\u0087\7\30\2\2xz\7\n\2\2"+
		"yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\7\31\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086w\3\2\2\2\u0086y\3\2\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0095\7\30\2\2\u0089\u008b\7\31\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0091\3\2\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u008a\3\2\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0098\7\n\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a1"+
		"\3\2\2\2\u0099\u00a2\7\30\2\2\u009a\u009e\7\31\2\2\u009b\u009d\t\4\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1"+
		"\u009a\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7\13\2\2\u00a4\u00a6\t"+
		"\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\t\5\2\2\u00aa\27\3\2\2\2\u00ab"+
		"\u00ac\7\r\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\5"+
		"\n\6\2\u00af\31\3\2\2\2\u00b0\u00b6\5\f\7\2\u00b1\u00b6\5\n\6\2\u00b2"+
		"\u00b6\5\30\r\2\u00b3\u00b6\5F$\2\u00b4\u00b6\5\34\17\2\u00b5\u00b0\3"+
		"\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00bd\5\32"+
		"\16\2\u00b9\u00ba\7\f\2\2\u00ba\u00bc\5\32\16\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\35\3\2\2\2\u00c2\u00c3"+
		"\5\b\5\2\u00c3\u00c4\5\n\6\2\u00c4\37\3\2\2\2\u00c5\u00c6\5\n\6\2\u00c6"+
		"\u00c7\7\6\2\2\u00c7\u00c8\5L\'\2\u00c8!\3\2\2\2\u00c9\u00ca\5\36\20\2"+
		"\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5L\'\2\u00cc#\3\2\2\2\u00cd\u00ce\5\30"+
		"\r\2\u00ce\u00cf\7\6\2\2\u00cf\u00d0\5L\'\2\u00d0%\3\2\2\2\u00d1\u00d2"+
		"\5\n\6\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\5\34\17\2\u00d4\'\3\2\2\2\u00d5"+
		"\u00d6\5\36\20\2\u00d6\u00d7\7\6\2\2\u00d7\u00d8\5\34\17\2\u00d8)\3\2"+
		"\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\7\6\2\2\u00db\u00dc\5\34\17\2\u00dc"+
		"+\3\2\2\2\u00dd\u00e4\5 \21\2\u00de\u00e4\5\"\22\2\u00df\u00e4\5$\23\2"+
		"\u00e0\u00e4\5&\24\2\u00e1\u00e4\5(\25\2\u00e2\u00e4\5*\26\2\u00e3\u00dd"+
		"\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e6\7\17\2\2"+
		"\u00e6\u00e7\5\4\3\2\u00e7\u00e8\7\20\2\2\u00e8/\3\2\2\2\u00e9\u00ea\5"+
		"\n\6\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\5L\'\2\u00ed"+
		"\61\3\2\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5.\30"+
		"\2\u00f1\u00f2\5L\'\2\u00f2\63\3\2\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5"+
		"\7\6\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\5L\'\2\u00f7\65\3\2\2\2\u00f8"+
		"\u00fc\5\60\31\2\u00f9\u00fc\5\62\32\2\u00fa\u00fc\5\64\33\2\u00fb\u00f8"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\67\3\2\2\2\u00fd"+
		"\u0103\5\36\20\2\u00fe\u0103\5,\27\2\u00ff\u0103\5\66\34\2\u0100\u0103"+
		"\5T+\2\u0101\u0103\5F$\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u01039\3\2\2\2"+
		"\u0104\u0105\58\35\2\u0105\u0106\7\34\2\2\u0106\u0108\3\2\2\2\u0107\u0104"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		";\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\5\n\6\2\u010d\u0111\7\17\2\2"+
		"\u010e\u0110\5> \2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\7\20\2\2\u0115=\3\2\2\2\u0116\u0117\5\36\20\2\u0117\u0118\7\f\2"+
		"\2\u0118\u011a\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\5\36\20\2\u011f?\3\2\2\2\u0120\u0121\7\25\2\2\u0121\u0122\5L\'"+
		"\2\u0122A\3\2\2\2\u0123\u0125\7\24\2\2\u0124\u0126\5\b\5\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\5<\37\2\u0128"+
		"\u0129\7\34\2\2\u0129\u012a\7\23\2\2\u012a\u012b\7\34\2\2\u012b\u012f"+
		"\5:\36\2\u012c\u012d\5@!\2\u012d\u012e\7\34\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\23"+
		"\2\2\u0132C\3\2\2\2\u0133\u0139\5\n\6\2\u0134\u0139\5\f\7\2\u0135\u0139"+
		"\5\30\r\2\u0136\u0139\5F$\2\u0137\u0139\5\34\17\2\u0138\u0133\3\2\2\2"+
		"\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139E\3\2\2\2\u013a\u013b\5\n\6\2\u013b\u0145\7\17\2\2\u013c"+
		"\u013d\5D#\2\u013d\u013e\7\f\2\2\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2"+
		"\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\5D#\2\u0145\u0141\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\20\2\2\u0148G\3\2\2\2"+
		"\u0149\u014e\5\n\6\2\u014a\u014e\5\f\7\2\u014b\u014e\5\30\r\2\u014c\u014e"+
		"\5F$\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014eI\3\2\2\2\u014f\u0153\5\n\6\2\u0150\u0153\5\16\b\2"+
		"\u0151\u0153\5\30\r\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151"+
		"\3\2\2\2\u0153K\3\2\2\2\u0154\u0155\b\'\1\2\u0155\u0156\7\17\2\2\u0156"+
		"\u0157\5L\'\2\u0157\u0158\7\20\2\2\u0158\u015f\3\2\2\2\u0159\u015a\7\n"+
		"\2\2\u015a\u015f\5J&\2\u015b\u015c\7)\2\2\u015c\u015f\5L\'\t\u015d\u015f"+
		"\5H%\2\u015e\u0154\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015b\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0171\3\2\2\2\u0160\u0161\f\b\2\2\u0161\u0162\t\6"+
		"\2\2\u0162\u0170\5L\'\t\u0163\u0164\f\7\2\2\u0164\u0165\t\7\2\2\u0165"+
		"\u0170\5L\'\b\u0166\u0167\f\6\2\2\u0167\u0168\t\b\2\2\u0168\u0170\5L\'"+
		"\7\u0169\u016a\f\5\2\2\u016a\u016b\7\'\2\2\u016b\u0170\5L\'\6\u016c\u016d"+
		"\f\4\2\2\u016d\u016e\7(\2\2\u016e\u0170\5L\'\5\u016f\u0160\3\2\2\2\u016f"+
		"\u0163\3\2\2\2\u016f\u0166\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u016c\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"M\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7\37\2\2\u0175\u0176\5L\'\2"+
		"\u0176\u0177\7\34\2\2\u0177\u0178\7\23\2\2\u0178\u0179\7\34\2\2\u0179"+
		"\u017a\5:\36\2\u017a\u017b\7\23\2\2\u017bO\3\2\2\2\u017c\u017d\7\34\2"+
		"\2\u017d\u017e\7 \2\2\u017e\u017f\5N(\2\u017fQ\3\2\2\2\u0180\u0181\7\34"+
		"\2\2\u0181\u0182\7 \2\2\u0182\u0183\7\34\2\2\u0183\u0184\7\23\2\2\u0184"+
		"\u0185\7\34\2\2\u0185\u0186\5:\36\2\u0186\u0187\7\23\2\2\u0187S\3\2\2"+
		"\2\u0188\u018c\5N(\2\u0189\u018b\5P)\2\u018a\u0189\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0191\5R*\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2"+
		"\2\u0191U\3\2\2\2&[ekquy~\u0083\u0086\u008c\u0091\u0094\u0097\u009e\u00a1"+
		"\u00a7\u00b5\u00bd\u00e3\u00fb\u0102\u0109\u0111\u011b\u0125\u012f\u0138"+
		"\u0141\u0145\u014d\u0152\u015e\u016f\u0171\u018c\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}