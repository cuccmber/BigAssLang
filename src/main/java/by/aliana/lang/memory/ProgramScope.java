package by.aliana.lang.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProgramScope {
    public List<FunctionScope> functionScopes = new ArrayList<>();

    @Override
    public String toString() {
        return "ProgramScope{" +
                "functionScopes=" + functionScopes +
                '}';
    }
}
