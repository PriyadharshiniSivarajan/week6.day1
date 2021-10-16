package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/CreateLead.feature",
                 monochrome=true,
                 glue="steps"
)
public class CreateLeadRunner extends AbstractTestNGCucumberTests {
	
	
	

}