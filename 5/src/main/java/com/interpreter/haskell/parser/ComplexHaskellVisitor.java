// Generated from ComplexHaskell.g4 by ANTLR 4.13.1

package com.interpreter.haskell.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComplexHaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComplexHaskellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ComplexHaskellParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ComplexHaskellParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(ComplexHaskellParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#fundecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundecl(ComplexHaskellParser.FundeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#patdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatdecl(ComplexHaskellParser.PatdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#datadecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatadecl(ComplexHaskellParser.DatadeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#constrdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrdecl(ComplexHaskellParser.ConstrdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ComplexHaskellParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPat(ComplexHaskellParser.PatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ComplexHaskellParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#expTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTuple(ComplexHaskellParser.ExpTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#patTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatTuple(ComplexHaskellParser.PatTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(ComplexHaskellParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(ComplexHaskellParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(ComplexHaskellParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(ComplexHaskellParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(ComplexHaskellParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruct(ComplexHaskellParser.ConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#typeconstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeconstr(ComplexHaskellParser.TypeconstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#functype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctype(ComplexHaskellParser.FunctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#tupletype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupletype(ComplexHaskellParser.TupletypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ComplexHaskellParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#tyconstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyconstr(ComplexHaskellParser.TyconstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ComplexHaskellParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ComplexHaskellParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#floating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating(ComplexHaskellParser.FloatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(ComplexHaskellParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexHaskellParser#joker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoker(ComplexHaskellParser.JokerContext ctx);
}