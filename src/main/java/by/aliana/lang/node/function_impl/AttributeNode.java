package by.aliana.lang.node.function_impl;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.statement.DeclareNode;

import java.util.ArrayList;
import java.util.List;

public class AttributeNode extends ASTNode {
    public List<DeclareNode> declareNodes = new ArrayList<>();

    @Override
    public String toString() {
        return "AttributeNode{" +
                "attributeNodes=" + declareNodes +
                '}';
    }
}
