package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_DoWhileLoop_Test {

	public static void main(String[] args) {
		
		// WHEN DO YOU GO FOR 'DO WHILE'?
		
		// Even  in 'FALSE CASE' 'do while' executes its loop body AT LEAST ONCE.
		
		// In real time, Sometimes the Requirement could be even in false case. 
		// I want execute the loop body at least once. In remaining cases may be based on condition(true) 
		
		
		// 'do while' loop, ‘while’ evaluates the expression at the 'End'
		// even if the condition is false 'do while' executes its loop body AT LEAST ONCE even in 'False' Case 
		// BECAUSE THERE IS NO CONDTION ON 'do'.  It will EVALUATE 'while' EXPRESSION at the END.
		// if the 'while' expression encounters 'FALSE' condition it will exit the 'do while'.
		
System.out.println("Start");
		
		boolean status = false;
		
		 do{ 
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.quit();
			status = false;
			
		}while(status);
		
		// on 'do' there no condition so it will execute 'do' the statements, 
		// then control goes inside the ‘while’ when it encounters the “status = false”
		// it exits from the 'do while' loop. 
		// In the above programe it opens the browser 1 time because there is no condition on 'do'
		// when 'while' evaluates it expression it will encounter the  ‘status = false, so will exit 'do while'  
		
		System.out.println("End");

			}
	}


