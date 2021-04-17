package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.unit.VarNameNode;

public class VarAssignmentToArrayNode extends ASTNode implements AssignmentDefinitionArea {

    public VarNameNode varNameNode;
    public ArrayNode arrayNode;
}