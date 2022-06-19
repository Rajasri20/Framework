package com.automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windos_Multiple_Windos_Tabs_Browsrs_T {

	public static void main(String[] args) throws Exception {

		// How to handle "Multiple Windows_Tabs_Browsers"?
		
		/* Requirement */
		
		// Once "cypress.io" opened in the Browser, when you hit "Log in" a browser Window opens
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// here "driver" always refers to the "1st opened Browser Window"
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		
		// if the "PAGE" is NOT YET LOADED, wait max of 1mins
		// 'in page load you need to mention Duration and the the time.
		// After 'Duration' put a dot and select ofminutes()method 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60));
		
		// if the "Element" is NOT YET "Present or Visible" wait max 60 secs
	
		driver.manage().window().maximize();
		
		driver.get("https://www.cypress.io/");
		
		// Opens in new window
		
		WebElement lnkLogin = driver.findElement(By.linkText("Login"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",  lnkLogin);
		
		// failed to perform click action using WebElement and Actions Click methods, so used
		// JavascriptExecutor method.
		
		// After clicking on "Login" a "NEW WINDOW OPENS".
		
		/*HOW THE NEW WINDOW COMMUNCATES WITH 1ST wINDOW? */
		
		// We need WINDOW Ids to Switch from "1st Window to Current Window"
		// each and every window will have "WINDOW IDS OR SESSION ID" 
		// this will be achieved through Selenium "getwindowHandles()" method.
		
		Set<String> set = driver.getWindowHandles();
		
		// When we Dont know WINDOW IDs we 1st we should use "getWindowHandles();"
		// This method will get WINDOW IDs of all the WINDOWS.
		// Select the 2nd Option "getWindowHandles():Set<String>-WebDriver", which mean 
		// return type is "Set", "Set" belongs to "Collections Concept of JAVA"
		// "Set" displays the in "UNORERD way", REFER TO "Collections Concept"
		// "Set" is a INTERFACE. 
		// The expression evolves from RIGHT to LEFT, 
		// it will get all the WINDOW IDs and Stores in "Set" 
		// "Set" displays the in "UNORERD way" so we need "List" concept to display in order
		
		List<String> list = new ArrayList<>(set);
		
		// "List" displays in a OREDER, so convert the "UNORERD"(Which is "Set").
		// So WINDOWS IDs will be displayed in ORDER(1st WINDOW, 2nd WINDOW).
		
		// "List" is a INTERFACE, so we can not use it Directly. 
		// Through "SubClasses "we can use "List".
		// One of the and Most USED "SubClasses" is "ArrayList".
		
		System.out.println(list.get(0)); 
		
		// Print 1st WiNDOW ID, which is INDEX point of view ZERO
		
		System.out.println(list.get(1));
		
		// Print 2nd WiNDOW ID, which is INDEX point of view 1
		
		driver.switchTo().window(list.get(1));
		
		// Now we need 2nd WINDOW ID so get that and SWICTH to 2nd WINDOW AND 
		// FIND THE CONTROL AND PERFORM THE ACTION
		
		driver.findElement(By.xpath("(//span[@class='pull-left'])[4]")).click();
		
		// I want to Click on "Login with Email" on the "New Window", which is a 4th option
		// Inspect, Locator type is xpath, a "Span Tag with Class".
		
		// Now RUN the program, you will get "NoSuchElementException"
		// Why we got this "Exception" 
		// because in the above line code "driver always refers to 1st WINDOW" but
		// Our "CONTROL" is "2nd Window", so it should Switch from "1st Window to 2nd Window",
		// without "Switch" we can not "PERFORM the ACTION".
		// To Identify this Control 1st we have to Switch, so before the above line code 
		// WRITE CODE for SWITHCH
		
		Thread.sleep(5000);
		
		// driver.close();
		
		// Closes only the 1st Browser Window 
		
		driver.quit();
		
		// It closes all the Browsers which are opened by the Selenium.

	}

}
