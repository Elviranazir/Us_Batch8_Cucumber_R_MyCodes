package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = "src/test/java/FeatuerFiles",
        glue = "StepDefinitions",
        plugin = "html:target/site/cucumber-pretty.html"
)

public class _06_RunnerWithPlugin extends AbstractTestNGCucumberTests {
}
