package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/MergeLead.feature",
monochrome=true,
glue="MergeLeadSteps")
public class MergeLeadRunner extends AbstractTestNGCucumberTests {

}
