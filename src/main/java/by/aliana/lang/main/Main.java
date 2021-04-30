package by.aliana.lang.main;

import by.aliana.lang.antlr.CSTVisitor;
import by.aliana.lang.antlr.assLexer;
import by.aliana.lang.antlr.assParser;
import by.aliana.lang.exception.CustomException;
import by.aliana.lang.memory.ScopeBuilder;
import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.prog.ProgNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException, CustomException {

        Path path = Paths.get("src/main/resources/data/test.ass");
        CharStream charStream = CharStreams.fromPath(path);
        assLexer lexer = new assLexer(charStream);
        assParser parser = new assParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        CSTVisitor visitor = new CSTVisitor();
        ASTNode progNode = visitor.visit(tree);
//        ScopeBuilder scopeConverter = new ScopeBuilder((ProgNode) progNode);
//        scopeConverter.createProgScope();

    }
}
