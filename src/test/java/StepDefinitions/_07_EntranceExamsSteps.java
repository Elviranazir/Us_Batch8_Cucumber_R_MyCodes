package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.ParameterDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _07_EntranceExamsSteps {
    LeftNavBar lb = new LeftNavBar();
    DialogContent dc = new DialogContent();
    @And("Go to Entrance Exams page")
    public void goToEntranceExamsPage() {
        lb.clickMethod(lb.EntranceExamsButton1);
        lb.clickMethod(lb.EntranceExamsSetupButton);
        lb.clickMethod(lb.EntranceExamsButton2);
    }

    @And("Fill the Create Exam form with")
    public void fillTheCreateExamFormWith(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.createExamName, dataList.get(0));
        dc.clickMethod(dc.academicPeriod);
        dc.clickMethod(dc.academicPeriodOption);
        dc.clickMethod(dc.gradeLevel);
        dc.clickMethod(dc.gradeLevelOption);
    }

    @And("Create a description")
    public void createADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.examDescription);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.iFrame));
        ParameterDriver.getDriver().switchTo().frame(0);
        dc.sendKeysMethod(dc.descriptionAndNotesText,dataList.get(0));
        ParameterDriver.getDriver().switchTo().defaultContent();

    }

    @And("create a note")
    public void createANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.examNotes);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.iFrame));
        ParameterDriver.getDriver().switchTo().frame(0);
        dc.sendKeysMethod(dc.descriptionAndNotesText,dataList.get(0));
        ParameterDriver.getDriver().switchTo().defaultContent();
    }
}
