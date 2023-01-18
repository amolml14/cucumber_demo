package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( features="./features/saucedemo.feature",
                  glue= {"stepdef"},
     plugin= {"pretty","html:target/cucumber-Report-html","json:target/report-json"},
                  		
		          monochrome=true
		)

public class Runner extends AbstractTestNGCucumberTests{

}
