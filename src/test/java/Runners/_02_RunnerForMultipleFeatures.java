package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"src/test/java/FeauterFiles/_01_Login.feature",
                "src/test/java/FeauterFiles/_02_CreateCountry.feature",
        "src/test/java/FeauterFiles/_05_FeeFunctionality.feature"},
        glue = "StepDefinitions",
        dryRun = true // default value is falce. --->
        // true ---> it only checks if all required step definitions for the features are exist.
)

public class _02_RunnerForMultipleFeatures extends AbstractTestNGCucumberTests {
}
