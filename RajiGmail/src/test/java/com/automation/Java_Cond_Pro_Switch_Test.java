package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_Cond_Pro_Switch_Test {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		System.out.println("Start");

		String browser = "firefox";
		
	switch (browser) {
		
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
		break;
	case "ie":
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		break;
	default:
		System.out.println("Invalid Browser Execution");
		break;
	}
	
	// 'break' must be mentioned other wise it will open every browser then opens the 'ie' or default case.
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.quit();

	}

}
