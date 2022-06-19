package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDnSeleByVlueTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult"); // Frames is required to run the below
		
		WebElement lastCars = driver.findElement(By.id("cars"));
		
		Select selectRef = new Select(lastCars);
		
		// SelectByValue() // on the WEB PAGE, Select a particular value from the Drop down Right click Inspect from the HTMLselect tag choose the particular CONTROL value   
		
		selectRef.selectByValue("volvo"); // For some reason its not accepting 1st one as Capital letters. The HTML was created by Shriram
		
		Thread.sleep(2000);
		
		selectRef.selectByValue("saab");
		
		Thread.sleep(2000);
		
		selectRef.selectByValue("opel");
		
		Thread.sleep(2000);
		
		selectRef.selectByValue("audi");

		Thread.sleep(2000);
		
		driver.quit();
	}

}
