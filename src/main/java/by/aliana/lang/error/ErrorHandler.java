package by.aliana.lang.error;

import by.aliana.lang.exception.CustomException;
import by.aliana.lang.handler.DoubleDeclarationErrorHandler;
import by.aliana.lang.node.assign.AssignmentDefinitionArea;
import by.aliana.lang.node.assign.DeclarationAssignmentNode;
import by.aliana.lang.node.assign.DeclarationAssignmentToArrayNode;
import by.aliana.lang.node.cast.CastDefinitionArea;
import by.aliana.lang.node.cast.DeclarationCastNode;
import by.aliana.lang.node.function_impl.BodyContentNode;
import by.aliana.lang.node.function_impl.FuncImplNode;
import by.aliana.lang.node.function_impl.ReturnFuncNode;
import by.aliana.lang.node.function_impl.VoidFuncNode;
import by.aliana.lang.node.statement.*;

import java.util.*;

public class ErrorHandler {

    public static void checkReturn(FuncImplNode funcImplNode) {
        if (funcImplNode instanceof ReturnFuncNode && funcImplNode.type == null) {
            try {
                throw new CustomException("Unexpected drop statement!");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        } else if (funcImplNode instanceof VoidFuncNode && funcImplNode.type != null) {
            try {
                throw new CustomException("Redundant drop statement!");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }

    public static void checkDoubleDeclaration(FuncImplNode funcImplNode) {
        List<String> declareNodeList = traverseDeclarations(funcImplNode);
        Set<String> duplicatedDeclarations = findDeclareDuplication(declareNodeList);
        if (!duplicatedDeclarations.isEmpty()) {
            try {
                throw new CustomException("Duplicated " + Arrays.toString(duplicatedDeclarations.toArray()).replace("[", "").replace("]", "") + ".");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }


    private static List<String> traverseDeclarations(FuncImplNode funcImplNode) {
        BodyContentNode bodyContentNode = funcImplNode.bodyContentNode;
        List<String> declareNodeList = new ArrayList<>();
        for (StatementNode statementNode : bodyContentNode.statementNodes) {
            StatementDefinitionArea statementDefinitionArea = statementNode.definitionArea;
            if (statementDefinitionArea instanceof AssignNode) {
                AssignmentDefinitionArea assignmentDefinitionArea = ((AssignNode) statementDefinitionArea).definitionArea;
                if (assignmentDefinitionArea instanceof DeclarationAssignmentNode) {
                    DeclareNode declareNode = ((DeclarationAssignmentNode) assignmentDefinitionArea).declareNode;
                    declareNodeList.add(declareNode.varNameNode.name);
                }
                if (assignmentDefinitionArea instanceof DeclarationAssignmentToArrayNode) {
                    DeclareNode declareNode = ((DeclarationAssignmentToArrayNode) assignmentDefinitionArea).declareNode;
                    declareNodeList.add(declareNode.varNameNode.name);
                }
            }
            if (statementDefinitionArea instanceof CastNode) {
                CastDefinitionArea castDefinitionArea = ((CastNode) statementDefinitionArea).definitionArea;
                if (castDefinitionArea instanceof DeclarationCastNode) {
                    DeclareNode declareNode = ((DeclarationCastNode) castDefinitionArea).declareNode;
                    declareNodeList.add(declareNode.varNameNode.name);
                }
            }
            if (statementDefinitionArea instanceof DeclareNode) {
                declareNodeList.add(((DeclareNode) ((DeclareNode) statementDefinitionArea)).varNameNode.name);
            }
        }
        return declareNodeList;
    }


    private static List<String> traverseUsages(FuncImplNode funcImplNode) {
        BodyContentNode bodyContentNode = funcImplNode.bodyContentNode;
        List<String> declareNodeList = new ArrayList<>();
        for (StatementNode statementNode : bodyContentNode.statementNodes) {

        }
        return declareNodeList;
    }


    public static Set<String> findDeclareDuplication(List<String> declareNodeList) {
        Set<String> declareSet = new HashSet<>(declareNodeList);
        if (declareNodeList.size() - declareSet.size() > 0) {
            declareSet.forEach((i)->declareNodeList.remove(i));
        } else {
            declareNodeList.clear();
        }
        Set<String> resultSet = new HashSet<>(declareNodeList);
        return resultSet;
    }


    public static void checkMissingDeclaration(){}
}
