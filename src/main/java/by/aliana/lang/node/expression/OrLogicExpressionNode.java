package by.aliana.lang.node.expression;

public class OrLogicExpressionNode extends ExpressionNode {

    public ExpressionNode leftExpressionNode;
    public ExpressionNode rightExpressionNode;

    @Override
    public String toString() {
        return "OrLogicExpressionNode{" +
                "leftExpressionNode=" + leftExpressionNode +
                ", rightExpressionNode=" + rightExpressionNode +
                '}';
    }
}
