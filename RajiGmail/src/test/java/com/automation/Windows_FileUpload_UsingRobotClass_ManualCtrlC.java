package com.automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_FileUpload_UsingRobotClass_ManualCtrlC {
	
	/* "FACED AN ISSUE WITH 'Robot.awt' IMPORT".
	 * 
	 * TO RESOLVE THIS "IMPORT ISSSUE" FOLLOW BELOW STEPS
	 * 
	 * 1. Open your Eclipse
	 * 2. From the Top click on "Windows"
	 * 3. Then Select "preferences"
	 * 4. In the "preferences" window, type in "Type Filters" 
	 * 5. Under the "Type Filters", UNCHECK the "java.awt.*" and click on "Apply and Close"
	 * 6. Now "java.awt.*" PACKAGE is AVAILABLE to USE.
	 * 
	 */
	
	
	/* Whenever you want to communicate with the WINDOWS BASED COMPONENT, 
	 * MEANING A FILE UPLOAD OR DOWN LOAD we use ROBOT CONCEPT*/
	
	// FILE UPLOAD
	// DOWN LOAD 
	
	/* FILE UPLOAD */ 
	
	// FILE UPLOAD will be done in 2 ways
	
	// Using SELENIUM
	// Using ROBOT
	
	
	
	/* Using ROBOT */
	
	/* REQUIREMENT
	 * 
	 * Before RUNNING the CODE, COPY the "FILE PATH MANUALLY", D:\googlelogo.png(NO "" quotes placed)
	 * then only the CONTENT will be AVAILABLE to be PASTED into the SYSTEM
	 * by USING the "VIRTUAL KEY" board actions. 
	 *  
	 *  */
	
	// Open Browser
	
	@Test
	public void upLoadFile() throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		// Login 
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000); 
		
		// Intentionally I am making it to wait, otherwise the program RUNS very FAST.
		// I want to see whether it is clicked on that particular Element
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
		
		System.out.println("Employee Id:" + id); 
		
		WebElement element = driver.findElement(By.id("photofile"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		
		Thread.sleep(5000);
		
		// The below FUNTIONALITY "File Path" should be 1st COPIED MANUALLY
		// and PASTE into the WINDOWS
		// based COMPONENT WINDOW, which is 'VK_CONTROL, VK_V',
		// and 2 times tab, 'VK_TAB' and FINALLY press 'ENTER' button 'VK_ENTER' 
		
		Robot robot = new Robot();
		
		/* WHEN DO WE USE "ROBOT METHOD"?*/
		
		// WHEN THE BROWSER CONTROL "type" IS NOT EQUALS TO "FILE" or 
		// "WHEN THERE IS NO "type" FILED AT ALL".
		
		// WHENEVER YOU WANT TO PERFORM ANY "KEY BOARD ACTIONS" WE USE "ROBOT CLASS",
		// WHICH COMES FROM "java.awt"
		
		// YOU NEED TO CREATE AN "OBJET FOR "ROBOT CLASS"
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// Whenever you want to perform the Key Board ACtions, 1st you need to PRESS the KEY,
		// which is 'keyPress'. 
		// AFTER every 'keyPress' you need to 'Release the Key', which is 'keyRelease'
		
		// 'robot' is REFERENCE variable, type in ''keyP' and hit ctrl space bar, 
		// select 'keyPress(int keycode); void-Robot', 
		// in the PARANTHESIS, type in 'KeyE' and hit ctrl space bar, 
		// select 'KeyEvent-jav.awt.event',
		// Put a DOT and type in 'VK_C', select 'VK_CONTROL',
		// "VK" stands for VIRTUAL KEY.
		
		// Any "KEYBOARD ACTIONS" WE USE "keyPress and KeyRelease" ARE 
		// considered as one Action complete.
				
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		// BEFORE RUNNING THE PROGRAM MAKE SURE YOU SHOULD “COPY THE FILE PATH MANUALLY” 
		// THEN ONLY IT WILL BE THERE IN YOUR SYSTEM OTHERWISE THE SYSTEM WON’T PASTE THE CONTENT 
		// WHILE RUNNING THE PROGRAME. THE FILE PATH SHOULD BE 
		// FOR EXAMPLE D:\googlelogo.png(NO "" quotes placed). there should be only ONE FORWARD SLASH.
		// You need to manually write the FILE PATH in Note Pad.
		
		
		// Logout
		
		driver.findElement(By.id("welcome")).click();
		
		// driver.findElement(By.linkText("Logout")).click();
		
		// SOMEHOW THIS PIECE OF CODE IS NOT WORKING, VERYFIED WITH SRIRAM IT IS CRROECT BUT
		// STILL GETTING THE ERROR
		
		// Select the CONTENT and "CTRL C"
		
		// Close Browser
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
	
	

}
