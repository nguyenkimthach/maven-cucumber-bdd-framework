package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/facebook/features", 
					glue = "facebook.stepDefinitions", 
					monochrome = true, 
					plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/facebookCucumber.json" }, 
					snippets = SnippetType.CAMELCASE, 
					//dryRun = true,
					tags = { "@parameter" }) 
public class FacebookTestRunner {

}
