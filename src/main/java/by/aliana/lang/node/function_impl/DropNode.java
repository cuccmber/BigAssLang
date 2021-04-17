package by.aliana.lang.node.function_impl;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;

public class DropNode extends ASTNode {

    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "DropNode{" +
                "expressionNode=" + expressionNode +
                '}';
    }
}
