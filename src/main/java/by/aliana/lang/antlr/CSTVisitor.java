package by.aliana.lang.antlr;

import by.aliana.lang.error.ErrorHandler;
import by.aliana.lang.exception.CustomException;
import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.assign.*;
import by.aliana.lang.node.cast.ArrayElementCastNode;
import by.aliana.lang.node.cast.DeclarationCastNode;
import by.aliana.lang.node.cast.VarCastNode;
import by.aliana.lang.node.expression.*;
import by.aliana.lang.node.function_call.FuncCallAttributeNode;
import by.aliana.lang.node.function_impl.*;
import by.aliana.lang.node.if_clause.ElifBlockNode;
import by.aliana.lang.node.if_clause.ElseBlockNode;
import by.aliana.lang.node.if_clause.IfBlockNode;
import by.aliana.lang.node.prog.ProgNode;
import by.aliana.lang.node.statement.*;
import by.aliana.lang.node.statement.DeclareNode;
import by.aliana.lang.node.unit.*;
import by.aliana.lang.node.unit.FuncCallNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CSTVisitor extends assBaseVisitor<ASTNode> {

    class Scope {
        public List<Scope>  scopes;
        public List<String> vars = new ArrayList<>();
    }

    private Scope funcScope = new Scope();
    private Scope ifScope = new Scope;
    Map<String,String> declareScope = new HashMap<>();
    List<String> usageScope = new ArrayList<>();
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    @Override
    public ProgNode visitProg(assParser.ProgContext ctx) {
        ProgNode progNode = new ProgNode();
        for (assParser.FuncContext funcContext : ctx.func()) {
            FuncImplNode funcNode = visitFunc(funcContext);
            progNode.funcNodes.add(funcNode);
        }
        System.out.println(progNode.toString());
        return progNode;
    }

    @Override
    public FuncImplNode visitFunc(assParser.FuncContext ctx) {
        funcScope = new Scope();
        //scope clear
        FuncImplNode funcNode;
        if (ctx.drop() != null) {
            funcNode = new ReturnFuncNode();
            ((ReturnFuncNode) funcNode).dropNode = visitDrop(ctx.drop());
        } else {
            funcNode = new VoidFuncNode();
        }
        if (ctx.genericType() != null) {
        funcNode.type = ctx.genericType().getText();
        }
        funcNode.signatureNode = visitSignature(ctx.signature());
        funcNode.bodyContentNode = visitBodyContent(ctx.bodyContent());
        ErrorHandler.checkReturn(funcNode);
//send to somefunc funcScope
        return funcNode;
    }

    @Override
    public SignatureNode visitSignature(assParser.SignatureContext ctx) {
        SignatureNode signatureNode = new SignatureNode();
        signatureNode.varName = ctx.varName().getText();
        for (assParser.AttributeContext attributeContext : ctx.attribute()) {
            AttributeNode attributeNode = visitAttribute(attributeContext);
            signatureNode.attributeNodes.add(attributeNode);
        }
        return signatureNode;
    }

    @Override
    public AttributeNode visitAttribute(assParser.AttributeContext ctx) {
        AttributeNode attributeNode = new AttributeNode();
        if (ctx.declare() != null) {
            for (assParser.DeclareContext declareContext : ctx.declare()) {
                DeclareNode declareNode = visitDeclare(declareContext);
                attributeNode.declareNodes.add(declareNode);
            }
        }
        return attributeNode;
    }

    @Override
    public BodyContentNode visitBodyContent(assParser.BodyContentContext ctx) {
        BodyContentNode bodyContentNode = new BodyContentNode();
        if (ctx.statement() != null) {
            for (assParser.StatementContext statementContext : ctx.statement()) {
                StatementNode statementNode = visitStatement(statementContext);
                bodyContentNode.statementNodes.add(statementNode);
            }
        }
        return bodyContentNode;
    }

    @Override
    public StatementNode visitStatement(assParser.StatementContext ctx) {
        StatementNode statementNode = new StatementNode();
        if (ctx.declare() != null) {
            statementNode.definitionArea = visitDeclare(ctx.declare());
        }
        if (ctx.assign() != null) {
            statementNode.definitionArea = visitAssign(ctx.assign());
        }
        if (ctx.cast() != null) {
            statementNode.definitionArea = visitCast(ctx.cast());
        }
        if (ctx.ifClause() != null) {
            statementNode.definitionArea = visitIfClause(ctx.ifClause());
        }
        if (ctx.funcCall() != null) {
            statementNode.definitionArea = visitFuncCall(ctx.funcCall());
        }
        return statementNode;
    }

    @Override
    public DropNode visitDrop(assParser.DropContext ctx) {
        DropNode dropNode = new DropNode();
        dropNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return dropNode;
    }

    @Override
    public ExpressionNode visitLogicExpressionWithBrackets(assParser.LogicExpressionWithBracketsContext ctx) {
        var logicExpressionWithBracketsNode = new LogicExpressionWithBracketsNode();
        logicExpressionWithBracketsNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return logicExpressionWithBracketsNode;
    }

    @Override
    public ExpressionNode visitUnaryMinusExpression(assParser.UnaryMinusExpressionContext ctx) {
        var unaryMinusExpression = new UnaryMinusExpressionNode();
        unaryMinusExpression.unitNode = this.visitUnaryMinusUnit(ctx.unaryMinusUnit());
        return unaryMinusExpression;
    }

    @Override
    public ExpressionNode visitInversionLogicExpression(assParser.InversionLogicExpressionContext ctx) {
        var inversionLogicExpressionNode = new InversionLogicExpressionNode();
        inversionLogicExpressionNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return inversionLogicExpressionNode;
    }

    @Override
    public ExpressionNode visitDivisionMultiplicationExpression(assParser.DivisionMultiplicationExpressionContext ctx) {
        var divisionMultiplicationExpressionNode = new DivisionMultiplicationExpressionNode();
        divisionMultiplicationExpressionNode.arithmeticOperator = ctx.getText();
        divisionMultiplicationExpressionNode.leftExpressionNode = (ExpressionNode) ctx.expression(LEFT).accept(this);
        divisionMultiplicationExpressionNode.rightExpressionNode = (ExpressionNode) ctx.expression(RIGHT).accept(this);
        return divisionMultiplicationExpressionNode;

    }

    @Override
    public ExpressionNode visitPlusMinusExpression(assParser.PlusMinusExpressionContext ctx) {
        var plusMinusExpressionNode = new PlusMinusExpressionNode();
        plusMinusExpressionNode.arithmeticOperator = ctx.getText();
        plusMinusExpressionNode.leftExpressionNode = (ExpressionNode) ctx.expression(LEFT).accept(this);
        plusMinusExpressionNode.rightExpressionNode = (ExpressionNode) ctx.expression(RIGHT).accept(this);
        return plusMinusExpressionNode;
    }

    @Override
    public ExpressionNode visitComparisonExpression(assParser.ComparisonExpressionContext ctx) {
        var comparisonExpressionNode = new ComparisonExpressionNode();
        comparisonExpressionNode.comparisonOperator = ctx.getText();
        comparisonExpressionNode.leftExpressionNode = (ExpressionNode) ctx.expression(LEFT).accept(this);
        comparisonExpressionNode.rightExpressionNode = (ExpressionNode) ctx.expression(RIGHT).accept(this);
        return comparisonExpressionNode;
    }

    @Override
    public ExpressionNode visitAndLogicExpression(assParser.AndLogicExpressionContext ctx) {
        var andLogicExpressionNode = new AndLogicExpressionNode();
        andLogicExpressionNode.leftExpressionNode = (ExpressionNode) ctx.expression(LEFT).accept(this);
        andLogicExpressionNode.rightExpressionNode = (ExpressionNode) ctx.expression(RIGHT).accept(this);
        return andLogicExpressionNode;
    }

    @Override
    public ExpressionNode visitOrLogicExpression(assParser.OrLogicExpressionContext ctx) {
        var orLogicExpressionNode = new OrLogicExpressionNode();
        orLogicExpressionNode.leftExpressionNode = (ExpressionNode) ctx.expression(LEFT).accept(this);
        orLogicExpressionNode.rightExpressionNode = (ExpressionNode) ctx.expression(RIGHT).accept(this);
        return orLogicExpressionNode;
    }

    @Override
    public ExpressionNode visitArithmeticExpression(assParser.ArithmeticExpressionContext ctx) {
        var arithmeticExpressionNode = new ArithmeticExpressionNode();
        arithmeticExpressionNode.unitNode = this.visitArithmeticUnit(ctx.arithmeticUnit());
        return arithmeticExpressionNode;
    }

    @Override
    public ArithmeticUnitNode visitArithmeticUnit(assParser.ArithmeticUnitContext ctx) {
        ArithmeticUnitNode arithmeticUnit = new ArithmeticUnitNode();
        if (ctx.varName() != null) {
            arithmeticUnit.definitionArea = visitVarName(ctx.varName());
        }
        if (ctx.literal() != null) {
            arithmeticUnit.definitionArea = visitLiteral(ctx.literal());
        }
        if (ctx.getElement() != null) {
            arithmeticUnit.definitionArea = visitGetElement(ctx.getElement());
        }
        if (ctx.funcCall() != null) {
            arithmeticUnit.definitionArea = visitFuncCall(ctx.funcCall());
        }
        return arithmeticUnit;
    }

    @Override
    public UnaryMinusUnitNode visitUnaryMinusUnit(assParser.UnaryMinusUnitContext ctx) {
        UnaryMinusUnitNode unaryMinusUnitNode = new UnaryMinusUnitNode();
        if (ctx.varName() != null) {
            unaryMinusUnitNode.definitionArea = visitVarName(ctx.varName());
        }
        if (ctx.digitLiteral() != null) {
            unaryMinusUnitNode.definitionArea = visitDigitLiteral(ctx.digitLiteral());
        }
        if (ctx.getElement() != null) {
            unaryMinusUnitNode.definitionArea = visitGetElement(ctx.getElement());
        }
        return unaryMinusUnitNode;
    }

    @Override
    public VarNameNode visitVarName(assParser.VarNameContext ctx) {
        VarNameNode varNameNode = new VarNameNode();
        varNameNode.name = ctx.getText();
        return varNameNode;
    }

    @Override
    public LiteralNode visitLiteral(assParser.LiteralContext ctx) {
        LiteralNode literalNode = new LiteralNode();
        literalNode.literal = ctx.getText();
        return literalNode;
    }

    @Override
    public LiteralNode visitDigitLiteral(assParser.DigitLiteralContext ctx) {
        LiteralNode literalNode = new LiteralNode();
        literalNode.literal = ctx.getText();
        return literalNode;
    }

    @Override
    public GetElementNode visitGetElement(assParser.GetElementContext ctx) {
        GetElementNode getElementNode = new GetElementNode();
        getElementNode.index = Integer.parseInt(ctx.unsignedIntValue().getText());
        getElementNode.varNameNode = visitVarName(ctx.varName());
        return getElementNode;
    }

    @Override
    public FuncCallNode visitFuncCall(assParser.FuncCallContext ctx) {
        FuncCallNode funcCallNode = new FuncCallNode();
        funcCallNode.varNameNode = visitVarName(ctx.varName());
        for (assParser.FuncCallAttributeContext attributeContext : ctx.funcCallAttribute()) {
            FuncCallAttributeNode attributeNode = visitFuncCallAttribute(attributeContext);
            funcCallNode.callAttributeNodes.add(attributeNode);
        }
        return funcCallNode;
    }

    @Override
    public FuncCallAttributeNode visitFuncCallAttribute(assParser.FuncCallAttributeContext ctx) {
        FuncCallAttributeNode funcCallAttributeNode = new FuncCallAttributeNode();
        if (ctx.varName() != null) {
            funcCallAttributeNode.definitionArea = visitVarName(ctx.varName());
        }
        if (ctx.literal() != null) {
            funcCallAttributeNode.definitionArea = visitLiteral(ctx.literal());
        }
        if (ctx.getElement() != null) {
            funcCallAttributeNode.definitionArea = visitGetElement(ctx.getElement());
        }
        if (ctx.funcCall() != null) {
            funcCallAttributeNode.definitionArea = visitFuncCall(ctx.funcCall());
        }
        if (ctx.array() != null) {
            funcCallAttributeNode.definitionArea = visitArray(ctx.array());
        }
        return funcCallAttributeNode;
    }

    @Override
    public ArrayNode visitArray(assParser.ArrayContext ctx) {
        ArrayNode arrayNode = new ArrayNode();
        for (assParser.ArrayElementValueContext arrayElementValueContext : ctx.arrayElementValue()) {
            ArrayElementValueNode arrayElementValueNode = visitArrayElementValue(arrayElementValueContext);
            arrayNode.arrayElementNodes.add(arrayElementValueNode);
        }
        return arrayNode;
    }

    @Override
    public ArrayElementValueNode visitArrayElementValue(assParser.ArrayElementValueContext ctx) {
        ArrayElementValueNode arrayElementValueNode = new ArrayElementValueNode();
        if (ctx.literal() != null) {
            arrayElementValueNode.definitionArea = visitLiteral(ctx.literal());
        }
        if (ctx.varName() != null) {
            arrayElementValueNode.definitionArea = visitVarName(ctx.varName());
        }
        if (ctx.getElement() != null) {
            arrayElementValueNode.definitionArea = visitGetElement(ctx.getElement());
        }
        if (ctx.funcCall() != null) {
            arrayElementValueNode.definitionArea = visitFuncCall(ctx.funcCall());
        }
        if (ctx.array() != null) {
            arrayElementValueNode.definitionArea = visitArray(ctx.array());
        }
        return arrayElementValueNode;
    }

    @Override
    public DeclareNode visitDeclare(assParser.DeclareContext ctx) {
        DeclareNode declareNode =  new DeclareNode();
        if (ctx.genericType() != null) {
            declareNode.type = ctx.genericType().getText();
        }
        declareNode.varNameNode = visitVarName(ctx.varName());
        return declareNode;
    }

    @Override
    public AssignNode visitAssign(assParser.AssignContext ctx) {
        AssignNode assignNode =  new AssignNode();
        if (ctx.varAssignment() != null) {
            assignNode.definitionArea = visitVarAssignment(ctx.varAssignment());
        }
        if (ctx.declarationAssignment() != null) {
            assignNode.definitionArea = visitDeclarationAssignment(ctx.declarationAssignment());
        }
        if (ctx.arrayElementAssignment() != null) {
            assignNode.definitionArea = visitArrayElementAssignment(ctx.arrayElementAssignment());
        }
        if (ctx.varAssignmentToArray() != null) {
            assignNode.definitionArea = visitVarAssignmentToArray(ctx.varAssignmentToArray());
        }
        if (ctx.declarationAssignmentToArray() != null) {
            assignNode.definitionArea = visitDeclarationAssignmentToArray(ctx.declarationAssignmentToArray());
        }
        if (ctx.arrayElementAssignmentToArray() != null) {
            assignNode.definitionArea = visitArrayElementAssignmentToArray(ctx.arrayElementAssignmentToArray());
        }
        return assignNode;
    }

    @Override
    public VarAssignmentNode visitVarAssignment(assParser.VarAssignmentContext ctx) {
        VarAssignmentNode varAssignmentNode = new VarAssignmentNode();
        varAssignmentNode.varNameNode = visitVarName(ctx.varName());
        varAssignmentNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return varAssignmentNode;
    }

    @Override
    public DeclarationAssignmentNode visitDeclarationAssignment(assParser.DeclarationAssignmentContext ctx) {
        DeclarationAssignmentNode declarationAssignmentNode = new DeclarationAssignmentNode();
        declarationAssignmentNode.declareNode = visitDeclare(ctx.declare());
        declarationAssignmentNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return declarationAssignmentNode;
    }

    @Override
    public ArrayElementAssignmentNode visitArrayElementAssignment(assParser.ArrayElementAssignmentContext ctx) {
        ArrayElementAssignmentNode arrayElementAssignmentNode = new ArrayElementAssignmentNode();
        arrayElementAssignmentNode.getElementNode = visitGetElement(ctx.getElement());
        arrayElementAssignmentNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return arrayElementAssignmentNode;
    }

    @Override
    public VarAssignmentToArrayNode visitVarAssignmentToArray(assParser.VarAssignmentToArrayContext ctx) {
        VarAssignmentToArrayNode varAssignmentToArrayNode = new VarAssignmentToArrayNode();
        varAssignmentToArrayNode.varNameNode = visitVarName(ctx.varName());
        varAssignmentToArrayNode.arrayNode = visitArray(ctx.array());
        return varAssignmentToArrayNode;
    }

    @Override
    public DeclarationAssignmentToArrayNode visitDeclarationAssignmentToArray(assParser.DeclarationAssignmentToArrayContext ctx) {
        DeclarationAssignmentToArrayNode declarationAssignmentToArrayNode = new DeclarationAssignmentToArrayNode();
        declarationAssignmentToArrayNode.declareNode = visitDeclare(ctx.declare());
        declarationAssignmentToArrayNode.arrayNode = visitArray(ctx.array());
        return declarationAssignmentToArrayNode;
    }

    @Override
    public ArrayElementAssignmentToArrayNode visitArrayElementAssignmentToArray(assParser.ArrayElementAssignmentToArrayContext ctx) {
        ArrayElementAssignmentToArrayNode arrayElementAssignmentToArrayNode = new ArrayElementAssignmentToArrayNode();
        arrayElementAssignmentToArrayNode.getElementNode = visitGetElement(ctx.getElement());
        arrayElementAssignmentToArrayNode.arrayNode = visitArray(ctx.array());
        return arrayElementAssignmentToArrayNode;
    }


    @Override
    public CastNode visitCast(assParser.CastContext ctx) {
        CastNode castNode = new CastNode();
        if (ctx.varCast() != null) {
            castNode.definitionArea = visitVarCast(ctx.varCast());
        }
        if (ctx.declarationCast() != null) {
            castNode.definitionArea = visitDeclarationCast(ctx.declarationCast());
        }
        if (ctx.arrayElementCast() != null) {
            castNode.definitionArea = visitArrayElementCast(ctx.arrayElementCast());
        }
        return castNode;
    }

    @Override
    public VarCastNode visitVarCast(assParser.VarCastContext ctx) {
        VarCastNode varCastNode = new VarCastNode();
        varCastNode.varNameNode = visitVarName(ctx.varName());
        varCastNode.type = ctx.castExpression().type().getText();
        varCastNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return varCastNode;
    }

    @Override
    public DeclarationCastNode visitDeclarationCast(assParser.DeclarationCastContext ctx) {
        DeclarationCastNode declarationCastNode = new DeclarationCastNode();
        declarationCastNode.declareNode = visitDeclare(ctx.declare());
        declarationCastNode.type = ctx.castExpression().type().getText();
        declarationCastNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return declarationCastNode;
    }

    @Override
    public ArrayElementCastNode visitArrayElementCast(assParser.ArrayElementCastContext ctx) {
        ArrayElementCastNode arrayElementCastNode = new ArrayElementCastNode();
        arrayElementCastNode.getElementNode = visitGetElement(ctx.getElement());
        arrayElementCastNode.type = ctx.castExpression().type().getText();
        arrayElementCastNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        return arrayElementCastNode;
    }

    @Override
    public IfClauseNode visitIfClause(assParser.IfClauseContext ctx) {
        IfClauseNode ifClauseNode = new IfClauseNode();
        ifClauseNode.ifBlockNode = visitIfBlock(ctx.ifBlock());
        if (ctx.elifBlock() != null) {
            for (assParser.ElifBlockContext elifBlockContext : ctx.elifBlock()) {
                ElifBlockNode elifBlockNode = visitElifBlock(elifBlockContext);
                ifClauseNode.elifBlockNodes.add(elifBlockNode);
            }
        }
        if (ctx.elseBlock() != null) {
            ifClauseNode.elseBlockNode = visitElseBlock(ctx.elseBlock());
        }
        return ifClauseNode;
    }


    @Override
    public IfBlockNode visitIfBlock(assParser.IfBlockContext ctx) {
        ifScope = new Scope();
        IfBlockNode ifBlockNode = new IfBlockNode();
        ifBlockNode.expressionNode = (ExpressionNode) ctx.expression().accept(this);
        ifBlockNode.bodyContentNode = visitBodyContent(ctx.bodyContent());
        funcScope.scopes.add(ifScope);
        return ifBlockNode;
    }

    @Override
    public ElifBlockNode visitElifBlock(assParser.ElifBlockContext ctx) {
        ifScope = new Scope();
        ElifBlockNode elifBlockNode = new ElifBlockNode();
        elifBlockNode.ifBlockNode = visitIfBlock(ctx.ifBlock());
        funcScope.scopes.add(ifScope);
        return elifBlockNode;
    }

    @Override
    public ElseBlockNode visitElseBlock(assParser.ElseBlockContext ctx) {
        ifScope = new Scope();
        ElseBlockNode elseBlockNode = new ElseBlockNode();
        elseBlockNode.bodyContentNode = visitBodyContent(ctx.bodyContent());
        funcScope.scopes.add(ifScope);
        return elseBlockNode;
    }
}
