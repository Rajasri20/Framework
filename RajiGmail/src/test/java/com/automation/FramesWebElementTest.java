package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//frame with 'WebElementframeElement', hit ctrl space bar, will see this option

public class FramesWebElementTest {

	public static void main(String[] args) throws Exception{
			
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			// 1st find the 'FRAME' as WebElement, then 'Switch to Frame'
			WebElement frame = driver.findElement(By.name("packageListFrame"));
			
			driver.switchTo().frame(frame); 
			// frame with 'WebElementframeElement', hit ctrl space bar, will see this option. was soon as 
			// selecting the 'WebElementframeElement' option it will choose 'WebElementframeElement' as "frame", this frame is from the above WebElement
			// In the HTML body scroll up to 'iframe' region and look for "Name or Id" in the tag
			
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
