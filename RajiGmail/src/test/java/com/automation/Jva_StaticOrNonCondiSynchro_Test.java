package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_StaticOrNonCondiSynchro_Test {

	public static void main(String[] args) throws Exception {
		
		/* What is Synchronization*/
		
		// When 2 or More Components work together is called as Synchronization
		
		/* Synchronization is of Types*/
		
		// 1. "Static or Non Conditional Synchronization"
		// 2. "Dynamic or Conditional Synchronization"
		
		/* WITHOUT USING THE ABOVE SYNCHRONIZATION METHODS WE WILL GET "EXCEPTION", WHILE WAITING
		   FOR THE 2ND CONTROL TO BE FOUND */
		
		// "Thread.sleep()" Method is called "Static or Non Conditional Synchronization"
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://my.microfocus.com/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		// When we run this Code we get "org.openqa.selenium.NoSuchElementException". Because
		// after finding the "Login" control, it will take some time to find the "User name" control
		// in this gap Selenium throws exception, why because it could not find the control immediately.
		// Now add "Tread.sleep()" for 30 secs, now run it, without any exception, will work as expected.
		
		Thread.sleep(30000); // Static or Non Conditional Synchronization 
		
		// But "Tread.sleep()" is not suggestible Method. Why because 
		// "User name" might take 5 sec or 30 or 1 min to display. Irrespective of time you have to wait
		// until the "Tread.sleep()" time is done. That is why it is not suggestible Method. 
		// But anyway we can manage with "Tread.sleep()". 
		
		driver.findElement(By.name("username")).sendKeys("Srikrishna");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
