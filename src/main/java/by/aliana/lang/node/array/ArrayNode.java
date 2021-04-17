package by.aliana.lang.node.array;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.function_call.FuncCallAttributeDefinitionArea;

import java.util.ArrayList;
import java.util.List;

public class ArrayNode extends ASTNode implements FuncCallAttributeDefinitionArea
                                                    , ArrayElementValueDefinitionArea{

    public List<ArrayElementValueNode> arrayElementNodes = new ArrayList<>();
}
