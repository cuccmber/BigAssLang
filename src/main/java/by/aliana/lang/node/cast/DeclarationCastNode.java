package by.aliana.lang.node.cast;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.statement.DeclareNode;

public class DeclarationCastNode extends ASTNode implements CastDefinitionArea {

    public DeclareNode declareNode;
    public String type;
    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "DeclarationCastNode{" +
                "declareNode=" + declareNode +
                ", type='" + type + '\'' +
                ", expressionNode=" + expressionNode +
                '}';
    }
}
