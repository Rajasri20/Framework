package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_DragAndDropBy_SliderTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement slider =driver.findElement(By.tagName("span"));
		// Used only tag name("span") to find out the WebElement. Even though there is class name but went with tag name
		// this way also we cen fin a WebElement
		
		Actions actions =new Actions(driver);
	
		actions.dragAndDropBy(slider, 100, 0).perform();
		//dragAndDropBy(WebElement source,int xOffset,int yOffset), to see this hit ctrl space bar
		//WebElement source is 'slider'(SEE LINE 25) 
		//int xOffset, is how many pix cells you want the SLIDER to move towards YOUR RIGHT in give any number. EX: 100 0R 300
		//int yOffset, moves the SLIDER towards YOUR LEFT. I didn't want to move in int yOffset way so gave value as 'ZERO'
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
