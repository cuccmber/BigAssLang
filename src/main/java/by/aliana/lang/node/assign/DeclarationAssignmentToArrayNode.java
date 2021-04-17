package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.statement.DeclareNode;

public class DeclarationAssignmentToArrayNode extends ASTNode implements AssignmentDefinitionArea {

    public DeclareNode declareNode;
    public ArrayNode arrayNode;
}
