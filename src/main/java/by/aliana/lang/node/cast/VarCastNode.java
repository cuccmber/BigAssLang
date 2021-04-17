package by.aliana.lang.node.cast;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.unit.VarNameNode;

public class VarCastNode extends ASTNode implements CastDefinitionArea {

    public VarNameNode varNameNode;
    public String type;
    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "VarCastNode{" +
                "varNameNode=" + varNameNode +
                ", type='" + type + '\'' +
                ", expressionNode=" + expressionNode +
                '}';
    }
}
