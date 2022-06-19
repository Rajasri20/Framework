package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_ClikHold_ReleaseTest {

	public static void main(String[] args) throws Exception {
		
		// DragAndDrp() can also be performed in 2 different ways by using
		
		// clickAndHold() and
		// release()
		
	// To perform DragAndDrp action we need "Source" and "Target or Destination" files.
		// 'clickAndHold' at "Source" 
		// 'release' at "Target or Destination"
	// we need to find the WebElement controls individually for both of them
		
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://api.jquery.com/droppable/");
				
				driver.switchTo().frame(0);
				
				WebElement source = driver.findElement(By.id("draggable")); 
				// element is of 'Div' tag, findElement By id
				// while execution of the above statement Selenium executes it from right to left 
				// and finds the Address or Reference of the 'div' tag will be stored in ref variable, 'source' is a reference variable  
				
				WebElement target = driver.findElement(By.id("droppable"));
				
				Actions actions = new Actions(driver);// driver is of WebDriver parameter(see line 27)
				
				actions.clickAndHold(source).perform(); // Mouse clickAndHold at 'source'
				// To Execute 'dragAndDrop' you have to call 'perform' by the end 
				//dragAndDrop is of 'WebElement source, WebElement target'(hit ctrl space bar, you will see this)see lines 35
				
				actions.release(target).perform(); // Mouse release at 'target'
				// To Execute 'dragAndDrop' you have to call 'perform' by the end 
				//dragAndDrop is of 'WebElement source, WebElement target'(hit ctrl space bar, you will see this)see lines 40
				
				Thread.sleep(5000);
				
				driver.quit();

			}
		}

