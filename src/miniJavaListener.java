// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(MiniJavaParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(MiniJavaParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(MiniJavaParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(MiniJavaParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(MiniJavaParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(MiniJavaParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniJavaParser.ExprContext ctx);
}