package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEleMethRadioBtnTest {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		// 7. isSelected()To know the status of the Radio button or Check Box by default selected or not. 
		//    This method is only used for Radio buttons or check boxes only
		//    This WEBELEMENT METHOD RETURNS A BOOLEAN VALUE, TRUE OR FALSE. 
		// 	  IF IT IS SELECTED RETURNS TRUE OR IF IT IS NOT SELECTED RETURNS FALSE.  
		
		System.out.println(driver.findElement(By.id("rblCategory_0")).isSelected());
		
		// by default "Individual" is selected so it returned the value as TRUE
		
		// Army is the next Radio button, which has multiple actions to perform so we need Reference Variable "RadioBtnArmy"  
		
		WebElement RadioBtnArmy = driver.findElement(By.id("rblCategory_1"));
		
		// by default "Army" is not selected so it returned the value as FALSE
		
		System.out.println(RadioBtnArmy.isSelected());
		
		Thread.sleep(2000);
		
		RadioBtnArmy.click(); // clicks on the Army 
		
		Thread.sleep(2000);
		
		System.out.println(RadioBtnArmy.isSelected());
		
		// Now "Individual" is selected so it returned the value as TRUE
		
		Thread.sleep(2000);
		
		driver.quit();	
	}

}
