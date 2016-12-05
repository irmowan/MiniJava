public interface Scope {
    Scope getOuterScope();

    ClassSymbol getOuterClass();

    void define(Symbol sym);

    Symbol lookup(String name);
}
