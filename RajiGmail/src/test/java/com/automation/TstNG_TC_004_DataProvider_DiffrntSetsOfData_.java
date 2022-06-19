package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_TC_004_DataProvider_DiffrntSetsOfData_ {
	
	/* DATA PROVIDER

	 * "SAME SCRIPT/APPLICATION", WILL BE RUN "MULTIPLE TIMES" WITH "DIIFERENT SETS OF DATA"
	 * EX: lOGIN with Different SETS of USER NAMES and PASSWORDS
	 * 
	 * Our LOGIN "CONTROLS", USER NAMES and PASSWORDS are "HARD CODED"(WHICH IS IN DOUBLE QUOTES),
	 * WE CAN NOT PASS THE "OTHER SET OF VALUES", 
	 * sendKeys("standard_user"), sendKeys("secret_sauce") ARE HARD CODED
	 * 
	 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 * 
	 * "HOW CAN WE REMOVE HARD CODED VALUE?"
	 * 
	 * Make the "@Test METHOD" as "PARAMETERIZED METHOD"
	 * 
	 * "String" type of "VALUES", because USER NAME and PASSWORD are sequence of characters,
	 * "GIVE APROVISION TO ACCEPET THE VALUES FROM OUTSIDE"
	 * 
	 * @Test
	 * public void addRemoveToCart(String userName, String password ) throws Exception {
	 * 
	 */
	
	
	 
	 /* XML FILE LOOKS LIKE BELOW
	 * 
	 *    
	 * <?xml version="1.0" encoding="UTF-8"?>
	 * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	 * <suite name="SWAG" >
	 * <test  name="TstNG_TC_004_DataProvider_DiffrntSetsOfData_">
	 * <parameter name = "Browser" value = "chrome"/>
	 * <classes>
	 * <class name="com.automation.TstNG_TC_004_DataProvider_DiffrntSetsOfData_/>
	 * </classes>
	 * </test>
	 * </suite>
	 * 
	 * */
	
	WebDriver driver = null;
	// Open Browser
	
		@Parameters ({"Browser"})
		@BeforeTest
		
		public void openBrowser(@Optional("chrome") String browser) throws Exception {


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
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
			
			driver.manage().window().maximize();
			
			
		}

		
		@Test(dataProvider = "getTestData") // TesstNG RUNS "getTestData" method 1st, CONTROL Switches to 'dataprovider'
		public void addRemoveToCart(String userName, String password ) throws Exception {
			// Login
			
			driver.get("https://www.saucedemo.com/");

			driver.findElement(By.id("user-name")).sendKeys(userName);

			Thread.sleep(1000);

			driver.findElement(By.id("password")).sendKeys("secret_sauce");

			Thread.sleep(1000);

			/* DATA PROVIDER

			 * "SAME APPLICATION", WILL BE RUN "MULTIPLE TIMES" WITH "DIIFERENT SETS OF DATA"
			 * EX: lOGIN with Different SETS of USER NAMES and PASSWORDS
			 * 
			 * Our LOGIN "CONTROLS", USER NAMES and PASSWORDS are "HARD CODED"(WHICH IS IN DOUBLE QUOTES),
			 * WE CAN NOT PASS THE "OTHER SET OF VALUES", 
			 * sendKeys("standard_user"), sendKeys("secret_sauce") ARE HARD CODED
			 * 
			 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
			 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
			 * 
			 * "HOW CAN WE REMOVE HARD CODED VALUE?"
			 * 
			 * Make the "@Test METHOD" as "PARAMETERIZED METHOD"
			 * 
			 * "String" type of "VALUES", because USER NAME and PASSWORD are sequence of characters,
			 * "GIVE APROVISION TO ACCEPET THE VALUES FROM OUTSIDE",
			 * APROVISION Values are 'userName and password' See Below
			 * 
			 * public void addRemoveToCart(String userName, String password ) throws Exception {
			 * 
			 *  Whatever VALUE you RECEIVE from OUTSIDE ENTER 
			 *  in the "sendKeys" MEthod, same VALUE as PARAMETER, which is userName,
			 *  DO NOT include the DOUBLE QUOTES for this value, 
			 *  if you put DOUBLE QUOTES it will be TREATED as "CONSTANT", SEE BELOW,
			 * 
			 *  driver.findElement(By.id("user-name")).sendKeys(userName);
			 *  driver.findElement(By.id("user-name")).sendKeys(password);
			 *  
			 *  If you RUN this Program you get ERROR because, 
			 *  we are passing DIFFERENT SETS of DATA NOT SINGlE set, 
			 *  
			 *  To pass the DIFFERENT SETS of DATA, we need "DATA PROVIDER"  
			 * 
			 * "DATA PROVIDER"
			 * 
			 * Write an other METHOD for "DATA PROVIDER" at the END of the "LOGIN"  
			 * 
			 * see detailed NOTES BELOW
			 *  
			 */
			
			driver.findElement(By.id("login-button")).click();

			Thread.sleep(3000);
			
		 	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

			Thread.sleep(1000);
			
			driver.findElement(By.id("remove-sauce-labs-backpack")).click();

			Thread.sleep(1000);
			
			driver.findElement(By.id("react-burger-menu-btn")).click();

			// Clicks on "Buger Icon", on far left a Square Box with 3 strait lines

			Thread.sleep(1000);

			driver.findElement(By.id("logout_sidebar_link")).click();
			
		}
		
		/*"DATA PROVIDER"
		 * 
		 * "PURPOSE of DATA PROVIDER "
		 * 
		 * TO PASS THE "TEST DATA" TO "@Test" METHOD.
		 *  
		 * 
		 * 1ST WRITE A METHOD
		 * For "DATA PROVIDER" "RETURN TYPE" is "Object" but not "void", 
		 * it always RUTURNS "Object", that means ANY TYPE OF VALUE 
		 * it can HOLD "ANY TYPE OF DATA", like 'String, int etc;'
		 * followed by 2 DYMENSIONAL ARRAY, 
		 * 2 DYMENSIONAL ARRAY to REPRESENT ROWS and COLUMNS YOU HAVE TO USE 2 STES OF
		 * SQUARE BRACES '[][]', GIVE ANY 'METHOD NAME'(){, LOOKS LIKE BELOW
		 * 
		 * public Object[][]getTestData(){
		 * 
		 * On the Top of this METHOD, Write "@DataProvider" Annotation
		 * 
		 * Inside the METHOD, DEFINE 2 DYMENSIONAL ARRAY, 
		 * 
		 * 1st write RETURN TYPE, which is 'Object' and a "variable name", then equals sign and
		 * start CURLY BRACE and end of the CURLY BRACE should be FOLLOWED BY 'SEMI COLON'(;)',
		 * again in CURLY BRACES ENTER the "REAL USERNAME and PASSWORD" that you want to on the
		 * APPLICATION, like this we can PASS N-NUMBER of DATA, see below 
		 * 
		 * Object[][] data ={
		 * 
		 * {"standard_user","secret_sauce"},
		 * {"standard_user","secret_sauce"},
		 * {"locked_out_user","secret_sauce"},
		 * {"problem_user","secret_sauce"},
		 * {"performance_glitch_user","secret_sauce"},
		 * }
		 * 
		 * This Method declaration you told that this METHOD "Returns" 2 Dimensional Array,
		 * WHERE IS IT? write "return" statement, see Below
		 * 
		 * return data;
		 * 
		 *  Give some MEANINGful NAME to @DataProvider, in General METHOD NAME,
		 *  'name' is Attribute, see below
		 *  
		 *  @DataProvider(name= "getTestData")
		 *  
		 *   Now go to "@Test" METHOD, to EXECUTE this particular Method "dataProvider" is
		 *   REQUIRED. In PARANTHESIS Write (dataProvider = "getTestData"), 
		 *   DO NOT FORGET THIS, because @Test searches of 'dataprovider'
		 *   otherwise you will get error, see below
		 *   
		 *   @Test(dataProvider = "getTestData")
		 *   
		 *   While execution of the "@Test method", "TestNG" 1st executes "getTestData" method,
		 *   which is "{"standard_user","secret_sauce"}," Internally "TestNG" captures 
		 *   1st set of DATA, which is "standard_user", will be COPIED into 'userName',
		 *   "secret_sauce" will be COPIED into 'password'.
		 *   
		 *   public void addRemoveToCart(String userName, String password ) throws Exception {
		 *    
		 *   The same process for other sets of DATA
		 *   
		 *   Go to XML file and Run
		 *   
		 * */	
		
		@DataProvider(name= "getTestData")
		
		public Object[][] getTestData(){ // "getTestData" is Method Name
			 
			Object[][] data = {
			
			// "Object" can HOLD any type of DATA(String,int etc;)
			// '[][]' Represents "Rows and Columns", below are displayed in 1 ROW and 2 CLOUMNS
					
					 {"standard_user","secret_sauce"},
					 
					 {"standard_user","secret_sauce"},
					 
					 {"locked_out_user","secret_sauce"},
					 
					 {"problem_user","secret_sauce"},
					 
					 {"performance_glitch_user","secret_sauce"}, 
		 
			};
			
			return data;
			
		}
			
			// In the METHOD it said that it RETUNS 2 Dimensional Array(Object[][]),
			
			// Object[][] data = {
			
			// we have to write the 'retun' statement, 
			
			// WHAT IS THE 2 Dimensional Array?
			
			// 'data' is 2 Dimensional Array, write in 'return' method
			
			// return data;
		
		

			// Close Browser

			@AfterTest

			public void closeBrowser() throws Exception {

			Thread.sleep(2000);

			driver.quit();

		}
}
