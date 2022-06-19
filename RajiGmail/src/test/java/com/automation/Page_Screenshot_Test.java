package com.automation;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_Screenshot_Test {

	public static void main(String[] args) throws Exception {

		// THE REQUIREMENT IS 'TAKING PAGE SCREENSHOT'(Takes only VISIBLE area
		// SCREENSHOT)

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// 'PAGE' is not a 'WebElement'.
		// 'driver' is type of A 'WebDriver', is not type of a 'TakesScreenshot'.  
		// in order to take screenshot of a page WE NEED TO CONVERT THE  'driver' as 'TakesScreenshot', 
		// because the required method 'getScreenshotAs()' is part of the 'TakesScreenshot' 
		// 'driver' represents whole 'ChromeBrowser'.
		// After placing the 'driver', if you type in 'getscreenshotAs' it won't display anything
		// because 'driver' is not type of a 'TakesScreenshot'.
		// If it were 'WebElement' 'TakesScreenshot' would display as and when you type in.
		// in order to take 'page' screenshot, After placing the 'driver', on left hand
		// side, in the Parenthesis'()' type 'takesc' and crtl spacebar select the
		// 'TakesScreenshot' now enclose with one more pair of Parenthesis'()',
		// this is called as 'Type casting'. "driver" will be "Type Casted" as "TakesScreenshot" for this
		// "PIECE OF CODE" only. In Rest of the lines 'driver' is "WebDriver" only
		// Now type in '.getscre' and crtl spacebar select the 'getScreenshotAs()',
		// fill in 'inpuType' parameter as 'OutputType' and '.FILE'.
		// on the left hand side 'File' and reference vari.. as 'source'

		File target = new File("D:\\Image2.PNG");

		FileHandler.copy(source, target);

		Thread.sleep(5000);

		driver.quit();

	}

}
