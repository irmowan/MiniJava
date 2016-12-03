import java.util.LinkedHashMap;
import java.util.Map;

public class BaseScope implements Scope {
    Scope scope;
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public BaseScope(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Scope getScope() {
        return null;
    }

    @Override
    public void define(Symbol sym) {

    }

    @Override
    public Symbol lookup(String name) {
        return null;
    }
}
