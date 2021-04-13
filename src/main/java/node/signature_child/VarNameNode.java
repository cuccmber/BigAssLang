package node.signature_child;

import node.ASTNode;
import node.assign_child.AssignLeftNodeChild;
import node.assign_child.AssignRightNodeChild;
import node.attribute_child.AttributeNodeChild;
import node.comparison_child.ComparisonAtomNodeChild;
import node.drop_child.DropNodeChild;
import node.array_child.ArrayElementNodeChild;

public class VarNameNode extends ASTNode implements DropNodeChild, ArrayElementNodeChild, AttributeNodeChild,
        AssignLeftNodeChild, AssignRightNodeChild, ComparisonAtomNodeChild {
    public String name;

    public VarNameNode(String name){
        this.name = name;
    }
}
