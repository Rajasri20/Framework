package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDnSeleByVisblTxtTest {

public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			
			driver.switchTo().frame("iframeResult"); // Frames is required to run the below
			
			WebElement lastCars = driver.findElement(By.id("cars"));
			
			Select selectRef = new Select(lastCars);
			
			// SelectByVisibleText() // based on the text Visible in the drop down
			
			selectRef.selectByVisibleText("Volvo");
			
			Thread.sleep(2000);
			
			selectRef.selectByVisibleText("Saab");
			
			Thread.sleep(2000);
			
			selectRef.selectByVisibleText("Opel");
			
			Thread.sleep(2000);
			
			selectRef.selectByVisibleText("Audi");

			Thread.sleep(2000);
			
			driver.quit();
	}

}
