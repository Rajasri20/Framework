package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KyBord_AutoSuggtn_Select2ndOptn_Test {

public static void main(String[] args) throws Exception {
		
		// "Auto suggestions or Auto Complete or Auto Catch". This KeyBoard action is not part of the 'Actions Class'

		// How to Select "Auto suggestions or Auto Complete or Auto Catch" from the Drop Downs
			
// The Requirement is go to the Browser, in 'From' Drop Down enter 'Hyderabad' 
// then it displays the 'Auto suggestions' select the "2nd Auto Suggestion" using 'KeyBoard Arrow' Down button 
									
			WebDriverManager.chromedriver().setup();
				
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();
				
			driver.get("https://www.apsrtconline.in/oprs-web");
					
			WebElement txtFrom = driver.findElement(By.id("fromPlaceName"));
				
			txtFrom.sendKeys("Hyderabad"); // enter data using sendKeys
			// here the 'sendKeys' of WebElement type, so no need to call perform() by the end
					
			Thread.sleep(2000);
					
			txtFrom.sendKeys(Keys.ARROW_DOWN); // your KeyBoard 'ARROW_DOWN' button. 'sendKeys' of WebElement type
// After entering 'Hyderabad', to complete the process it should select 'Auto Suggested' data,
// 1st it should use your KeyBoard 'ARROW_DOWN' button and then'Enter' button. 
// then it will select the 2nd option from the 'dropdown' 
			
			Thread.sleep(2000);
			
			txtFrom.sendKeys(Keys.ENTER);
				
			Thread.sleep(3000);
					
			driver.quit();

	}

}
