package by.aliana.lang.node.function_impl;

public class ReturnFuncNode extends FuncImplNode {

    public DropNode dropNode;

    @Override
    public String toString() {
        return "ReturnFuncNode{" +
                "type='" + type + '\'' +
                ", signatureNode=" + signatureNode +
                ", bodyContentNode=" + bodyContentNode +
                ", dropNode=" + dropNode +
                '}';
    }
}
