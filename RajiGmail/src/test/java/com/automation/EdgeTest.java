package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		//EdgeDriver = new EdgeDriver();
		//In place of EdgeDriver we can use WebDriver also both are valid
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/");
		
		driver.quit();
	}

}
