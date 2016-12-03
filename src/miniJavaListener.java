// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniJavaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniJavaParser.ProgContext ctx);
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
	 * Enter a parse tree produced by the {@code BraceStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBraceStatement(MiniJavaParser.BraceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BraceStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBraceStatement(MiniJavaParser.BraceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignArrayStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignArrayStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx);
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