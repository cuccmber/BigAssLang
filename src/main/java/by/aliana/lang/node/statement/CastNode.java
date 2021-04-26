package by.aliana.lang.node.statement;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.cast.CastDefinitionArea;

public class CastNode extends ASTNode implements StatementDefinitionArea {

    public CastDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "CastNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
