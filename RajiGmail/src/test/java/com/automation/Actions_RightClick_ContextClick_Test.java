package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_RightClick_ContextClick_Test {

	public static void main(String[] args)throws Exception {
	
		// RightClick Or ContextClick
		//contextClick(WebElement webElement)
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
//When you right click On the control if there is no "INSPECT", then press F12 in your keyboard, then clock on Spy, 
//then go to Control and click on it
		
//HOW TO BUILD XPATH based on 'span' tag with Text. there must be Text in 'span' tag 

//When there is one ‘span’ tag control you can use ‘findelement by ‘ tag name strategy(EX:"span"). if there are more ‘span’ tags(in the browser ctrl f and type //span, it displays number of span tags) 
//you can not find element by tag name strategy, you should use TEXT BASED ‘xpath’ using text.
//WE can use find element in different ways but the above one is NEW
		
		Actions actions =new Actions(driver);
		
		actions.contextClick(rightClick).perform();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
