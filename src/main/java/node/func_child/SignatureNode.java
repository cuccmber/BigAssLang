package node.func_child;

import node.ASTNode;
import node.comparison_child.ComparisonAtomNodeChild;
import node.signature_child.AttributeNode;
import node.signature_child.VarNameNode;
import java.util.ArrayList;
import java.util.List;

public class SignatureNode extends ASTNode implements ComparisonAtomNodeChild {
    public VarNameNode name;
    public List<AttributeNode> attributes = new ArrayList<>();
}