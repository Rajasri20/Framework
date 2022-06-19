package com.automation;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshot_Test {

	public static void main(String[] args) throws Exception {
		
		// TAKESSCREENSHOT: Why do we need it?
		
		// To capture the each and every step of the 'SCRIPT' and 
		// to know weather the'SCRIPT' Failed or Passed. It is completely based on 'REQUIREMENT'
		
		 // The  Real Time 'REQUIREMENT' could be, 
		// 1. Once you enter the data, before submitting the page
		// 2. Each and every step of the 'SCRIPT' that Failed or Passed.
		// 3. Only in Failed cases.
		
		
		// The 'Requirement' is 'TAKESCREENSHOT' of a table, Webelement screenshot.
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		Thread.sleep(5000); 
		// I will scroll the page down to take full screen shot of table content, otherwise
		// it will take only visible content.
		
		WebElement table = driver.findElement(By.id("example")); 
		// 'table' is a reference variable, expression evaluates from 'Right to Left', 
		// address or reference of the 'WebElemnet(table)' will be stored in the 'reference variable'
		
		//TAKING A SCREENSHOT OF A TABLE
		
		// ".getScreenshotAs()" Method will only takes screenshot of a "WEBELELMENT" Only, 
		// but not the entire page. ".getScreenshotAs()" Method is part of the 'TAKESCREENSHOT' interface 
		
		File source = table.getScreenshotAs(OutputType.FILE);
		
		// After 'table' put a 'dot' and call "getScreenshotAs()' method, 
		// if you want to Invoke this method you need to pass input parameter type as "OutputType", now 
		// type in 'Outp', ctrl space bar and select "OutputType" now I want this screenshot(i,e; "OutputType") as a 'FILE',
		// now remove '<X>' and type in '.fil', 'ctrl space bar'
		// and select "FILE:OutputType<jav.io.file> - OutputType<T>".
		// If it is a "FILE" we can assign it to a "FILE" reference variable, which is 'source'(ur choice)
		// 'source' is nothing but a 'Temp directory', here 'source' is a reference variable 
		// by default Selenium takes screenshot and puts in 'Temp directory", 
		// which is not my desired location, I want to save to my "D: drive"
		// on the "Left hand Side" type in 'fil' hit 'ctrl space bar' 
		// and select a 'File' which belongs to 'java.io'   
		
		File target = new File("D:\\Image1.PNG");
		
		// I want to put the above image in the following location, File("D:\\Image1.PNG");
		// 'source' is nothing but a 'Temp directory', here 'target' is a reference variable 
		// by default Selenium takes screenshot and puts in 'Temp directory",
		// which is not my desired location, I want to save to my "D: drive"
		// Create an "INSTANCE" FOR TARGET, now type 'File' from .io and mention the 'target'(location),
		// then '=', then 'new File' location path which is 
		// "D: drive, ImageName, File Extension, File("D:\\Image1.PNG"); 
		// "File Extension" must be of "PNG, BMP or JPEG".
		
		// IF AT ALL, YOU DIDN'T WANT TO PASS THE PATH TO SAVE THE FILE, BY DEFAULT IT WILL 
		// SAVE INTO THE "PROJECT LOCATION"(EX: GMAIL). SEE LEFT HAND SIDE IN THE 'PACKAGE EXPLORER'
		// SYNTAX SHOULD BE, File target = new File("Image1.PNG"); HIT ON RUN, SCREENSHOT IS TAKEN
		// NOW "RIGHT CLICK ON THE PROJECT" AND CLICK "REFRESH", SCROLL DOWN ALL THE WAY TO THE BOTTOM, 
		// YOU WILL SEE YOUR SCREENSHOT SAVED THERE.
		// TO SEE THE LOCATION OF FILE SAVED, 'RIGHT CLICK ON THE PROJECT', SELECT 'PROPERTIES', 
		// ON THE 'PROPERTIES' WINDOW YOU WILL SEE 'Location: C:\AutomationWorkSpace\RajiGmail' with
		// an 'Arrow' click on it, then click on 'RajiGmail', then on 'Image1'. 
		// or directly click on the 'Image1' from package explorer it will open.
		
		
		// HOW TO MOVE THE FILE FROM "SOURCE LOCATION TO TARGET LOCATION"?
		
		// We need "FileHandler" Copy() method to do this
		
		FileHandler.copy(source, target);
		 
		// I want to move the file from 'temp location to desired location', "copy" method should be used, 
		// which is 'source and target 'copy(source, target), if you don't use "copy" method 
		// it will just take screenshot but it won't save the Image in desired location
		// hit 'ctrl and space bar' you will see 2 'FileHandler class files' select the 'FileHandler' 
		// which is related to "org.openqa.selenium.io" only 
		// after that put a dot and write 'cop' and hit 'ctrl and space bar', 
		// select 'copy(file from file to) method, it is nothing but "copy(source, target)"
		// To resolve the 'ERROR' on 'FileHandler', 
		// hover over the mouse select 'Add throw declaration' and select exception  
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
