package runner_1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber1\\tag_demo.feature",tags= {"@FunctionalTest"})

public class tag_demo_run {

}
