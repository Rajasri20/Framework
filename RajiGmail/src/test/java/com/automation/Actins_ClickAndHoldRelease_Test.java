package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actins_ClickAndHoldRelease_Test {

	public static void main(String[] args) throws Exception {
		
//Copied this from PDF, for mine I am getting the exception at Frames, not able to resolve. but the entire code is correct
		
		// Frames
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(source).perform();
		
		actions.release(target).perform();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
