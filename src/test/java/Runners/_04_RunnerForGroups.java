package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatuerFiles",
        tags = "@Smoke",
        glue = "StepDefinitions"
)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
