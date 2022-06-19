package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_Synchro_WebDriWait_ControlNotVisble {

	public static void main(String[] args) throws Exception {

		/* What is Synchronization */

		// When 2 or More Components work together is called as Synchronization

		/* Synchronization is of Types */

		// 1. "Static or Non Conditional Synchronization"
		// 2. "Dynamic or Conditional Synchronization"

		/*
		 * WITHOUT USING THE ABOVE SYNCHRONIZATION METHODS WE WILL GET "EXCEPTION",
		 * WHILE WAITING FOR THE 2ND CONTROL TO BE FOUND
		 */

		// "Dynamic or Conditional Synchronization"

		// 1. "implicitlyWait()" Method
		// 2. "WebDriverWait"

		/* "WebDriverWait" */
		
		// When the ELEMENT is PRESENT AND ELEMENT is VISIBLE "WebDriverWait" will be USED.
		
		/* HOW TO KNOW whether THE ELEMENT is PRESENT AND ELEMENT is VISIBLE? */
		
		// On the Control Right Click, Inspect and see Locator type like "ID, Name, Class etc; are
		// given, if the Locators are given then its a ELEMENT is PRESENT AND ELEMENT is VISIBLE but
		// it is "Disabled or CONTROL IS PRESENT BUT NOT VISIBLE" we go for "WebDriverWait" 
		
		
		// "WebDriverWait" is a Class, coming from 'Selenium' package
		// WebDriverWait is nothing but 'ExplicitWait'

		/* IN THIS REQUIREMENT THE CONTROL IS PRESENT BUT NOT VISIBLE */
		// That is why you will get "ElementNotInteractableException" error

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://github.com/");

		driver.findElement(By.partialLinkText("Sign up")).click();

		// After clicking on the 'Sign up', the control goes to below control,
		// here this Control is displayed Or Visible(By.id("email") but
		// it will take some time to Display the "Enter your Email" FIELD("Sriramakrishna"),
		// This called "THE CONTROL IS PRESENT BUT NOT VISIBLE"
		// that is why we are not able to enter the DATA so we get
		// "ElementNotInteractableException",
		// to Resolve this Exception we need to write "implicitlyWait()" Method, after
		// defining the 'driver' object.
		
		/* YOU HAVE TO WRITE "WebDriverWait"(is a class)CODE AFTER THE 1st CONTROL, which is ("Sign up")  
		 * OTHERWISE YOU WILL SEE SAME 'EXCEPTION' */
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

		driver.findElement(By.id("email")).sendKeys("Sriramakrishna");
		
		Thread.sleep(5000);

		driver.quit();

	}

}
