package by.aliana.lang.node.unit;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueDefinitionArea;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.function_call.FuncCallAttributeDefinitionArea;

public class GetElementNode extends ASTNode implements ArithmeticUnitDefinitionArea
                                                        , UnaryMinusUnitDefinitionArea
                                                        , FuncCallAttributeDefinitionArea
                                                        , ArrayElementValueDefinitionArea {
    public VarNameNode varNameNode;
    public int index;
}
