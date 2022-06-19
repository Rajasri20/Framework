package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriExecuLan_Style_BordrHighLit_T {

	public static void main(String[] args) throws Exception {
		
		/* The Requirement is, "Highlight the DOB Text Box Field Border with Red color and 
		 * Solid or Dotted or 3d and with 2pxl thickness*/ 
		
		// There is no Strait Forward Method to change the "Control Border into red ", in "SELENIUM" 
		// we have to Use "JS Language" Only.
				
		// 1st Find The Control, then using the "style.border='2px solid red" method, which belongs to JSEL

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.thepancard.com/");
		
((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.border='2px solid red';");

// ((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.border='2px dotted red';");

// ((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.border='2px 3d red';");

// We can also write this by Using Selenium(findEelemt)+JSEL(style.border='2px solid red) but we are using
//directly JSEL 

// Go to 'Elements' tab find the control and copy it 
// Click on 'Console', follow below steps

// 'document' is nothing but the Browser, which is highlighted when you type in "document".
// 'getElementById' is, find control based on "id" 
// 'style.border' is, thickness of the 'Border' 
// '2px' line style
// 'solid red' line color



		Thread.sleep(5000);

		driver.quit();

	}

}
