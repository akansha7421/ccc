package CaseStudy_p;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="CaseStudy\\CS2.feature", glue= {"CaseStudy_p"}, plugin= {"html:target/CS2.html"})
public class run_cs2 {

}
