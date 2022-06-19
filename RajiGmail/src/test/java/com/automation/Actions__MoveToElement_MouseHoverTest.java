package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions__MoveToElement_MouseHoverTest {

	public static void main(String[] args)throws Exception {
	
		// 'moveToElement()' is nothing but 'mouseHover'
		
// The Requirement is, in the below website, 
// 1st 'Mouse Hover on 'Tracking' tab, options will be displayed, then click on 'E-Tracking' 

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dtdc.in/");
		
		WebElement mouseHoverLnkTracker = driver.findElement(By.linkText("Tracking"));
		
		Actions actions =new Actions(driver);
		
		actions.moveToElement(mouseHoverLnkTracker).perform(); 
		//'moveToElement' is nothing but 'mouseHover'. 
		// moveToElement(WebElement webElement), is of WebElement parameter
		
		Thread.sleep(2000);
		
		WebElement lnkETracker = driver.findElement(By.linkText("E-Tracker"));
		
		lnkETracker.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
