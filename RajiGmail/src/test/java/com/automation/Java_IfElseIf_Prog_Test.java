package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_IfElseIf_Prog_Test {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		// WebDriver driver = null; // 'WebDriver' is Interface, 
		// Interface is of non primitive and default value for non primitive is 'null'
		// after writing WebDriver driver = null; you will error for Driver in 'if' and 'else' blocks
		// because 'WebDriver' is already defined in 'Main Method' so do not redefine the 'webDriver',
		// so remove 'webDriver' from the 'if' and 'else if' blocks
		// NEver go with individual drivers like 'chromedriver driver = null;', 
		// this gives the error in other block, because it supports Chrome browser only but not other browsers

		
		System.out.println("Start");
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();
		
		// The above 3 statements are common for all the 'if, else if' statements 
		// so we don't need to rewrite them because these common across all the Browsers.
		// so Delete these 3 statements from every block and keep only 1 set of statements 
		// and place them at the end of the  'if else if' block. This one set is applicable for all blocks
		// as soon as these statements were placed here you will see the errors for 'driver', 
		// because these 3 statements are outside of the 'if' and 'else if' blocks.
		// define the 'WebDriver driver' inside the main method(all the way top), 
		// so you can access through out the programme or Method 
		// WebDriver driver = null; // 'WebDriver' is Interface, 
		// Interface is of non primitive and default value for non primitive is 'null'
		// after writing WebDriver driver = null; you will error for Driver in 'if' and 'else if' blocks
		// because 'WebDriver' is already defined in 'Main Method' so do not redefine the 'webDriver',
		// so remove 'webDriver' from the 'if' and 'else if' blocks

		System.out.println("End");
		}
}
		
		
