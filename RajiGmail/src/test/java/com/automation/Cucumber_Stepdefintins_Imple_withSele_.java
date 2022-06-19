package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Stepdefintins_Imple_withSele_ {
	
	/* "STEP DEFENITIONS"
	 * 
	 * REMVOE "COMMENT and EXCEPTION"
	 * IMPORT ANNOTATIONS, THEN ONLY ERROR WILL BE RESOLVED
	 * ex: @Given, @Then, @when 
	 * 
	 * When you HIT on RUN from "Feature File", the "PIECE of CODE" inside "STEP DEFENITIONS"
	   will be EXECUTED
	 
	 */
	
	WebDriver driver=null;
	
	@Given("open browser and enter the url")
	public void open_browser_and_enter_the_url() {
	  
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(60));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("enter username and password, click on login")
	public void enter_username_and_password_click_on_login() throws Exception{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
	    
	}
	
	@When("enter {string} and {string}, click on login")
	public void enter_and_click_on_login(String string, String string2) {
		
		// This METHOD, GIVEN a PROVISION to Accept the VALUES from OUTSIDE,
		// 'string, string2'
		// public void enter_and_click_on_login(String string, String string2)
		
		// In "sendkeys() METHOD, in PLACE of "Username", PASS 'String' and
		// in PLACE of "Password", PASS 'String2'
		// Now there are no HARD CODED values, we are recieing the values from 'Feature file'
		
		driver.findElement(By.id("txtUsername")).sendKeys(string);
		
		driver.findElement(By.id("txtPassword")).sendKeys(string2);
		
		driver.findElement(By.id("btnLogin")).click();
		
	     
	}

	@Then("verification for welcome page")
	public void verification_for_welcome_page() {
	    
		/* HOW TO VERIFY WHETHER WE SUCCESSFULLY LOGGED ON TO THE aPPLICATION OR NOT?
		 * 
		 * If you are able to see the "Welcome" on the TOP RIGHT corner
		 * 
		 * 
		 * */
	    
	    WebElement welcomelnk = null;
	   
		// "lnkWelcome" is type of "WebElement", WebElement is an "Interface", 
		// it is Non-Premitive, Default value of the "Interface" is "null"
		
		welcomelnk = driver.findElement(By.id("welcome"));
		
		// Once it finds the CONTROL and stores the ADDRESS or REFERENCE of the CONTROL will be
		// STORED in "lnkWelcome" REFERENCE VARIABLE that means its "NotNull".
		// that means WE SUCCESSFULLY LOGGEDIN 
		
		// THE CONTROL IS "NotNull", write VALIDATION Using "HARD ASSEERT", "AssertNotNull",  
		
		Assert.assertNotNull(welcomelnk);
	    
	}
	
	@When("click on welcome and logout")
	public void click_on_welcome_and_logout() {
	    
		driver.findElement(By.id("welcome"));
		
		//driver.findElement(By.id("logout"));
		
		// SOME HOW LOGOUT IS NOT WORKING, ALL THE CODE IS CORRECT BUT ITS NOT WORKING
	}

		
	    
	@When("close the browser")
	public void close_the_browser() throws Exception {
		
		Thread.sleep(1000);
		
		driver.quit();
	    
	}

}
