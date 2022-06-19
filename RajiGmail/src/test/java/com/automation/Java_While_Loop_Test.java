package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_While_Loop_Test {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		boolean status = true;
		
		while(status) { 
		// while evaluates the expression at the 'beginning'
		// if the condition is FALSE it can not execute its loop body
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.quit();
			status = false;
		}
		
		// When the condition is TRUE, control goes inside the ‘while’ and executes the statements 
		// and 2nd time when it encounters the “status = false” it exits from the while loop. 
		// In the above programe it opens the browser only 1 time because 2nd time the ‘status = false’. 
		// If we don’t mention ‘status = false’ it iterates infinite times, the browser goes on opens. 
		
		System.out.println("End");

	}

}
