package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDnSeleByIndxTest {

		public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			
			driver.switchTo().frame("iframeResult"); // Frames is required to run the below
			
			WebElement lastCars = driver.findElement(By.id("cars"));
			
			Select selectRef = new Select(lastCars);
			
			// SelectByindex()  // Index meaning 1st one, second one, 3rd one etc, Index starts with ZERO
			
			selectRef.selectByIndex(0);
			
			Thread.sleep(2000);
			
			selectRef.selectByIndex(1);
			
			Thread.sleep(2000);
			
			//selectRef.selectByIndex(2); If the requirment says only '0'1'3, Then Control goes to Index 3, 
			// then the output would be "Volvo, Saab  and Audi" 
			
			Thread.sleep(2000);
			
			selectRef.selectByIndex(3);
			
			Thread.sleep(2000);
			
			driver.quit();

	}

}
