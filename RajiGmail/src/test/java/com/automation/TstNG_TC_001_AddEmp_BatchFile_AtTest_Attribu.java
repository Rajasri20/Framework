package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_TC_001_AddEmp_BatchFile_AtTest_Attribu {
	
	public class TC_001_AddEmp_BatchFile_AtTest_Attribu {
		
		
		@Test(enabled = false, description = "Testing the Add Employee", testName = "TstNG_TC_001_AddEmp_BatchFile_AtTest_Attribu", invocationCount = 2) 
		public void addEmployee() throws Exception {
			/* @Test ATTRIBUTES
			 * 1. @Test("enabled:boolean -test")
			 * 
			 * 1st add PARANTHESIS then Type in 'ena' hit ctrl space bar, 
			 * select "enabled:boolean -test", which RETURNS "TRUE or FALSE", this one of the   
			 * ATTRIBUTES of the @Test. But it is Optional
			 * By DEFAULT it is TRUE, TRUE means it will RUN the SCRIPT. If you 
			 * make "enabled = false" it will SKIP that particular SCRIPT and RUNS the next one.
			 * Looks like this "@Test(enabled = false)"
			 * 
			 * 
			 * IN THE "testng.xml"
			 * 
			 * This will be done in the script or in the "testng.xml" file 
			 * Ex: <test name="TstNG_TC_002_EditEmployee" enabled = "false">
			 * See "testng.xml" file
			 * 
			 *  2. @Test(desciption:string-test)
			 *  
			 *  1st add PARANTHESIS then Type in 'desc' hit ctrl space bar, 
			 *  select "desciption:string-test", which RETURNS "String" type of value
			 *  this one of the  ATTRIBUTES of the @Test. But it is Optional.
			 *  Before adding this if there are 
			 *  any other METODS/ATTRIBUTES it should be added by COMMA(,) separated
			 *  It "Describes" what you are testing, SEE BELOW
			 *  "@Test(enabled = false, description = "Testing the Add Employee")"
			 *  
			 *  
			 *  3. @Test(testName:string-test)
			 *  
			 *  If you want to MAP with FUNCTIONAL TEST CASE, use "(testName:string-test)"
			 *  
			 *  1st add PARANTHESIS then Type in 'testN' hit ctrl space bar, 
			 *  select "testName:string-test", which RETURNS "String" type of value
			 *  this one more ATTRIBUTES of the @Test. But it is Optional.
			 *  Before adding this if there are 
			 *  any other METODS/ATTRIBUTES it should be added by COMMA(,) separated
			 *  It "exact Test NAme" what you are testing, SEE BELOW
			 *  "@Test(enabled = false, description = "Testing the Add Employee", testName = "TstNG_TC_001_AddEmp_BatchFile_AtTest_Attribu" )"
			 *  
			 *  
			 *  4. @Test(invocationCount:int-test)
			 *  
			 *  If you want to MAP with FUNCTIONAL TEST CASE, use "(testName:string-test)"
			 *  
			 *  1st add PARANTHESIS then Type in 'invo' hit ctrl space bar, 
			 *  select "invocationCount:int-test", which RETURNS "String" type of value
			 *  this one more ATTRIBUTES of the @Test. But it is Optional.
			 *  Before adding this if there are 
			 *  any other METODS/ATTRIBUTES it should be added by COMMA(,) separated
			 *  It tells "HOW MANY TIMES YOU WANT TO EXECUTE THE SAME SCRIPT", SEE BELOW
			 *  "@Test(enabled = false, description = "Testing the Add Employee", testName = "TstNG_TC_001_AddEmp_BatchFile_AtTest_Attribu", invocationCount =2)
			 */ 
			 
			
			// NOW REMOVE THE CODE FROM THE MAIN METHOD AND CREATE NEW METHOD,
			// ON THE TOP, UNDER NEW METHOD PASTE IT.
			// To see how many methods are there press "ctrl o(letter o)", 
			// only "addEmployee()" is displayed 
					
			// Once we start using "TestNG" we don't use "MAIN METHOD". 
			// WE USE "@Test" ANNOTATION. We write this ABOVE THE NEWLY CREATED METHOD.
			// NOW THE EXECUTION IS TAKEN CARE BY "TestNG" because there is NO "MAIN METHOD" to
			// EXECUTE THE PROGRAM
					
			/* HOW TO EXECUTE THE PROGRAM? */
					
			// There are 3 ways to Execute, 
			// hit "Run" button top or
			// hit "Run" UNDER the "@TestNG" or
			// hit "Run All" ABOVE the "Method Declaration".
			// Or with Batch File Execution, which is nothing but TestNG.xml file.  
			
			/* How to Generate "Batch File or testng.xml" file*/ 
			
			// RIGHT Click on "TestNG" SCRIPT that you wrote(in Navigator tab  on your left),
			// Select "TestNG", then click on "convert to TestNG"
			// The "TestNG" option will be available when you INSTALL "TestNG", 
			// other wise you don't see that option.  
			// Generate testing.xml window opens, in the location field you will see,
			// "testing.xml" which is nothing but a BATCH FILE, which is generated in the
			// PROJECT called "Gmail".
			// click on FINISH.
			// In the "Navigator" scroll down, "testing.xml" file is generated, 
			// Click on it, opens in new window and in "Design" mode.
			
			// Click on "Source" tab, it will be opened in "xml" file format
			// After the "Doc Type", the following CODE will be displayed 
			// "<suite name="Suite">" code, 
			// in this code if you want to change the "Suite Name"  
			// you can change or its OPTIONAL, it looks like this
			// <suite name="Orange HRM Add Employee">
			
			// In the 2nd line of CODE "<test thread-count="5" name="Test">", 
			// you can REMOVE "thread-count="5"" BUT it's optional, looks like this,
			// "<test name="Test">"
			
			// If you want you can change the NAME of the "Test" in above tag but its Optional, 
			// If you want to change the name 
			// in GENERAL '"TEST NAME WILL BE SAME AS CLASS NAME" or
			// else you can give your own choice with unique NAME. looks like below,
			// "<test name="TstNG_TC_001_AddEmployee_BatchFileGene">"
			
			
			
			// At the end of the </test> tag the following
			// COMMENT will be displayed, "<!-- Test -->". It is just Comment REMOVE it.
			// At the end of the "</suite>" tag the following
			// COMMENT will be displayed, "<!-- Suite -->". It is just Comment REMOVE it.
			
			/* RUN THE PROGRAM FROM "xml file" */
			
			// Open "testng.xml file", hit RUN button on the top,
			// Testng finds the "com.automation" package and
			// Testng finds the "TC_001_AddEmployee_BatchFileGene" class, and in 
			// "TC_001_AddEmployee_BatchFileGene" class Testng finds the "@Test" ANNOTATION,
			// (it Jumps from "testng.xml file to "TestNG" SCRIPT that you wrote") and
			// EXECUTES the "AddEmployee" functionality and 
			// it will generate the REPORT for "testng.xml file" 
			// with the RENAMEd Suite NAME "Orange HRM AddEmployee(1/0/0/0)(21.333 s)".
			
			// Right Click on your PROJECT(Gmail) and click on "Refresh".
			// Open "test-output" folder and click on "emailable-report.html",
			// by default report opens Eclipse IDE, in new tab, OR 
			// for MORE READEABLITY you can Open the REPORT in BROWSER also,
			// From the Eclipse IDE COPY the report link and PASTE in the Browser OR
			// right click on the "emailable-report.html", select "Open With" and 
			// now click on "Web Browser", REPORT will be OPENED in Browser.
			// You can see "REPORT" for "TC_001_AddEmployee_BatchFileGene_Xml" Script.
			
			/* ADVANTAGES OF THE BATCH FILE 
			 * 
			 * MULTIPLE(100s and 1000s of) SCRIPTS CAN BE RUN AT A TIME. */
			
			// Write 2 more scripts for "Employee" functionality,
			// 1 with "EDIT" functionality and 
			// 2nd one with "DELETE"
			
			// Now go to "testng.xml" file, 
			// COPY the CODE from START of the <test> tag
			// to the end of the </test> tag for both the "Edit and Delete" scripts, 
			// PASTE it 2 times between <suit> </suit> tags,
			// change the CLASS NAME and TEST NAMES respectively.
			
			// Now hit on run from "testng.xml" file, it will RUN one by one COTINUOUSLY,
			// No need to open the single script and run then next one.
			// If it is a Batch file you can execute them at a time
			
			
			
			// Open Browser
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			// Login 
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
			driver.findElement(By.className("button")).click();
			
			Thread.sleep(3000);
			
			// Intentionally I am make it to wait, otherwise the program RUNS very FAST.
			// I want to whether it is clicked on that particular Element
			// It is nothing to do with "implicitlyWait wait or pageLoadTimeout", these will 
			// wait Until the "Object is Visible and until the page is loaded" respectively
			// "Thread.sleep" and "implicitlyWait wait or pageLoadTimeout" are completely different.
			
			
			// Transaction or Add Employee

			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			
			driver.findElement(By.id("firstName")).sendKeys("Srikrishna");
			
			driver.findElement(By.id("lastName")).sendKeys("A");
			
			String id = driver.findElement(By.id("employeeId")).getAttribute("value");
			
			System.out.println(id); 
			
			// Stores the value in ID
			
			driver.findElement(By.id("btnSave")).click(); 
			
			// Logout
			
			driver.findElement(By.id("welcome")).click();
			
			// driver.findElement(By.linkText("Logout")).click();
			
			// SOMEHOW THIS PIECE OF CODE IS NOT WORKING, VERYFIED WITH SRIRAM IT IS CRROECT BUT
			// STILL GETTING THE ERROR
			
			// driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
			
			// tried copying the xpath from the browser too but still getting the error
			

			// Close Browser
			
			Thread.sleep(2000);
			
			driver.quit();

	}
	}}


