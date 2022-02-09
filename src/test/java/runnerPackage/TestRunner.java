package runnerPackage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\features\\loginPage.feature"},
        glue = {"stepDefinition"}
)

public class TestRunner {

}
