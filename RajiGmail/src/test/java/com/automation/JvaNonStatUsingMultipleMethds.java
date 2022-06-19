package com.automation;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class JvaNonStatUsingMultipleMethds {

	// NON STATIC OR INSTANCE METHOD, USING multiple METHODs 3 DIFFERENT FUNCTIONALITIES

	// THE REQUIREMENT IS WRITING METHODS FOR LOGNG PROGRAMES(SUPPOSE 100 LINES ARE
	// THERE,
	// IT IS HARD TO READ SO DEFINING THE METHODS AT VARIOUS LEVELS(SPLITTING THE
	// PROGRAMME TO OPEN, TRANSACTION, CLOSE BROWSER)
	// WILL BE EASIER TO READ AND UNDERSTAND). WE CAN ALSO WRITE IN A SINLE METHOD
	// BUT
	// 3 DIFFERENT FUNCTIONALITIES ARE NOT RECOMMENDED IN SINLGE METHOD.

	// INITIALLY WE DID NOT KNOW HOW TO WRITE A METHOD SO WROTE IN 'MAIN METHOD'.
		
		WebDriver driver = null; 
		
// Press 'ctrl' and letter 'o' to see how many methods are there. Displayed with 'circled' are methods.

 //OPEN BROWSER
	public void openBrowser() throws InterruptedException { 
		
	// DEFINING METHOD. 
	// 'openBrowser' is method name. naming notation 1st word 'lower case'(open), 2nd word 'Uppercase'(Browser)
		
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
				
				// To resolve the 'ERRORS' for "Drivers" in all 3 methods, define the "Driver" 
				// inside the 'CLASS' and outside the 'METHOD'.
	}
		
	// TRANSACTION
	public void listDropdown() throws InterruptedException {
		
		driver.switchTo().frame("iframeResult"); // Frames concept is required to run the below
		
		WebElement listCars = driver.findElement(By.id("cars"));
		
		Select selectRef = new Select(listCars);
		
		System.out.println(selectRef.isMultiple()); 
		
		selectRef.selectByIndex(0);  
		
		Thread.sleep(1000);
		
		selectRef.selectByVisibleText("Opel");

		selectRef.selectByValue("audi");

	   System.out.println(selectRef.getAllSelectedOptions().size());
	  
		}	
			   
		//CLOSE BROWSER
		public void closeBrowser()  {
	
			  	driver.quit();
		}
			
		public static void main(String[] args) throws InterruptedException { 
			
			// To execute 'Main Method' is required. Otherwise we can not execute the progarame
			
			JvaNonStatUsingMultipleMethds test = new JvaNonStatUsingMultipleMethds(); 
			
			
			
			test.openBrowser();
			test.listDropdown();	
			test.closeBrowser();
			
			//'test' is reference variable, 'selection()' is 'Method' name.

	}
  }
