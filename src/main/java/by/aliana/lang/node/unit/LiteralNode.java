package by.aliana.lang.node.unit;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueDefinitionArea;
import by.aliana.lang.node.function_call.FuncCallAttributeDefinitionArea;

public class LiteralNode extends ASTNode implements ArithmeticUnitDefinitionArea
                                                    , UnaryMinusUnitDefinitionArea
                                                    , FuncCallAttributeDefinitionArea
                                                    , ArrayElementValueDefinitionArea {

    public String literal;

    @Override
    public String toString() {
        return "LiteralNode{" +
                "literal='" + literal + '\'' +
                '}';
    }
}
