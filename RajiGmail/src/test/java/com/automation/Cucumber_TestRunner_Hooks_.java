package com.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= "src\\test\\resources\\features\\CuCumbr Hooks HRM.feature",dryRun = false,glue = "com.automation", plugin = "html:Reports.html")
public class Cucumber_TestRunner_Hooks_ extends AbstractTestNGCucumberTests{
	
	
	

}
