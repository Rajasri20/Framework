package com.automation.core2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSript_RootScript_FrameworkScrpt {
	
/* FrameWorkScript or BaseScript or RootScript */
	
	/* "Open Browser" and "Close Browser" functionality is not only related to this one Script, 
	 * this functionality is APPLICABLE ACCROSS the ENTIRE APPLICATION.
	 * So you need to SEPARETE it from this SCRIPT and 
	 * Create a NEW PACKAGE, called "core" meaning(which is useful Across the Scripts)
	 * and NEW CLASS FILE AND PASTE OVER THERE.
	 * By USING "INHERITANCE CONCEPT" IT IS GOING TO BE AVAILABLE TO ALL THE SCRIPTS 
	 * "extends" KEY WORD used in "INHERITANCE CONCEPT", the use of the "INHERITANCE CONCEPT"
	 * is "CODE REUSABILTY"
	 *  
	 * */
	
	/* Once we TOOK OFF "Open Browser" and "Close Browser" functionality from
	 * DataDriven_FrameWork_TC_001_CreateRecrd 
	 * we see ERRORS for "driver" in
	 * SUB CLASS("FrameWorks_DataDriven_Test"),
	 * SUPER CLASS("FrameWrk_Base_RootScript_") members are Automatically AVAILABLE to the 
	 * SUB CLASS("FrameWorks_DataDriven_Test"), but why the "driver" is not available? 
	 * Because, we are trying to ACCESS it from OUTSIDE the PACKAGE, 
	 * 
	 * 
	 *  */
	
	
	/* How to RESOLVE the "driver" ERRORS? */
	
	/* By adding a "PROTECTED" ACCESS MODIFIER to the "WebDriver driver =null;"  
	 * 
	 * We are trying to Access the 'driver' from 
	 * Outside the package(both the Scripts are in different PACKAGES) */
	
	/*  untill now "WebDriver driver =null;" has default ACCESS MODIFIER, which is PUBLIC,
	 *  which is LIMITED to SAME PACKAGE,
	 *  now MAKE it as "PROTECTED" 'protected WebDriver driver =null;" then i
	 *  t can be Accessible to BOTH THE PACKAGES "core" and "com.automation"*/ 
	
	
	/* RUNNING SAME SCRIPT ON CROSS BROWERS 
	 * 
	 * To do this we need Switch Statement, refer CONDITIONAL Statements
	 * 
	 * */
	
	
	protected WebDriver driver = null;
	
	
	// Open Browser
	
		@Parameters({"Browser"})
		@BeforeTest
		public void openBrowser(@Optional("chrome") String browser) throws Exception{
			
		// String browser = "edge"; This is hard coded so we can not pass the values
			
		// In this case we need to use TesNG PARAMETERIZATION. 
		// In the METHOD CONSTRUCTor write (String browser),
			// public void openBrowser(String browser) throws Exception{
			
		// Now HOW TO "PASS THE VALUES FROM OUTSIDE"?
		
		// gO TO tesng.xml file and write TEST LEVEL PARAMETER
			
			//  <parameter name="Browser" value= "edge"/>
			
		/*Now go to the SCRIPT, where do you want to receive the value? */ 
			
		// Ans: In "Open Browser Functionality", the 'browser' is required to run the below
		// FUNCTIONALITY. so define "@parameter" annotation on top of the @BeforeTest
		// @parameters, in PARANTHESIS in CURLY BRACES, pass the value "Browser" from xmlfile  
		
			/* @optional pArAmeTeR*/
			
			/* After adding the @parameters, if you RUN the SCRIPT you will get EXCEPTION or
			 * if there is no Test level parameter in xml also you will get EXCEPTION 
			 * 
			 * to AVOID EXCEPTION '@optional' is required, write in the 'openBrwoser' method
			 * public void openBrowser(@Optional("chrome") String browser) throws Exception{
			 * 
			 * */
			
		
		// Possible values for 'browser' are chrome, ff, edge.
		// If the 'browser' = "edge"; then control transfers to case "edge":, 
		// if If the 'browser' = "ff";, then control transfers to case "ff":
		// if If the 'browser' = "chrome";, then control transfers to case "chrome":
			
		
		
		switch (browser) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
			case "ff":
				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "edge":
				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();
				break;
		}
	
		driver.manage().window().maximize();
					
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(60));
					
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60));
					
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		}
		
		@AfterMethod
		
		public void closeBrowser() throws Exception {
		
		// Close Browser
		
			Thread.sleep(2000);
			
			driver.quit();
		
		}
}  
