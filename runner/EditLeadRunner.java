package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/EditLead.feature",
monochrome=true,
glue="steps")
public class EditLeadRunner extends AbstractTestNGCucumberTests{

}
