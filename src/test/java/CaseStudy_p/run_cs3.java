package CaseStudy_p;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="CaseStudy\\CS3.feature", glue= {"CaseStudy_p"}, plugin= {"html:target/CS3.html"})
public class run_cs3 {
	

}
