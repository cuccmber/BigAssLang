package node.statement_child;

import node.ASTNode;
import node.assign_child.AssignRightNodeChild;
import node.attribute_child.AttributeNodeChild;
import node.comparison_child.ComparisonAtomNodeChild;
import node.drop_child.DropNodeChild;
import node.array_child.ArrayElementNodeChild;
import node.func_call_child.FuncCallAttributeNode;
import java.util.ArrayList;
import java.util.List;

public class FuncCallNode extends ASTNode implements DropNodeChild, StatementNodeChild, ArrayElementNodeChild,
        AttributeNodeChild, AssignRightNodeChild, ComparisonAtomNodeChild {
    public List<FuncCallAttributeNode> funcCallAttributeNodeChildren = new ArrayList<>();
}
