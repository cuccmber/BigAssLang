package by.aliana.lang.node.expression;


public class AndLogicExpressionNode extends ExpressionNode {
    public ExpressionNode leftExpressionNode;
    public ExpressionNode rightExpressionNode;

    @Override
    public String toString() {
        return "AndLogicExpressionNode{" +
                "leftExpressionNode=" + leftExpressionNode +
                ", rightExpressionNode=" + rightExpressionNode +
                '}';
    }
}
