package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_Sync_ImpliWait_Btnclik_CtrllNotVisble {

	public static void main(String[] args) throws Exception {
		
		/* The Requirement is once the "PAGE IS LOADED and during the 
		 * "Your Internet speed is Displaying"", the REQUIRED ELEMENT 
		 * "Show More Info" Button NOT YET VISIBLE but already the Button is PRESENT
		 
		 /* HOW TO KNOW WHETHER THE BUTTON IS PRESENT OR NOT? 
		 
		 * Once the PAGE Load and Internet speed display is done, "Show More Info" Button displays  
		 * Right click on the button, Inspect, you will see element with 
		 * "id=show-more-details-link", now
		 * Refresh the Browser, still the Above tag is PRESENT but BUTTON is not VISIBLE, 
		 * which means ELEMENT is PRESENT but NOT VISIBLE
		 *     
		 * WE ARE INFORMING THE DRIVER TO WAIT FOR SOMETIME  
		 * TO DISPLAY THE REQUIRED "Show More Info" Button ELEMENT"*/
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/* USES of "implicitlyWait()" Method*/
		
		/* "implicitlyWait()" Method is used for "WebElements" Only*/
		/* "implicitlyWait()" Method is Applicable Throughout the "driver" */
		/* If the Control is NOT PRESENT or the Control is NOT VISIBLE in both the cases 
		 	"implicitlyWait()" Method can wait*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

		driver.get("https://fast.com/");
		
		driver.findElement(By.id("show-more-details-link")).click();
		
		// The above ELEMENT is PRESENT but NOT VISIBLE. 
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
