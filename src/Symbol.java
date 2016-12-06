public class Symbol {
    private String name;
    private SymbolType symbolType;
    
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
}
