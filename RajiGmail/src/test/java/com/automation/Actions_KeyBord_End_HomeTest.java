package com.automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_KeyBord_End_HomeTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.goibibo.com/");
	
		Actions actions = new Actions(driver); // driver is of WebDriver parameter(see line 16)
		
		actions.sendKeys(Keys.END).perform(); //after actions you type 'sendkeys and select it'
		
		Thread.sleep(3000);
	
// sendKeys is of Actions Class method not a WebElement method.
//You will see 2 options but You should select the following one, "sendKeys(CharSequence.... keys)"
	//In CharSequence place, type in "Keys" ctrl space bar and select "Keys with E symbol" then a 'DOT' then select ''END' option
// Keys is a 'ENUM' to represent a group of 'CONSTANTS'. You will see 'E' symbol besides 'Keys'. To invoke "Keyboard" action
// END or HOME(Scroll) Should be performed on the 'BROWSER' not on the 'WEBELEMENT'
// This method simulates keyboard typing action on focused or active WebElement	
	
		actions.sendKeys(Keys.HOME).perform(); // HOME is start of the page

		Thread.sleep(3000);
		
		driver.quit();

		

	}

}
