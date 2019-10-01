package runner_1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber1\\demo.feature",glue= {"StepDef"},plugin= {"html:target/cucumber.html"})
public class run1 {
	

}
