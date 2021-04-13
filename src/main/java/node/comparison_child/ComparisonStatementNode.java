package node.comparison_child;

import node.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ComparisonStatementNode extends ASTNode {
    public List<ComparisonAtomNode> comparisonAtoms = new ArrayList<>();
    public String comparisonOperator;
}
