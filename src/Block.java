import java.util.LinkedHashMap;
import java.util.Map;

public class Block implements Scope {
    Scope outerScope;
    Map<String, Symbol> symbols = new LinkedHashMap<>();
    ClassSymbol outerClass;

    public Block(Scope outerScope) {
        this.outerScope = outerScope;
        if (outerScope != null) {
            this.outerClass = outerScope.getOuterClass();
        }
    }

    public Block(Scope outerScope, ClassSymbol classSymbol) {
        this.outerScope = outerScope;
        this.outerClass = classSymbol;
    }

    @Override
    public Scope getOuterScope() {
        return outerScope;
    }

    @Override
    public ClassSymbol getOuterClass() {
        return outerClass;
    }

    @Override
    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    @Override
    public Symbol lookup(String name) {
        Symbol s = symbols.get(name);
        if (s != null) {
            return s;
        }
        if (outerScope != null) {
            return outerScope.lookup(name);
        }
        return null;
    }
}
