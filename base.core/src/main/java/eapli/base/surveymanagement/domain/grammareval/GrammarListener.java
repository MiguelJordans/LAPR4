// Generated from C:/Users/maria/OneDrive/Documentos/lei21_22_s4_2dj_1\Grammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.domain.grammareval;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionnaire}
	 * labeled alternative in {@link GrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void enterQuestionnaire(GrammarParser.QuestionnaireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionnaire}
	 * labeled alternative in {@link GrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void exitQuestionnaire(GrammarParser.QuestionnaireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sections}
	 * labeled alternative in {@link GrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSections(GrammarParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sections}
	 * labeled alternative in {@link GrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSections(GrammarParser.SectionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questions}
	 * labeled alternative in {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(GrammarParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questions}
	 * labeled alternative in {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(GrammarParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
}