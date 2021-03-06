package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_TC_001_AddEmp_LogMesageInReportGen {
	/* REPORTER
	 * 
	 * To WTITE any CUSTOM MESSAGES in Default REPORT generated by TestNG, 
	 * you have to USE "REPORTER"   
	 * 
	 * "REPORTER" is a Class, which is coming from TestNG,
	 * "log" method is, To WTITE any MESSAGE in Default REPORT generated by TestNG, see below 
	 * 
	 * Reporter.log("ID:"+id);
	 * 
	 */
	
	
	 /* The REQUIREMENT is to RECORD "Employee ID" in TestNG REPORT 
	 * 
	 * Reporter.log("ID:"+id);
	 * 
	 */
	
	
	 /* TestNG REPORT 
	 * 
	 * Now RUN the Program, Click on  "emailable-report.html", 
	 * at end of the REPORT you will see "Messages" section, "Employee ID" is logged  
	 *
	 **/
	    
	
	
	@Test
	public void addEmployee() throws Exception {
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
		
		
		// Transaction or Add Employee

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Srikrishna");
		
		driver.findElement(By.id("lastName")).sendKeys("A");
		
		String id = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		System.out.println("Employee ID:" +id);
		
		// Stores the value in ID
		
		Reporter.log("ID:"+id);
		
		driver.findElement(By.id("btnSave")).click(); 
		
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
