package com.eg.qa.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\sheet\\eclipse-workspace\\Egranary\\EGmaven\\src\\main\\java\\com\\eg\\qa\\features\\EGranary.feature", //the path of the feature files
			glue = "com.eg.qa.stepdefinations", //the path of the step definition files
		//	format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
			//monochrome = true, //display the console output in a proper readable format
			//strict = true, //it will check if any step is not defined in step definition file
			tags = "@CIP",
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)

	public class TestRunner {
		
		@AfterClass

		public static void setup()

		{

		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));

		//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));

		Reporter.setSystemInfo("User Name", "SHEETAL");

		Reporter.setSystemInfo("Application Name", "Test App ");

		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());

		Reporter.setSystemInfo("Environment", "QA");

		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

		}
		 
}

