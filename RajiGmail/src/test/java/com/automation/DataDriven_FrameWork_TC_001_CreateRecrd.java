package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.core2.BaseSript_RootScript_FrameworkScrpt;
import com.automation.helper.ExcelHelper;

public class DataDriven_FrameWork_TC_001_CreateRecrd extends BaseSript_RootScript_FrameworkScrpt{
	
	// hold "CTRL" and mouse click on FrameWrk_Base_RootScript_, it will navigate you to  
		// 'core' PACKAGE where FrameWrk_Base_RootScript_ class file was created.  
		
	/* Requirement */
		
		/* 	We need one END to END Functionality to implement the Framework 
		 * 
		 *  1. Open Browser, enter this url "https://demo.openmrs.org/openmrs/login.htm"
		 *  
		 *  2. Login
		 *  
		 *  3. Create a Record
		 *  
		 *  4. Logout
		 *  
		 *  5. Close Browser
		 *  
		 *  
		 * */
		
		
		// 'WebDriver' is a non primitive and Inter face, the default value is 'null'.
		
		
		/* "Open Browser" and "Close Browser" functionality is not only related to this one Script, 
		 * this functionality is APPLICABLE ACCROSS the ENTIRE APPLICATION.
		 * So you need to SEPARETE it from this SCRIPT and 
		 * Create a NEW PACKAGE, called "core" meaning(which is useful Across the Scripts)
		 * and NEW CLASS FILE AND PASTE OVER THERE.
		 * By USING "INHERITANCE CONCEPT" IT IS GOING TO BE AVAILABLE TO ALL THE SCRIPTS 
		 * "extends" KEY WORD used in "INHERITANCE CONCEPT", the use of the "INHERITANCE CONCEPT"
		 * is "CODE REUSABILTY".
		 * 
		 *  "FrameWrk_Base_RootScript_" is SUPER CLASS, members are Automatically AVAILABLE to the 
		 *  SUB CLASS, "FrameWorks_DataDriven_Test"
		 * 
		 * */
		
		
		
		/* How to RESOLVE the "driver" ERRORS? */
		
		/* By adding a "PROTECTED" ACCESS MODIFIER to the "WebDriver driver =null;"  
		 * 
		 * We are trying to Access the 'driver' from 
		 * Outside the package(both the Scripts are in different PACKAGES) */
		
		 /*  untill now "WebDriver driver =null;" has default ACCESS MODIFIER, which is PUBLIC,
		 *  which is LIMITED to SAME PACKAGE,
		 *  now MAKE it as "PROTECTED" 'protected WebDriver driver =null;" then i
		 *  t can be Accessible to BOTH THE PACKAGES "core" and "com.automation"*/
	
	
		
		@Test(dataProvider = "getTestData")
		
		public void createRecord(String userName, String password, String firstName, 
				String lastName, String gender, String date, String month, 
				String year, String address, String mobileNumber) throws Exception{
			
			// Login
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		Assert.assertEquals(driver.getTitle(), "Login", "Verification for Login Page");
		
		// Validation for Login
		
		driver.findElement(By.id("username")).sendKeys(userName);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("Registration Desk")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
		
		Assert.assertEquals(driver.getTitle(), "Home", "Verification for Sucessfull Login");
		

		// Create a Record
		
		driver.findElement(By.partialLinkText("Register a patient")).click();
		
		driver.findElement(By.name("givenName")).sendKeys(firstName);
		
		/* <input type="text"  name="givenName" value="" 
		// class="required focused ui-autocomplete-input" autocomplete="off">
		 * 
		 * If the 'id' contains numeric values, id="fr4398-field", that means 
		 * NUMERIC VALUE MIGHT CHANGE in THE COMING RELEASES, so BETTER GO WITH 
		 * OTHER COMTROL LIKE 'name', name="givenName" 
		 * 
		 *  
		 */
		 
		driver.findElement(By.name("familyName")).sendKeys(lastName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("gender-field")).sendKeys(gender);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("birthdateDay-field")).sendKeys(date);
		
		driver.findElement(By.id("birthdateMonth-field")).sendKeys(month);
		
