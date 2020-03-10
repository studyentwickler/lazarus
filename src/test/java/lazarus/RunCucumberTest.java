package lazarus;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
                "html:target/cucumber-html-report",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber-html-report/cucumber.json",
                "pretty:target/cucumber-html-report/cucumber-pretty.txt",
                "usage:target/cucumber-html-report/cucumber-usage.json",
                "junit:target/cucumber-html-report/cucumber-results.xml"
        },
        glue = {"lazarus.steps"},
        strict = true
)

public class RunCucumberTest {
}
