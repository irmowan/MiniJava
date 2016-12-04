// Created by irmo on 16/12/3.

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class DefPhase extends MiniJavaBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    Block globals;
    Scope currentScope;

    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    public Block getGlobals() {
        return globals;
    }

    @Override
    public void enterProg(MiniJavaParser.ProgContext ctx) {
        globals = new Block(null);
        currentScope = globals;
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
        currentScope.define(new ClassSymbol(className));

        currentScope = new Block(currentScope);
        // Get the arguments
        String argsName = ctx.ID(1).getText();
        currentScope.define(new VarSymbol(argsName, VarType.typeStringArray));
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentScope = currentScope.getOuterScope();
        saveScope(ctx, currentScope);
    }

    @Override
    public void enterClassDec(MiniJavaParser.ClassDecContext ctx) {
        String className = ctx.ID(0).getText();
        List<TerminalNode> IDs = ctx.ID();
        if (IDs.size() > 1) {
            // Check the inherited class
            String inheritedClassName = ctx.ID(1).getText();
            if (inheritedClassName != null && currentScope.lookup(inheritedClassName) == null) {
                printError(ctx.ID(1).getSymbol(), "Inherited Class " + className + " doesn't exist.");
            }
        }
        ClassSymbol newClass = new ClassSymbol(className);
        currentScope.define(newClass);
        currentScope = new Block(currentScope);
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
        VarType type = this.getTypeFromTypeName(typeName);
        if (type != VarType.typeClass) {
            currentScope.define(new VarSymbol(varName, type));
        } else {
            Symbol classSymbol = currentScope.lookup(typeName);
            if (classSymbol == null) {
                // Class Symbol doesn't exist.
                printError(ctx.type().getStart(), "The class " + typeName + " doesn't exist.");
            } else if (classSymbol.getSymbolType() != SymbolType.classSymbol) {
                // Type is not a class symbol.
                printError(ctx.type().getStart(), typeName + " is not a Class Symbol.");
            } else {
                currentScope.define(new VarSymbol(varName, (ClassSymbol) classSymbol));
            }
        }
    }

    @Override
    public void enterMethodDec(MiniJavaParser.MethodDecContext ctx) {
        currentScope = new Block(currentScope);
        saveScope(ctx, currentScope);
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

    VarType getTypeFromTypeName(String typeName) {
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
