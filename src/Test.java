// Created by irmo on 16/12/3.

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        } else {
            inputFile = "src/input/BinarySearch_Error.java";
        }
        InputStream in = new FileInputStream(inputFile);
        System.out.println("File loaded.");
        ANTLRInputStream input = new ANTLRInputStream(in);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.prog();

        // Check symbols
        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
        RefPhase ref = new RefPhase(def.getScopes(), def.getGlobals());
        walker.walk(ref, tree);

        // Show AST in console
        System.out.println(tree.toStringTree(parser));

        // Show AST in GUI
        JFrame frame = new JFrame("ANTLR AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.0);
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}
