package by.aliana.lang.node.statement;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.assign.AssignmentDefinitionArea;

public class AssignNode extends ASTNode implements StatementDefinitionArea {

    public AssignmentDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "AssignNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
