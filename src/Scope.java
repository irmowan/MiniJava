public interface Scope {
    Scope getOuterScope();

    void define(Symbol sym);

    Symbol lookup(String name);
}
