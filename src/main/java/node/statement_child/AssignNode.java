package node.statement_child;

import node.ASTNode;
import node.assign_child.AssignLeftNode;
import node.assign_child.AssignRightNode;
import node.assign_child.CastNode;

public class AssignNode extends ASTNode implements StatementNodeChild {
    public AssignLeftNode assignLeftNode;
    public CastNode castNode;
    public AssignRightNode assignRightNode;
}
