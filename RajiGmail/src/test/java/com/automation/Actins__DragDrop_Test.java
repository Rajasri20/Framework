package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actins__DragDrop_Test {

	public static void main(String[] args) throws Exception {
		
//Copied this from PDF, for mine I am getting the exception at Frames, not able to resolve. 
		// but the entire code is correct
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
