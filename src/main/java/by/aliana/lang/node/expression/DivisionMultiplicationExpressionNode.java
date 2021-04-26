package by.aliana.lang.node.expression;


public class DivisionMultiplicationExpressionNode extends ExpressionNode {

    public String arithmeticOperator;
    public ExpressionNode leftExpressionNode;
    public ExpressionNode rightExpressionNode;

    @Override
    public String toString() {
        return "DivisionMultiplicationExpressionNode{" +
                "arithmeticOperator='" + arithmeticOperator + '\'' +
                ", leftExpressionNode=" + leftExpressionNode +
                ", rightExpressionNode=" + rightExpressionNode +
                '}';
    }
}
