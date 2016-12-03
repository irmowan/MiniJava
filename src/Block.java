import java.util.LinkedHashMap;
import java.util.Map;

public class Block implements Scope {
    Scope outerScope;
    Map<String, Symbol> symbols = new LinkedHashMap<>();

    public Block(Scope outerScope) {
        this.outerScope = outerScope;
    }

    @Override
    public Scope getOuterScope() {
        return this.outerScope;
    }

    @Override
    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
        symbol.setScope(this);
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
