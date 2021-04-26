package by.aliana.lang.node.expression;

import by.aliana.lang.node.unit.UnaryMinusUnitNode;

public class UnaryMinusExpressionNode extends ExpressionNode {
    public UnaryMinusUnitNode unitNode;

    @Override
    public String toString() {
        return "UnaryMinusExpressionNode{" +
                "unitNode=" + unitNode +
                '}';
    }
}
