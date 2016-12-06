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
	 * Enter a parse tree produced by the {@code IntArrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntArrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MiniJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MiniJavaParser.ClassTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(MiniJavaParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(MiniJavaParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(MiniJavaParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(MiniJavaParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewClassInstanceExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewClassInstanceExpr(MiniJavaParser.NewClassInstanceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewClassInstanceExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewClassInstanceExpr(MiniJavaParser.NewClassInstanceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLengthExpr(MiniJavaParser.LengthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLengthExpr(MiniJavaParser.LengthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(MiniJavaParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(MiniJavaParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewIntArrayExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArrayExpr(MiniJavaParser.NewIntArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewIntArrayExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArrayExpr(MiniJavaParser.NewIntArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(MiniJavaParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(MiniJavaParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(MiniJavaParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(MiniJavaParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(MiniJavaParser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(MiniJavaParser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassExpr(MiniJavaParser.ClassExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassExpr(MiniJavaParser.ClassExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(MiniJavaParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(MiniJavaParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(MiniJavaParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(MiniJavaParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MiniJavaParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MiniJavaParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr(MiniJavaParser.TimesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr(MiniJavaParser.TimesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(MiniJavaParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(MiniJavaParser.ThisExprContext ctx);
}