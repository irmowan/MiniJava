public class MethodSymbol extends Symbol {
    VarType returnType;
    ClassSymbol returnClassName;

    public MethodSymbol(String name) {
        super(name, SymbolType.methodSymbol);
    }

    public MethodSymbol(String name, VarType returnType) {
        super(name, SymbolType.methodSymbol);
        this.returnType = returnType;
    }

    public MethodSymbol(String name, ClassSymbol returnClassName) {
        super(name, SymbolType.methodSymbol);
        this.returnType = VarType.typeClass;
        this.returnClassName = returnClassName;
    }

    public VarType getReturnType() {
        return returnType;
    }
}
