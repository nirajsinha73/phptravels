package CucumberRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/CucumberFeature",
			glue=("StepDefination"),
			monochrome = true,
			plugin = {"pretty" , "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml",
					"html:target/cucumber-reports"}
						
			//,format = {"pretty","html:test-output"}
			)

	public class TestRunner {
}
