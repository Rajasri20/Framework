package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOrDrpDnSngleSelTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		WebElement lstDOBProof = driver.findElement(By.id("proof_dob")); // This is a SINGLE SELECTION DROPDOWN 
		
		// To know the particular control or Drop down is a "Single Selection or Multi Selection drop down we use isMultiple()"
		// isMultiple() method is part of "Select Class Method", isMultiple() returns a Boolean value, 
		// if it is Single Selection Drop down it Returns FALSE, if it is Multi Selection Drop down it Returns True
		// Without SELECT CLASS OBJECT we can not access isMultiple() method
		// To invoke/access isMultiple() method we should create SELECT CLASS OBJECT."selectReference" is a reference variable.
		// While SELECT object creation, after writing NEW when you are choosing SELECT by pressing Control space bar after SELECT you need choose WEBELEMENT, 
		// this will choose the CONTROL value from the above WEBELEMENT(which is created in the above line 
		
		Select selectReference = new Select(lstDOBProof);
		
		System.out.println(selectReference.isMultiple());
		
		lstDOBProof.sendKeys("Passport"); 
		
		//By using sendKeys() method we can enter the data in a Text Field and to select value from a Drop down.
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
