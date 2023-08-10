package StepDefinitions;


import Utilities.ParameterDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before // runs before each scenario in the feature file
    public void beforeScenario(){
        System.out.println("Before Scenario runs");
    }

    @After // runs after each scenario in the feature file
    public void afterScenario(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] byteImage = ((TakesScreenshot) ParameterDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
        ParameterDriver.quitDriver();
    }



//    @BeforeStep // runs before each step in the feature file
//    public void beforeStep(){
//        System.out.println("Before Step runs");
//    }
//
//    @AfterStep // runs after each step in the feature file
//    public void afterStep(){
//        System.out.println("After Step runs");
//    }
//

}
