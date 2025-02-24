// Generated from prova.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.util.Vector;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link provaParser}.
 */
public interface provaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link provaParser#inici}.
	 * @param ctx the parse tree
	 */
	void enterInici(provaParser.IniciContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#inici}.
	 * @param ctx the parse tree
	 */
	void exitInici(provaParser.IniciContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(provaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(provaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_tipus}.
	 * @param ctx the parse tree
	 */
	void enterBloc_tipus(provaParser.Bloc_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_tipus}.
	 * @param ctx the parse tree
	 */
	void exitBloc_tipus(provaParser.Bloc_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_tipus(provaParser.Declaracio_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_tipus(provaParser.Declaracio_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#camp}.
	 * @param ctx the parse tree
	 */
	void enterCamp(provaParser.CampContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#camp}.
	 * @param ctx the parse tree
	 */
	void exitCamp(provaParser.CampContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_variables}.
	 * @param ctx the parse tree
	 */
	void enterBloc_variables(provaParser.Bloc_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_variables}.
	 * @param ctx the parse tree
	 */
	void exitBloc_variables(provaParser.Bloc_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#declaracio_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_variable(provaParser.Declaracio_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#declaracio_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_variable(provaParser.Declaracio_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_funcions}.
	 * @param ctx the parse tree
	 */
	void enterBloc_funcions(provaParser.Bloc_funcionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_funcions}.
	 * @param ctx the parse tree
	 */
	void exitBloc_funcions(provaParser.Bloc_funcionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#accio}.
	 * @param ctx the parse tree
	 */
	void enterAccio(provaParser.AccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#accio}.
	 * @param ctx the parse tree
	 */
	void exitAccio(provaParser.AccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#funcio}.
	 * @param ctx the parse tree
	 */
	void enterFuncio(provaParser.FuncioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#funcio}.
	 * @param ctx the parse tree
	 */
	void exitFuncio(provaParser.FuncioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#parametres}.
	 * @param ctx the parse tree
	 */
	void enterParametres(provaParser.ParametresContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#parametres}.
	 * @param ctx the parse tree
	 */
	void exitParametres(provaParser.ParametresContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#parametre}.
	 * @param ctx the parse tree
	 */
	void enterParametre(provaParser.ParametreContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#parametre}.
	 * @param ctx the parse tree
	 */
	void exitParametre(provaParser.ParametreContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_sentencies}.
	 * @param ctx the parse tree
	 */
	void enterBloc_sentencies(provaParser.Bloc_sentenciesContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_sentencies}.
	 * @param ctx the parse tree
	 */
	void exitBloc_sentencies(provaParser.Bloc_sentenciesContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#assignacio}.
	 * @param ctx the parse tree
	 */
	void enterAssignacio(provaParser.AssignacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#assignacio}.
	 * @param ctx the parse tree
	 */
	void exitAssignacio(provaParser.AssignacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpr_booleana(provaParser.Expr_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpr_booleana(provaParser.Expr_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(provaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(provaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#vector_access}.
	 * @param ctx the parse tree
	 */
	void enterVector_access(provaParser.Vector_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#vector_access}.
	 * @param ctx the parse tree
	 */
	void exitVector_access(provaParser.Vector_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#tuple_access}.
	 * @param ctx the parse tree
	 */
	void enterTuple_access(provaParser.Tuple_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#tuple_access}.
	 * @param ctx the parse tree
	 */
	void exitTuple_access(provaParser.Tuple_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#crida_funcio}.
	 * @param ctx the parse tree
	 */
	void enterCrida_funcio(provaParser.Crida_funcioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#crida_funcio}.
	 * @param ctx the parse tree
	 */
	void exitCrida_funcio(provaParser.Crida_funcioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(provaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(provaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bucle_mentre}.
	 * @param ctx the parse tree
	 */
	void enterBucle_mentre(provaParser.Bucle_mentreContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bucle_mentre}.
	 * @param ctx the parse tree
	 */
	void exitBucle_mentre(provaParser.Bucle_mentreContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(provaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(provaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bucle_per}.
	 * @param ctx the parse tree
	 */
	void enterBucle_per(provaParser.Bucle_perContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bucle_per}.
	 * @param ctx the parse tree
	 */
	void exitBucle_per(provaParser.Bucle_perContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#crida_accio}.
	 * @param ctx the parse tree
	 */
	void enterCrida_accio(provaParser.Crida_accioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#crida_accio}.
	 * @param ctx the parse tree
	 */
	void exitCrida_accio(provaParser.Crida_accioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#instruccio_io}.
	 * @param ctx the parse tree
	 */
	void enterInstruccio_io(provaParser.Instruccio_ioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#instruccio_io}.
	 * @param ctx the parse tree
	 */
	void exitInstruccio_io(provaParser.Instruccio_ioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#tipus_basic}.
	 * @param ctx the parse tree
	 */
	void enterTipus_basic(provaParser.Tipus_basicContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#tipus_basic}.
	 * @param ctx the parse tree
	 */
	void exitTipus_basic(provaParser.Tipus_basicContext ctx);
}