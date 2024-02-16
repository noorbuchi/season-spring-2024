// Generated from ComplexHaskell.g4 by ANTLR 4.13.1

package com.interpreter.haskell.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComplexHaskellParser}.
 */
public interface ComplexHaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ComplexHaskellParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ComplexHaskellParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ComplexHaskellParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ComplexHaskellParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(ComplexHaskellParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(ComplexHaskellParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#fundecl}.
	 * @param ctx the parse tree
	 */
	void enterFundecl(ComplexHaskellParser.FundeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#fundecl}.
	 * @param ctx the parse tree
	 */
	void exitFundecl(ComplexHaskellParser.FundeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#patdecl}.
	 * @param ctx the parse tree
	 */
	void enterPatdecl(ComplexHaskellParser.PatdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#patdecl}.
	 * @param ctx the parse tree
	 */
	void exitPatdecl(ComplexHaskellParser.PatdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#datadecl}.
	 * @param ctx the parse tree
	 */
	void enterDatadecl(ComplexHaskellParser.DatadeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#datadecl}.
	 * @param ctx the parse tree
	 */
	void exitDatadecl(ComplexHaskellParser.DatadeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#constrdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstrdecl(ComplexHaskellParser.ConstrdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#constrdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstrdecl(ComplexHaskellParser.ConstrdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ComplexHaskellParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ComplexHaskellParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(ComplexHaskellParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(ComplexHaskellParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ComplexHaskellParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ComplexHaskellParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#expTuple}.
	 * @param ctx the parse tree
	 */
	void enterExpTuple(ComplexHaskellParser.ExpTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#expTuple}.
	 * @param ctx the parse tree
	 */
	void exitExpTuple(ComplexHaskellParser.ExpTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#patTuple}.
	 * @param ctx the parse tree
	 */
	void enterPatTuple(ComplexHaskellParser.PatTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#patTuple}.
	 * @param ctx the parse tree
	 */
	void exitPatTuple(ComplexHaskellParser.PatTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(ComplexHaskellParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(ComplexHaskellParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(ComplexHaskellParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(ComplexHaskellParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(ComplexHaskellParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(ComplexHaskellParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(ComplexHaskellParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(ComplexHaskellParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(ComplexHaskellParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(ComplexHaskellParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#construct}.
	 * @param ctx the parse tree
	 */
	void enterConstruct(ComplexHaskellParser.ConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#construct}.
	 * @param ctx the parse tree
	 */
	void exitConstruct(ComplexHaskellParser.ConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#typeconstr}.
	 * @param ctx the parse tree
	 */
	void enterTypeconstr(ComplexHaskellParser.TypeconstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#typeconstr}.
	 * @param ctx the parse tree
	 */
	void exitTypeconstr(ComplexHaskellParser.TypeconstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#functype}.
	 * @param ctx the parse tree
	 */
	void enterFunctype(ComplexHaskellParser.FunctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#functype}.
	 * @param ctx the parse tree
	 */
	void exitFunctype(ComplexHaskellParser.FunctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#tupletype}.
	 * @param ctx the parse tree
	 */
	void enterTupletype(ComplexHaskellParser.TupletypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#tupletype}.
	 * @param ctx the parse tree
	 */
	void exitTupletype(ComplexHaskellParser.TupletypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ComplexHaskellParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ComplexHaskellParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#tyconstr}.
	 * @param ctx the parse tree
	 */
	void enterTyconstr(ComplexHaskellParser.TyconstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#tyconstr}.
	 * @param ctx the parse tree
	 */
	void exitTyconstr(ComplexHaskellParser.TyconstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ComplexHaskellParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ComplexHaskellParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ComplexHaskellParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ComplexHaskellParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#floating}.
	 * @param ctx the parse tree
	 */
	void enterFloating(ComplexHaskellParser.FloatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#floating}.
	 * @param ctx the parse tree
	 */
	void exitFloating(ComplexHaskellParser.FloatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(ComplexHaskellParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(ComplexHaskellParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexHaskellParser#joker}.
	 * @param ctx the parse tree
	 */
	void enterJoker(ComplexHaskellParser.JokerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexHaskellParser#joker}.
	 * @param ctx the parse tree
	 */
	void exitJoker(ComplexHaskellParser.JokerContext ctx);
}