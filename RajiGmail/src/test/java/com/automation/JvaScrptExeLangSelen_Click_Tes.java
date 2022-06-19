package com.automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScrptExeLangSelen_Click_Tes {

	public static void main(String[] args) throws Exception {
		
		// When do we use JavaSriptExecutor?

				// When "FAILED TO FULFIL THE REQUIREMENT BY USING 'WEBEMENT SENDKEYS AND ACTION
				// SENDKEYS METHODS'

				// The 'Requirement' is ""CLICK ON A CHECKBOX".

				/* "CLICK ON A CHECKBOX" BY USING JAVASCRIPTEXECUTOR LANGUAGE  */
			/* JAVASCRIPTEXECUTOR LANGUAGE is a Browser side Language, It is completely an other Language */
				
				// 'Find the element' and 'Perform the action' both will be done in
				// "JAVASCRIPTEXECUTOR LANGUAGE" itself. No need to find Element by using "Selenium"
				
				/*STEPS*/ 
				
				// Go to the "ChromeBrowser", Inspect on 'Interest rate', 
				// copy the webElementId(any given attribute) from 'Elements' tab,
				// now click on 'Console', type in "clear();" press enter, if there is any data will be cleared.
				// Type in 'document', whole page will be highlighted, in JavaScript Executor Lang 
				// browser is called as "DOCUMENT".
				// now we need to find our 'control'
				// now place a Dot and type in 'getelem', "getElementById" will be highlighted, select it, 
				// in 'Parenthesis', in 'single quotes', place the 'copied id'(WebElement or Control id)
				// again place a Dot and write 'Value=' and in 'single quotes'(I WANT TO ENTER THE VALUE)
				// enter the 'Interest Rate', which is '12.5', 
				// BEFORE PRESSING ENTER, YOU WILL SEE THE EXIXTING INTEREST VALUE, BUT NOW 
				// Press enter, the 'Desired value' '12.5' will be displayed in 'Console' and 
				// has been entered in 'Interest Rate' filed.
				
				// Finally "JavaScript Executor Language code" looks like this,
				
				// document.getElementById('loaninterest').value='12.5';
				
				// Now press Key Board 'UP ARROW', same code will be displayed in an other line, 
				// 'Copy' it and paste in the 'Eclipse IDE'("String script" parameter)
		
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // not related to JSE Lang

		driver.manage().window().maximize();

		driver.get("https://my.microfocus.com/");
		
		
		/*WebElement Click Method*/
		
		// FAILED TO CLICK ON "REMEMBER ME CHECK BOX"
		
		
		// driver.findElement(By.partialLinkText("Login")).click();
		
		// driver.findElement(By.id("username")).sendKeys("srikrishna");
		
		// WebElement element = driver.findElement(By.id("remember@true"));
		
		// element.click();
		
		
		/*Actions Click Method*/
		
		// FAILED TO CLICK ON "REMEMBER ME CHECK BOX"
		
		// driver.findElement(By.partialLinkText("Login")).click();
		
		// driver.findElement(By.id("username")).sendKeys("srikrishna");
		
		// WebElement element = driver.findElement(By.id("remember@true"));
		
		// Actions actions = new Actions(driver);
		
		// actions.click(element).perform();
		
		
		/*USING JAVASCRIPTEXECUTOR*/
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		driver.findElement(By.id("username")).sendKeys("Rajasri");
		 
			
		WebElement element = driver.findElement(By.id("remember@true"));
		
	((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		 
		 // The above one is also CORRECT method  
	
	// Suppose in 'Object... args', is variable parameter args, any number of variables we can pass.
	// if there is one more variable before 'element' like 'null' then 
	// arguments[0] will be arguments[1], because our required one is 'element', 
	// which is place after 'null', see below
	
	// ((JavascriptExecutor)driver).executeScript("arguments[0].click()", null, element);
	
	
	// 'Find the element' belong tO 'Selenium'(element)
	// 'Perform the action' both belongs to "JAVASCRIPTEXECUTOR LANGUAGE"(click())
	// Both are combined in one line of code.
	
		Thread.sleep(5000);

		driver.quit();

	}

}
