package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecutorActinsSendKeysFailedTest {

	public static void main(String[] args) throws Exception {
		
		// When do we use JavaSriptExecutor?
		
	// When "FAILED TO FULFIL THE REQUIREMENT BY USING 'WEBEMENT SENDKEYS AND ACTION SENDKEYS METHODS'
				
				// The 'Requirement' is "Enter the User Chosen Interest Rate".
				
				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

				driver.get("https://emicalculator.net/");
				
	// USING ACTION CLASS SENDKEYS METHOD
				
				WebElement txtLoanInterest = driver.findElement(By.id("loaninterest"));
				
				Actions actions = new Actions(driver);
				
				actions.sendKeys(txtLoanInterest, "12.5").perform(); // select 2nd sendKeys method
				
				// When you run the programe, the desired ""Interest Rate" is added the 'Existing' one,
				// which is called 'Appended". The Existing one was '7.5' and the desired is '12.5', on the
				// Browser it shows like this "7.512.5", which is not correct. 
				// It should enter only"12.5".
				
	/*"ACTION CLASS SENDKEYS METHOD" method failed to enter(perform the action) the "Desired Data"*/
				
		/*WE SHOULD USE JAVSCRIPTEXECUTER TO FULFIL THE REQUIREMENT*/
				
				Thread.sleep(5000);

				driver.quit();

	}

}
