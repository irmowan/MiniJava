public class MethodSymbol extends Symbol {
    VarType returnType;

    public MethodSymbol(String name) {
        super(name, SymbolType.methodSymbol);
    }

    public MethodSymbol(String name, VarType returnType) {
        super(name, SymbolType.methodSymbol);
        this.returnType = returnType;
    }

    public VarType getReturnType() {
        return returnType;
    }
}
