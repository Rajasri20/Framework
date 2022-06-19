package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_Sync_WebDriWait_Btnclik_CtrllNotVisble {

	public static void main(String[] args) throws InterruptedException {
		
		/* The Requirement is once the "PAGE IS LOADED and during the 
		 * "Your Internet speed is Displaying"", the REQUIRED ELEMENT 
		 * "Show More Info" Button NOT YET VISIBLE but already the Button is PRESENT
		 
		 /* HOW TO KNOW WHETHER THE BUTTON IS PRESENT OR NOT? 
		 
		 * Once the PAGE Load and Internet speed display is done, "Show More Info" Button displays  
		 * Right click on the button, Inspect, you will see element with 
		 * "id=show-more-details-link", now
		 * Refresh the Browser, still the Above tag is PRESENT in but BUTTON is not VISIBLE, 
		 * which means ELEMENT is PRESENT but NOT VISIBLE */    
		 
		// When we USE "Explicit" or "WebDriverWait" method WE SHOULD ALWAYS WRITE THE "findElememt..."
		// CODE after the "WebDriverWait" code. See below 
		// driver.findElement(By.id("show-more-details-link")).click(); is Written at the end
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://fast.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("show-more-details-link"))));
		
		// In the "ExpectedConditions" if you select "presenceOfElementLocated" you will get
		// "ElementNotInteractable exception" because 
		// here the Element is PRESENT and NOT YET VISIBLE", So you need to select
		// "visibilityOfElementLocated" method.
		// We are asking the 'driver' to wait until the Element is "VISIBLE"
		
		driver.findElement(By.id("show-more-details-link")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
