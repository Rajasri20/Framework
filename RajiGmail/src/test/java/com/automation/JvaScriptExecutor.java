package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecutor {

	public static void main(String[] args) throws Exception {

		// When do we use JavaSriptExecutor?

		// When "FAILED TO FULFIL THE REQUIREMENT BY USING 'WEBEMENT SENDKEYS AND ACTION
		// SENDKEYS METHODS'

		// The 'Requirement' is "Enter the User Chosen Interest Rate".

		/* USING JAVASCRIPTEXECUTOR*/

		// 1st FindEelment then TYPE CAST "driver" AS "JavascriptExecutor"

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://emicalculator.net/");

		WebElement txtLoanInterest = driver.findElement(By.id("loaninterest"));
		
		// Above code line Belongs to 'Selenium'

		((JavascriptExecutor) driver).executeScript("arguments[0].value= '12.5'", txtLoanInterest);
		
		
		// In the above line "arguments[0].value= '12.5'" piece of code belongs to "Javascript Language"
		// here we combined both 'Selenium' and "Javascript Language"
		
		// After Placing 'driver', place a Dot and type in "executeScript" method, this won't display 
		// Because 'driver' is type of A 'WebDriver', is not a type of "JavascriptExecutor".
		// In order to Enter "Desired Data" WE NEED TO CONVERT THE  'driver' as 'JavascriptExecutor',
		// which is called as TYPE CASTING.
		// After placing the 'driver', on left hand side, in the Parenthesis'()' 
		// type 'Javascr' and crtl space bar select the "JavascriptExecutor" which is a 'Interface' 
		// Now enclose "JavascriptExecutor" and 'driver' with one more pair of Parenthesis'()',
		// this is called as 'Type casting'. 
		// "driver" will be "Type Casted" as "JavascriptExecutor" for this "PIECE OF CODE" only.
		// After "Type Casted" we complete the  Execute JSExecutor step using ".executeScript" method, 
		// so Type casting will be applicable for this 'STEP'only 
		// In Rest of the lines of code 'driver' is "WebDriver" only.
		
		// Now place a dot type in ".execus' and select the 3rd one, 
		// "String script" parameter as "arguments[0](in square braces pass value as zero"), 
		// place a dot and type in as ".value =" and in single quotes enter the desired value as '12.5',
		// now in "Object...args" put a comma and place "txtLoanInterest" which is a 'WebElement control'
		// "Object...args" can hold 'String values, int values, double values'. 
		// "..." indicate you can pass any number of values with 'comma' separated.
		
		
		// "String script" parameter = "arguments[0].value= '12.5'"
		
		//	"Object...args"	=	",txtLoanInterest"
		
		// ((JavascriptExecutor) driver).executeScript("arguments[0].value= '12.5'", txtLoanInterest);
		
		// In "String script" we can not enter the value as "txtLoanInterest", because "String" is 
		// Written in 'DOUBLE QUOTES', if it is in DOUBLE QUOTES it will be TREATED as 'HARDCODED VALUE' 
		// THAT IS WHY WE NEED to ENTER AS "arguments of zero("arguments[0]"),
		// "txtLoanInterest" will be passed into "arguments[0]".
		// "arguments[0]" is nothing but "txtLoanInterest" 
		// but "txtLoanInterest" should not placed as "String script" parameter,
		// if we put txtLoanInterest in 'DOUBLE QUOTES' it will be treated as 'HARDCODED VALUE'   

		Thread.sleep(5000);

		driver.quit();

	}

}
