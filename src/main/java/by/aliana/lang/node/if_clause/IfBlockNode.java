package by.aliana.lang.node.if_clause;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.function_impl.BodyContentNode;


public class IfBlockNode extends ASTNode {

    public ExpressionNode expressionNode;
    public BodyContentNode bodyContentNode;

    @Override
    public String toString() {
        return "IfBlockNode{" +
                "expressionNode=" + expressionNode +
                ", bodyContentNode=" + bodyContentNode +
                '}';
    }
}
