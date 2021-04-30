package by.aliana.lang.handler;

import by.aliana.lang.memory.IfClauseScope;

public class DoubleDeclarationErrorHandler {

    public static boolean handleError(String search, IfClauseScope scope) {
        for (String variable : scope.variables) {
            if (search.equals(variable)) {
                return true;
            }
        }
        if (!scope.nestedIfClauseScope.isEmpty()) {
            for (IfClauseScope ifClauseScope : scope.nestedIfClauseScope) {
                if (handleError(search, ifClauseScope)) {
                    return true;
                }
            }
        }
        return false;
    }


}
