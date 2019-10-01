package runner_1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber1\\login_f.feature",glue= {"StepDef"},plugin= {"html:target/c_again.html"})
public class run_again {

}
