package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		//FirefoxDriver driver = new FirefoxDriver();
		////In place of FirefoxDriver we can use WebDriver also both are valid
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/");
		
		driver.quit();
			
	}

}
