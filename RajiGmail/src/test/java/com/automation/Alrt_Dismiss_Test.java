package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alrt_Dismiss_Test {
	
	//Alert Methods

		// accept() ... Click on OK BUTTON on the POPUP
		// dismiss() ... Click on CANCEL BUTTON on the POPUP
		// getText() ... Gets the TEXT from the POPUP
		// sendKeys() ... To enter the data on the POPUP
	
	// dismiss() ... Click on CANCEL BUTTON on the POPUP

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		
		driver.findElement(By.linkText("Show Confirm")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
