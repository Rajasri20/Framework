package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_If_Test {

	public static void main(String[] args) {
		
		// CONDITIONAL STATEMENTS
		// 'if'

// "if" is a Key word and a Reserved word, is a Positive CONDITION or one way CONDITION
// why it is a Reserve word, we can not use 'if' as a Class Name or Variable name
		
// SYNTAX
	
// if(Condition){
//   Statements for if
//	}
// "Condition" is type OF Boolean(True or False)
// 'if' the condition is true execute the statement otherwise don't execute
		
// THE REQUIREMENT IS, IF THE INPUT EQUALS TO 'CHROME' THEN ONLY EXECUTE THE SCRIPT ON 'CHROME BROWESER'
// OTHER THAN 'CHROME BROWSER'(Ex: Firefox, IE, Edge) I DONT WANT TO DO ANTYHING.
		
		System.out.println("Start");
		
		String input = "chrome"; // the 1st letter in 'String' must be capital letter. 
//'chrome' is of 'String' type, 'input' is reference variable

		 if (input.equals("chrome")){ // verify and see if the 'input' is equals to chrome or not
//Here the 'input' type is of 'chrome'(String input = "chrome";),so it is true the statement is executed.
			
	// Now Change the 'input' equals firefox
		// String input = "firefox";	
		// if (input.equals("chrome")){
			// } 
//Here the 'input' is type of 'firefox'(String input = "firefox";) 
//input is not equals to 'chrome' so the condition is false, so it won,t execute at all. 
//In the Console it shows as 'False'
//The Control immediately goes to after the 'if' block statement.
			
		WebDriverManager.chromedriver().setup();
			 
		WebDriver driver = new ChromeDriver();
			 
		driver.manage().window().maximize();
			 
		driver.get("https://mvnrepository.com/");
			 
		driver.quit();
		
// Here the 'input' is equals to 'chrome' so the 'if' condition is true, so it executed on 'chrome'	 
		 }
		 
	System.out.println("End");

	}

}
