package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.unit.GetElementNode;

public class ArrayElementAssignmentNode extends ASTNode implements AssignmentDefinitionArea {

    public GetElementNode getElementNode;
    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "ArrayElementAssignmentNode{" +
                "getElementNode=" + getElementNode +
                ", expressionNode=" + expressionNode +
                '}';
    }
}
