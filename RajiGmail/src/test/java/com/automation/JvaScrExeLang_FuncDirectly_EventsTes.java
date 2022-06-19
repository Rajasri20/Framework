package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScrExeLang_FuncDirectly_EventsTes {

	public static void main(String[] args) throws Exception {
		
		// How to use Java Script Executor Language directly?
		
		// Think that there is no attribute id, name, class, xpath or etc;. 
		// There is only something like this, 
		// <input onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		// Is there anyway to write the code?
		
		// yes, there is Mechanism, Java Script Executor Language provides direct method.
		// Internally what happens is "onclick" of 'Check Availability', "onclick" event will fire and 
		// 'validateBookingSearch' method will execute directly using Java Script Executor. 
		// 'validateBookingSearch' is Java Script Function 
		
		/* HOW TO IDENTIFY JAVA SCRIPT EVENTS*/
		
		// "if you see "Onclick, Onmouseover" are CALLED "JAVA SCRIPT EVENTS". 
		// Any message like this "validateBookingSearch" is called "JAVASCRIPT FUNCTIONS"
		

		/*USING JAVASCRIPT EXECUTOR LANGUAGE DIRECTLY*/
		
		// On the Browser, Right click 'Inspect', think that there is no attribute given, and
		// there is only "Onclick" Event with "validateBookingSearch"
		// Copy "validateBookingSearch",
		// Go to Console, enter Clear(); it clears the content,
		// Now paste validateBookingSearch();, then enter
		// now "Onclick" event fires, 'validateBookingSearch' method will execute 
		// now "Please select start place" pop up displays.
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		
		((JavascriptExecutor)driver).executeScript("validateBookingSearch();");
		
		// We did not write any code for "FindElement", we directly used "JAVASCRIPT FUNCTION" to 
		// to click on the "Check Availability" button because when we have a
		// "Onclick"  "JAVA SCRIPT EVENT" we can directly use "JS Language". This one of the 
		// advantages of the "JS Language". 
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
