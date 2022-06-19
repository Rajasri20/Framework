package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_DynaOrCondiSynchro_ImpliWait {

	public static void main(String[] args) throws Exception {


/* What is Synchronization*/
		
		// When 2 or More Components work together is called as Synchronization
		
		/* Synchronization is of Types*/
		
		// 1. "Static or Non Conditional Synchronization"
		// 2. "Dynamic or Conditional Synchronization"
		
		// "Dynamic or Conditional Synchronization"
		
		// 1. "implicitlyWait()" Method 
		// 2. "WebDriverWait"
		
		/* WITHOUT USING THE ABOVE SYNCHRONIZATION METHODS WE WILL GET "NoSuchElementException",
		   WHILE WAITINGFOR THE 2ND CONTROL TO BE FOUND */
		
		
		/* USES of "implicitlyWait()" Method*/
		
		/* "implicitlyWait()" Method is used for "WebElements" Only*/
		/* "implicitlyWait()" Method is Applicable Throughout the "driver" */
		/* If the Control is NOT PRESENT or the Control is NOT VISIBLE in both the cases 
		 	"implicitlyWait()" Method can wait*/
		
		/* IN THIS REQUIREMENT THE CONTROL IS NOT PRESENT */ 
		// That is why you will get "NoSuchElementException" error 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// After creating the "driver" 'object', you are informing the "driver" that 
		// after clicking on "Login" it will take some time to display "user name" control
		// Using "implicitlyWait()" Method we can run the code without any exceptions. 
		// After finding the "user name" control continue with Rest of the Program
		// If the COntrol is Present it wont wait until given Time(Ex: '60 sec') 
		// it will display control immediately and continues with Rest of the Program 
		// If the control is not present then only it can wait Max given time(Ex: '60 sec')
		
		// "implicitlyWait()" Method is the right Method to use but not the Thread.sleep(); Method.
	
		
		// Write below code to use "implicitlyWait()" Method.
		
		// After "driver.manage().
		// select timeouts().
		// then  implicitlyWait(), in the parenthesis type in 'Dura' and select 'Duration' 
		// 'Duration' parameter belongs to "java.time", 
		// then put a Dot and select 'ofSeconds()', enter the secs 
		// You can also select 'ofMinutes()' or any option. 
		// It wont wait until the given timer is done,
		// once it finds the control it will continue with the rest of the Program. This is the 
		// advantage of the "implicitlyWait()".
		// If the control is not present then only it can wait Max given time(Ex: '60 sec')
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.manage().window().maximize();
		
		driver.get("https://my.microfocus.com/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		driver.findElement(By.name("username")).sendKeys("Srikrishna");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
