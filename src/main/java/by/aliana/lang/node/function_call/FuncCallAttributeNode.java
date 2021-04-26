package by.aliana.lang.node.function_call;

import by.aliana.lang.node.ASTNode;

public class FuncCallAttributeNode extends ASTNode {

    public FuncCallAttributeDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "FuncCallAttributeNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
