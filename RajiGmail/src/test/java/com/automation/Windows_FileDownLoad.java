package com.automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_FileDownLoad {
	/* Requirement 
	 * 
	 * "DownLoad a FILE" from Seleniumdev.com
	 * 
	 * 
	 * */
	
		@Test
		public void downLoad()throws Exception {
			
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
			
			driver.get("https://www.selenium.dev/downloads/");
			
			driver.findElement(By.linkText("4.2.1")).click();
			
			Thread.sleep(5000);
			
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_LEFT);
			robot.keyRelease(KeyEvent.VK_LEFT);
			
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			// When you click on "4.2.1" to Down Load, "Window based Component" displays
			// To SAVE the file, You should use KEY BOARD "LEFT ARROW" and 
			// KEY BOARD "ENTER" in your KEY BOARD. 
			
			driver.quit();
	
		}

}
