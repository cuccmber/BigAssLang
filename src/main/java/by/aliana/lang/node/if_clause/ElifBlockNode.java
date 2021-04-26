package by.aliana.lang.node.if_clause;

import by.aliana.lang.node.ASTNode;


public class ElifBlockNode extends ASTNode {

    public IfBlockNode ifBlockNode;

    @Override
    public String toString() {
        return "ElifBlockNode{" +
                "ifBlockNode=" + ifBlockNode +
                '}';
    }
}
