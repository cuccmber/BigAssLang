package by.aliana.lang.node.expression;


public class PlusMinusExpressionNode extends ExpressionNode {

    public String arithmeticOperator;
    public ExpressionNode leftExpressionNode;
    public ExpressionNode rightExpressionNode;

    @Override
    public String toString() {
        return "PlusMinusExpressionNode{" +
                "arithmeticOperator='" + arithmeticOperator + '\'' +
                ", leftExpressionNode=" + leftExpressionNode +
                ", rightExpressionNode=" + rightExpressionNode +
                '}';
    }
}
