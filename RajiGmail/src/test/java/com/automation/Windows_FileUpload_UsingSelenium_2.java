package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_FileUpload_UsingSelenium_2 {
	/* Whenever you want to communicate with the WINDOWS BASED COMPONENT, 
	 * MEANING A FILE UPLOAD OR DOWN LOAD we use ROBOT CONCEPT*/
	
	// FILE UPLOAD
	// DOWN LOAD 
	
	/* FILE UPLOAD */ 
	
	// FILE UPLOAD will be done in 2 ways
	
	// Using SELENIUM
	// Using ROBOT
	
	/* Using SELENIUM */
	
	// During the FILE UPLOAD process 
	// if we see the Selenium Control(on choose file, right click inspect) 
	// as "type = file" then using Selenium "SendKeys Method" we can UPLOAD a FILE.
	
	
	/* FileUpLoad Using SELENIUM */
	
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
		
		driver.findElement(By.className("button")).click();
		
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
		
		driver.findElement(By.id("photofile")).sendKeys("D:\\googlelogo.png");
		
		// The CONTROL is "type="file"
		// So we use Selenum "sendKeys" method to UPLOAD a FILE
		
		Thread.sleep(5000);
		
		// Logout
		
		driver.findElement(By.id("welcome")).click();
		
		// driver.findElement(By.linkText("Logout")).click();
		
		// SOMEHOW THIS PIECE OF CODE IS NOT WORKING, VERYFIED WITH SRIRAM IT IS CRROECT BUT
		// STILL GETTING THE ERROR
		
		// Close Browser
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
