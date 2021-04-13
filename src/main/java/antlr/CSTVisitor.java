package antlr;

import node.ASTNode;
import node.array_child.ArrayElementNode;
import node.array_child.GetElementNode;
import node.assign_child.AssignLeftNode;
import node.assign_child.AssignRightNode;
import node.assign_child.CastNode;
import node.body_child.StatementNode;
import node.comparison_child.ComparisonAtomNode;
import node.comparison_child.ComparisonStatementNode;
import node.drop_child.ArithmeticExpressionNode;
import node.drop_child.ArrayNode;
import node.drop_child.ComparisonLogicalStatementNode;
import node.drop_child.ValueNode;
import node.func_call_child.FuncCallAttributeNode;
import node.func_child.BodyContentNode;
import node.func_child.DropNode;
import node.func_child.SignatureNode;
import node.func_child.TypeNode;
import node.if_child.ElifNode;
import node.if_child.ElseNode;
import node.if_child.IfNode;
import node.prog_child.FuncImplNode;
import node.root.ProgNode;
import node.signature_child.AttributeNode;
import node.signature_child.VarNameNode;
import node.statement_child.AssignNode;
import node.statement_child.DeclareNode;
import node.statement_child.FuncCallNode;
import node.statement_child.IfClauseNode;

public class CSTVisitor extends assBaseVisitor<//    public List<ComparisonKaryStatementNodeChild> comparisonStatementNodes = new ArrayList<>();
ASTNode> {

    private final String EMPTY_STRING = "";
    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;

    @Override
    public ASTNode visitProg(assParser.ProgContext ctx){
        ProgNode rootNode = new ProgNode();
        for(assParser.FuncContext funcCtx : ctx.func()) {
            FuncImplNode funcNode = this.visitFunc(funcCtx);
            rootNode.functions.add(funcNode);
        };
        return rootNode;
    }

    @Override
    public FuncImplNode visitFunc(assParser.FuncContext ctx) {
        FuncImplNode funcImplNode = new FuncImplNode();
        funcImplNode.signature = visitSignature(ctx.signature());
        funcImplNode.body = visitBodyContent(ctx.bodyContent());
        funcImplNode.drop = visitDrop(ctx.drop());
        TypeNode typeNode;
        if (ctx.type() != null) {
            typeNode = new TypeNode(ctx.type().getText());
        } else if (ctx.arrayType() != null) {
            typeNode = new TypeNode(ctx.type().getText());
        } else {
            typeNode = new TypeNode(EMPTY_STRING);
        }
        if (typeNode != null) {
            funcImplNode.type = typeNode;
        }
        return funcImplNode;
    }

    @Override
    public FuncCallNode visitFuncCall(assParser.FuncCallContext ctx) {
        FuncCallNode funcCallNode = new FuncCallNode();
        for (assParser.FuncCallAttributeContext funcCallAttributeContext : ctx.funcCallAttribute()) {
            FuncCallAttributeNode childNode = visitFuncCallAttribute(funcCallAttributeContext);
            funcCallNode.funcCallAttributeNodeChildren.add(childNode);

        }
        return funcCallNode;
    }

    @Override
    public FuncCallAttributeNode visitFuncCallAttribute(assParser.FuncCallAttributeContext ctx) {
        FuncCallAttributeNode funcCallAttributeNode = new FuncCallAttributeNode();
        if (ctx.varName() != null) {
            funcCallAttributeNode.attributeNodeChild = visitVarName(ctx.varName());
        }
        if (ctx.value() != null) {
            funcCallAttributeNode.attributeNodeChild = visitValue(ctx.value());
        }
        if (ctx.getElement() != null) {
            funcCallAttributeNode.attributeNodeChild = visitGetElement(ctx.getElement());
        }
        if (ctx.funcCall() != null) {
            funcCallAttributeNode.attributeNodeChild = visitFuncCall(ctx.funcCall());
        }
        if (ctx.array() != null) {
            funcCallAttributeNode.attributeNodeChild = visitArray(ctx.array());
        }
        return funcCallAttributeNode;
    }

    @Override
    public SignatureNode visitSignature(assParser.SignatureContext ctx) {
        SignatureNode signatureNode =  new SignatureNode();
        signatureNode.name = visitVarName(ctx.varName());
        for(assParser.AttributeContext attributeContext : ctx.attribute()) {
            AttributeNode attributeNode = visitAttribute(attributeContext);
            signatureNode.attributes.add(attributeNode);
        }
        return signatureNode;
    }

    @Override
    public AttributeNode visitAttribute(assParser.AttributeContext ctx) {
        AttributeNode attributeNode = new AttributeNode();
        if (ctx.declare() != null) {
            for (assParser.DeclareContext declareContext : ctx.declare()) {
                DeclareNode declareNode = visitDeclare(declareContext);
                attributeNode.declarations.add(declareNode);
            }
        }
        return attributeNode;
    }

    @Override
    public BodyContentNode visitBodyContent(assParser.BodyContentContext ctx) {
        BodyContentNode bodyContentNode = new BodyContentNode();
        if (ctx.statement() != null) {
            for (assParser.StatementContext statementContext : ctx.statement()) {
                bodyContentNode.statementNodes.add(visitStatement(statementContext));
            }
        }
        return bodyContentNode;
    }

    @Override
    public DropNode visitDrop(assParser.DropContext ctx) {
        DropNode dropNode = new DropNode();
        if (ctx.arithmeticExpression() != null) {
            dropNode.dropNodeChild = visitArithmeticExpression(ctx.arithmeticExpression());
        }
        if (ctx.array() != null) {
            dropNode.dropNodeChild = visitArray(ctx.array());
        }
        if (ctx.comparisonLogicalStatement() != null) {
            dropNode.dropNodeChild = visitComparisonLogicalStatement(ctx.comparisonLogicalStatement());
        }
        if (ctx.value() != null) {
            dropNode.dropNodeChild = visitValue(ctx.value());
        }
        if (ctx.varName() != null) {
            dropNode.dropNodeChild = visitVarName(ctx.varName());
        }
        if (ctx.funcCall() != null) {
            dropNode.dropNodeChild = visitFuncCall(ctx.funcCall());
        }
        return dropNode;
    }

    @Override
    public StatementNode visitStatement(assParser.StatementContext ctx) {
        StatementNode statementNode = new StatementNode();
        if (ctx.declare() != null) {
            statementNode.statement = visitDeclare(ctx.declare());
        }
        if (ctx.assign() != null) {
            statementNode.statement = visitAssign(ctx.assign());
        }
        if (ctx.funcCall() != null) {
            statementNode.statement = visitFuncCall(ctx.funcCall());
        }
        if (ctx.ifClause() != null) {
            statementNode.statement = visitIfClause(ctx.ifClause());
        }
        return statementNode;
    }

    @Override
    public ValueNode visitValue(assParser.ValueContext ctx) {
        return new ValueNode(ctx.getText());
    }

    @Override
    public VarNameNode visitVarName(assParser.VarNameContext ctx) {
        return new VarNameNode(ctx.getText());
    }

    @Override
    public TypeNode visitType(assParser.TypeContext ctx) {
        return new TypeNode(ctx.getText());
    }

    @Override
    public ArrayNode visitArray(assParser.ArrayContext ctx) {
        ArrayNode arrayNode = new ArrayNode();
        if (ctx.arrayElement() != null) {
            for (assParser.ArrayElementContext element : ctx.arrayElement()) {
                arrayNode.elements.add(visitArrayElement(element));
            }
        }
        return arrayNode;
    }

    @Override
    public GetElementNode visitGetElement(assParser.GetElementContext ctx) {
        GetElementNode getElementNode = new GetElementNode();
        assParser.UnsignedIntValueContext indexContext = ctx.unsignedIntValue();
        getElementNode.index = Integer.parseInt(indexContext.getText());
        assParser.VarNameContext varNameContext = ctx.varName();
        getElementNode.varName = varNameContext.getText();
        return getElementNode;
    }

    @Override
    public ArrayElementNode visitArrayElement(assParser.ArrayElementContext ctx) {
        ArrayElementNode arrayElementNode = new ArrayElementNode();
        if (ctx.value() != null){
            arrayElementNode.arrayElementNode = visitValue(ctx.value());
        }
        if (ctx.varName() != null) {
            arrayElementNode.arrayElementNode = visitVarName(ctx.varName());
        }
        if (ctx.getElement() != null) {
            arrayElementNode.arrayElementNode = visitGetElement(ctx.getElement());
        }
        if (ctx.funcCall() != null) {
            arrayElementNode.arrayElementNode = visitFuncCall(ctx.funcCall());
        }
        if (ctx.array() != null) {
            arrayElementNode.arrayElementNode = visitArray(ctx.array());
        }
        return arrayElementNode;
    }

    @Override
    public DeclareNode visitDeclare(assParser.DeclareContext ctx) {
        DeclareNode declareNode = new DeclareNode();
        TypeNode typeNode = null;
        if (ctx.type() != null) {
            //visitor can be redundant
            typeNode = new TypeNode(ctx.type().getText());
            declareNode.typeNode = typeNode;
        }
        if (ctx.arrayType() != null) {
            typeNode = new TypeNode(ctx.arrayType().getText());
            declareNode.typeNode = typeNode;
        }
        declareNode.varNameNode = visitVarName(ctx.varName());
        return declareNode;
    }

    @Override
    public AssignNode visitAssign(assParser.AssignContext ctx) {
        AssignNode assignNode = new AssignNode();
        if (ctx.cast() != null) {
            assignNode.castNode = visitCast(ctx.cast());
        }
        assignNode.assignLeftNode = visitAssignmentLeftPart(ctx.assignmentLeftPart());
        assignNode.assignRightNode = visitAssignmentRightPart(ctx.assignmentRightPart());
        return assignNode;
    }

    @Override
    public AssignLeftNode visitAssignmentLeftPart(assParser.AssignmentLeftPartContext ctx) {
        AssignLeftNode assignLeftNode = new AssignLeftNode();
        if (ctx.declare() != null) {
            assignLeftNode.assignLeftNodeChild = visitDeclare(ctx.declare());
        }
        if (ctx.varName() != null) {
            assignLeftNode.assignLeftNodeChild = visitVarName(ctx.varName());
        }
        if (ctx.getElement() != null) {
            assignLeftNode.assignLeftNodeChild = visitGetElement(ctx.getElement());
        }
        return assignLeftNode;
    }

    @Override
    public AssignRightNode visitAssignmentRightPart(assParser.AssignmentRightPartContext ctx) {
        AssignRightNode assignRightNode = new AssignRightNode();
        if (ctx.value() != null) {
            assignRightNode.assignRightNodeChild = visitValue(ctx.value());
        }
        if (ctx.varName() != null) {
            assignRightNode.assignRightNodeChild = visitVarName(ctx.varName());
        }
        if (ctx.getElement() != null) {
            assignRightNode.assignRightNodeChild = visitGetElement(ctx.getElement());
        }
        if (ctx.arithmeticExpression() != null) {
            assignRightNode.assignRightNodeChild = visitArithmeticExpression(ctx.arithmeticExpression());
        }
        if (ctx.array() != null) {
            assignRightNode.assignRightNodeChild = visitArray(ctx.array());
        }
        if (ctx.funcCall() != null) {
            assignRightNode.assignRightNodeChild = visitFuncCall(ctx.funcCall());
        }
        return assignRightNode;
    }

    @Override
    public CastNode visitCast(assParser.CastContext ctx) {
        CastNode castNode = new CastNode();
        castNode.typeNode = new TypeNode(ctx.type().getText()) ;
        return castNode;
    }

    @Override
    public IfClauseNode visitIfClause(assParser.IfClauseContext ctx) {
        IfClauseNode ifClauseNode = new IfClauseNode();
        ifClauseNode.ifNode = visitIfBlock(ctx.ifBlock());
        if (ctx.elifBlock() != null) {
            for (assParser.ElifBlockContext elifContext : ctx.elifBlock()) {
                ElifNode elIfNode = visitElifBlock(elifContext);
                ifClauseNode.elifNode.add(elIfNode);
            }
        }
        if (ctx.elseBlock() != null) {
            ifClauseNode.elseNode = visitElseBlock(ctx.elseBlock());
        }
        return ifClauseNode;
    }

    @Override
    public IfNode visitIfBlock(assParser.IfBlockContext ctx) {
        IfNode ifNode = new IfNode();
        ifNode.comparisonLogicalStatementNode = visitComparisonLogicalStatement(ctx.comparisonLogicalStatement());
        ifNode.bodyContentNode = visitBodyContent(ctx.bodyContent());
        return ifNode;
    }

    @Override
    public ElifNode visitElifBlock(assParser.ElifBlockContext ctx) {
        ElifNode elIfNode = new ElifNode();
        elIfNode.comparisonLogicalStatementNode = visitComparisonLogicalStatement(ctx.ifBlock().comparisonLogicalStatement());
        elIfNode.bodyContentNode = visitBodyContent(ctx.ifBlock().bodyContent());
        return elIfNode;
    }

    @Override
    public ElseNode visitElseBlock(assParser.ElseBlockContext ctx) {
        ElseNode elseNode = new ElseNode();
        elseNode.bodyContentNode = visitBodyContent(ctx.bodyContent());
        return elseNode;
    }

    @Override
    public ComparisonAtomNode visitComparisonAtom(assParser.ComparisonAtomContext ctx) {
        ComparisonAtomNode comparisonAtomNode = new ComparisonAtomNode();
        if (ctx.varName() != null) {
            comparisonAtomNode.comparisonAtomNode = visitVarName(ctx.varName());
        }
        if (ctx.value() != null) {
            comparisonAtomNode.comparisonAtomNode = visitValue(ctx.value());
        }
        if (ctx.getElement() != null) {
            comparisonAtomNode.comparisonAtomNode = visitGetElement(ctx.getElement());
        }
        if (ctx.signature() != null) {
            comparisonAtomNode.comparisonAtomNode = visitSignature(ctx.signature());
        }
        if (ctx.arithmeticExpression() != null) {
            comparisonAtomNode.comparisonAtomNode = visitArithmeticExpression(ctx.arithmeticExpression());
        }
        if (ctx.funcCall() != null) {
            comparisonAtomNode.comparisonAtomNode = visitFuncCall(ctx.funcCall());
        }
        return comparisonAtomNode;
    }

    @Override
    public ComparisonStatementNode visitComparisonStatement(assParser.ComparisonStatementContext ctx) {
        ComparisonStatementNode comparisonStatementNode = new ComparisonStatementNode();
        for (assParser.ComparisonAtomContext atomContext : ctx.comparisonAtom()) {
            ComparisonAtomNode atomNode = visitComparisonAtom(atomContext);
            comparisonStatementNode.comparisonAtoms.add(atomNode);
        }
        if (ctx.comparisonOperator() != null) {
            comparisonStatementNode.comparisonOperator = ctx.comparisonOperator().getText();
        }
        return comparisonStatementNode;
    }

    @Override
    public ComparisonLogicalStatementNode visitComparisonLogicalStatement(assParser.ComparisonLogicalStatementContext ctx) {
        return new ComparisonLogicalStatementNode();
    }






    @Override
    public ASTNode visitComparisonOperator(assParser.ComparisonOperatorContext ctx) {
        return super.visitComparisonOperator(ctx);
    }

    @Override
    public ASTNode visitLogicalComparisonOperator(assParser.LogicalComparisonOperatorContext ctx) {
        return super.visitLogicalComparisonOperator(ctx);
    }


    @Override
    public ASTNode visitArithmeticOperator(assParser.ArithmeticOperatorContext ctx) {
        return super.visitArithmeticOperator(ctx);
    }

    @Override
    public ASTNode visitArithmeticAtom(assParser.ArithmeticAtomContext ctx) {
        return super.visitArithmeticAtom(ctx);
    }

    @Override
    public ASTNode visitArithmeticAtomWithBrackets(assParser.ArithmeticAtomWithBracketsContext ctx) {
        return super.visitArithmeticAtomWithBrackets(ctx);
    }

    @Override
    public ArithmeticExpressionNode visitArithmeticExpression(assParser.ArithmeticExpressionContext ctx) {
        return new ArithmeticExpressionNode();
    }
}
