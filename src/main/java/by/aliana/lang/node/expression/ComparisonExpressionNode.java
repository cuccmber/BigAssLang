package by.aliana.lang.node.expression;

public class ComparisonExpressionNode extends ExpressionNode {

    public String comparisonOperator;
    public ExpressionNode leftExpressionNode;
    public ExpressionNode rightExpressionNode;

    @Override
    public String toString() {
        return "ComparisonExpressionNode{" +
                "comparisonOperator='" + comparisonOperator + '\'' +
                ", leftExpressionNode=" + leftExpressionNode +
                ", rightExpressionNode=" + rightExpressionNode +
                '}';
    }
}
