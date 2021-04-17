package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.expression.ExpressionNode;
import by.aliana.lang.node.statement.DeclareNode;
import by.aliana.lang.node.unit.VarNameNode;

public class DeclarationAssignmentNode extends ASTNode implements AssignmentDefinitionArea {

    public DeclareNode declareNode;
    public ExpressionNode expressionNode;

    @Override
    public String toString() {
        return "DeclarationAssignmentNode{" +
                "declareNode=" + declareNode +
                ", expressionNode=" + expressionNode +
                '}';
    }
}
