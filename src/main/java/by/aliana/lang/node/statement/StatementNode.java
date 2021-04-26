package by.aliana.lang.node.statement;

import by.aliana.lang.node.ASTNode;

public class StatementNode extends ASTNode {
    public StatementDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "StatementNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
