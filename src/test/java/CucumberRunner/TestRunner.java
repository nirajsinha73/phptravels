package CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/CucumberFeature",
			glue=("StepDefination")
			)

	public class TestRunner {
}
