package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//defaultContent()Method

public class Frames_DefaltContnt_Test {

public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(0); // switches to 1st FRAME and finds the below CONTROL
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent(); 
		
		// After it clicks on the above or 1st CONTROL, 
		//it must exit from the 1st CONTROL and then go to the MAIN HTML DOCUMENT, then it SWITHES to 2nd FRAME.
		//it can not directly Switch from 1st control to 2nd Control, 
		//without using defaultContent()method if you run the programe you get an exception error. Because the below cntrol is in 2nd frame 
		//here exiting to MAIN HTML DOCUMENT is called defaultContent()
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1); // Now it switches from 1st frame to 2nd FRAME and finds the below CONTROL 
		
		driver.findElement(By.linkText("TakesScreenshot")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(2); // Now it switches from 2nd FRAME to 3rd FRAME and finds the below CONTROL
		
		driver.findElement(By.linkText("ChromeDriver")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	
	}

}
