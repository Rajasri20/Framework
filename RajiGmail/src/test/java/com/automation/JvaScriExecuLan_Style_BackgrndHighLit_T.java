package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriExecuLan_Style_BackgrndHighLit_T {

	public static void main(String[] args) throws Exception {
	
		/* The Requirement is, "Highlight the DOB Text Box Field Background with Green color*/
		
		// There is no Strait Forward Method to change the "Control Background into Green", in "SELENIUM" 
		// we have to Use "JS Language" Only.
				
		// 1st Find The Control, then using the "style.background='green'" method, which belongs to JSEL

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.thepancard.com/");
		
((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.background='green';");

// We can also write this by Using Selenium(findEelemt)+JSEL(style.background='green') but we are using
// directly JSEL 

// Go to 'Elements' tab find the control and copy it 
// Click on 'Console', follow below steps

// 'document' is nothing but the Browser, which is highlighted when you type in "document".
// 'getElementById' is, find control based on "id" 
// 'style.background' is, background color of the text box 

		Thread.sleep(5000);

		driver.quit();

	}

}
