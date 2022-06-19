package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_ifElse_2_Test {

	public static void main(String[] args) {

		WebDriver driver = null;
// why we are using 'WebDriver' because we are using different browsers(chrome, firefox etc;)
// 'WebDriver'is a is Interface, Interface is of non primitive and default value for non primitive is 'null'// Always go with 'diver' is of type 'WebDriver' because it can support all the browsers 
// NEver go with individual drivers like 'chromedriver driver = null;', 
// this gives the error in other block, because it supports Chrome browser only but not other browsers

		// CONDITIONAL STATEMENTS

		// 'if else'

		// 'if else' is a 2 way CONDITION

		// SYNTAX

		// if(Condition){
		// Statements for if
//			}else{
		// Statements for else
		// }

		// "Condition" is type OF Boolean(True or False)

		// 'if' the condition is true execute the statement,
		// 'else'(if the 1st condition is false)execute the next statement

		// THE REQUIREMENT IS, 'IF' THE INPUT EQUALS TO 'CHROME' THEN EXECUTE THE SCRIPT
		// ON 'CHROME BROWESER'
		// 'ELSE' OTHER THAN 'CHROME BROWSER', i.e, Firefox|IE|Edge then EXECUTE THE
		// SCRIPT ON 'FIREFOX BROWSER'.

		System.out.println("Start");

		String input = "chrome"; // The input is equals to 'chrome', so the output is "Execute Script on Chrome
									// Browser"

		// String input = "firefox";
		// String input = "ie";
		// String input = "edge";
		// The input is not equals to 'chrome' so the control immediately transfers to
		// 'else' block
		// so the output is "Execute Script on firefox Browser"

		if (input.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

// A 'driver' is a variable which is type of 'WebDriver' and 
// defined inside the 'if' block so it is local to 'if' block only. 
// outside of this block we can not access 				
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

// A 'driver' is a variable which is a type of 'WebDriver' and 
// defined inside the 'else' block so it is local to 'else' block only. outside of this block we can not access			

		}
// The below statements are same for both 'if' and 'else' so no need to write 2 times, just place  
// them right after 'else' block. 
// as soon as these statements were placed here you will see the errors for 'driver', 
// because these 3 statements are outside of the 'if' and 'else' blocks.
// define the 'WebDriver driver' inside the main method(all the way top), 
// so you can access through out the programme or Method 
// WebDriver driver = null; // 'WebDriver' is Interface, 
// Interface is of non primitive and default value for non primitive is 'null'
// after writing WebDriver driver = null; you will error for Driver in 'if' and 'else' blocks
// because 'WebDriver' is already defined in 'Main Method' so do not redefine the 'webDriver',
// so remove 'webDriver' from the 'if' and 'else' blocks

		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();

		System.out.println("End");

	}

}
