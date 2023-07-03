package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/features"},
		dryRun= true, //true for mapping the step steps definitions
		snippets = SnippetType.CAMELCASE, //to format the method names in the steps class
		monochrome = true //to remove unreadable characters and make the test more readable
		//glue = "" //helps to locate the step definition file
		
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
