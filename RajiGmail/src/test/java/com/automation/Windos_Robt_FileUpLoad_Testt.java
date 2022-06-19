package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windos_Robt_FileUpLoad_Testt {

	public static void main(String[] args) throws Exception{
		
		/* Whenever you want to communicate with the WINDOWS BASED COMPONENT, 
		 * MEANING A FILE UPLOAD OR DOWN LOAD we use ROBOT CONCEPT*/
		
		// FILE UPLOAD
		// DOWN LOAD 
		
		/* FILE UPLOAD */ 
		
		// FILE UPLOAD will be done in 2 ways
		
		// Using SELENIUM
		// Using ROBOT
		
		/* Using SELENIUM */
		
		// During the FILE UPLOAD process 
		// if we see the Selenium Control(on choose file, right click inspect) 
		// as "type = file" then using Selenium "SendKeys Method" we can UPLOAD a FILE.
		
		/* Using ROBOT */
		
		
		/* WHEN DO WE USE "ROBOT METHOD"?*/
		
		// WHEN THE BROWSER CONTROL "type" IS NOT EQUALS TO "FILE" or 
		// "WHEN THERE IS NO "type" FILED AT ALL".
		// WHENEVER YOU WANT TO PERFORM ANY "KEY BOARD ACTIONS" WE USE "ROBOT CLASS",
		// WHICH COMES FROM "java.awt"
		
		// YOU NEED TO CREATE AN "OBJET FOR "ROBOT CLASS"
		// Any "KEYBOARD ACTIONS" WE USE "keyPress and KeyRelease" ARE considered as one Action complete
		
		// BEFORE RUNNING THE PROGRAM MAKE SURE YOU SHOULD “COPY THE FILE PATH MANUALLY” 
		// THEN ONLY IT WILL BE THERE IN YOUR SYSTEM OTHERWISE THE SYSTEM WON’T PASTE THE CONTENT 
		// WHILE RUNNING THE PROGRAME. THE FILE PATH SHOULD BE 
		// FOR EXAMPLE “D:\googlelogo.png”. there should be only ONE FORWARD SLASH.
		// You need to manully write the FILE PATH in Note Pad.
		
		
		/*HOW TO AVOID WRITING THE PATH MANUALLY? */

		// WHATEVER YOU WANT TO “PLACE”(Ctrl C) THE CONTENT IN THE SYSTEM 
		// YOU SHOULD USE “StringSelection”, we need to COPY “D:\googlelogo.png” and 
		// BY using the “Toolkit.getDefaultToolKit()” method it will be in the Key Board.

		
		// "KeyEvent" is for that particular KeyBoardKey
		// "VK" Virtual Keyboard. CONTROL for "ctrl V" for pasting the content
		// Every KeyBoard Actiond MUST HAVE "keyPress and KeyRelease" THEN ONLT ONE ACTION IS COMPLETE.
		// MANUALLY also we do the same "Copy" and RELEASE the keyborad and "PASTE" and RELEASE.
		// "TAB OUT" and RELEASE the KEY, PRESS "ENTER" and RELEASE the ENTER button.
		
		
		/* Using ROBOT */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		
		// if the "PAGE" is NOT YET LOADED, wait max of 1mins
		// 'in page load you need to mention Duration and the the time.
		// After 'Duration' put a dot and select ofminutes()method 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60));
		
		// if the "Element" is NOT YET "Present or Visible" wait max 60 secs
	
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/");
		
		WebElement lnkupload = driver.findElement(By.xpath("//a[@title='Click to upload your resume']"));
		
		lnkupload.click();
		
		// Click on "UPLOAD RESUME"
		
		WebElement fileToupload = driver.findElement(By.id("file-upload"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", fileToupload);
		
		// On next pop upClick on "FILE TO UPLOAD", which opens 
		// your WINDOWS BASED COMPONENT window, where you specify path to upload Resume
		
		/* SOME HOW THIS THIS CODE IS NOT WORKING.
		 * 
		 *  SEE THE THIS JAVA "Windows_FileUpLoad_UsingRobotClass_T" CLASS FILE*/
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
