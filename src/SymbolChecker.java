// Created by irmo on 16/12/3.

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class SymbolChecker extends MiniJavaBaseListener {
    Block globalScope;
    Scope currentScope;
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    ParseTreeProperty<VarType> exprType = new ParseTreeProperty<>();
    ParseTreeProperty<ClassSymbol> exprClassSymbol = new ParseTreeProperty<>();

    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    public Block getGlobalScope() {
        return globalScope;
    }

    @Override
    public void enterProg(MiniJavaParser.ProgContext ctx) {
        globalScope = new Block(null);
        currentScope = globalScope;
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitProg(MiniJavaParser.ProgContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        // Define class
        String className = ctx.ID(0).getText();
        ClassSymbol newClass = new ClassSymbol(className);
        currentScope.define(newClass);

        currentScope = new Block(currentScope, newClass);
        // Get the arguments
        String argsName = ctx.ID(1).getText();
        currentScope.define(new VarSymbol(argsName, VarType.typeStringArray));
        saveScope(ctx, currentScope);
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
        currentScope = new Block(currentScope, newClass);
        saveScope(ctx, currentScope);
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
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitMethodDec(MiniJavaParser.MethodDecContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterBraceStatement(MiniJavaParser.BraceStatementContext ctx) {
        currentScope = new Block(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitBraceStatement(MiniJavaParser.BraceStatementContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void exitIfStatement(MiniJavaParser.IfStatementContext ctx) {
        MiniJavaParser.ExprContext exprCtx = ctx.expr();
        if (exprType.get(exprCtx) != VarType.typeBoolean) {
            printError(exprCtx.getStart(), "The condition of the If statement must be boolean expression.");
        }
    }

    @Override
    public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        MiniJavaParser.ExprContext exprCtx = ctx.expr();
        if (exprType.get(exprCtx) != VarType.typeBoolean) {
            printError(exprCtx.getStart(), "The condition of the While statement must be boolean expression.");
        }
    }

    @Override
    public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        // Here, Print Check will meet not forward reference.
//        MiniJavaParser.ExprContext exprCtx = ctx.expr();
//        switch (exprType.get(exprCtx)) {
//            case typeInt:
//            case typeString:
//            case typeBoolean:
//                break;
//            default:
//                printError(exprCtx.getStart(), "The printed expression must be int/string/boolean expression.");
//        }
    }

    @Override
    public void exitAssignStatement(MiniJavaParser.AssignStatementContext ctx) {
        String ID = ctx.ID().getText();
        Symbol IDSymbol = currentScope.lookup(ID);
        if (IDSymbol == null) {
            printError(ctx.ID().getSymbol(), "Symbol " + ID + " doesn't exist.");
        } else if (IDSymbol.getSymbolType() != SymbolType.varSymbol) {
            printError(ctx.ID().getSymbol(), "Symbol " + ID + " is not an variable symbol.");
        } else if (((VarSymbol) IDSymbol).getVarType() != exprType.get(ctx.expr())) {
            printError(ctx.ID().getSymbol(), "Symbol " + ID + " is not matched with expression.");
        }
    }

    @Override
    public void exitAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx) {
        String ID = ctx.ID().getText();
        Symbol IDSymbol = currentScope.lookup(ID);
        MiniJavaParser.ExprContext exprCtx1 = ctx.expr(0);
        MiniJavaParser.ExprContext exprCtx2 = ctx.expr(1);
        if (exprType.get(exprCtx1) != VarType.typeInt) {
            printError(exprCtx1.getStart(), "The index must be int expression.");
        }
        if (IDSymbol == null) {
            printError(ctx.ID().getSymbol(), "Symbol " + ID + " doesn't exist.");
        } else if (IDSymbol.getSymbolType() != SymbolType.varSymbol) {
            printError(ctx.ID().getSymbol(), "Symbol " + ID + " is not an variable symbol.");
        } else {
            VarType IDType = ((VarSymbol) IDSymbol).getVarType();
            VarType assignType = exprType.get(exprCtx2);
            switch (IDType) {
                case typeIntArray:
                    if (assignType != VarType.typeInt) {
                        printError(ctx.getStart(), "The symbol " + ID + " is an int array, but expression not matched.");
                    }
                    break;
                case typeStringArray:
                    if (assignType != VarType.typeString) {
                        printError(ctx.getStart(), "The symbol " + ID + " is a string array, but expression not matched.");
                    }
                    break;
                default:
                    printError(ctx.getStart(), "The symbol " + ID + " is not an array of int/string.");
            }
        }
    }

    @Override
    public void exitAndExpr(MiniJavaParser.AndExprContext ctx) {
        MiniJavaParser.ExprContext exprCtx1 = ctx.expr(0);
        MiniJavaParser.ExprContext exprCtx2 = ctx.expr(1);
        if (exprType.get(exprCtx1) != VarType.typeBoolean) {
            printError(exprCtx1.getStart(), "The && operator must be operated on two boolean expression.");
        }
        if (exprType.get(exprCtx2) != VarType.typeBoolean) {
            printError(exprCtx2.getStart(), "The && operator must be operated on two boolean expression.");
        }
        exprType.put(ctx, VarType.typeBoolean);
    }

    @Override
    public void exitLessExpr(MiniJavaParser.LessExprContext ctx) {
        MiniJavaParser.ExprContext exprCtx1 = ctx.expr(0);
        MiniJavaParser.ExprContext exprCtx2 = ctx.expr(1);
        if (exprType.get(exprCtx1) != VarType.typeInt) {
            printError(exprCtx1.getStart(), "The < operator must be operated on two int expression.");
        }
        if (exprType.get(exprCtx2) != VarType.typeInt) {
            printError(exprCtx2.getStart(), "The < operator must be operated on two int expression.");
        }
        exprType.put(ctx, VarType.typeBoolean);
    }

    @Override
    public void exitPlusMinusExpr(MiniJavaParser.PlusMinusExprContext ctx) {
        MiniJavaParser.ExprContext exprCxt1 = ctx.expr(0);
        MiniJavaParser.ExprContext exprCxt2 = ctx.expr(1);
        if (exprType.get(exprCxt1) != VarType.typeInt) {
            printError(exprCxt1.getStart(), "The +/- operator must be operated on two int expression.");
        }
        if (exprType.get(exprCxt2) != VarType.typeInt) {
            printError(exprCxt2.getStart(), "The +/- operator must be operated on two int expression.");
        }
        exprType.put(ctx, VarType.typeInt);
    }

    @Override
    public void exitTimesExpr(MiniJavaParser.TimesExprContext ctx) {
        MiniJavaParser.ExprContext exprCxt1 = ctx.expr(0);
        MiniJavaParser.ExprContext exprCxt2 = ctx.expr(1);
        if (exprType.get(exprCxt1) != VarType.typeInt) {
            printError(exprCxt1.getStart(), "The * operator must be operated on two int expression.");
        }
        if (exprType.get(exprCxt2) != VarType.typeInt) {
            printError(exprCxt2.getStart(), "The * operator must be operated on two int expression.");
        }
        exprType.put(ctx, VarType.typeInt);
    }

    @Override
    public void exitIndexExpr(MiniJavaParser.IndexExprContext ctx) {
        MiniJavaParser.ExprContext exprCtx1 = ctx.expr(0);
        MiniJavaParser.ExprContext exprCtx2 = ctx.expr(1);
        switch (exprType.get(exprCtx1)) {
            case typeIntArray:
                exprType.put(ctx, VarType.typeInt);
                break;
            case typeStringArray:
                exprType.put(ctx, VarType.typeString);
                break;
            default:
                printError(exprCtx1.getStart(), exprCtx1.getText() + " is not an array of int/string.");
                // Error recovery
                exprType.put(ctx, VarType.typeInt);
        }
        if (exprType.get(exprCtx2) != VarType.typeInt) {
            printError(exprCtx2.getStart(), exprCtx2.getText() + " is not an int expression.");
        }
    }

    @Override
    public void exitLengthExpr(MiniJavaParser.LengthExprContext ctx) {
        MiniJavaParser.ExprContext exprCtx = ctx.expr();
        switch (exprType.get(exprCtx)) {
            case typeIntArray:
            case typeStringArray:
                break;
            default:
                printError(exprCtx.getStart(), exprCtx.getText() + " is not an array of int/string");
        }
        exprType.put(ctx, VarType.typeInt);
    }

    @Override
    public void exitCallExpr(MiniJavaParser.CallExprContext ctx) {

    }

    @Override
    public void exitIntExpr(MiniJavaParser.IntExprContext ctx) {
        exprType.put(ctx, VarType.typeInt);
    }

    @Override
    public void exitTrueExpr(MiniJavaParser.TrueExprContext ctx) {
        exprType.put(ctx, VarType.typeBoolean);
    }

    @Override
    public void exitFalseExpr(MiniJavaParser.FalseExprContext ctx) {
        exprType.put(ctx, VarType.typeBoolean);
    }

    @Override
    public void exitClassExpr(MiniJavaParser.ClassExprContext ctx) {
        Symbol symbol = currentScope.lookup(ctx.getText());
        if (symbol == null) {
            printError(ctx.getStart(), "The class " + ctx.getText() + " doesn't exist.");
        } else {
            switch (symbol.getSymbolType()) {
                case classSymbol:
                    exprType.put(ctx, VarType.typeClass);
                    exprClassSymbol.put(ctx, (ClassSymbol) symbol);
                    break;
                case varSymbol:
                    exprType.put(ctx, ((VarSymbol) symbol).getVarType());
                    break;
                case methodSymbol:
                    printError(ctx.getStart(), "Expected to get class but method symbol " + ctx.getText() + ".");
            }
        }
    }

    @Override
    public void exitThisExpr(MiniJavaParser.ThisExprContext ctx) {
        exprType.put(ctx, VarType.typeClass);
        exprClassSymbol.put(ctx, currentScope.getOuterClass());
    }

    @Override
    public void exitNewIntArrayExpr(MiniJavaParser.NewIntArrayExprContext ctx) {
        if (exprType.get(ctx.expr()) != VarType.typeInt) {
            printError(ctx.expr().getStart(), "The index of the array must be Int.");
        }
        exprType.put(ctx, VarType.typeIntArray);
    }

    @Override
    public void exitNewClassInstanceExpr(MiniJavaParser.NewClassInstanceExprContext ctx) {
        Symbol newInstance = currentScope.lookup(ctx.ID().getText());
        if (newInstance == null) {
            printError(ctx.ID().getSymbol(), "The symbol " + ctx.ID().getText() + " doesn't exist.");
        } else if (newInstance.getSymbolType() != SymbolType.classSymbol) {
            printError(ctx.ID().getSymbol(), "The symbol " + ctx.ID().getText() + " is not a class symbol.");
        } else {
            exprType.put(ctx, VarType.typeClass);
            exprClassSymbol.put(ctx, (ClassSymbol) newInstance);
        }
    }

    @Override
    public void exitNotExpr(MiniJavaParser.NotExprContext ctx) {
        if (exprType.get(ctx.expr()) != VarType.typeBoolean) {
            printError(ctx.expr().getStart(), "Not operator must be operated on boolean variable.");
        }
        exprType.put(ctx, VarType.typeBoolean);
    }

    @Override
    public void exitParenthesisExpr(MiniJavaParser.ParenthesisExprContext ctx) {
        exprType.put(ctx, exprType.get(ctx.expr()));
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
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
