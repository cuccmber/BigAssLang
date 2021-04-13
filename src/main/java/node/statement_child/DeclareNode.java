package node.statement_child;

import node.ASTNode;
import node.assign_child.AssignLeftNodeChild;
import node.func_child.TypeNode;
import node.signature_child.VarNameNode;

public class DeclareNode extends ASTNode implements StatementNodeChild, AssignLeftNodeChild {
    public TypeNode typeNode;
    public VarNameNode varNameNode;
}
