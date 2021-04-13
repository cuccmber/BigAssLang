package main;

import antlr.CSTVisitor;
import antlr.assLexer;
import antlr.assParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        assLexer lexer = new assLexer(new ANTLRFileStream("src/main/resources/file/test.ass"));
        assParser parser = new assParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.func();
        CSTVisitor visitor = new CSTVisitor();
        visitor.visit(tree);

    }
}
