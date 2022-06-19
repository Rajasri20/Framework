package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jva_Sync_WebDriWait_ImgOrBanner_CtrlVisbleNPrsnt {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://havells.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/homepagebanners/lighting_main_banner.html']")));
		
		// visibilityOfElementLocated = Wait until the Banner is VISIBLE
		
		driver.findElement(By.xpath("//img[@src='/homepagebanners/lighting_main_banner.html']")).click();
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
