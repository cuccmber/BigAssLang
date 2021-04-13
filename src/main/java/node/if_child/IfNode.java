package node.if_child;

import node.ASTNode;
import node.drop_child.ComparisonLogicalStatementNode;
import node.func_child.BodyContentNode;

public class IfNode extends ASTNode {
    public ComparisonLogicalStatementNode comparisonLogicalStatementNode;
    public BodyContentNode bodyContentNode;
}
