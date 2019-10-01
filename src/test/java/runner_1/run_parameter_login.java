package runner_1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber1\\parameter_login.feature",glue= {"StepDef_para"},plugin= {"html:target/cucmber.html"})
public class run_parameter_login {
	
}
