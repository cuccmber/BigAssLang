package by.aliana.lang.memory;

import by.aliana.lang.node.statement.IfClauseNode;


public class FunctionScope {
    public String name;
    public String type;
    public IfClauseScope scope;

    @Override
    public String toString() {
        return "FunctionScope{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", scope=" + scope +
                '}';
    }

}
