package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SignUp.feature",
        glue = {"org/example/stepDefinitions"},
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"}

)
public class TestRunner {
}
