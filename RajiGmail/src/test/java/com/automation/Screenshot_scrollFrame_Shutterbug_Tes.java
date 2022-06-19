package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.CaptureElement;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_scrollFrame_Shutterbug_Tes {

	public static void main(String[] args) throws Exception {

		// 'Selenium Shutterbug' is 3rd Party Utility tool to take full/Complete
		// screenshot.

		// THE REQUIREMENT IS TAKING "COMPLETE FRAME" SCREENSHOT(Scrolls all the way down of Frame and takes )
		// "FULL_Scroll" of the Frame.
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement frame = driver.findElement(By.name("packageListFrame"));
		
		Shutterbug.shootFrame(driver, frame, CaptureElement.FULL_SCROLL ).save("D:\\Screenshots");

		// "Shutterbug" is a Class, which is coming from Selenium Shutterbug package.
		// "Shoot frame" is a Static Method(you will see 'S' symbol beside "Shoot page"),
		// so no need to create an 'Instance'.
		// multiple "Shoot frame" Methods are there choose the 3rd one,
		// when you use this Method need to pass 3 parameter,
		// 1st is 'Webdriver type of parameter', then 2nd one is 'WebeElement frame', 3rd is Captureelement capture
		// 'Webdriver type of parameter' is 'driver'
		// 'WebeElement frame', is a 'frame'. This is the webElement I want to take screenshot, pass it
		// type in 'CapE', ctrl ctrl space bar select 'Capture Element', it is a "Enum". we don't define "Enum"
		// then type in ".fullsc" hit ctrl space bar, select "FULL_Scroll: Capture Element"
		// Our Requirement is "FULL_Scroll", so select this
		// then'.save("String path")', give the path to save the file.

		Thread.sleep(5000);

		driver.quit();
		
		// Open 'D: drive' you will see full frame screenshot with 'Date and Time Stamp'

	}

}
