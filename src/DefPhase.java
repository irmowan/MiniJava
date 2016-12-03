// Created by irmo on 16/12/3.

import org.antlr.v4.runtime.tree.ParseTreeProperty;

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
    }

    @Override
    public void exitProg(MiniJavaParser.ProgContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        currentScope = new Block(currentScope);
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentScope = currentScope.getOuterScope();
    }

    @Override
    public void enterClassDec(MiniJavaParser.ClassDecContext ctx) {
        currentScope = new Block(currentScope);
    }

    @Override
    public void exitClassDec(MiniJavaParser.ClassDecContext ctx) {
        currentScope = currentScope.getOuterScope();
    }
    
    @Override
    public void enterMethodDec(MiniJavaParser.MethodDecContext ctx) {
        currentScope = new Block(currentScope);
    }

    @Override
    public void enterBraceStatement(MiniJavaParser.BraceStatementContext ctx) {
        currentScope = new Block(currentScope);
    }

    @Override
    public void exitBraceStatement(MiniJavaParser.BraceStatementContext ctx) {
        currentScope = currentScope.getOuterScope();
    }
}
