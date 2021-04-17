package by.aliana.lang.antlr;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.array.ArrayElementValueNode;
import by.aliana.lang.node.array.ArrayNode;
import by.aliana.lang.node.assign.*;
import by.aliana.lang.node.expression.*;
import by.aliana.lang.node.function_call.FuncCallAttributeNode;
import by.aliana.lang.node.function_impl.*;
import by.aliana.lang.node.prog.ProgNode;
import by.aliana.lang.node.statement.*;
import by.aliana.lang.node.statement.DeclareNode;
import by.aliana.lang.node.unit.*;
import by.aliana.lang.node.unit.FuncCallNode;

import javax.xml.catalog.Catalog;


public class CSTVisitor extends assBaseVisitor<ASTNode> {

    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    @Override
    public ProgNode visitProg(assParser.ProgContext ctx) {
        ProgNode progNode = new ProgNode();
        for (assParser.FuncContext funcContext : ctx.func()) {
            FuncImplNode funcNode = visitFunc(funcContext);
            progNode.funcNodes.add(funcNode);
        }
        return progNode;
    }

    @Override
    public FuncImplNode visitFunc(assParser.FuncContext ctx) {
        FuncImplNode funcNode;
        if (ctx.drop() != null) {
            funcNode = new ReturnFuncNode();
            ((ReturnFuncNode) funcNode).dropNode = visitDrop(ctx.drop());
        } else {
            funcNode = new VoidFuncNode();
        }
        funcNode.type = ctx.genericType().getText();
        funcNode.signatureNode = visitSignature(ctx.signature());
        funcNode.bodyContentNode = visitBodyContent(ctx.bodyContent());
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
        return new AttributeNode();
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
        if (ctx.assign() != null) {
            statementNode.definitionArea = visitAssign(ctx.assign());
        }
        return new StatementNode();
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
        System.out.println("bracket");
        return logicExpressionWithBracketsNode;
    }

    @Override
    public ExpressionNode visitUnaryMinusExpression(assParser.UnaryMinusExpressionContext ctx) {
        var unaryMinusExpression = new UnaryMinusExpressionNode();
        unaryMinusExpression.unitNode = this.visitUnaryMinusUnit(ctx.unaryMinusUnit());
        System.out.println("minus");
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
        System.out.println("plus");

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
        System.out.println("and");
        return andLogicExpressionNode;
    }

    @Override
    public ExpressionNode visitOrLogicExpression(assParser.OrLogicExpressionContext ctx) {
        var orLogicExpressionNode = new OrLogicExpressionNode();
        orLogicExpressionNode.leftExpressionNode = (ExpressionNode) ctx.expression(LEFT).accept(this);
        orLogicExpressionNode.rightExpressionNode = (ExpressionNode) ctx.expression(RIGHT).accept(this);
        System.out.println("or");
        return orLogicExpressionNode;
    }

    @Override
    public ExpressionNode visitArithmeticExpression(assParser.ArithmeticExpressionContext ctx) {
        var arithmeticExpressionNode = new ArithmeticExpressionNode();
        arithmeticExpressionNode.unitNode = this.visitArithmeticUnit(ctx.arithmeticUnit());
        System.out.println("arithmetic");
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
        declareNode.type = ctx.genericType().getText();
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
        return varAssignmentNode;
    }

    @Override
    public DeclarationAssignmentNode visitDeclarationAssignment(assParser.DeclarationAssignmentContext ctx) {
        DeclarationAssignmentNode declarationAssignmentNode = new DeclarationAssignmentNode();
        return declarationAssignmentNode;
    }

    @Override
    public ArrayElementAssignmentNode visitArrayElementAssignment(assParser.ArrayElementAssignmentContext ctx) {
        ArrayElementAssignmentNode arrayElementAssignmentNode = new ArrayElementAssignmentNode();
        return arrayElementAssignmentNode;
    }

    @Override
    public VarAssignmentToArrayNode visitVarAssignmentToArray(assParser.VarAssignmentToArrayContext ctx) {
        VarAssignmentToArrayNode varAssignmentToArrayNode = new VarAssignmentToArrayNode();
        return varAssignmentToArrayNode;
    }

    @Override
    public DeclarationAssignmentToArrayNode visitDeclarationAssignmentToArray(assParser.DeclarationAssignmentToArrayContext ctx) {
        DeclarationAssignmentToArrayNode declarationAssignmentToArrayNode = new DeclarationAssignmentToArrayNode();
        return declarationAssignmentToArrayNode;
    }

    @Override
    public ArrayElementAssignmentToArrayNode visitArrayElementAssignmentToArray(assParser.ArrayElementAssignmentToArrayContext ctx) {
        ArrayElementAssignmentToArrayNode arrayElementAssignmentToArrayNode = new ArrayElementAssignmentToArrayNode();
        return arrayElementAssignmentToArrayNode;
    }

    @Override
    public CastNode visitCastExpression(assParser.CastExpressionContext ctx) {
        CastNode castNode = new CastNode();
        return castNode;
    }

    @Override
    public IfClauseNode visitIfClause(assParser.IfClauseContext ctx) {
        IfClauseNode ifClauseNode = new IfClauseNode();
        return ifClauseNode;
    }


    @Override
    public ASTNode visitVarCast(assParser.VarCastContext ctx) {
        return super.visitVarCast(ctx);
    }

    @Override
    public ASTNode visitDeclarationCast(assParser.DeclarationCastContext ctx) {
        return super.visitDeclarationCast(ctx);
    }

    @Override
    public ASTNode visitArrayElementCast(assParser.ArrayElementCastContext ctx) {
        return super.visitArrayElementCast(ctx);
    }

    @Override
    public ASTNode visitCast(assParser.CastContext ctx) {
        return super.visitCast(ctx);
    }

    @Override
    public ASTNode visitIfBlock(assParser.IfBlockContext ctx) {
        return super.visitIfBlock(ctx);
    }

    @Override
    public ASTNode visitElifBlock(assParser.ElifBlockContext ctx) {
        return super.visitElifBlock(ctx);
    }

    @Override
    public ASTNode visitElseBlock(assParser.ElseBlockContext ctx) {
        return super.visitElseBlock(ctx);
    }
}
