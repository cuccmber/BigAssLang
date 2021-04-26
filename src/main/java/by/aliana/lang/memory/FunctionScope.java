package by.aliana.lang.memory;

import java.util.ArrayList;
import java.util.List;

public class FunctionScope {
    public String name;
    public String type;
    public List<String> variables = new ArrayList<>();
    public List<IfClauseScope> nestedIfClauseScope = new ArrayList<>();
}
