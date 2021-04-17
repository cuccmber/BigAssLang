package by.aliana.lang.node.expression;

import by.aliana.lang.node.ASTNode;

public class LogicExpressionWithBracketsNode extends ExpressionNode {
    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "LogicExpressionWithBracketsNode{" +
                "expressionNode=" + expressionNode +
                '}';
    }
}
