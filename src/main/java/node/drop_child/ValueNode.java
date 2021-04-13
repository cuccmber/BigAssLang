package node.drop_child;

import node.ASTNode;
import node.array_child.ArrayElementNodeChild;
import node.assign_child.AssignRightNodeChild;
import node.attribute_child.AttributeNodeChild;
import node.comparison_child.ComparisonAtomNodeChild;

public class ValueNode extends ASTNode implements DropNodeChild, ArrayElementNodeChild, AttributeNodeChild,
        AssignRightNodeChild, ComparisonAtomNodeChild {
    public String value;

    public ValueNode(String value) {
        this.value = value;
    }
}
