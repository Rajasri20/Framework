package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesIndxTest {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		// If you do not switch to FRAME you will get "No Such Element Exception error"
		
		// HOW TO KNOW WHETHER THE CONTROLL IS A PART OF FRAME?
		// Go to the particular FRAME, in the empty pace right click, you will see 
		// "View frame source and Reload Frames" options. OR 
		// in the HTML tags area Scroll up you will see "iframe or frame" html tag, 
		// once you hover the tag the FRAME will be highlighted in yellow.
		
		// HOW TO KNOW WHETHER ITS A 1st, 2nd OR 3rd FRAME?
		// ctrlF on key board and create Xpath for FRAME, 
		// the following is the Xpath //iframe 
		// press enter on the right hand side you will number of FRAMES, click on UP & Down arrows
		
		driver.findElement(By.linkText("org.openqa.selenium")).click(); 

		// This Control is in 1st frame, Index point of view zero
		// once it clicks on the above link, the color will change to yellow and related options of the link will be displayed below
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