		driver.findElement(By.id("birthdateYear-field")).sendKeys(year);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("address1")).sendKeys(address);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys(mobileNumber);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("next-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("next-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit")).click();
		
		/* HOW TO FIND CONTROL AND CAPTURE THE PATIENT ID, WHICH IS
		 * 'NUMERIC NUMBER and "DYNAMIC" IN NATURE' EX: 100K42. */
		
		
		/* Once you click on the "Confirm" button, on right side corner PATIENT ID 
		 * will be GENERATED, EX: 100KUL.
		 * This number is DYNAMIC in NATURE, every time NEW PATIENT ID will be DISPLAYED 
		 * 
		 * Right Click on the PATIENT ID, copy the control,
		 *  
		 * which has a "<span>100K42</span>", NO ID, NAME, CLASS ATTRIBUTES ARE GIVEN,
		 * 
		 * Thre N -NUMBER of CONTROLS are there so we CAN NOT Identify Directly
		 *  
		 * How can we CAPTURE the TEXT('100K42') PROGRAMATICALLY, which is DYNAMIC IN NATURE,
		 *  
		 * WE CAN NOT IDENTIFY THIS 'CONTROL' DIRECTLY, but 
		 * 
		 * "Patient ID"(it is a TEXT displayed before the Dynamic number) is 'STATIC IN NATURE'
		 *  
		 * So WE CAN IDENTIFY THE 'CONTROL'FOR "Patient ID", then 
		 * 
		 * we can NAVIGATE from,"Patient ID" to "100KUL", 
		 * 
		 * Right click, Inspect on "Patient ID", Copy the Element,
		 * 
		 * <em>Patient ID</em>, 
		 * 'em' is a tag/link with TEXT, so LinkText Strategy,
		 * 
		 * //em[text()='Patient ID']
		 * 
		 * Go to Browser, control 'f' and ctrl v, CONTROL for "Patient ID" is HIGH LIGHTED in Yellow
		 * 
		 * <em>Patient ID</em> and "<span>100K42</span>", were displayed ONE after the Other 
		 * 
		 * but Our Required one is "<span>100K42</span>", 
		 * 
		 * for this we need to FIND OUT the "PARENT" tag to NAVIGATE from 
		 * <em>Patient ID</em> to "<span>100K42</span>",
		 * 
		 * On the Browser DOM, in the SEARCH, where you pasted the //em[text()='Patient ID'],
		 * beside the CONTROL put a "FORWARD SLASH AND 2 DOTS",
		 *  
		 * //em[text()='Patient ID']/..
		 * 
		 * NOW the PARENT tag which is DIV will be highlighted,
		 * 
		 * <div class="float-sm-right">
	            <em>Patient ID</em>
	            <span>100K42</span>
	            
	        </div>
		 * 
		 * when you place CURSOR on <div class="float-sm-right"> both 'Patient ID' and '100K42'
		 * will be highlighted.   
		 * 
		 * now from PARENT TAG to go to "span",
		 * to this xpath //em[text()='Patient ID']/..
		 * 
		 * put a FORWARD SlASH and  WRITE 'span', //em[text()='Patient ID']/../span
		 * 
		 * inside the PARENT TAG, "span" got HIGHLIGHTED
		 *   
		 * now we are going to NAVIGATE from //em[text()='Patient ID'] to "<span>100K42</span>",
		 *  
		 * */
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//em[text() = 'Patient ID']/../span")));
		
		// BOTH TIME WAIT ARE WORKING FINE
		
		
		String id = driver.findElement(By.xpath("//em[text() = 'Patient ID']/../span")).getText();
		
		System.out.println("ID"+id);
		
		Reporter.log("ID=" + id);

		Thread.sleep(2000);	
		
		// Logout
		
		driver.findElement(By.partialLinkText("Logout")).click();
		
		}
		

		@DataProvider(name = "getTestData")
		public Object[][] getTestData() throws Exception {
			return ExcelHelper.getTestData("D:\\FrameWorkTD.xlsx", "Sheet1");
		
		}
		}

/*  hOW TO GET THe 'EXCELDATA' FROM HERE TO 'CORE SCRIPT OR BASESCRIPT' */

// TO GET THIS DATA FROME HERE,nOW GO YOUR CORE SCRIPT OR BASESCRIPT AND WRITE THE CODE
// FOR EXCEL AND 'CTRL CLICK' ON 'getTestData'(return ExcelHelper.getTestData("D:\\TestDataFrameWork.xlsx", "Sheet1");
// IT WILL NAVIAGTE HERE TO THIS SCRIPT
// AND GOES TO THE PARTICULAR FILE AND GOES TO THE PARTICULAR SHEET AND WILL
// CAPTURE THE ENTIRE DATA AND IT IS GOING TO RETURN AS 2 DIMENTIONAL ARRAY 
// THAT 2 DIMENTIONAL ARRAY WE HAVE TO PROVIDE TO THE 'getTestData', you have to 
// USE 'return' statement. 
// return ExcelHelper.getTestData("D:\\TestDataFrameWork.xlsx", "Sheet1");
// whatever 2 DIMENTIONAL ARRAY we RETRIEVED we hae to return that 2 DIMENTIONAL ARRAY
// to the @Test, write dataProvider = "getTestData", @Test(dataProvider = "getTestData")


