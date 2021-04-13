package node.array_child;

import node.ASTNode;
import node.assign_child.AssignLeftNodeChild;
import node.assign_child.AssignRightNodeChild;
import node.attribute_child.AttributeNodeChild;
import node.comparison_child.ComparisonAtomNodeChild;

public class GetElementNode extends ASTNode implements ArrayElementNodeChild, AttributeNodeChild,
        AssignLeftNodeChild, AssignRightNodeChild, ComparisonAtomNodeChild {
    public String varName;
    public int index;
}
