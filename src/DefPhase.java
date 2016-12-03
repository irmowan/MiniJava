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
}
