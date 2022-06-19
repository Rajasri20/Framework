package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDnDeSeleTest {

		public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			
			driver.switchTo().frame("iframeResult"); // Frames is required to run the below
			
			WebElement lastCars = driver.findElement(By.id("cars"));
			
			Select selectRef = new Select(lastCars);
			
			System.out.println(selectRef.isMultiple()); // The Drop down is Multi so displayed TRUE in console
			
			// All these are part of Select Class Method and Should be Used for MULTI SELECTION DROP DOWN. 
			// Make Sure that The CONTROL must be of SELECT Tag on the WebPage.
			// To select MORE THAN ONE OPTIONS AT A TIME from the drop down SendKeys() method won't work. 
			// You need to USE below Methods
			// 1. deselectByindex()  // Index meaning 1st one, second one, 3rd one etc, Index starts with ZERO
			// 2. deselectByVisibleText() // based on the text Visible in the drop down
			// 3. deselectByValue() // on the WEB PAGE, Select a particular value from the Drop down Right click Inspect from the HTMLselect tag choose the particular CONTROL value   
			
			
			selectRef.selectByIndex(0); // No quotation marks are used around any Index number 
			
			Thread.sleep(2000);
			
			selectRef.selectByVisibleText("Opel");
			
			Thread.sleep(2000);
			
			selectRef.selectByValue("audi");
			
			Thread.sleep(2000);
			
			
			// DeSelection methods are only applicable for Multi Selection Drop downs only not for Single selection drop downs
			 
			selectRef.deselectAll();
			
			Thread.sleep(2000);
			
			selectRef.deselectByIndex(0);  
			
			Thread.sleep(2000);
			
			selectRef.deselectByVisibleText("Opel");
			
			Thread.sleep(2000);
			
			selectRef.deselectByValue("audi");
			
			Thread.sleep(2000);
			
			driver.quit();

	}

}
