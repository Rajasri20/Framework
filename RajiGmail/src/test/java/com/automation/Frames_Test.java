package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		// Go to Web page, scroll up and see for "iframe" tag, when you hover the mouse on the tag 
		// the whole region of the drop down displays in a FRAME. 
		// That is why we need to Switch to FRAME (by nameOrId or by index, WebElementframeElement, when you hit CTRL Space bar you will see these)
		// otherwise we get "No Such Element Exception" error when you run the programe.
		
		WebElement lstcars = driver.findElement(By.id("cars")); 
		
	// Each and every CONTROL is a WebElement(hit CTRL Space bar select the "WebElement Web Driver one")
			
		lstcars.sendKeys("Opel");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
