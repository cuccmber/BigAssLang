package by.aliana.lang.node.function_impl;

import by.aliana.lang.node.ASTNode;

public class FuncImplNode extends ASTNode {

    public String type;
    public SignatureNode signatureNode;
    public BodyContentNode bodyContentNode;

    @Override
    public String toString() {
        return "FuncImplNode{" +
                "type='" + type + '\'' +
                ", signatureNode=" + signatureNode +
                ", bodyContentNode=" + bodyContentNode +
                '}';
    }
}
