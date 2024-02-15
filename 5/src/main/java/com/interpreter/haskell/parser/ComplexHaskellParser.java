// Generated from ComplexHaskell.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ComplexHaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, CHAR=22, VARID=23, TYCONSTRID=24, 
		INT=25, FLOAT=26, JOKER=27, WS=28, REMAINDER=29;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_decls = 2, RULE_fundecl = 3, RULE_patdecl = 4, 
		RULE_datadecl = 5, RULE_constrdecl = 6, RULE_exp = 7, RULE_pat = 8, RULE_type = 9, 
		RULE_expTuple = 10, RULE_patTuple = 11, RULE_application = 12, RULE_branch = 13, 
		RULE_let = 14, RULE_cases = 15, RULE_lambda = 16, RULE_construct = 17, 
		RULE_typeconstr = 18, RULE_functype = 19, RULE_tupletype = 20, RULE_var = 21, 
		RULE_tyconstr = 22, RULE_integer = 23, RULE_bool = 24, RULE_floating = 25, 
		RULE_character = 26, RULE_joker = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "decls", "fundecl", "patdecl", "datadecl", "constrdecl", 
			"exp", "pat", "type", "expTuple", "patTuple", "application", "branch", 
			"let", "cases", "lambda", "construct", "typeconstr", "functype", "tupletype", 
			"var", "tyconstr", "integer", "bool", "floating", "character", "joker"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'{'", "';'", "'}'", "'='", "'data'", "'|'", "'('", "','", 
			"')'", "'if'", "'then'", "'else'", "'let'", "'in'", "'case'", "'of'", 
			"'->'", "'\\'", "'True'", "'False'", null, null, null, null, null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "CHAR", "VARID", 
			"TYCONSTRID", "INT", "FLOAT", "JOKER", "WS", "REMAINDER"
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
	public String getGrammarFileName() { return "ComplexHaskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComplexHaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 267387200L) != 0)) {
				{
				{
				setState(56);
				decl();
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					match(T__0);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public FundeclContext fundecl() {
			return getRuleContext(FundeclContext.class,0);
		}
		public PatdeclContext patdecl() {
			return getRuleContext(PatdeclContext.class,0);
		}
		public DatadeclContext datadecl() {
			return getRuleContext(DatadeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				fundecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				patdecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				datadecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decls);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__1);
				setState(73);
				decl();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(74);
					match(T__2);
					setState(75);
					decl();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__1);
				setState(84);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FundeclContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public FundeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterFundecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitFundecl(this);
		}
	}

	public final FundeclContext fundecl() throws RecognitionException {
		FundeclContext _localctx = new FundeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fundecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			var();
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				pat();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 267387136L) != 0) );
			setState(93);
			match(T__4);
			setState(94);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatdeclContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PatdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterPatdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitPatdecl(this);
		}
	}

	public final PatdeclContext patdecl() throws RecognitionException {
		PatdeclContext _localctx = new PatdeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_patdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			pat();
			setState(97);
			match(T__4);
			setState(98);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DatadeclContext extends ParserRuleContext {
		public TyconstrContext tyconstr() {
			return getRuleContext(TyconstrContext.class,0);
		}
		public List<ConstrdeclContext> constrdecl() {
			return getRuleContexts(ConstrdeclContext.class);
		}
		public ConstrdeclContext constrdecl(int i) {
			return getRuleContext(ConstrdeclContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public DatadeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterDatadecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitDatadecl(this);
		}
	}

	public final DatadeclContext datadecl() throws RecognitionException {
		DatadeclContext _localctx = new DatadeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datadecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
			setState(101);
			tyconstr();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARID) {
				{
				{
				setState(102);
				var();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__4);
			setState(109);
			constrdecl();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(110);
				match(T__6);
				setState(111);
				constrdecl();
				}
				}
				setState(116);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstrdeclContext extends ParserRuleContext {
		public TyconstrContext tyconstr() {
			return getRuleContext(TyconstrContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ConstrdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterConstrdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitConstrdecl(this);
		}
	}

	public final ConstrdeclContext constrdecl() throws RecognitionException {
		ConstrdeclContext _localctx = new ConstrdeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constrdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			tyconstr();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==VARID) {
				{
				{
				setState(118);
				type();
				}
				}
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TyconstrContext tyconstr() {
			return getRuleContext(TyconstrContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FloatingContext floating() {
			return getRuleContext(FloatingContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ExpTupleContext expTuple() {
			return getRuleContext(ExpTupleContext.class,0);
		}
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				tyconstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				integer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				bool();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				floating();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				character();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				expTuple();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				application();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				branch();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				let();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				cases();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				lambda();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TyconstrContext tyconstr() {
			return getRuleContext(TyconstrContext.class,0);
		}
		public JokerContext joker() {
			return getRuleContext(JokerContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FloatingContext floating() {
			return getRuleContext(FloatingContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public PatTupleContext patTuple() {
			return getRuleContext(PatTupleContext.class,0);
		}
		public ConstructContext construct() {
			return getRuleContext(ConstructContext.class,0);
		}
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitPat(this);
		}
	}

	public final PatContext pat() throws RecognitionException {
		PatContext _localctx = new PatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pat);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				tyconstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				joker();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				integer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				floating();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				character();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				patTuple();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				construct();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TypeconstrContext typeconstr() {
			return getRuleContext(TypeconstrContext.class,0);
		}
		public FunctypeContext functype() {
			return getRuleContext(FunctypeContext.class,0);
		}
		public TupletypeContext tupletype() {
			return getRuleContext(TupletypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				typeconstr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				functype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				tupletype();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpTupleContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterExpTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitExpTuple(this);
		}
	}

	public final ExpTupleContext expTuple() throws RecognitionException {
		ExpTupleContext _localctx = new ExpTupleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__7);
			setState(156);
			exp();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(157);
				match(T__8);
				setState(158);
				exp();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatTupleContext extends ParserRuleContext {
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public PatTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterPatTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitPatTuple(this);
		}
	}

	public final PatTupleContext patTuple() throws RecognitionException {
		PatTupleContext _localctx = new PatTupleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_patTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__7);
			setState(167);
			pat();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(168);
				match(T__8);
				setState(169);
				pat();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApplicationContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitApplication(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__7);
			setState(178);
			exp();
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				exp();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 133777664L) != 0) );
			setState(184);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BranchContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitBranch(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__10);
			setState(187);
			exp();
			setState(188);
			match(T__11);
			setState(189);
			exp();
			setState(190);
			match(T__12);
			setState(191);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__13);
			setState(194);
			decls();
			setState(195);
			match(T__14);
			setState(196);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CasesContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__15);
			setState(199);
			exp();
			setState(200);
			match(T__16);
			setState(201);
			match(T__1);
			setState(202);
			pat();
			setState(203);
			match(T__17);
			setState(204);
			exp();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(205);
				match(T__2);
				setState(206);
				pat();
				setState(207);
				match(T__17);
				setState(208);
				exp();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitLambda(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__18);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				pat();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 267387136L) != 0) );
			setState(223);
			match(T__17);
			setState(224);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructContext extends ParserRuleContext {
		public TyconstrContext tyconstr() {
			return getRuleContext(TyconstrContext.class,0);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public ConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitConstruct(this);
		}
	}

	public final ConstructContext construct() throws RecognitionException {
		ConstructContext _localctx = new ConstructContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__7);
			setState(227);
			tyconstr();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 267387136L) != 0)) {
				{
				{
				setState(228);
				pat();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeconstrContext extends ParserRuleContext {
		public TyconstrContext tyconstr() {
			return getRuleContext(TyconstrContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeconstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeconstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterTypeconstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitTypeconstr(this);
		}
	}

	public final TypeconstrContext typeconstr() throws RecognitionException {
		TypeconstrContext _localctx = new TypeconstrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeconstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__7);
			setState(237);
			tyconstr();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==VARID) {
				{
				{
				setState(238);
				type();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FunctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterFunctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitFunctype(this);
		}
	}

	public final FunctypeContext functype() throws RecognitionException {
		FunctypeContext _localctx = new FunctypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__7);
			setState(247);
			type();
			setState(248);
			match(T__17);
			setState(249);
			type();
			setState(250);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupletypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TupletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterTupletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitTupletype(this);
		}
	}

	public final TupletypeContext tupletype() throws RecognitionException {
		TupletypeContext _localctx = new TupletypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tupletype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__7);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==VARID) {
				{
				setState(253);
				type();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(254);
					match(T__8);
					setState(255);
					type();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(263);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode VARID() { return getToken(ComplexHaskellParser.VARID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(VARID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TyconstrContext extends ParserRuleContext {
		public TerminalNode TYCONSTRID() { return getToken(ComplexHaskellParser.TYCONSTRID, 0); }
		public TyconstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyconstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterTyconstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitTyconstr(this);
		}
	}

	public final TyconstrContext tyconstr() throws RecognitionException {
		TyconstrContext _localctx = new TyconstrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tyconstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(TYCONSTRID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ComplexHaskellParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ComplexHaskellParser.FLOAT, 0); }
		public FloatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterFloating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitFloating(this);
		}
	}

	public final FloatingContext floating() throws RecognitionException {
		FloatingContext _localctx = new FloatingContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FLOAT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(ComplexHaskellParser.CHAR, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(CHAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JokerContext extends ParserRuleContext {
		public TerminalNode JOKER() { return getToken(ComplexHaskellParser.JOKER, 0); }
		public JokerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).enterJoker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexHaskellListener ) ((ComplexHaskellListener)listener).exitJoker(this);
		}
	}

	public final JokerContext joker() throws RecognitionException {
		JokerContext _localctx = new JokerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_joker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(JOKER);
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
		"\u0004\u0001\u001d\u0118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0001\u0000\u0004\u0000;\b\u0000\u000b\u0000\f\u0000"+
		"<\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002M\b\u0002\n\u0002\f\u0002P\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003Z\b\u0003\u000b\u0003\f\u0003[\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005h\b\u0005\n\u0005\f\u0005k\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005q\b"+
		"\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006x\b"+
		"\u0006\n\u0006\f\u0006{\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0094"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009a\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00a0\b\n\n\n\f\n\u00a3\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ab\b\u000b\n"+
		"\u000b\f\u000b\u00ae\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0004\f\u00b5\b\f\u000b\f\f\f\u00b6\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d3\b\u000f\n\u000f\f\u000f"+
		"\u00d6\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00dc\b\u0010\u000b\u0010\f\u0010\u00dd\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00e6\b\u0011\n"+
		"\u0011\f\u0011\u00e9\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00f0\b\u0012\n\u0012\f\u0012\u00f3\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0101\b\u0014\n\u0014\f\u0014\u0104\t\u0014\u0003\u0014\u0106"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000"+
		"\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0001\u0001\u0000\u0014\u0015"+
		"\u0124\u0000@\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004"+
		"U\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\b`\u0001\u0000"+
		"\u0000\u0000\nd\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e"+
		"\u0088\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012"+
		"\u0099\u0001\u0000\u0000\u0000\u0014\u009b\u0001\u0000\u0000\u0000\u0016"+
		"\u00a6\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000\u0000\u0000\u001a"+
		"\u00ba\u0001\u0000\u0000\u0000\u001c\u00c1\u0001\u0000\u0000\u0000\u001e"+
		"\u00c6\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\"\u00e2"+
		"\u0001\u0000\u0000\u0000$\u00ec\u0001\u0000\u0000\u0000&\u00f6\u0001\u0000"+
		"\u0000\u0000(\u00fc\u0001\u0000\u0000\u0000*\u0109\u0001\u0000\u0000\u0000"+
		",\u010b\u0001\u0000\u0000\u0000.\u010d\u0001\u0000\u0000\u00000\u010f"+
		"\u0001\u0000\u0000\u00002\u0111\u0001\u0000\u0000\u00004\u0113\u0001\u0000"+
		"\u0000\u00006\u0115\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u0000"+
		"9;\u0005\u0001\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000"+
		"\u0000\u0000>8\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0001\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CG\u0003\u0006\u0003\u0000DG\u0003\b\u0004"+
		"\u0000EG\u0003\n\u0005\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0002\u0000\u0000IN\u0003\u0002\u0001\u0000JK\u0005\u0003\u0000\u0000"+
		"KM\u0003\u0002\u0001\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0004\u0000\u0000RV\u0001"+
		"\u0000\u0000\u0000ST\u0005\u0002\u0000\u0000TV\u0005\u0004\u0000\u0000"+
		"UH\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\u0005\u0001\u0000"+
		"\u0000\u0000WY\u0003*\u0015\u0000XZ\u0003\u0010\b\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0005\u0000\u0000"+
		"^_\u0003\u000e\u0007\u0000_\u0007\u0001\u0000\u0000\u0000`a\u0003\u0010"+
		"\b\u0000ab\u0005\u0005\u0000\u0000bc\u0003\u000e\u0007\u0000c\t\u0001"+
		"\u0000\u0000\u0000de\u0005\u0006\u0000\u0000ei\u0003,\u0016\u0000fh\u0003"+
		"*\u0015\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005\u0005\u0000\u0000mr\u0003\f\u0006\u0000"+
		"no\u0005\u0007\u0000\u0000oq\u0003\f\u0006\u0000pn\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000s\u000b\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uy\u0003"+
		",\u0016\u0000vx\u0003\u0012\t\u0000wv\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\r\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|\u0089\u0003*\u0015"+
		"\u0000}\u0089\u0003,\u0016\u0000~\u0089\u0003.\u0017\u0000\u007f\u0089"+
		"\u00030\u0018\u0000\u0080\u0089\u00032\u0019\u0000\u0081\u0089\u00034"+
		"\u001a\u0000\u0082\u0089\u0003\u0014\n\u0000\u0083\u0089\u0003\u0018\f"+
		"\u0000\u0084\u0089\u0003\u001a\r\u0000\u0085\u0089\u0003\u001c\u000e\u0000"+
		"\u0086\u0089\u0003\u001e\u000f\u0000\u0087\u0089\u0003 \u0010\u0000\u0088"+
		"|\u0001\u0000\u0000\u0000\u0088}\u0001\u0000\u0000\u0000\u0088~\u0001"+
		"\u0000\u0000\u0000\u0088\u007f\u0001\u0000\u0000\u0000\u0088\u0080\u0001"+
		"\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000\u0088\u0082\u0001"+
		"\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0084\u0001"+
		"\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u000f\u0001"+
		"\u0000\u0000\u0000\u008a\u0094\u0003*\u0015\u0000\u008b\u0094\u0003,\u0016"+
		"\u0000\u008c\u0094\u00036\u001b\u0000\u008d\u0094\u0003.\u0017\u0000\u008e"+
		"\u0094\u00030\u0018\u0000\u008f\u0094\u00032\u0019\u0000\u0090\u0094\u0003"+
		"4\u001a\u0000\u0091\u0094\u0003\u0016\u000b\u0000\u0092\u0094\u0003\""+
		"\u0011\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008b\u0001\u0000"+
		"\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000"+
		"\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000"+
		"\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0011\u0001\u0000"+
		"\u0000\u0000\u0095\u009a\u0003*\u0015\u0000\u0096\u009a\u0003$\u0012\u0000"+
		"\u0097\u009a\u0003&\u0013\u0000\u0098\u009a\u0003(\u0014\u0000\u0099\u0095"+
		"\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0013"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u00a1\u0003"+
		"\u000e\u0007\u0000\u009d\u009e\u0005\t\u0000\u0000\u009e\u00a0\u0003\u000e"+
		"\u0007\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u0015\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\b\u0000\u0000\u00a7\u00ac\u0003\u0010\b\u0000"+
		"\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00ab\u0003\u0010\b\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\n\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\b\u0000\u0000\u00b2\u00b4\u0003\u000e\u0007\u0000\u00b3\u00b5\u0003"+
		"\u000e\u0007\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"\n\u0000\u0000\u00b9\u0019\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u000b"+
		"\u0000\u0000\u00bb\u00bc\u0003\u000e\u0007\u0000\u00bc\u00bd\u0005\f\u0000"+
		"\u0000\u00bd\u00be\u0003\u000e\u0007\u0000\u00be\u00bf\u0005\r\u0000\u0000"+
		"\u00bf\u00c0\u0003\u000e\u0007\u0000\u00c0\u001b\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u000e\u0000\u0000\u00c2\u00c3\u0003\u0004\u0002\u0000"+
		"\u00c3\u00c4\u0005\u000f\u0000\u0000\u00c4\u00c5\u0003\u000e\u0007\u0000"+
		"\u00c5\u001d\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0010\u0000\u0000"+
		"\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8\u00c9\u0005\u0011\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca\u00cb\u0003\u0010\b\u0000\u00cb"+
		"\u00cc\u0005\u0012\u0000\u0000\u00cc\u00d4\u0003\u000e\u0007\u0000\u00cd"+
		"\u00ce\u0005\u0003\u0000\u0000\u00ce\u00cf\u0003\u0010\b\u0000\u00cf\u00d0"+
		"\u0005\u0012\u0000\u0000\u00d0\u00d1\u0003\u000e\u0007\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000\u00d8\u001f"+
		"\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\u0013\u0000\u0000\u00da\u00dc"+
		"\u0003\u0010\b\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u0012\u0000\u0000\u00e0\u00e1\u0003\u000e\u0007\u0000\u00e1!\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\b\u0000\u0000\u00e3\u00e7\u0003,\u0016"+
		"\u0000\u00e4\u00e6\u0003\u0010\b\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\n\u0000\u0000\u00eb"+
		"#\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\b\u0000\u0000\u00ed\u00f1"+
		"\u0003,\u0016\u0000\u00ee\u00f0\u0003\u0012\t\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\n\u0000\u0000\u00f5%\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\b\u0000"+
		"\u0000\u00f7\u00f8\u0003\u0012\t\u0000\u00f8\u00f9\u0005\u0012\u0000\u0000"+
		"\u00f9\u00fa\u0003\u0012\t\u0000\u00fa\u00fb\u0005\n\u0000\u0000\u00fb"+
		"\'\u0001\u0000\u0000\u0000\u00fc\u0105\u0005\b\u0000\u0000\u00fd\u0102"+
		"\u0003\u0012\t\u0000\u00fe\u00ff\u0005\t\u0000\u0000\u00ff\u0101\u0003"+
		"\u0012\t\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005\n\u0000"+
		"\u0000\u0108)\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0017\u0000\u0000"+
		"\u010a+\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0018\u0000\u0000\u010c"+
		"-\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0019\u0000\u0000\u010e/\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0007\u0000\u0000\u0000\u01101\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\u001a\u0000\u0000\u01123\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\u0016\u0000\u0000\u01145\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u001b\u0000\u0000\u01167\u0001\u0000\u0000\u0000\u0015"+
		"<@FNU[iry\u0088\u0093\u0099\u00a1\u00ac\u00b6\u00d4\u00dd\u00e7\u00f1"+
		"\u0102\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}