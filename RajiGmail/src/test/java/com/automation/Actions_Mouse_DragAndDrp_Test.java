package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Mouse_DragAndDrp_Test {
	
public static void main(String[] args) throws Exception {
	
	// DragAndDrp()
	
// To perform DragAndDrp action we need "Source" and "Target or Destination" files.
	// "Source" is 'Drag me to my Target'
	// "Target or Destination" is 'drop here'
// we need to find the WebElement controls individually for both of them
	
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://api.jquery.com/droppable/");
			
			driver.switchTo().frame(0);//both source and target WebElements are in single frame only
						
			WebElement source = driver.findElement(By.id("draggable")); 
			
			WebElement target = driver.findElement(By.id("droppable"));
			
			Actions actions = new Actions(driver); // driver is of WebDriver parameter(see line 24)
			
			actions.dragAndDrop(source, target).perform(); // To Execute 'dragAndDrop' you have to call 'perform' by the end 
			//dragAndDrop is of 'WebElement source, WebElement target'(hit ctrl space bar, you will see this)see lines 32, 37	
			
			Thread.sleep(5000);
			
			driver.quit();

		}
	}


