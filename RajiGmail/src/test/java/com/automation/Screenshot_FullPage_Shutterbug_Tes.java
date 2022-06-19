package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_FullPage_Shutterbug_Tes {

	public static void main(String[] args) throws Exception {


		// 'Selenium Shutterbug' is 3rd Party Utility tool to take full/Complete screenshot.
		
		
		// THE REQUIREMENT IS 'TAKING "Full PAGE" SCREENSHOT'(Takes Entire Page)
		
		// To take FULL SCREENSHOT we need to add some 'Dependencies' to 'Pom.xml'
		
		// Go to https://mvnrepository.com/
		// in Search bar, type in 'Selenium Shutterbug', click on it. it is free ware.
		// Select latest Version, for now it is '1.5' version, click on it
		// Select the Dependencies, go to Eclipse and paste in 'pom.xml' and Save 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		Shutterbug.shootPage(driver, Capture.FULL).save("D:\\Screenshots");
		
		// "Shutterbug" is a Class, which is coming from Selenium Shutterbug package.
		// "Shoot page" is a Static Method(you will see 'S' symbol beside "Shoot page"), No need to 
		// create an 'Instance'.
		// multiple "Shoot page" Methods are there choose the 3rd one,
		// when you use this Method pass 2 parameter,
		// 1st is 'Webdriver type of parameter', then 2nd one is 'Capture'
		// 'Webdriver type of parameter' is 'driver'
		//  type in 'Cap', ctrl space bar select 'Capture', it is a "Enum". we don't define "Enum"
		// then type in '.ful' hit ctrl space bar, select "FULL:Capture"
		// then'.save("String path")', give the path to save the file.
		
		Thread.sleep(5000);

		driver.quit();
		
		// Open 'D: drive' you will see full page screenshot with 'Date and Time Stamp'
	}

}
