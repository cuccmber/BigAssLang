package by.aliana.lang.memory;

import java.util.HashMap;

public class ProgramScope {
    public HashMap<String,FunctionScope> functionScopes = new HashMap<>();

    @Override
    public String toString() {
        return "ProgramScope{" +
                "functionScopes=" + functionScopes +
                '}';
    }
}
