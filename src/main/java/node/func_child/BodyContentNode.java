package node.func_child;

import node.*;
import node.body_child.StatementNode;

import java.util.ArrayList;
import java.util.List;

public class BodyContentNode extends ASTNode {
    public List<StatementNode> statementNodes = new ArrayList<>();
}
