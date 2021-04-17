package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.unit.VarNameNode;

public class VarAssignmentNode extends ASTNode implements AssignmentDefinitionArea {

    public VarNameNode varNameNode;
    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "VarAssignmentNode{" +
                "varNameNode=" + varNameNode +
                ", expressionNode=" + expressionNode +
                '}';
    }
}
