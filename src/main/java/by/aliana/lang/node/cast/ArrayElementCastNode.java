package by.aliana.lang.node.cast;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.unit.GetElementNode;

public class ArrayElementCastNode extends ASTNode implements CastDefinitionArea {

    public GetElementNode getElementNode;
    public String type;
    public ExpressionNode expressionNode;
}
