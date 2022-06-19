package com.automation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_FileUpLoad_UsingSelenium_T {

	public static void main(String[] args) throws Exception {
		
		/* Whenever you want to communicate with the WINDOWS BASED COMPONENT, 
		 * MEANING A FILE UPLOAD OR DOWN LOAD we use ROBOT CONCEPT*/
		
		// FILE UPLOAD
		// DOWN LOAD 
		
		/* FILE UPLOAD */ 
		
		// FILE UPLOAD will be done in 2 ways
		
		// Using SELENIUM
		// Using ROBOT
		
		/* Using SELENIUM */
		
		// During the FILE UPLOAD process 
		// if we see the Selenium Control(on choose file, right click inspect) 
		// as "type = file" then using Selenium "SendKeys Method" we can UPLOAD a FILE.
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		
		// if the "PAGE" is NOT YET LOADED, wait max of 1mins
		// 'in page load you need to mention Duration and the the time.
		// After 'Duration' put a dot and select ofminutes()method 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60));
		
		// if the "Element" is NOT YET "Present or Visible" wait max 60 secs
	
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/");
		
WebElement lnkupload = driver.findElement(By.xpath("//a[@title='Click to upload your resume']"));
		
 // 'Anchor Tag" with "title" as an ATTRIBUTE.

		lnkupload.click();
		
		// Click on "UPLOAD RESUME"
		
		WebElement fileToupload = driver.findElement(By.id("file-upload"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", fileToupload);
		
		// On next pop upClick on "FILE TO UPLOAD", which opens 
		// your WINDOWS BASED COMPONENT window
		
		fileToupload.sendKeys("D:\\TestRes");
		 
		Thread.sleep(5000);
		
		driver.quit();

	}

}
