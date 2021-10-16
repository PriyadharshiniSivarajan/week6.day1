package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/DuplicateLead.feature",
monochrome=true,
glue="DuplicateLeadStep"
)
public class DuplicateLeadRunner extends AbstractTestNGCucumberTests {

}
