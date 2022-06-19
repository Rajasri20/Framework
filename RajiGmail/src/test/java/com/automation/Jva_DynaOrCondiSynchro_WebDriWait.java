package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_DynaOrCondiSynchro_WebDriWait {

	public static void main(String[] args) throws Exception {

		/* What is Synchronization */

		// When 2 or More Components work together is called as Synchronization

		/* Synchronization is of Types */

		// 1. "Static or Non Conditional Synchronization"
		// 2. "Dynamic or Conditional Synchronization"

		/*
		 * WITHOUT USING THE ABOVE SYNCHRONIZATION METHODS WE WILL GET "EXCEPTION",
		 * WHILE WAITING FOR THE 2ND CONTROL TO BE FOUND.
		 */

		// "Dynamic or Conditional Synchronization"

		// 1. "implicitlyWait()" Method
		// 2. "WebDriverWait"

		/* "WebDriverWait" */

		// "WebDriverWait" is a Class, coming from 'Selenium' package
		// WebDriverWait is nothing but 'ExplicitWait'

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://my.microfocus.com/");

		driver.findElement(By.partialLinkText("Login")).click();

		// Write below code to use "WebDriverWait".

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		// Create "WebDriverWait" Object
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		// in the parenthesis 'driver' is of WebDriver, type in 'Dura' and select
		// 'Duration'
		// 'Duration' parameter belongs to "java.time",
		// then put a Dot and select 'ofSeconds()', enter the secs or
		// You can also select 'ofMinutes()' or any option.
		// "In General "WebDriverWait" can wait Max 5 Mins"

		// Then write below code,

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

		// 'wait' is a reference variable, then put a Dot,
		// Type in 'unti',
		// select 'until', in parenthesis type in 'Expec', select 'ExpectedConditions',
		// the a Dot,
		// Type in 'prese', select 'presenceOfElementLocated()' wait until the below 'element' is present
		// in parenthesis copy & paste your Control or Element "(By.name("username")"
		// "(ExpectedConditions.presenceOfElementLocated(By.name("username")));" will keep on checking 
		// until the Element is present, once the element is present, immediately the control goes to the 
		// next statement and perform the next action. 
	
		driver.findElement(By.name("username")).sendKeys("Srikrishna");

		Thread.sleep(5000);

		driver.quit();

	}

}
