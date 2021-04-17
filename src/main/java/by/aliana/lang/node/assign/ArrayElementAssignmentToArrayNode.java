package by.aliana.lang.node.assign;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.unit.GetElementNode;

public class ArrayElementAssignmentToArrayNode extends ASTNode implements AssignmentDefinitionArea {

    public GetElementNode getElementNode;
    public ArrayNode arrayNode;

    @Override
    public String toString() {
        return "ArrayElementAssignmentToArrayNode{" +
                "getElementNode=" + getElementNode +
                ", arrayNode=" + arrayNode +
                '}';
    }
}
