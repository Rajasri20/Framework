package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_While_Loop_Indx_Test {

	public static void main(String[] args) {


System.out.println("Start");

// The Requirement is I want to open the Browser 2 times only.

// To achieve this we have to "increment the index" that is 'index+1'
// index= 1 is 1<=2, yes it is TRUE so the Control goes inside the 'while loop' and execute the statements
// 2nd time when it encounters 'index = index+1;", is index=2 2<=2, yes this also TRUE it executes 2nd time too
// when it encounters 'index = index+1;", is index=3 3<=2, NO it's FALSE, then it exits from while loop. 
// it executed only 2 times

// index=1 is 1<=2 
// index=2(1+1) is 2<=2
// index=3(2=1) is 3<=2

		int index = 1;
		
		while(index<=2) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.quit();
			index = index+1; // index+1 value will be stored in 'index'(the one before assignment operater '=') 
			// Or you can write only index++, meaning index = index+1
			// index++; 
		}

		System.out.println("End");

	}
	}

