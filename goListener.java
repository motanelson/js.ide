// Generated from go.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link goParser}.
 */
public interface goListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link goParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(goParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(goParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(goParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(goParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(goParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(goParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(goParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(goParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(goParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(goParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(goParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(goParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(goParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(goParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(goParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(goParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(goParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(goParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(goParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(goParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(goParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(goParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(goParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(goParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(goParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(goParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(goParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(goParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(goParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(goParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(goParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(goParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(goParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(goParser.LiteralContext ctx);
}