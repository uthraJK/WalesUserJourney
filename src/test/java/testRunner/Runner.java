package testRunner;

import java.io.File;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/featureFile/data.feature",
				glue= "stepDefinition",
				dryRun=false,
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		        monochrome = true )
				
public class Runner {

	@AfterClass
	public static void teardown() {
	Reporter.loadXMLConfig(new File("C:\\Users\\Balajee\\eclipse-workspace\\WalesUserJourney-master\\config\\extent-config.xml"));
	Reporter.setSystemInfo("user", System.getProperty("user.name"));
	Reporter.setSystemInfo("os", "Mac OSX");
	Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
