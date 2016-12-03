// Created by irmo on 16/12/3.

import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends MiniJavaBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    Block globals;
    Scope currentScope;

    public RefPhase(ParseTreeProperty<Scope> scopes, Block globals) {
        this.scopes = scopes;
        this.globals = globals;
    }

    @Override
    public void exitProg(MiniJavaParser.ProgContext ctx) {
        currentScope = null;
    }
}