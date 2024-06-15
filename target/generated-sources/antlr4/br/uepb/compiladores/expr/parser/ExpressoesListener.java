// Generated from br/uepb/compiladores/expr/parser/Expressoes.g4 by ANTLR 4.13.1
package br.uepb.compiladores.expr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressoesParser}.
 */
public interface ExpressoesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ExpressoesParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ExpressoesParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ExpressoesParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ExpressoesParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#listaDecl}.
	 * @param ctx the parse tree
	 */
	void enterListaDecl(ExpressoesParser.ListaDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#listaDecl}.
	 * @param ctx the parse tree
	 */
	void exitListaDecl(ExpressoesParser.ListaDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExpressoesParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExpressoesParser.DeclContext ctx);
}