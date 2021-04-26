package by.aliana.lang.memory;

import java.util.ArrayList;
import java.util.List;

public class IfClauseScope {
    public List<String> variables = new ArrayList<>();
    public List<IfClauseScope> nestedIfClauseScope = new ArrayList<>();

    @Override
    public String toString() {
        return "Scope{" +
                "variables=" + variables +
                ", nestedScope=" + nestedIfClauseScope +
                '}';
    }
}

