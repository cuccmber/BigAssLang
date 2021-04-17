package by.aliana.lang.node.unit;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueDefinitionArea;
import by.aliana.lang.node.function_call.FuncCallAttributeDefinitionArea;
import by.aliana.lang.node.function_call.FuncCallAttributeNode;

import java.util.ArrayList;
import java.util.List;

public class FuncCallNode extends ASTNode implements ArithmeticUnitDefinitionArea
                                                    , FuncCallAttributeDefinitionArea
                                                    , ArrayElementValueDefinitionArea {

    public VarNameNode varNameNode;
    public List<FuncCallAttributeNode> callAttributeNodes = new ArrayList<>();
}
