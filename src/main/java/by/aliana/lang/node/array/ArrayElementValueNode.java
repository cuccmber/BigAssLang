package by.aliana.lang.node.array;

import by.aliana.lang.node.ASTNode;

public class ArrayElementValueNode extends ASTNode {

    public ArrayElementValueDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "ArrayElementValueNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
