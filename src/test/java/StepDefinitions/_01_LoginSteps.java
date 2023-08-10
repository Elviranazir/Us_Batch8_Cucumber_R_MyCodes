package StepDefinitions;

import Pages.DialogContent;
import Utilities.ParameterDriver;
import io.cucumber.java.en.*;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");
    }

    @Given("Enter username and password")
    public void enter_username_and_password() {
        dc.sendKeysMethod(dc.username,"turkeyts");
        dc.sendKeysMethod(dc.password,"TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
      dc.assertText(dc.dashBoard,"Dashboard");
    }

}
