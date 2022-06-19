package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_ParentFrame_Test {

	public static void main(String[] args) throws Exception {
	
		//Shriram did'nt have any real time example
		
		//Example: FRAME1 has FIRST NAME and MOBILE NUMBER. FRAME2 has LAST NAME
		
		// FRAME1 is PARENT and FRAME2 is CHILD 
		
//Parent Frame() method …… Is used when there is a dependency(PARENT AND CHILD) on the FRAMES
//Suppose we are in CHILD FRAME and need to switch to Parent FRAME, then use  Parent Frame() method

		// After entering the LAST NAME, FRAME2 MUST EXIT TO PARENT FRAME TO enter the MOBILE NUMBER
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.No Reatime Example Provided");
		
        driver.switchTo().frame(0); // switches from 1st frame and finds the below CONTROL 
		
		driver.findElement(By.id("FirstName")).sendKeys("Rajsri");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1); // Now it switches from 1st frame to 2nd FRAME and finds the below CONTROL 
		
		driver.findElement(By.id("LastName")).sendKeys("Surakanti"); //LastName is a CHILD FRAME(FRAME2)
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame(); // Child FRAME i.e, FRAME2 exits to ParentFrame. 
		//then it Switches to FRAME 1(Parent Frame)
		
		driver.switchTo().frame(0); // Now it switches from 2nd(CHILD) frame to 1st(PARENT) Frame 
		//and finds the Mobile Nuber's CONTROL 
		
		driver.findElement(By.id("MobileNumber")).sendKeys("5732020562");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
