package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		//<a href="https://www.thepancard.com/newpancard.php"><b>Apply New PAN Card</b></a>

		//in the syntax, 'a' indicates anchor tag which has link, after link some text is also displayed thats why is it called linktext 

		
		//driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		
		//Partial LinkText:

			//if the text is of Dynamic in(which always changes) nature. Forexample after the Text if have date is displaying then we should use partial LinkText
			//because the Date is not static in nature but it is Dynamic in nature, it always changes, 
			//lets assume that it the below example has Date in the text, if you excute the same tou will get errors in the Programme,
			//why bacause the Date is Dynamic in nature it always changes then we need to choose "Partial LinkText" Locator.  

			 //<a href="https://www.thepancard.com/newpancard.php"><b>Apply New PAN Card12252021</b></a>
		
			driver.findElement(By.partialLinkText("Apply New PAN Card12252021")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
