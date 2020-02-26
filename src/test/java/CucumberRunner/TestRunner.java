package CucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		 
			features = "src/test/java/CucumberFeature", //Path of the feature file
		
			glue=("StepDefination"), //Path of the step defination file
					
			monochrome = true, // Display the console output in proper readable format
			plugin = {"pretty" , "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml",
					"html:target/cucumber-reports" }, // Generating different type of reporting
			dryRun = false , //To check the mapping is proper between feature file and step definition file
		 // dryRun = true , //it will check all the step definition are define or not
			
			strict = true // it will check if any step not define inside step definition
					
			//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.htm"}
			)

	public class TestRunner 
	{
	
	}

