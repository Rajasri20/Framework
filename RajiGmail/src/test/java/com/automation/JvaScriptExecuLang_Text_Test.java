package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecuLang_Text_Test {

	public static void main(String[] args) throws Exception {

		// When do we use JavaSriptExecutor?

		// When "FAILED TO FULFIL THE REQUIREMENT BY USING 'WEBEMENT SENDKEYS AND ACTION
		// SENDKEYS METHODS'

		// The 'Requirement' is "Enter the User Chosen "TEXT" in Interest Rate TEXT BOX".

		/* ENTER "TEXT" BY USING JAVASCRIPTEXECUTOR LANGUAGE  */
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
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://emicalculator.net/");

((JavascriptExecutor)driver).executeScript("document.getElementById('loaninterest').value='12.5';");
	
	//  document.getElementById('remember@true').click();
	// "Object...args" parameter is optional here, we already have complete script so not using this.


	// 'Find the element' and 'Perform the action' both belong to "JAVASCRIPTEXECUTOR LANGUAGE"

	// Find the element = "document.getElementById('loaninterest') and
	// Perform the action = .value='12.5';")
	
		Thread.sleep(5000);

		driver.quit();
	}

}
