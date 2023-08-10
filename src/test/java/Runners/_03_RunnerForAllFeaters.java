package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = ("src/test/java/FeauterFiles"),
        glue = "StepDefinition",
        dryRun = false
)
public class _03_RunnerForAllFeaters extends AbstractTestNGCucumberTests {
}
