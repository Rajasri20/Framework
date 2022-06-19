package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxTest {

	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.thepancard.com/");
	
	driver.findElement(By.linkText("Apply New PAN Card")).click();
	
	// In the Text Field enter the data by using SendKeys() Method
	
	driver.findElement(By.id("txtDOB")).sendKeys("04/20/1983");
	
	Thread.sleep(3000);
	
	// After entering the data in the Text Field, get the Data from the TextBox by using getAttribute() Method
	// by passing the String type of Parameter as "value" (use lower case letter 'v') 
	// and display/Print in Console by Using System.out.println() 
	
	System.out.println(driver.findElement(By.id("txtDOB")).getAttribute("value"));
	
	driver.findElement(By.id("txtDOB")).clear();
	
	driver.quit();

	}

}
