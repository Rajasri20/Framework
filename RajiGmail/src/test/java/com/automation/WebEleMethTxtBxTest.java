package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEleMethTxtBxTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		WebElement DOBtextfield = driver.findElement(By.id("txtDOB")); 
		
		// "DOBtextfield" is a reference variable, which is created by YOU. 
		// If there are multiple actions to be performed then create REFERENCE VARIABLE AND STORE IN WebElement. 
		// "txtDOB" is the control.Here the expression evaluates from Right to Left 
		// so the address of the Control is stored in the "Reference Variable" "DOBtextfield" 
		
		//WEBELEMENT METHODS:Method meaning Perform an action or a Task
		
		// 1. isDisplayed()MEANING IS ISVISIBLE WEBELEMENT METHOD RETURNS A BOOLEAN VALUE, TRUE OR FALSE
		//    IF IT IS SELECTED RETURNS TRUE OR IF IT IS NOT SELECTED RETURNS FALSE.
		//    THIS METHOD CAN BE USED FOR ANY TYPE OF CONTROL LIKE "TEXT FIELD, RADIO BUTTON OR CHECK BOX"
		
		// 2. isEnabled() MEANING THE WHETHER THE "RADIO BUTTON, CHECKBOX OR TEXT FIELD" IS ENABLED OR NOT. 
		//    THIS METHOD CAN BE USED FOR ANY TYPE OF CONTROL LIKE "TEXT FIELD, RADIO BUTTON OR CHECK BOX"
		//    IT IS A WEBELEMENT METHOD RETURNS A BOOLEAN VALUE, TRUE OR FALSE
		//    IF IT IS SELECTED RETURNS TRUE OR IF IT IS NOT SELECTED RETURNS FALSE.
		
		// 3. getAttribute()WEBELEMENT METHOD GETS THE CONTENT WHICH IS ENTERED IN THE CONTROL. EX: TEXT/dATE
		
		// 4. clear() WEBELEMENT METHOD CLEARS THE CONTENT WHICH IS ENTERED IN THE CONTROL. EX: TEXT/dATE
		
		// 5. getLocation()MEANING GETS THE LOCATION OF 'X' AXIS getX() AND 'Y' AXIS getY()
		
		// 6. getSize()WEBELEMENT METHOD GETS THE height and width OF THE PARTICULAR CONTROL. getHeight(),getWidth( 
		
		// 7. isElected()MEANING IS the Radio button by default selected or not. WEBELEMENT METHOD RETURNS A BOOLEAN VALUE, TRUE OR FALSE 
		
		System.out.println(DOBtextfield.isDisplayed());
		
		// isDisplayed meaning is visible. Is the "txtDOB" control is Visible/Displayed in the browser.
		
		Thread.sleep(2000);
		
		System.out.println(DOBtextfield.isEnabled());
		
		// Is the "txtDOB" control isEnabled in the browser.
		
		DOBtextfield.sendKeys("01/01/1991"); // sendKeys webElement method is used for to enter the data  
		
		System.out.println(DOBtextfield.getAttribute("value"));
		
		Thread.sleep(2000);
		
		DOBtextfield.clear();
		
		System.out.println(DOBtextfield.getLocation().getX());
		
		System.out.println(DOBtextfield.getLocation().getY());
		
		System.out.println(DOBtextfield.getSize().getHeight());
		
		System.out.println(DOBtextfield.getSize().getWidth());
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
