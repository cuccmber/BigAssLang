package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.statement.DeclareNode;

public class ArrayElementAssignmentNode extends ASTNode implements AssignmentDefinitionArea {

    public ArrayElementValueNode arrayElementValueNode;
    public ExpressionNode expressionNode;
}
