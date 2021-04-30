package by.aliana.lang.memory;

import by.aliana.lang.exception.CustomException;
import by.aliana.lang.handler.DoubleDeclarationErrorHandler;
import by.aliana.lang.node.assign.DeclarationAssignmentNode;
import by.aliana.lang.node.assign.DeclarationAssignmentToArrayNode;
import by.aliana.lang.node.cast.DeclarationCastNode;
import by.aliana.lang.node.function_impl.BodyContentNode;
import by.aliana.lang.node.function_impl.FuncImplNode;
import by.aliana.lang.node.if_clause.ElifBlockNode;
import by.aliana.lang.node.prog.ProgNode;
import by.aliana.lang.node.statement.*;

import java.util.ArrayList;
import java.util.List;

public class ScopeBuilder {
    private ProgNode tree;

    public ScopeBuilder(ProgNode progNode) {
        this.tree = progNode;
    }

    public ProgramScope createProgScope() throws CustomException {
        ProgramScope programScope = new ProgramScope();
        for (FuncImplNode funcImplNode : tree.funcNodes) {
            programScope.functionScopes.add(createFunctionScope(funcImplNode));
        }
        System.out.println(programScope.toString());
        return programScope;
    }

    public FunctionScope createFunctionScope(FuncImplNode funcImplNode) throws CustomException {
        FunctionScope functionScope = new FunctionScope();
        String functionName = funcImplNode.signatureNode.varName;
        String functionType = funcImplNode.type;
        functionScope.name = functionName;
        functionScope.type = functionType;
        functionScope.ifClauseScope = createScope(funcImplNode.bodyContentNode);
        return functionScope;
    }

    public IfClauseScope createScope(BodyContentNode bodyContentNode) throws CustomException {
        IfClauseScope ifClauseScope = new IfClauseScope();
        for (StatementNode statementNode : bodyContentNode.statementNodes) {
            StatementDefinitionArea statementDefinitionArea = statementNode.definitionArea;
            if (statementDefinitionArea instanceof AssignNode) {
                if (selectAssignmentNodes(statementDefinitionArea) != null) {
                    String name = selectAssignmentNodes(statementDefinitionArea);
                    ifClauseScope.variables.add(name);
                    if (DoubleDeclarationErrorHandler.handleError(name, ifClauseScope)) {
                        throw new CustomException("Variable " + name + " is declared more than one time");
                    }
                }
            }
            if (statementDefinitionArea instanceof CastNode) {
                if (selectCastNodes(statementDefinitionArea) != null) {
                    String name = selectCastNodes(statementDefinitionArea);
                    ifClauseScope.variables.add(name);
                    if (DoubleDeclarationErrorHandler.handleError(name, ifClauseScope)) {
                        throw new CustomException("Variable " + name + " is declared more than one time");
                    }
                }
            }
            if (statementDefinitionArea instanceof DeclareNode) {
                String name = ((DeclareNode) statementDefinitionArea).varNameNode.name;
                ifClauseScope.variables.add(name);
                if (DoubleDeclarationErrorHandler.handleError(name, ifClauseScope)) {
                    throw new CustomException("Variable " + name + " is declared more than one time");
                }
            }
            if (statementDefinitionArea instanceof IfClauseNode) {
                for (BodyContentNode ifsBodies : selectBodyNodes(statementDefinitionArea)) {
                    ifClauseScope.nestedIfClauseScope.add(createScope(ifsBodies));
                }
            }
        }
        System.out.println(ifClauseScope.toString());
        return ifClauseScope;
    }

    public String selectAssignmentNodes(StatementDefinitionArea statementDefinitionArea) {
        AssignNode assignNode = (AssignNode) statementDefinitionArea;
        String name = null;
        if (assignNode.definitionArea instanceof DeclarationAssignmentNode) {
            DeclareNode declareNode = ((DeclarationAssignmentNode)assignNode.definitionArea).declareNode;
            name = declareNode.varNameNode.name;
        }
        if (assignNode.definitionArea instanceof DeclarationAssignmentToArrayNode) {
            DeclareNode declareNode = ((DeclarationAssignmentToArrayNode)assignNode.definitionArea).declareNode;
            name = declareNode.varNameNode.name;
        }
        return name;
    }

    public String selectCastNodes(StatementDefinitionArea statementDefinitionArea) {
        String name = null;
        CastNode castNode = (CastNode) statementDefinitionArea;
        if (castNode.definitionArea instanceof DeclarationCastNode) {
            DeclareNode declareNode = ((DeclarationCastNode)castNode.definitionArea).declareNode;
            name = declareNode.varNameNode.name;
        }
        return name;
    }

    public List<BodyContentNode> selectBodyNodes(StatementDefinitionArea statementDefinitionArea) {
        List<BodyContentNode> bodies = new ArrayList<>();
        bodies.add(((IfClauseNode) statementDefinitionArea).ifBlockNode.bodyContentNode);
        if (((IfClauseNode) statementDefinitionArea).elifBlockNodes != null) {
            for ( ElifBlockNode elifBlockNode : ((IfClauseNode) statementDefinitionArea).elifBlockNodes) {
                bodies.add(elifBlockNode.ifBlockNode.bodyContentNode);
            }
        }
        if (((IfClauseNode) statementDefinitionArea).elseBlockNode != null) {
            bodies.add(((IfClauseNode) statementDefinitionArea).elseBlockNode.bodyContentNode);
        }
        return bodies;
    }
}
