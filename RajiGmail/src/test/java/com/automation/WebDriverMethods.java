package com.automation;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws Exception  {
		
		//Below are called WebDriverMethods,
		
		//maximize()
		//minimize()
		//manage().window(). must be used before maximize(),minimize() METHODS
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver or browser is reference variable
		
		// In general when we open a browser we use get(String url)METHOD
		//get(String url)
		
		//browser Back, Forward and Refresh Navigate buttons
		//navigate(). must be used before back(),forward(),refresh() METHODS
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//back()
		//forward()
		//refresh(

		//to(string url)
		
		//In the same browser window if you want to enter another URL the following MEHOTDS should be used
		//First the browser will load the https://www.selenium.dev/ then in the same Browser it load the 
		// https://mvnrepository.com/
		//driver.get("https://www.selenium.dev/");
		//driver.navigate().to("https://mvnrepository.com/");
		
		
		// to(URL url)
		
		// We need to create Instance or Object for URL
		// URL url = new URL("https://www.naukri.com/");
		// driver.navigate().to(url);
		// In the same browser window if you want to enter another URL the following MEHOTDS should be used
		// First the browser will load the "https://www.selenium.dev/" then in the same Browser it load the 
		// "https://mvnrepository.com/" then it will load "https://naukri.com/ 
		// driver.get("https://www.selenium.dev/");
		// driver.navigate().to("https://mvnrepository.com/");
		// URL url = new URL("https://www.naukri.com/");
		
		
		//quit()
		// Close Main window as well as Child windows. In the Task manager Chrome.exe will not be seen
		//driver.quit();
		
		//close()
		//driver.quit();
		// Close Main window but not Child windows. In the Task manager still the Chrome.exe still runs
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://mvnrepository.com/");
		
		Thread.sleep(3000);
		
		URL url = new URL("https://www.naukri.com/");
		
		driver.navigate().to(url);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
