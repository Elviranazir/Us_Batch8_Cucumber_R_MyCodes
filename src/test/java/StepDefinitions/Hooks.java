package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before // runs before each scenario in the feature file
    public void beforeScenario(){
        System.out.println("Before Scenario runs");
    }

    @After // runs after each scenario in the feature file
    public void afterScenario(){
        System.out.println("After Scenario suns");
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
