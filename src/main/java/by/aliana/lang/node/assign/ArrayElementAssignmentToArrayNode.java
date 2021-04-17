package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.expression.ExpressionNode;

public class ArrayElementAssignmentToArrayNode extends ASTNode implements AssignmentDefinitionArea {

    public ArrayElementValueNode arrayElementValueNode;
    public ArrayNode arrayNode;
}
