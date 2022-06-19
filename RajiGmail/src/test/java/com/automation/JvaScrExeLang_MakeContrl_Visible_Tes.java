package com.automation;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScrExeLang_MakeContrl_Visible_Tes {

	public static void main(String[] args) throws Exception {
		
		
		/* The Requirement is, "Donate" button is at the BOTTOM of the Browser, 
		 * Make it Visible at the Top of the PAGE*/
		
		// There is no Strait Forward Method to make the "Control" VISIBLE, in "SELENIUM" 
		// we have to Use "JS Language" Only.
		
		// 1st Find The Control, then using the "scrollIntoView()" method, which belongs to JSEL  


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		// WebElement btnDonate = driver.findElement(By.name("submit"));
		
		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", btnDonate);
		
		// Selenium(findElement)+scrollIntoView()(JSEL)
		
		// If we place the "Control", 'btnDonate' in 'Double Quotes' it is Treated as Hard Coded, 
		// so Hard Coded code is not Visible. So we can not PLACE the 'btnDonate' in 'Double Quotes'
		// That is why we place the control 'btnDonate' in 2nd Parameter to make it 'Visible'. And
		// in 'Double Quotes' we pass the 2nd parameter "arguments[0]"("arguments of Zero) with
		// JSE Method "scrolIntoView()", which belongs to JSEL.
		// The above code is Correct but by Using JSEL both 'findElement' and Perform an action(JSEL)  
		// will be written in JSEL
		
		
		/* Using JSEL*/ 
		
((JavascriptExecutor)driver).executeScript("document.getElementsByName('submit')[0].scrollIntoView();");
		
/*STEPS*/ 

// Go to the "ChromeBrowser", Inspect on 'Interest rate', 
// copy the webElementId(here the given attribute is only "Name") from 'Elements' tab,
// now click on 'Console', type in "clear();" press enter, if there is any data will be cleared.
// Type in 'document', whole page will be highlighted, 
// in JavaScript Executor Lang browser is called as "DOCUMENT".
// now we need to find our 'control', 
// now place a Dot and type in 'getelem', "getElementsByName" will be highlighted, select it, 
// in 'Parenthesis', in 'single quotes', place the 'copied id'(WebElement or Control, which is a 'Name')
// in 'Square Braces place zero'. Because in the Document, there is only one "getElementsByName"
// Control with 'Name'. If there are multiple "ElementsByName" the 'Square Braces' value will change  
// again place a Dot and type in 'scrollin' hit 'ctrl space bar' and select "scrollIntoView();" method


// Finally "JavaScript Executor Language code" looks like this,
// document.getElementsByName('submit')[0].scrollIntoView();

// Now press Key Board 'UP ARROW', same code will be displayed in an other line, 
// 'Copy' it and paste in the 'Eclipse IDE'("String script" parameter)

		Thread.sleep(5000);
		
		driver.quit();
	}

}
