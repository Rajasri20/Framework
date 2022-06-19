package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IETest {

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		//In place of InternetExplorerDriver we can use WebDriver also both are valid
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/");
		
		driver.quit();
			

	}

}
