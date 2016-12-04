public class VarSymbol extends Symbol {
    VarType varType;
    ClassSymbol classType;

    public VarSymbol(String name) {
        super(name, SymbolType.varSymbol);
    }

    public VarSymbol(String name, VarType varType) {
        super(name, SymbolType.varSymbol);
        this.varType = varType;
    }

    public VarSymbol(String name, ClassSymbol classSymbol) {
        super(name, SymbolType.varSymbol);
        this.varType = VarType.typeClass;
        this.classType = classSymbol;
    }

    public boolean isClassInstance() {
        return classType != null;
    }

    public ClassSymbol getClassType() {
        return classType;
    }

    public VarType getVarType() {
        return varType;
    }
}
