package node.signature_child;

import node.ASTNode;
import node.statement_child.DeclareNode;

import java.util.ArrayList;

public class AttributeNode extends ASTNode {
    public ArrayList<DeclareNode> declarations = new ArrayList<>();
    public String comma;

}