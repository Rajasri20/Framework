package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxTst2 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		// If developer changes code in next releases it is hard to change the code in many places.
		// Instead of changing the code in multiple places and finding the Text box CONTROL too many times 
		// we need to go for Web element Method and create a reference variable 
		// so that the entered value or address is stored in the reference variable, 
		// for example, here the reference variable is "textBoxDOB" 
		// we can change the related control code in one place only. 
		// Instead of finding the Text box CONTROL too many times use Web Element method
		// When we run the code, the Expression evaluates from right to left, below Web Element 
		// finds the Control of "txtDOB" and stores the value of "Text Box" in "textBoxDOB Reference Variable"
		
		WebElement textBoxDOB = driver.findElement(By.id("txtDOB"));
		
		textBoxDOB.sendKeys("02/23/1977");
		
		Thread.sleep(2000);
		
		// After entering the data in the Text Field, get the Data from the TextBox by using getAttribute() Method
		// by passing the String type of Parameter as "value" (use lower case letter 'v') 
		// and display/Print in Console by Using System.out.println() 
		
		System.out.println(textBoxDOB.getAttribute("value"));
		
		Thread.sleep(2000);
		
		textBoxDOB.clear();
		
		Thread.sleep(2000);
		
		driver.quit();

		}
	}
