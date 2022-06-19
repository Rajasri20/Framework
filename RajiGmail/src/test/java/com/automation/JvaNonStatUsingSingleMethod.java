package com.automation;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

		public class JvaNonStatUsingSingleMethod {
		
		// NON STATIC OR INSTANCE METHOD, USING SINLE METHOD 3 DIFFERENT FUNCTIONALITIES
		
		// THE REQUIREMENT IS WRITING METHODS FOR LOGNG PROGRAMES(SUPPOSE 100 LINES ARE THERE, 
		// IT IS HARD TO READ SO DEFINING THE METHODS AT VARIOUS LEVELS(SPLITTING THE PROGRAMME TO OPEN, TRANSACTION, CLOSE BROWSER) 
		// WILL BE EASIER TO READ AND UNDERSTAND). WE CAN ALSO WRITE IN A SINLE METHOD BUT
		// 3 DIFFERENT FUNCTIONALITIES ARE NOT RECOMMENDED IN SINLGE METHOD.
		
		
		// INITIALLY WE DID NOT KNOW HOW TO WRITE A METHOD SO WROTE IN 'MAIN METHOD'. 
		
		public void selection() throws InterruptedException {  
			// DEFINING METHOD. 'SELECTION' is method name
		
		//OPEN BROWSER
			
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
				
			// Press 'ctrl' and letter 'o' to see how many methods are there. Displayed with 'circled' are methods.
				
		// TRANSACTION
				
				driver.switchTo().frame("iframeResult"); // Frames concept is required to run the below
				
				WebElement listCars = driver.findElement(By.id("cars"));
				
				Select selectRef = new Select(listCars);
				
				System.out.println(selectRef.isMultiple()); // The Drop down is Multi so displayed TRUE in console
				
				// All these are part of Select Class Method and Should be Used for MULTI SELECTION DROP DOWN. 
				// Make Sure that The CONTROL must be of SELECT Tag on the WebPage.
				// To select MORE THAN ONE OPTIONS AT A TIME from the drop down SendKeys() method won't work. 
				// You need to USE below Methods
				// 1. SelectByindex()  // Index meaning 1st one, second one, 3rd one etc, Index starts with ZERO
				// 2. SelectByVisibleText() // based on the text Visible in the drop down
				// 3. SelectByValue() // on the WEB PAGE, Select a particular value from the Drop down Right click Inspect from the HTMLselect tag choose the particular CONTROL value   
				
				
				selectRef.selectByIndex(0); // No quotation marks are used around any Index number 
				
				Thread.sleep(2000);
				
				selectRef.selectByVisibleText("Opel");
				
				Thread.sleep(2000);
				
				selectRef.selectByValue("audi");
				
				Thread.sleep(2000);
				
			   System.out.println(selectRef.getAllSelectedOptions().size()); 
			   // In Console this method displays TOTAL NUBER OF OPTIONS SELECTED from drop down, 
			   // above we selected 3 options, so output is 3. .size() must be used
				
			   
		//CLOSE BROWSER
			   
			   Thread.sleep(2000);
			   
			   System.out.println(selectRef.getOptions().size()); 
			   // Displays TOTAL NUBER OF OPTIONS FROM drop down. .size() must be used
			   
				driver.quit();
			
		}

		public static void main(String[] args) throws Exception { 
			
			// To execute 'Main Method' is required. Otherwise we can not execute the progarame
			
			JvaNonStatUsingSingleMethod test = new JvaNonStatUsingSingleMethod(); 
			
			// For 'Non Static Method, we need to create an 'Instance'
			//JvaNonStaticPrgra is a class name, 'test' is reference variable, again class name(JvaNonStaticPrgra)
			
			test.selection(); 
			
			//'test' is reference variable, 'selection()' is 'Method' name.

	}

	}

