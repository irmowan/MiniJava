// Generated from miniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(miniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(miniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(miniJavaParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(miniJavaParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(miniJavaParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(miniJavaParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(miniJavaParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(miniJavaParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(miniJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(miniJavaParser.ExprContext ctx);
}