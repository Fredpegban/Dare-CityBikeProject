package CB_Package;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Frankfurt.feature", monochrome = true, dryRun = false, strict=true)

           
		
public class CB_RunnerClass {

}
