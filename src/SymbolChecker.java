// Created by irmo on 16/12/3.

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class SymbolChecker extends MiniJavaBaseListener {
    Block globalScope;
    Scope currentScope;

    @Override
    public void enterProg(MiniJavaParser.ProgContext ctx) {
        globalScope = new Block(null);
        currentScope = globalScope;
    }

    @Override
    public void exitProg(MiniJavaParser.ProgContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        // Define class
        String className = ctx.ID(0).getText();
        currentScope.define(new ClassSymbol(className));

        currentScope = new Block(currentScope);
        // Get the arguments
        String argsName = ctx.ID(1).getText();
        currentScope.define(new VarSymbol(argsName, VarType.typeStringArray));
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterClassDec(MiniJavaParser.ClassDecContext ctx) {
        String className = ctx.ID(0).getText();
        List<TerminalNode> IDs = ctx.ID();
        if (IDs.size() > 1) {
            // Check the inherited class
            String inheritedClassName = ctx.ID(1).getText();
            if (inheritedClassName != null && currentScope.lookup(inheritedClassName) == null) {
                printError(ctx.ID(1).getSymbol(), "Inherited class " + inheritedClassName + " doesn't exist.");
            }
        }
        ClassSymbol newClass = new ClassSymbol(className);
        currentScope.define(newClass);
        currentScope = new Block(currentScope);
    }

    @Override
    public void exitClassDec(MiniJavaParser.ClassDecContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterVarDec(MiniJavaParser.VarDecContext ctx) {
        String varName = ctx.ID().getText();
        String typeName = ctx.type().getText();
        VarType type = getTypeFromTypeName(typeName);
        if (!type.equals(VarType.typeClass)) {
            currentScope.define(new VarSymbol(varName, type));
        } else {
            Symbol classSymbol = currentScope.lookup(typeName);
            if (classSymbol == null) {
                // Class Symbol doesn't exist.
                printError(ctx.type().getStart(), "The class " + typeName + " doesn't exist.");
            } else if (classSymbol.getSymbolType() != SymbolType.classSymbol) {
                // Type is not a class symbol.
                printError(ctx.type().getStart(), typeName + " is not a class symbol.");
            } else {
                currentScope.define(new VarSymbol(varName, (ClassSymbol) classSymbol));
            }
        }
    }

    @Override
    public void enterMethodDec(MiniJavaParser.MethodDecContext ctx) {
        String returnTypeName = ctx.type(0).getText();
        String methodName = ctx.ID(0).getText();
        VarType returnType = getTypeFromTypeName(returnTypeName);
        if (!returnType.equals(VarType.typeClass)) {
            currentScope.define(new MethodSymbol(methodName, returnType));
        } else {
            Symbol classSymbol = currentScope.lookup(returnTypeName);
            if (classSymbol == null) {
                printError(ctx.type(0).getStart(), "The class " + returnTypeName + " doesn't exist.");
            } else if (classSymbol.getSymbolType() != SymbolType.classSymbol) {
                printError(ctx.type(0).getStart(), returnTypeName + " is not a class symbol.");
            } else {
                currentScope.define(new MethodSymbol(methodName, (ClassSymbol) classSymbol));
            }
        }
        currentScope = new Block(currentScope);
        List<MiniJavaParser.TypeContext> parameterTypes = ctx.type();
        List<TerminalNode> parameterIDs = ctx.ID();
        for (int i = 1; i < parameterTypes.size(); ++i) {
            TerminalNode parameterID = parameterIDs.get(i);
            MiniJavaParser.TypeContext parameterType = parameterTypes.get(i);
            VarType parameterVarType = getTypeFromTypeName(parameterType.getText());
            if (!parameterVarType.equals(VarType.typeClass)) {
                currentScope.define(new VarSymbol(parameterID.getText(), parameterVarType));
            } else {
                Symbol classSymbol = currentScope.lookup(parameterType.getText());
                if (classSymbol == null) {
                    printError(parameterType.getStart(), "The class " + parameterType.getText() + " doesn't exist.");
                } else if (classSymbol.getSymbolType() != SymbolType.classSymbol) {
                    printError(parameterType.getStart(), parameterType.getText() + " is not a class symbol.");
                } else {
                    currentScope.define(new VarSymbol(parameterID.getText(), (ClassSymbol) classSymbol));
                }
            }
        }
    }

    @Override
    public void exitMethodDec(MiniJavaParser.MethodDecContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterBraceStatement(MiniJavaParser.BraceStatementContext ctx) {
        currentScope = new Block(currentScope);
    }

    @Override
    public void exitBraceStatement(MiniJavaParser.BraceStatementContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterIfStatement(MiniJavaParser.IfStatementContext ctx) {

    }

    @Override
    public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {

    }

    @Override
    public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {

    }

    @Override
    public void enterAssignStatement(MiniJavaParser.AssignStatementContext ctx) {

    }

    @Override
    public void enterAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx) {

    }

    @Override
    public void enterAndExpr(MiniJavaParser.AndExprContext ctx) {

    }

    @Override
    public void enterLessExpr(MiniJavaParser.LessExprContext ctx) {

    }

    @Override
    public void enterPlusMinusExpr(MiniJavaParser.PlusMinusExprContext ctx) {

    }

    @Override
    public void enterTimesExpr(MiniJavaParser.TimesExprContext ctx) {

    }

    @Override
    public void enterIndexExpr(MiniJavaParser.IndexExprContext ctx) {

    }

    @Override
    public void enterLengthExpr(MiniJavaParser.LengthExprContext ctx) {

    }

    @Override
    public void enterCallExpr(MiniJavaParser.CallExprContext ctx) {

    }

    @Override
    public void enterIntExpr(MiniJavaParser.IntExprContext ctx) {

    }

    @Override
    public void enterTrueExpr(MiniJavaParser.TrueExprContext ctx) {
    }

    @Override
    public void enterFalseExpr(MiniJavaParser.FalseExprContext ctx) {

    }

    @Override
    public void enterClassExpr(MiniJavaParser.ClassExprContext ctx) {

    }

    @Override
    public void enterThisExpr(MiniJavaParser.ThisExprContext ctx) {

    }

    @Override
    public void enterNewIntArrayExpr(MiniJavaParser.NewIntArrayExprContext ctx) {

    }

    @Override
    public void enterNewClassInstanceExpr(MiniJavaParser.NewClassInstanceExprContext ctx) {
    }

    @Override
    public void enterNotExpr(MiniJavaParser.NotExprContext ctx) {

    }

    @Override
    public void enterParenthesisExpr(MiniJavaParser.ParenthesisExprContext ctx) {

    }

    static VarType getTypeFromTypeName(String typeName) {
        if (typeName.equals("int[]")) {
            return VarType.typeIntArray;
        }
        if (typeName.equals("boolean")) {
            return VarType.typeBoolean;
        }
        if (typeName.equals("int")) {
            return VarType.typeInt;
        }
        return VarType.typeClass;
    }

    static void printError(Token t, String msg) {
        System.err.printf("line %d:%d %s \n", t.getLine(), t.getCharPositionInLine(), msg);
    }
}
