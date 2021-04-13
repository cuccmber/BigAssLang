// Generated from /home/diana/IdeaProjects/BigAssLang/src/main/java/antlr/ass.g4 by ANTLR 4.9.1
package antlr;
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
	 * Visit a parse tree produced by {@link assParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(assParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(assParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(assParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(assParser.ArrayContext ctx);
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
	 * Visit a parse tree produced by {@link assParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(assParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#assignmentLeftPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentLeftPart(assParser.AssignmentLeftPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#assignmentRightPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRightPart(assParser.AssignmentRightPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(assParser.AssignContext ctx);
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
	 * Visit a parse tree produced by {@link assParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(assParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#logicalComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalComparisonOperator(assParser.LogicalComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#comparisonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonAtom(assParser.ComparisonAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#comparisonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonStatement(assParser.ComparisonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#comparisonLogicalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonLogicalStatement(assParser.ComparisonLogicalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#comparisonLogicalStatementWithBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonLogicalStatementWithBrackets(assParser.ComparisonLogicalStatementWithBracketsContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link assParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(assParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arithmeticAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtom(assParser.ArithmeticAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arithmeticAtomWithBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtomWithBrackets(assParser.ArithmeticAtomWithBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link assParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(assParser.ArithmeticExpressionContext ctx);
}