package CucumberFramework.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

 
@CucumberOptions (
	features = {"src/test/java/CucumberFramework/FeatureFiles/"},
	glue = {"CucumberFramework.stepFiles"},
	plugin = {"pretty", "html:target/cucumber", 
			"json:target/cucumber.json" /* , 
		 	"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" */
	}	
)


public class MainRunner {
  /*  @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
        
    } */
}