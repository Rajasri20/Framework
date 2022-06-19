package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDnGetOptionsTest {

public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult"); // Frames concept is required to run the below
		
		WebElement listCars = driver.findElement(By.id("cars"));
		
		Select selectRef = new Select(listCars);
		
		System.out.println(selectRef.isMultiple());
		
		// Requirement is to Get the list of options/webElements and display in console
		
		List<WebElement> listref = selectRef.getOptions(); 
		// Type Get and hit Ctrl Space bar, 
		// in the pop up along with Get Options method you will see List<WebElement>, 
		// blindly you have to write List<WebElement> (List comes from Java.util) expression on the left hand side and create a Reference variable for List, here it's listref 
		
		// To retrieve the stored values from listref we need to use Enhanced for loop
		
		for (WebElement webElementref:listref) {
			
			// 1st write colon: in the paranthesis and to the right side specify from where we need to retrieve the values.
			// to the left side specify the WebElement and a reference variable to WebElement as WebElementref  
			// In the above for loop from listref we need to retrieve the values, WebElement Values are stored in the listref so write WebElement on lest side
			
			System.out.println(webElementref.getText());
			
			driver.quit();
		}
		}

	}


