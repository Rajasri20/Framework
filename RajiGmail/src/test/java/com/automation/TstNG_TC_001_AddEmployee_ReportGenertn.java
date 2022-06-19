package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_TC_001_AddEmployee_ReportGenertn {
	
	/* Writing AddEmployee Functional Test Case using Selenium 
	 * Adding TestNG Annotation and Implementation
	 * Report Generation*/
	
	@Test
	public void addEmployee() throws Exception {
		// Method Name should start with "Lower case and next word followed by Upper case" 
		
		// NOW REMOVE THE CODE FROM THE MAIN METHOD AND CREATE NEW METHOD,
		// ON THE TOP UNDER NEW METHOD PASTE IT.
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
		
		// One of the Capabilities of the "TestNG" is 
		// Once the program is RUN, it will generate the "REPORT",
		// click on "TNG results" tab in console.
		// To See the Reports, RIGHT CLICK on the PROJECT(Gmail) on top, 
		// RIGHT CLICK select REFRESH, now scroll down and click on "test-output" folder,
		// now click on "emailable-reports.html" it OPENS in NEW WINDOW,
		// copy paste the link in Browser OR
		// RIGHT CLICK on the "emailable-report.html", select "Open With" and 
		// now click on "Web Browser", REPORT will be OPENED in Browser.
		// The REport shows you how many scripts are passed or failed.
		// This report will be generated only when we USE "TestNG" 
		
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
		
		// Intentionally I am making it to wait, otherwise the program RUNS very FAST.
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
		
		System.out.println("Employee Id:" + id); 
		
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

}
