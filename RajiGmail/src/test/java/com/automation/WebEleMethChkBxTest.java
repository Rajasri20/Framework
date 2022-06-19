package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEleMethChkBxTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.thepancard.com/");
			
			driver.findElement(By.linkText("Apply New PAN Card")).click();
			
			WebElement ChckBxTermsCondi = driver.findElement(By.id("agreeproof"));
			
			System.out.println(ChckBxTermsCondi.isSelected()); //Returns TRUE because By default it is selected 
			
			Thread.sleep(2000);
			
			ChckBxTermsCondi.click(); // clicks to unchek 
			
			Thread.sleep(2000);
			
			System.out.println(ChckBxTermsCondi.isSelected()); //Now Returns FALSE because it is Deselected
			
			Thread.sleep(2000);
			
			driver.quit();

	}

}
