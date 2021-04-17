package by.aliana.lang.node.function_impl;

import by.aliana.lang.node.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class SignatureNode extends ASTNode {

    public String varName;
    public List<AttributeNode> attributeNodes = new ArrayList<>();

    @Override
    public String toString() {
        return "SignatureNode{" +
                "varName='" + varName + '\'' +
                ", attributeNodes=" + attributeNodes +
                '}';
    }
}
