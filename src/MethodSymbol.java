public class MethodSymbol extends Symbol {
    VarType returnType;
    ClassSymbol returnClassSymbol;

    public MethodSymbol(String name, VarType returnType) {
        super(name, SymbolType.methodSymbol);
        this.returnType = returnType;
    }

    public MethodSymbol(String name, ClassSymbol returnClassName) {
        super(name, SymbolType.methodSymbol);
        this.returnType = VarType.typeClass;
        this.returnClassSymbol = returnClassName;
    }

    public VarType getReturnType() {
        return returnType;
    }

    public ClassSymbol getReturnClassSymbol() {
        return returnClassSymbol;
    }

}
