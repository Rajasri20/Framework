package com.automation;

public class TstNG_FrameWork_Notes {

	public static void main(String[] args) {


		/* TestNG_FrameWork */
		
		// Stands for "Test Next Generation", but it is not really a Frame work, 
		// TestNG is a Structured Approach, based on this concept 
		// we have to Implement below "CUSTOMIZED AND REAL TIME FrameWorks" like 
		/* 
		 * 1. DATA DRIVEN FRAMEWORK 
		 * 2. PAGE OBJECT MODEL
		 * 3. HYBRID FRAMEWORK
		 * 4. KEYWORD DRIVEN FRAMEWORK */
		
		
		/* How to Write a TestNG Script
		 * 
		 * In TestNG we "DO NOT USE MAIN METHOD for EXECUTION", we INTEGERATE the SCRIPT with 
		 * 
		 * TestNG by writing a "@Test" and EXECUTION will be Taken care by "@Test" 
		 * 
		 * 
		 * 1st Write a Selenium/Automation Script InISDE a METHOD
		 * and you should use "@Test", type in '@Tes' hit space bar and select "@Test",
		 * Execution Taken Care by TestNG.
		 * when Selenium/Automation Script is INTEGRATED with TesNG, 
		 * we can Execute "Batch Files", "Report Generation" etc;
		 * 
		 * */
		
		//*OTHER CONCEPTS OR FRAMEWORKS*/
		
		// the below CONCEPTS are called FRAME WORKS  but really they are not FRAME WORKS  
		// They are the STRUCTURED Approach 
		// to Implement CUSTOMIZED AND REAL TIME FRAME WORKS 
		
		/* Java
		 * Selenium
		 * Robot
		 * Apache POI
		 * TestNG
		 * Cucumber*/
		
		// based on ALL THESE CONCEPTS we have to Implement 
		// ABOVE "CUSTOMIZED AND REAL TIME FrameWorks".
		
		// MANUL TEST CASE/SCRIPT IS THE BASE FOR ANY AUTOMATION TEST SCRIPT
		// 1ST YOU NEED TO UNDERSTAND THE MANUAL TEST CASE THEN WRITE THE AUTOMATION TEST SCRIPT 
		
	
		/* FEATURES
		 * 
		 * 1. It is Also Called as "UNIT TESTING FRAMEWORK" 
		 * 2. It is a OPEN SOURCE and FREE WEARE over the Internet, 
		 * anyone can USE in their Real Time Projects. 
		 * 3. We can "Run BATCH EXECUTION" 
		 * 4. REPORT GENERATION 
		 * 5. SUPPORTS ANNOTATIONS
		 * 6. SUPPORTS VALIDATIONS using ASSERTIONS 
		 * 7. SUPPORTS PARAMETERIZATION, Passing parameter through "testng.xml"
		 *    by using "@Parameters" Annotation in the SCRIPT
		 * 8. SUPPORTS DATA DRIVEN FRAMEWORK
		 * 9. SUPPORTS PARRELLAL EXECUTION
		 * 10. @DataPrivder
		 * 
		 * */
		
		/* How to add TestNG DEPENDENCIES?
		 * 
		 *  Go to https://mvnrepository.com/ 
		 *  Search for TestNG and Click on it and click on the latest Version /
		 *  COPY the required set of DEPENDENCIES
		 *  Now go to IDE, Click on POM.xml file and paste the DEPENDENCIES and Save, 
		 *  it will be connected to CENTRAL REPOSITORY of MAVEN. 
		 *  click on "Package Explorer tab" scroll down you will see TestNG files. */
		
		/* Add Eclipse TestNG PlugIn
		 * 
		 * WHY WE NEED IT?
		 * 
		 *  TO "Execute the SCRIPT" we need Eclipse TestNG PlugIn 
		 *  but to "Write the Script" we DO NOT need the plug in 
		 *  To EXCECUTE any TestNG SCRIPT through ECLIPSE IDE or EDITOR we need this PlugIn 
		 *  
		 *  On the Top part of Eclipse, Click on "Help", select "Eclipse Market Place", follow 
		 *  Search for TestNG, hit enter "TestNG for Eclipse" displays, click on Install,
		 *  In the next window all the check boxes by default checked, click on "Confirm"
		 *  Accept Terms and Conditions, and hit on Finish.
		 *  On the Waning window select Install anyway, click on Restart now then click next next
		 *   
		 *  On the Top part of Eclipse, Go to "Windows" select "Preferences", you will see
		 *  TestNg node, that means you Successfully down loaded the TestNg PlugIn*/
		
		
		
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
		
		
		/* ANNOTATIONS
		 * 
		 * @Test
		 * @BeforeTest
		 * @BeforeMethod
		 * @AfterTest
		 * @AfterMethods
		 * 
		 * Above are Important and below 4 are not REQUIRED
		 * 
		 * @BeforeSuite
		 * @AfterSuite
		 * @BeforeClass
		 * @AfterClass
		 * 
		 * */
		

	}

}
