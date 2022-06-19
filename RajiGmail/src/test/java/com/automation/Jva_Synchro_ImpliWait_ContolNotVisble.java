package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_Synchro_ImpliWait_ContolNotVisble {

	public static void main(String[] args) throws Exception {
		
		
/* What is Synchronization*/
		
		// When 2 or More Components work together is called as Synchronization
		
		/* Synchronization is of Types*/
		
		// 1. "Static or Non Conditional Synchronization"
		// 2. "Dynamic or Conditional Synchronization"
		
		// "Dynamic or Conditional Synchronization"
		
		// 1. "implicitlyWait()" Method 
		// 2. "WebDriverWait"
		
		/* WITHOUT USING THE ABOVE SYNCHRONIZATION METHODS WE WILL GET "ElementNotInteractableException",
		   WHILE WAITINGFOR THE 2ND CONTROL TO BE FOUND */
		
		
		/* USES of "implicitlyWait()" Method*/
		
		/* "implicitlyWait()" Method is used for "WebElements" Only*/
		/* "implicitlyWait()" Method is Applicable Throughout the "driver" */
		/* If the Control is NOT PRESENT or the Control is NOT VISIBLE in both the cases 
		 	"implicitlyWait()" Method will be used*/
		
		/* IN THIS REQUIREMENT THE CONTROL IS NOT VISIBLE */
		// That is why you will get "ElementNotInteractableException" error
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		
		driver.findElement(By.partialLinkText("Sign up")).click();
		
		// After clicking on the 'Sign up', the control goes to below control,
		// here this Control is displayed Or Visible(By.id("email") but
		// it will take some time to Display the "Enter your Email" FIELD("Sriramakrishna"),
		// that is why we are not able to enter the DATA so we get "ElementNotInteractableException",
		// to Resolve this Exception we need to write "implicitlyWait()" Method, after defining 
		// the 'driver' object.
		
		driver.findElement(By.id("email")).sendKeys("Sriramakrishna");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
