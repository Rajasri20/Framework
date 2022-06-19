package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Scenario_Step_Hooks_ {
	
	/* Cucumber Scenario Level and Step Level Hooks
	 * 
	 * 1. @Before -> Scenario level hook
	 * 2. @BeforeStep -> Step level hook
	 * 3. @AfterStep -> Step level hook
	 * 4. @After -> Scenario level hook
	 * 
	 * 
	 * */
	
	
	/* "Scenario Level" HOOKs */
	
	// "When openBrowser and When closeBrowser" are pre-Requisits for all the 3 "Scenarios",
	// We don't have to write 3 times. "DELETE" them, now there is no STEPS for the above 2, 
	// Go to "Java File" and "DELETE step definition Annotations"
	// "@Given("openBrowser")" and "@When("closeBrowser")"
	// ADD "Scenario Level" HOOKs called "@Bfore" and @After Hooks
	
	// EVEN THOUGH THERE ARE NO STEPS IN FEATURE FILE, USING THE "@Bfore" and @After Hooks
	// AUTOMATICALLY CODE WILL BE EXECUTED
	
	
	/* "Step Level" HOOKs 
	 * 
	 * 
	 * */
	
	WebDriver driver=null;
	
	@Before
	public void open_browser() {
	    
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(60));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		
	}

	@When("login")
	public void login() throws Exception {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
	    
	}

	@When("addEmployee")
	public void add_employee() throws Exception {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Srikrishna");
		
		driver.findElement(By.id("lastName")).sendKeys("A");
		
		String id = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		System.out.println(id); 
		
		driver.findElement(By.id("btnSave")).click();
	    
	}

	@When("logout")
	public void logout() throws Exception {
		
		driver.findElement(By.id("welcome")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
	    
	}

	@After
	public void close_browser() throws Exception {
		
		Thread.sleep(2000);
		
		driver.quit();
	    
	}

	@When("editEmployee")
	public void edit_employee() throws Exception {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Srikrishna A");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(2000);
		
				
		driver.findElement(By.linkText("Srikrishna")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Radha");
		
		
		driver.findElement(By.id("btnSave")).click();
		
	    
	}

	@When("deleteEmployee")
	public void delete_employee() throws Exception {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(2000);
				
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Srikrishna A");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnDelete")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
		
	    
	}


}
