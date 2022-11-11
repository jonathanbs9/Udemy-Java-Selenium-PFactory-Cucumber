package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SignUp.feature",
        glue = {"org/example/stepDefinitions"},
        plugin = {"pretty"}
)
public class TestRunner {
}
