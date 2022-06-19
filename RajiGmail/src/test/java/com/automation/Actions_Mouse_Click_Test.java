package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Mouse_Click_Test {
	
public static void main(String[] args)throws Exception {
	
	//Actions Class... if it is Custom control or click, will go for Actions click(), if it is a regular click then can use WebElement Click() 
	
		// 1. Mouse Actions
		// 2. Keyboard Actions ... also called Advance User Interactions

	//Actions Class Methods ..... IS used when Failed to click on using WebElement click() method, i.e, click()
	//then Actions Class Method should be used. 
	//After creating Actions class object we must specify "Perform()", then only it will click on the particular Control
	
	// Mouse Actions Methods

	// 1. click()
	// 2. doubleClick()
	// 3. drangAndDrop()
	// 4. clcikAndHold()
	// 5. release()
		
	
// Go to the Browser, Press F12 on your KEY BOARD, CONTROL window opens 
// then click on SPY ICON(which is the 1st icon. 
// Now go to the particular CONTROL or WEBELEMENT on the web page and click over there, 
// CONTROL RELATED or WEBELEMENT related HTML tag will be highlighted 
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.timesjobs.com/");
		 
		WebElement btnResume = driver.findElement(By.id("resumeFile_basic"));
		
		// btnResume.click(); // It is a WebElement type of Click() Method. If you are not able to Proceed with WebElement type of Click() Method
		// If you are not able to Proceed with WebElement type of Click()Method, go with "Actions Class Mouse Click()"
		// Using this Method we can click on the 'UploadResumebtn'. So we need to USE "Actions Class Mouse Click()" Method
		
		Actions actions = new Actions(driver);
		//To use Actions class you need to create an "Actions class Object", Actions of a 'Constructor' type
		// After hitting CTRL Space bar select Actions type should be of WebDriver type of parameter, so select 'WebDriver'(see code line 41 ) type as 'Driver
		
		actions.click(btnResume).perform(); // This click() method belongs to 'Actions Class'
		
		// To Execute 'Click', you have to call 'perform()' by the end
		
		actions.click(btnResume).build().perform(); // This expression is also valid
		//Click is of 'WebElement Target'(hit ctrl space bar you will this), here 'WebElement' is 'btnResume'
		//After click we should not forget to invoke 'perform()' method to paerform the action, otherwise it wont click on 'upload your Resume' or 'btnResume'  

		Thread.sleep(5000);

		driver.quit();

	}

}
