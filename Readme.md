## MiniJava

The project is a front-end of the compiler of language MiniJava([BNF](http://www.cambridge.org/us/features/052182060X/grammar.html), [Samples](http://www.cambridge.org/us/features/052182060X/)).

### Usage

Make sure that the [antlr4](http://www.antlr.org/) is installed already and added to class path. (follow the QuickStart of the Antlr page.)

```shell
cd /usr/local/lib
sudo curl -O http://www.antlr.org/download/antlr-4.5.3-complete.jar
export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"
```

Then, compile the java code and run the main class.

```shell
cd src/
javac *.java
java Test input/BinarySearch.minijava
```

Use `java Test [file path]` to run the main class, the default file path is `input/BinarySearch.minijava`.

---

Author: [irmo](https://github.com/irmowan)

Date: 2016.11
