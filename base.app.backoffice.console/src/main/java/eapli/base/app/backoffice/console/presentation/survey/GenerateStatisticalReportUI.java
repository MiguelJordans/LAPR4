package eapli.base.app.backoffice.console.presentation.survey;

import eapli.base.surveymanagement.application.GenerateStatisticalReportController;
import eapli.base.surveymanagement.domain.exception.InvalidAnswerFileException;
import eapli.base.surveymanagement.domain.exception.InvalidSurveyException;
import eapli.base.surveymanagement.domain.exception.NoFilesInsideDirectoryException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class GenerateStatisticalReportUI extends AbstractUI {

    GenerateStatisticalReportController generateStatisticalReportController = new GenerateStatisticalReportController();

    @Override
    protected boolean doShow() {

        boolean boolOpt = false;
        int surveyId = 0;

        do {
            try {
                surveyId = Console.readInteger("Please enter the desired questionnaire ID:\n");

                if (surveyId < 0) {
                    throw new IllegalArgumentException("\nPlease enter a valid option! (The number must be positive!)");
                }

                boolOpt = generateStatisticalReportController.verifyIfSurveyExists(surveyId);

            } catch (IllegalArgumentException | InvalidSurveyException e) {
                System.out.println(e.getMessage());
                boolOpt = false;
            } catch (Exception e) {
                System.out.println("The specified questionnaire doesn't exist! Please enter another one!\n");
                boolOpt = false;
            }

        } while (!boolOpt);

        try {
            generateStatisticalReportController.generateReport(surveyId);
        } catch (NoFilesInsideDirectoryException | InvalidAnswerFileException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (NullPointerException e) {
            System.out.println("There are no answers for that specific questionnaire yet!");
            return false;
        }

        boolOpt = false;
        int option = 0;

        do {
            try {
                option = Console.readInteger("\nPlease choose one valid option:\n\n>0 : Exit without seeing the generated file\n>1 : See the file (in txt)\n>2 : See the file (in HTML page)\n");

                if (option < 0 || option > 2) {
                    throw new IllegalArgumentException("\nPlease enter a valid option! (Enter a number between 0 and 2!)");
                }

                if (option != 0) generateStatisticalReportController.openFile(surveyId, option);

                boolOpt = true;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                boolOpt = false;
            }

        } while (!boolOpt);

        System.out.println("Operation success!\n\n");

        return true;
    }

    @Override
    public String headline() {
        return "View the statistical report of a survey";
    }

}