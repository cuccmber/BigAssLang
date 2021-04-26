package by.aliana.lang.node.unit;

import by.aliana.lang.node.ASTNode;

public class UnaryMinusUnitNode extends ASTNode {

    public UnaryMinusUnitDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "UnaryMinusUnitNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
