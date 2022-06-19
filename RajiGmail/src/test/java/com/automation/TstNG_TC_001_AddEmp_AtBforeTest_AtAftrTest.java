package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_TC_001_AddEmp_AtBforeTest_AtAftrTest {
	
		/* There are 3 IMPORTANT "@" Annotations, these are DEFINED by "TestNG"
		 * 
		 * Always the "Annotations" are written BEFORE the METHOD NOT aFTER THE METHOD
		 * if you write AFTER the METHOD you will get ERROR for other lines of CODE  
		 * 
		 *  1. @BeforeTest 
		 *  2. @Test
		 *  3. @AfterTest
		 *   
		 *   The Program will EXECUTE in the above order.
		 *   If you FORGET to ADD "@" Annotations, that METHOD CAN NOT be EXECUTED by TestNG
		 *   
		 *   */
	
	
		// UNTIL NOW WE USED "SINGLE" METHOD TO 
		// "IMEPLENT 3 FUNCTIONALTIES" OF THE "Add Employee", 
		// "Open Browser, AddEmployee and Close Browser".
		// USING A "SINGLE" METHOD" IS NOT RECOMMENDED.
		// If we use a SINGLE METHOD if someone changes CODE 
		// it will be DIFFICULT to identify.
		// to bring the MODULARITY to the PROGRAME.
		// WE ARE CREATING "SEPARATE METHODs" FOR EACH FUNCTIONALITY,
		
		

		/*
		 * CREATING "SEPARATE METHODs" for EACH FUNCTIONALITY to BRING the
		 * MODULARITY/CLARITY
		 */
		
		// AFTER CREATING THE SEPEARTE METHODS FOR EACH FUNTIONALITY, HIT ON "RUN", immediately
		// you will GET an ERROR because when you hit on RUN "TesgNG" looks for "@Test" ANNOTATION
		// EXECUTION ALWAYS START FROM "@Test", BUT here you CAN NOT directly "Login"
		// Open "BROWSER" is the PREREQUISISTS for "Login".  
		// WITHOUT OPENING the BROWSER it CAN NOT LOGIN AND ENTER THE DATA OR CLOSE BOWSER 
		
		// So need to "CALL" "openBrowser()" METHOD inside the "@Test", after the "addEmployee" method 
		// Now "closeBrowser()" METHOD should be placed at the end of the "addEmployee" method. 
		
		
		/* HOW TO KNOW HOW MANY METHODS ARE THERE 
		 * 
		 * CLICK ctrl o, displays how many methods are there in this SCRIPT */
		
		
		WebDriver driver = null;
		
		// "WebDriver" is in "openBrowser()", so it is "APPLICABLE" to that piece of BLOCK only,
		// In other METHODS you will GET ERRORS for "driver" in the other MEthods, 
		// So we need to DEFINE the "WebDriver" in the CLASS LEVEL so,
		// "driver" is ACCESSABLE through out the "Program". 
		// Now remove WebDriver from "openBrowser()" method, Errors will be resolved.
		
		
		/*  1. @BeforeTest .... for OpenBrowser
		 * 
		 * Open Browser is the PREREQUIST to the "login", 
		 * so write "@BeforeTest" before the "openBrowser()" method.  
		 * 
		 * */
		
		
		// Open Browser
		
		@BeforeTest
		
		public void openBrowser() {
			
		// Method Name should start with "Lower case and next word followed by Upper case"
		
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Create a new METHOD, COPY and PASTE the "Open Browser" Functionality inside
		// the METHOD
		
		}

		
		/* 2. @Test .... for AddEmployee
		 * 
		 * Execution starts at "@Test" Annotation, Add Employee functionality is added    
		 *  
		 *  */
		
		@Test
		public void addEmployee() throws Exception {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
			Thread.sleep(3000);
			
			driver.findElement(By.className("button")).click();
			
			Thread.sleep(3000); 
			
		
			//  Add Employee

			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			
			driver.findElement(By.id("firstName")).sendKeys("Srikrishna");
			
			driver.findElement(By.id("lastName")).sendKeys("A");
			
			String id = driver.findElement(By.id("employeeId")).getAttribute("value");
			
			System.out.println(id); 
			
			// Stores the value in ID
			
			driver.findElement(By.id("btnSave")).click(); 
			
			Thread.sleep(2000);
			
			
			// Logout
			
			driver.findElement(By.id("welcome")).click();
			
			Thread.sleep(2000);
			
			// driver.findElement(By.linkText("Logout")).click();
			
			// SOMEHOW THIS PIECE OF CODE IS NOT WORKING, VERYFIED WITH SRIRAM IT IS CRROECT BUT
			// STILL GETTING THE ERROR
			
			// driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
			
			// tried copying the xpath from the browser too but still getting the error
			
		}
		
		
		/* 3. @AfterTest .... for CloseBrowser 
		 * 
		 * This Annotation is used for Closing the BROWSER
		 * 
		 * */
		
		
		// Close Browser
		
		@AfterTest
		
		public void closeBrowser() throws Exception {
			
				Thread.sleep(2000);
				
				driver.quit();
		}
}
