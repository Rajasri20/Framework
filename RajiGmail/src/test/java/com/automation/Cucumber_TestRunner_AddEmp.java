package com.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\features\\HRM Add Employee.feature",dryRun = false,glue = "com.automation", plugin = "html:Reports.html")
public class Cucumber_TestRunner_AddEmp extends AbstractTestNGCucumberTests {


}

