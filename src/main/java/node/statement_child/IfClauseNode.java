package node.statement_child;


import node.ASTNode;
import node.if_child.ElifNode;
import node.if_child.ElseNode;
import node.if_child.IfNode;

import java.util.ArrayList;
import java.util.List;

public class IfClauseNode extends ASTNode implements StatementNodeChild {
    public IfNode ifNode;
    public List<ElifNode> elifNode = new ArrayList<>();
    public ElseNode elseNode;
}
