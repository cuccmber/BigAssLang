package by.aliana.lang.main;

import by.aliana.lang.antlr.CSTVisitor;
import by.aliana.lang.antlr.assLexer;
import by.aliana.lang.antlr.assParser;
import by.aliana.lang.node.prog.ProgNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/file/test.ass");
        CharStream charStream = CharStreams.fromPath(path);
        assLexer lexer = new assLexer(charStream);
        assParser parser = new assParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        CSTVisitor visitor = new CSTVisitor();
        visitor.visit(tree);
    }
}
