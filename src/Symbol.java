public class Symbol {
    private String name;
    private SymbolType symbolType;
    private Scope scope;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, SymbolType symbolType) {
        this.name = name;
        this.symbolType = symbolType;
    }

    public String getName() {
        return name;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
