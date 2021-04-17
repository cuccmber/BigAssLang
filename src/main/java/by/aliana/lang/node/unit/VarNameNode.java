package by.aliana.lang.node.unit;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueDefinitionArea;
import by.aliana.lang.node.function_call.FuncCallAttributeDefinitionArea;

public class VarNameNode extends ASTNode implements ArithmeticUnitDefinitionArea
                                                    , UnaryMinusUnitDefinitionArea
                                                    , FuncCallAttributeDefinitionArea
                                                    , ArrayElementValueDefinitionArea {

    public String name;
}
