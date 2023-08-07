package StepDefinitions;

import Pages.DialogContent;
import Utilities.BaseDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BaseDriver.getDriver().get("https://test.mersys.io/");
    }

    @Given("Enter username and password")
    public void enter_username_and_password() {
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");
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
