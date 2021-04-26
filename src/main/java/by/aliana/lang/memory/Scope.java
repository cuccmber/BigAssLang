package by.aliana.lang.memory;

import java.util.ArrayList;
import java.util.List;

public class FunctionScope {
    public List<String> variables = new ArrayList<>();
    public List<FunctionScope> nestedScope = new ArrayList<>();

    @Override
    public String toString() {
        return "FunctionScope{" +
                "variables=" + variables.toString() +
                ", nestedScope=" + nestedScope.toString() +
                '}';
    }
}

