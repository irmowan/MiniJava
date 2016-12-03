public interface Scope {
    Scope getScope();
    void define(Symbol sym);
    Symbol lookup(String name);
}
