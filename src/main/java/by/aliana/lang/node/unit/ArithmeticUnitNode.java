package by.aliana.lang.node.unit;

import by.aliana.lang.node.ASTNode;

public class ArithmeticUnitNode extends ASTNode {

    public ArithmeticUnitDefinitionArea definitionArea;

    @Override
    public String toString() {
        return "ArithmeticUnitNode{" +
                "definitionArea=" + definitionArea +
                '}';
    }
}
