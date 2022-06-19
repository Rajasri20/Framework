package com.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= "src\\test\\resources\\features\\HRM Application.feature",dryRun = true,glue = "com.automation", plugin = "html:Reports.html")
public class Cucumber_TestRunner_T extends AbstractTestNGCucumberTests {
	
	/* TestRunner
	 * 
	 * TestRunner is used for "CUSTOMIZED" Scenario RUNNING, which Scenario you want to RUN. 
	 * 
	 * Hit On RUN BUTTON from "Feature File" is one Approach and 
	 * one more Approach is using "TestRunner",
	 * You have to WRITE a "TestRunner", 
	 * Go to Java, Create a Class file. 
	 * 
	 * "TestRunner" is a SUB-CLASS of AbstractTestNGCucumberTests, so use the KEY WORD "extends"(Interface)
	 * then type in "Abstra" hit Ctrl and select "AbstractTestNGCucumberTests" 
	 * 
	 * Cucumber_TestRunner_T extends AbstractTestNGCucumberTests  {
	 * 
	 * On the Top of the CLASS write Annotation called "@CucumberOptions"
	 * 
	 * */
	
	/* ATTRIBUTES OF "@CucumberOptions" 
	 * 
	 * 1. features
	 * 		where is your "Feature file"?
	 * 
	 * 		RIGHT CLICK on '"Feature file", select "Properties", you can give complete path
	 * like below or you can give from "src" this is also enough,
	 * 
	 * 	"AutomationWorkSpace\RajiGmail\src\test\resources\features\Orange HRM.feature"
	 * "src\\test\\resources\\features\\Orange HRM.feature"
	 * 
	 * 2. glue
	 * 		where is your "Step Definitions Locations"
	 * 		"com.automation" is the package where "Step Definitions Locations" are LOCATED 
	 * 
	 * 3. plugin
	 * 		To Generate REPORTS
	 * 
	 * 		What kind of REPORTS you want to generate?
	 * 		I want to generate "html" type of REPORTS, COLON Separated, html:
	 * 		
	 * 		Give a File NAme, for EX: "Reports.html", looks like below
	 *  
	 * 		"html:Reports.html"
	 * 
	 * 		NOW HIT on RUN from "Test Runner", the out put is same, 
	 * 		it generates "html" Report, GO to PROJECT, right click and hit "Refresh", 
	 * 		it will be in "test-ouput" folder, click on "Reports.html", 
	 * 		If it is not OPENING in the Default browser in Eclipse, 
	 * 		COPY and PASTE in CHROME BROWSER, it will show how many passed how many failed
	 * 
	 * 		
	 * 4. tags
	 * 		A particular/mentioned "scenario", which is given "tags" will be executed, NOT all
	 * 		"@Parameters" scenario.
	 * 
	 * 		If you Do NOt want RUN a particular Scenario, add with COMMA separated or
	 * 		REMOVE "tags", so all the "Scenarios" will be EXECUTED
	 * 	
	 * 5. dryRun
	 * 		CROSS CHECKS the "Step Definitions"  
	 * 		"dryRun" verifies, whether "Each and every sTEP has a Step Definition or not" 
	 * 		
	 * 	"dryRun" will return "boolean" value, By default it is "false".
	 * 	If you make it "true"(without double quotes), EX: dryRun = true
	 * 	it just CROSS CHECKS that whether the STEP has a
	 *  "Step Definition" or not and displays the MISSING "STEP DEFINITIONS" in the CONSOLE,
	 *  but it WON'T Open the Browser.
	 *  
	 *  After checking this DO NOT FORGET to MAKE it FALSE, other your SCRIPT won't be RUN
	 *   
	 * 
	 * */

}
