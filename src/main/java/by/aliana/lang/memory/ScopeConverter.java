package by.aliana.lang.memory;

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

public class ScopeConverter {
    private ProgNode tree;

    public ScopeConverter(ProgNode progNode) {
        this.tree = progNode;
    }

    public ProgramScope createProgScope() {
        ProgramScope programScope = new ProgramScope();
        for (FuncImplNode funcImplNode : tree.funcNodes) {
            FunctionScope functionScope = new FunctionScope();
            programScope.functionScopes.add(createFunctionScope(funcImplNode.bodyContentNode));
        }
        System.out.println(programScope.toString());
        return programScope;
    }

    public FunctionScope createFunctionScope(BodyContentNode bodyContentNode) {
        FunctionScope functionScope = new FunctionScope();


        return functionScope;
    }


    public IfClauseScope createIfClauseScope(BodyContentNode bodyContentNode) {
        IfClauseScope ifClauseScope = new IfClauseScope();
        for (StatementNode statementNode : bodyContentNode.statementNodes) {
            StatementDefinitionArea statementDefinitionArea = statementNode.definitionArea;
            if (statementDefinitionArea instanceof AssignNode) {
                if (selectAssignmentNodes(statementDefinitionArea) != null) {
                    ifClauseScope.variables.add(selectAssignmentNodes(statementDefinitionArea));
                }
            }
            if (statementDefinitionArea instanceof CastNode) {
                if (selectCastNodes(statementDefinitionArea) != null) {
                    ifClauseScope.variables.add(selectCastNodes(statementDefinitionArea));
                }
            }
            if (statementDefinitionArea instanceof DeclareNode) {
                String name = ((DeclareNode) statementDefinitionArea).varNameNode.name;
                //TODO validate
                ifClauseScope.variables.add(name);
            }
            if (statementDefinitionArea instanceof IfClauseNode) {
                for (BodyContentNode ifsBodies : selectBodyNodes(statementDefinitionArea)) {
                    ifClauseScope.nestedIfClauseScope.add(createIfClauseScope(ifsBodies));
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
