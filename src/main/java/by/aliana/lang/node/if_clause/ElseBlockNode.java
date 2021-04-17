package by.aliana.lang.node.if_clause;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.function_impl.BodyContentNode;

public class ElseBlockNode extends ASTNode {

    public BodyContentNode bodyContentNode;

    @Override
    public String toString() {
        return "ElseBlockNode{" +
                "bodyContentNode=" + bodyContentNode +
                '}';
    }
}
