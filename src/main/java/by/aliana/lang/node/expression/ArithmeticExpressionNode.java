package by.aliana.lang.node.expression;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.unit.ArithmeticUnitNode;

public class ArithmeticExpressionNode extends ExpressionNode {

    public ArithmeticUnitNode unitNode;

    @Override
    public String toString() {
        return "ArithmeticExpressionNode{" +
                "unitNode=" + unitNode +
                '}';
    }
}
