package node.drop_child;

import node.ASTNode;
import node.assign_child.AssignRightNodeChild;
import node.comparison_child.ComparisonAtomNodeChild;

public class ArithmeticExpressionNode extends ASTNode implements DropNodeChild, AssignRightNodeChild,
        ComparisonAtomNodeChild {
}
