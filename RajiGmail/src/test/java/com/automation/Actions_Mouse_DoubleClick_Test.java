package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Mouse_DoubleClick_Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		
		WebElement divtag = driver.findElement(By.tagName("div")); // element is of only 'Div' tag. No name, id or class are given 
		// while execution of the above statement Selenium executes it from right to left 
		// and finds the Address or Reference of the 'div' tag will be stored in ref variable, 'divtag' is a reference variable  
		
		Actions actions = new Actions(driver);  // driver is of WebDriver parameter(see line 17)
		
		actions.doubleClick(divtag).perform(); // doubleClick is of 'WebElement target'(hit ctrl space bar, you will see this)see line 25
		
		// To Execute doubleClick, you have to call 'perform()' by the end
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
