package node.root;

import node.ASTNode;
import node.prog_child.FuncImplNode;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode {
    public List<FuncImplNode> functions = new ArrayList<>();
}
