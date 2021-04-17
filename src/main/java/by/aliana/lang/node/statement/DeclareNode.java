package by.aliana.lang.node.statement;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.unit.VarNameNode;

public class DeclareNode extends ASTNode implements StatementDefinitionArea {

    public String type;
    public VarNameNode varNameNode;

    @Override
    public String toString() {
        return "DeclareNode{" +
                "type='" + type + '\'' +
                ", varNameNode=" + varNameNode +
                '}';
    }
}
