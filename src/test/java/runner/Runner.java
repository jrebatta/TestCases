package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        tags = "@Login",
        glue = "stepdefinition",
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty","json:target/cucumber/report.json"}
)
public class Runner {


}
