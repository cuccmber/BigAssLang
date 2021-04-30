// Generated from /home/diana/IdeaProjects/BigAssLang/src/main/java/by/aliana/lang/antlr/ass.g4 by ANTLR 4.9.1
package by.aliana.lang.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link assParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface assVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link assParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(assParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(assParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(assParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(assParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(assParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(assParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#digitLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitLiteral(assParser.DigitLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(assParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#unsignedIntValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedIntValue(assParser.UnsignedIntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#floatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatValue(assParser.FloatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(assParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#getElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetElement(assParser.GetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arrayElementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementValue(assParser.ArrayElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(assParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(assParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(assParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#declarationAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAssignment(assParser.DeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arrayElementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAssignment(assParser.ArrayElementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#varAssignmentToArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignmentToArray(assParser.VarAssignmentToArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#declarationAssignmentToArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAssignmentToArray(assParser.DeclarationAssignmentToArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arrayElementAssignmentToArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAssignmentToArray(assParser.ArrayElementAssignmentToArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(assParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(assParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#varCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCast(assParser.VarCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#declarationCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationCast(assParser.DeclarationCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arrayElementCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementCast(assParser.ArrayElementCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(assParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(assParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#bodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyContent(assParser.BodyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(assParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(assParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(assParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(assParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#funcCallAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallAttribute(assParser.FuncCallAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(assParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arithmeticUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnit(assParser.ArithmeticUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#unaryMinusUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusUnit(assParser.UnaryMinusUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andLogicExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLogicExpression(assParser.AndLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(assParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExpressionWithBrackets}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpressionWithBrackets(assParser.LogicExpressionWithBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpression(assParser.PlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inversionLogicExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversionLogicExpression(assParser.InversionLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionMultiplicationExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionMultiplicationExpression(assParser.DivisionMultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(assParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(assParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orLogicExpression}
	 * labeled alternative in {@link assParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrLogicExpression(assParser.OrLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(assParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(assParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(assParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(assParser.IfClauseContext ctx);
}