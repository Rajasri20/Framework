package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecutorWebEleSnedKeysFailedTest {

	public static void main(String[] args) throws Exception {


		// When do we use JavaSriptExecutor?
		
	// When "FAILED TO FULFIL THE REQUIREMENT BY USING 'WEBEMENT SENDKEYS AND ACTION SENDKEYS METHODS'
		
		// The 'Requirement' is "Enter the User Chosen Interest Rate".
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://emicalculator.net/");
		
		// USING WEBELEMENT SENDKEYS METHOD
		
		WebElement txtLoanInterest = driver.findElement(By.id("loaninterest"));
		
		txtLoanInterest.clear();
		
		txtLoanInterest.sendKeys("12.5");
		
		// When you run the programe, the desired ""Interest Rate" is added the 'Existing' one,
		// which is called 'Appended". The Existing one was '7.5' and the desired is '12.5', on the
		// Browser it shows like this "7.512.5", which is not correct. 
		// it should enter only"12.5".
		
		/*what can we do to enter the "Desired Data"?*/
		
		// Clear the existing Content and enter the "Desired Data"
		// now write "txtLoanInterest.clear();"  
		
		// Run the Programe.
		// Now it will add the "Desired Interest to the "Default Interest" rate.
		// Default is 5 and Desired is 12.5, shows like this "512.5"(Appended). 
		// THIS THE DEAULT NATURE OF "THAT PARTICULAR CONTROL"
		// Even though after clearing the "previous one" we could not enter the "Desired Data"
		// WebElement "clear()" Method also Failed.
		
	/*"WebElement sendKeys" method failed to enter(perform the action) the "Desired Data"*/
		
	/*WE SHOULD USE JAVSCRIPTEXECUTER TO FULFIL THE REQUIREMENT*/

		Thread.sleep(5000);

		driver.quit();
		

	}

}
