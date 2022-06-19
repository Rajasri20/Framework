package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_ForLoop_Test {

	public static void main(String[] args) {
		
		// FOR Loop: in general for fixed number of times execution we can use ‘for’ loop. 
		// If you want use ‘while’ and ‘do while’ loop also but'FOR' is prefered.
		
		// SYSNTAX FOR 'FOR' LOOP
		
				// for(Initialization;Condition;update)	{ // INSIDE PARENTHESIS 2 SEMICOLNS SEPARATED( ; ; )
				// STATEMENTS FO FO LOOP
				// }
		
		// UPDATE meaning INCREMENT OR DECREMENT)
		
		System.out.println("Start");

		// The Requirement is I want to open the Browser 3 times.

		// To achieve this we have to "increment the index" that is 'index+1'
		// index= 1 is 1<=3, yes it is TRUE so the Control goes inside the 'while loop' and execute the statements
		// 2nd time when it encounters 'index++;", is index=2 2<=3, yes this also TRUE it executes 2nd time too
		// when it encounters 'index++;", is index=3 3<=2, YES it's TRUE, EXECUTES FOR loop. 
		// it executed 3 times

		// index=1 is 1<=3 
		// index=2(1+1) is 2<=3
		// index=3(2+1) is 3<=3
								
				for(int index=1;index<=3;index++) {
				
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.google.com/");
					driver.quit();
					
					// index++ is UPDATE(INCREMENT OR DECREMENT)
				}

				System.out.println("End");

			}
}


