package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_TC_004_AddRemoveCart_ParallelExecuOnBrowsers {
	
	
	/* HOW TO RUN SAME SCRIPT PARALLELY ON "MULTI BROWSERS OR DIFFERENT OR CROSS BROWSERS
	 * CROSS BROWSER COMPATABILITY"?
	 * 
	 * Which is also CALLED as "SEQUENTIAL eXECUTION, MEANING SAME SCRIPT IS EXECUTED 
	 * ON DIFFERENT BROWSER ONE BY ONE"
	 * 
	 * Go tO "tesng.xml" file COPY the TC_004 file and PASTE MULTIPLE TIMES.
	 * Go to <suite> tag, Inside this Tag write "parallel = "tests"", 
	 * 
	 * "parallel" IS ONE OF THE ARRIBUTES OF THE <suite> TAG, 
	 * We are RUNNING "3 different TESTS" so parallel = "tests", SEE BELOW 
	 * 
	 *  <suite name="SWAG" parallel = "tests">
	 *  
	 * 
	 * XML FILE LOOKS LIKE BELOW
	 * 
	 *    
	 * <?xml version="1.0" encoding="UTF-8"?>
	 * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	 * 
	 * <suite name="SWAG" parallel = "tests">
	 * 
	 * <test  name="TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr_F">
	 * <parameter name = "Browser" value = "ff"/>
	 * <classes>
	 * <class name="com.automation.TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr"/>
	 * </classes>
	 * </test>
	 * 
	 * 
	 * <test  name="TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr_E">
	 * <parameter name = "Browser" value = "edge"/>
	 * <classes>
	 * <class name="com.automation.TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr"/>
	 * </classes>
	 * </test>
	 * 
	 * 
	 * <test  name="TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr_C">
	 * <parameter name = "Browser" value = "chrome"/>
	 * <classes>
	 * <class name="com.automation.TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr"/>
	 * </classes>
	 * </test>
	 * </suite>
	 * 
	 * */
	
	WebDriver driver = null;
	// Open Browser
	
		@Parameters ({"Browser"})
		@BeforeTest
		
		public void openBrowser(@Optional("chrome") String browser) {
			
			// browser is a variable which of String type of value will be stored, which is "edge"
			
			// If I directly want to RUN the Script from IDE not from 'xml', 
			// I need to SET the "@Optional",
			// Without this if I RUN the program you will get ERROR
			// "@Optional" is a ANNOTATION, which is coming from TestNG, 
			// to set the "DEFAULt VALUES" of the "DECLARED PARAMETER"(String browser))
			// public void openBrowser(@Optional("edge") String browser) {
			
			// If we Don't pass any "Parameters" in xml file, say you did not write "parameter" Tag
			// the default "value" for Browser is "@Optional("chrome")", SEE BELOW,
			
			// public void openBrowser(@Optional("chrome") String browser) {
			
			// If you pass "parameter" value as "edge" in "parameter" Tag, 
			// then it will RUN on "edge" only, but  not on "chrome" because 
			// you SPECIFIED the PARAMETER as "edge",  SEE BELOW
			
			// <parameter name = "Browser" value = "edge"/>
			
			
			
			switch(browser) {
			
			// To support the BROWSER, "switch" statement is required.
			// "switch" is part of the "CONDITINAL STATEMENTS" REFER TO THAT NOTES
			// Inside the "switch" you need to WRITE "cases"
			
			case "chrome":
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				
				break;
				
			// For each and Every "case" DO NOT FORGET to MENTION "break", 
			// otherwise CONTROL goes to NEXT case
			
			case "ff":
				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();
				
				break;
			
			case "edge":
				
				WebDriverManager.edgedriver().setup();

				driver = new EdgeDriver();
				
				break;
			
			}
			
			// Now EXECUTE the Script, it will be EXECUTED only on 'edge', because 
			// in the following code we mentioned "String browser = "edge";", 
			// so if you want to EXECUTE the Script on "ff" you need to MANUALLy change 
			// every time you need to go to SCRIPT and change.
			// The value in the double quotes("") is HARD CODED
			// "String browser = "edge";"
			// which is not recommended or possible.
			// You need to make this VALUE "PARAMETERized" METHOD to RECEIVE the VALUE from OUTSIDE.
			
			/* Define/write "PARAMETER" 
			 * 
			 *  public void openBrowser(String browser)
			 *  
			 *  Now REMOVE thIS "String browser = "edge";", which you DEFINED before "switch"
			 * 
			 * Now the QUESTION is how to PASS THE "PARAMETER" from OUTSIDE? 
			 * 
			 * THROUGH "testng.xml" FILE WE CAN pASS "PARAMETER" from OUTSIDE 
			 * 
			 * * "Test Level" Parameter
			 * 
		 	 * The "Parameter" which DEFINED in <test> </test> is CALEED Test Level Parameter,
		 	 * this Parameter will be ACCESSED only in a particular or TC_004 SCRIPT ONLY,  
		 	 * We CAN NOT ACCESS it in TC_005
			 * 
			 * Go to "testng.xml" FILE, INSIDE the "<test>" tag
			 * Define/write a "PARAMETER", TAG looks like below
			 * 
			 * <parameter name = "Browser" value = "edge"/>
			 * 
			 * We defined PARAMETER inside the "<test>" so it called "TEST LEVEL PARAMETER" 
			 * wE CAN access THIS PARAMETER ONLLY IN TC_004 SCRIPT.
			 * nOW copy THE parameter name, which is "Browser",
			 * 
			 * 
			 *  Testng.xml TAG looks like below
			 *  
			 * 
			 * <?xml version="1.0" encoding="UTF-8"?>
			 * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
			 * <suite name="SWAG">
			 * <test  name="TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr">
			 * <parameter name = "Browser" value = "edge"/>
			 * <classes>
			 * <class name="com.automation.TstNG_TC_004_AddRemoveCart_DiffrntBrowsers_TstLvl_ParaMetr"/>
			 * </classes>
			 * </test>
			 *   
			 * 
			 * In the SCRIPT where I need this PARAMETER?
			 * I need it in "openBrowser" functionality METHOD, so go to that Method,
			 * define "@Parameters"(do not select @Parameter select "@Parameters")
			 * above the "@BeforeTest",
			 * 
			 * In PARANTHESIS(), in CURLY BRACES{}, in DOUBLE QUOTES"", 
			 * paste COPIED PARAMETER VALUE "Browser", which of TYPE "String"
			 * looks like this, @Parameters({"Browser"})
			 *  
			 * 
			 * You can give any PARAMETER name value, 
			 * here chose to give SCRIPT RELAVANT as "Browser"
			 * 
			 * Now PASS the name = "Browser" value in the "openBrowser" METHOD PARANTHESIS 
			 * "public void openBrowser()", looks like below.
			 * If you RUN the Program from the testng.xml, while execution of the program,
			 * Internally "TestNg" "CAPTURES" the "Parameter" information "Browser"="edge",
			 * 
			 * In the SCRIPT, in the @Parameters({"Browser"}), "Browser" is nothing but "edge",
			 * CONTROL "switches" to "edge" "case" and it will execute that PIECE of CODE,
			 * then rest of the execution is same as before.
			 * 
			 *  If you want to EXECUTE on "ff", you need to PASS the VLAUE as "ff" in xml file.
			 * 
			 * */
			 
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));

			driver.get("https://www.saucedemo.com/");
		}

		// Login

		@BeforeMethod

		public void login() throws Exception {

			driver.findElement(By.id("user-name")).sendKeys("standard_user");

			Thread.sleep(1000);

			driver.findElement(By.id("password")).sendKeys("secret_sauce");

			Thread.sleep(1000);

			driver.findElement(By.id("login-button")).click();

			Thread.sleep(3000);

		}

}
