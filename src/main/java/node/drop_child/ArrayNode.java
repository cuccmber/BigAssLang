package node.drop_child;

import node.ASTNode;
import node.array_child.ArrayElementNode;
import node.array_child.ArrayElementNodeChild;
import node.assign_child.AssignRightNodeChild;
import node.attribute_child.AttributeNodeChild;

import java.util.ArrayList;
import java.util.List;

public class ArrayNode extends ASTNode implements DropNodeChild, ArrayElementNodeChild, AttributeNodeChild,
        AssignRightNodeChild {
    public List<ArrayElementNode> elements = new ArrayList<>();
}


