package com.automation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_KeyBoard_pageDwnTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.goibibo.com/");
	
		Actions actions = new Actions(driver); // driver is of WebDriver parameter(see line 15)
		
		actions.sendKeys(Keys.PAGE_DOWN).perform(); //after actions you type 'sendkeys and select it'
		
		Thread.sleep(1000);
	
// sendKeys is of Actions Class method not a WebElement method.
//You will see 2 options but You should select the following one, "sendKeys(CharSequence.... keys)"
	//In CharSequence palce, type in "Keys" ctrl space bar and select "Keys with E symbol" then a 'DOT' then select ''PADGE_DOWN' option
// Keys is a 'ENUM' to represent a group of 'CONSTANTS'. You will see 'E' symbol besides 'Keys'. To invoke "Keyboard" action
// PAGE UP or PAGE DOWN(Scroll) Should be performed on the 'BROWSER' not on the 'WEBELEMENT'
// This method simulates keyboard typing action on focused or active WebElement	
	
		actions.sendKeys(Keys.PAGE_DOWN).perform(); // 2 times PAGEDOWN
		
		Thread.sleep(2000);
		
// If you want to execute same statement multiple times, without writing it multiple times, 
// using 'for loop' we can do it in single statement

		//for(int index=1; index<=3; index++){
			
			//actions.sendKeys(Keys.PAGE_DOWN).perform();
			
			//Thread.sleep(2000);
		//}
		
		actions.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000);
		
		actions.sendKeys(Keys.PAGE_UP).perform(); // 2 times PAGEUP
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
