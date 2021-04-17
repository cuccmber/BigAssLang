package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.statement.DeclareNode;
import by.aliana.lang.node.unit.GetElementNode;

public class ArrayElementAssignmentNode extends ASTNode implements AssignmentDefinitionArea {

    public GetElementNode getElementNode;
    public ExpressionNode expressionNode;
}
