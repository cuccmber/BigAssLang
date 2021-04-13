package node.prog_child;

import node.*;
import node.func_child.BodyContentNode;
import node.func_child.DropNode;
import node.func_child.SignatureNode;
import node.func_child.TypeNode;

public class FuncImplNode extends ASTNode {
    public SignatureNode signature;
    public BodyContentNode body;
    public DropNode drop;
    public TypeNode type;
}
