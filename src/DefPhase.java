// Created by irmo on 16/12/3.

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DefPhase extends MiniJavaBaseListener {
    Block globalScope;
    Scope currentScope;
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    Map<ClassSymbol, Scope> classScopes = new LinkedHashMap<>();
//    ParseTreeProperty<VarType> exprType = new ParseTreeProperty<>();
//    ParseTreeProperty<ClassSymbol> exprClassSymbol = new ParseTreeProperty<>();

    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    public Block getGlobalScope() {
        return globalScope;
    }

    public Map<ClassSymbol, Scope> getClassScopes() {
        return classScopes;
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
        classScopes.put(newClass, currentScope);
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterClassDec(MiniJavaParser.ClassDecContext ctx) {
        String className = ctx.ID(0).getText();
        ClassSymbol newClass = new ClassSymbol(className);
        currentScope.define(newClass);
        currentScope = new Block(currentScope, newClass);
        saveScope(ctx, currentScope);
        classScopes.put(newClass, currentScope);
    }

    @Override
    public void exitClassDec(MiniJavaParser.ClassDecContext ctx) {
        currentScope = currentScope.getOuterScope();
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
