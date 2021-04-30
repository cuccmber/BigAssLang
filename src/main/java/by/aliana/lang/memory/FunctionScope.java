package by.aliana.lang.memory;


public class FunctionScope {
    public String name;
    public String type;
    public IfClauseScope ifClauseScope;

    @Override
    public String toString() {
        return "FunctionScope{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", scope=" + ifClauseScope +
                '}';
    }

}
