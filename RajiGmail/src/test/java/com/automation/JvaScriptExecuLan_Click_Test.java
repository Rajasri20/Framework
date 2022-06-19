package com.automation;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecuLan_Click_Test {

	public static void main(String[] args) throws Exception {

		// When do we use JavaSriptExecutor?

		// When "FAILED TO FULFIL THE REQUIREMENT BY USING 'WEBEMENT SENDKEYS AND ACTION
		// SENDKEYS METHODS'

		// The 'Requirement' is ""CLICK ON A CHECKBOX".

		/* "CLICK ON A CHECKBOX" BY USING JAVASCRIPTEXECUTOR LANGUAGE */
		/*
		 * JAVASCRIPTEXECUTOR LANGUAGE is a Browser side Language, It is completely an
		 * other Language
		 */

		// 'Find the element' and 'Perform the action' both will be done in
		// "JAVASCRIPTEXECUTOR LANGUAGE" itself. No need to find Element by using
		// "Selenium"

		/* STEPS */

		// Go to the "FirefoxBrowser", Inspect on 'Check box',
		// copy the webElementId(any given attribute) from 'Elements' tab,
		// now click on 'Console', type in "clear();" press enter, if there is any data that
		// will be cleared.
		// Type in 'document', whole page will be highlighted, in JavaScript Executor
		// Lang browser is called as "DOCUMENT".
		// now we need to find our 'control'
		// now place a Dot and type in 'getelem', "getElementById" will be highlighted,
		// select it,
		// in 'Parenthesis', in 'single quotes', place the 'copied id'(WebElement or
		// Control id)
		// again place a Dot and write 'cli' select the 'Click()' by the end semicolon(;)
		// BEFORE PRESSING ENTER, YOU WILL SEE CHECK BOX NOT CHECKED, 
		// Press enter, CHECK BOX IS CHECKED now
		

		// Finally "JavaScript Executor Language code" looks like this,

		// document.getElementById('remember@true').click();

		// Now press Key Board 'UP ARROW', same code will be displayed in an other line,
		// 'Copy' it and paste in the 'Eclipse IDE'("String script" parameter)

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // not related to JSE Lang

		driver.manage().window().maximize();

		driver.get("https://my.microfocus.com/");
		
		/* USING JAVASCRIPTEXECUTOR LANGUAGE */

		((JavascriptExecutor)driver).executeScript("document.getElementById('remember@true').click();");

		// 'Find the element' and 'Perform the action' both belong to
		// "JAVASCRIPTEXECUTOR LANGUAGE"
		
		Thread.sleep(5000);

		driver.quit();

	}

}
