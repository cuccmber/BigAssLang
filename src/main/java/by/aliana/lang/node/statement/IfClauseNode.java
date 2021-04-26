package by.aliana.lang.node.statement;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.if_clause.ElifBlockNode;
import by.aliana.lang.node.if_clause.ElseBlockNode;
import by.aliana.lang.node.if_clause.IfBlockNode;

import java.util.ArrayList;
import java.util.List;

public class IfClauseNode extends ASTNode implements StatementDefinitionArea {

    public IfBlockNode ifBlockNode;
    public List<ElifBlockNode> elifBlockNodes = new ArrayList<>();
    public ElseBlockNode elseBlockNode;

    @Override
    public String toString() {
        return "IfClauseNode{" +
                "ifBlockNode=" + ifBlockNode +
                ", elifBlockNodes=" + elifBlockNodes +
                ", elseBlockNode=" + elseBlockNode +
                '}';
    }
}
