package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTest {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		
		// LOCATORS or STRATEGIES
		
		// <input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" 
		// title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		// type, name, id, class, value, title, onclick are called Attribute Names. 
		// The VALUES in DOUBLE QUOTES("") are called ATTRIBUTE VALUES
		
		
		//driver.findElement(By.id("searchBtn")).click();
		
		//driver.findElement(By.name("searchBtn")).click();
		
		//driver.findElement(By.className("chkavailabilityBtn")).click();
		
		
		
		// FULL XPATH
		
		// IF THE "name, id, class" ARE GIVEN IN THE WEB APPLICATON YOU NEED TO BUILD XPATH. 
		// ON HTML TAG RIGHT CLICK, SELECT COPY AND SELECT FULL XPATH "/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]"
		
		//AND PASTE IN ECLIPSE, THE XPATH COPIES FROM START OF THE BODY OF THE XML TO 
		//THE REQUIRED CONTROL(THE REQUIRED CONTRIL IS IN THE TAG IS INPUT[9])
		//THIS METHOD IS NOT RECOMMENDED BECAUSE IF THERE ARE ANY CHANGES IN COMING RELEASES 
		//THE DEVELOPER MIGHT ADD OR DELETE TEXT BOXES 
		
		//driver.findElement(By.xpath("/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]")).click();
		
		
		
		//RELATIVE XPATH .... INTERVIEW POINT OF VIEW THIS IS VERY USEFULL, THEY MAY ASK YOU HOW TO WRITE XPATH
		
		//Relative xpath syntax

		// Double forward slashes //tagname[@PropertyName=PropertyValue'']

		//ex: input[@value='Check Availability']
		
		//driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		
		// input[@title='Search']
		
		//driver.findElement(By.xpath("//input[@title='Search']")).click();
		
		//driver.findElement(By.xpath("//input[@title='Search']")).click();
		
		
		
		//CssSelector
		
		// 1. Full or Absolute or Complete CssSelector:
		
		//driver.findElement(By.cssSelector("html>body>div:nth-of-type(4)>div>form>div:nth-of-type(1)>div>div:nth-of-type(1)>input:nth-of-type(9)")).click();
		
		
		//Relative CssSelector:
		
		//Syntax:
		
		//TagName[PropetyName='PropetyValue']

		driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
