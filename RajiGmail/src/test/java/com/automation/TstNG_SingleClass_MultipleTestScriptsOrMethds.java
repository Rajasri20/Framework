package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_SingleClass_MultipleTestScriptsOrMethds {
	
	/* WRITING 3 SCRIPTS or METHODS, "ADD EMPLOYEE, EDIT EMPLOYEE, DELETE EMPLOYEE" IN ONE CLASS FILE */
	
	// There are MULTIPLE "@Test" METHODS are there, 
	// So need to MENTION the PRIORITY, which "@Test" METHOD should be RUN first.
	// EX: @Test(priority = 1).
	
	// IF YOU DON'T MENTION THE PRIORITY ORDER, 
	// BASED "METHODS ALPHABETICAL ORDER" IT WILL EXECEUTE.
	// In our case, after Adding the Employee it will Delete the employee, if it is Deleted
	// how can we Edit the employee? That is why mentioning the PRIORITY is very IMPORTANT  
	

	WebDriver driver = null;

	// Open Browser

	@BeforeTest

	public void openBrowser() {

		// Method Name should start with "Lower case and next word followed by Upper
		// case"

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	// Login

	@BeforeMethod

	public void login() throws Exception {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		Thread.sleep(3000);

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		Thread.sleep(3000);

		driver.findElement(By.className("button")).click();

		Thread.sleep(3000);

	}
	
	
	//  Add Employee
	
	@Test(priority = 1) // Should START with lower case, 'prio' hit ctrl space bar and select it
	public void addEmployee() throws Exception {
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
	}

	// Edit Employee

	@Test(priority = 2)
	public void editEmployee() throws Exception {
		driver.findElement(By.linkText("Srikrishna")).click();

		// Now find the control for "displayed Name"(Which we searched for "Srikrishna
		// A")
		// And Clicks on it.

		driver.findElement(By.id("btnSave")).click();

		// control for EDIT

		Thread.sleep(2000);

		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Radha");

		// LastName Edited to Radha

		driver.findElement(By.id("btnSave")).click();

		// clicks on save

	}
	

	//  Delete Employee
	
	@Test(priority = 3)
	public void deleEmployee() throws Exception {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Srikrishna A");

		// After clicking on PIM, to SEARCH the "Employee Name"
		// we nee to find control for "Employee Name", Above control was found, click on
		// it

		driver.findElement(By.id("searchBtn")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("ohrmList_chkSelectAll")).click();

		// Find check box(check belongs to "Id" field) Control to select

		Thread.sleep(2000);

		driver.findElement(By.id("btnDelete")).click();

		// Deletes the selected name

		Thread.sleep(2000);

		driver.findElement(By.id("dialogDeleteBtn")).click();

		// On the pop up click OK
	}
	

	// Logout

	@AfterMethod

	public void logout() {

		driver.findElement(By.id("welcome")).click();

	}
	
	

	// Close Browser

	@AfterTest

	public void closeBrowser() throws Exception {

		Thread.sleep(2000);

		driver.quit();

	}

}
