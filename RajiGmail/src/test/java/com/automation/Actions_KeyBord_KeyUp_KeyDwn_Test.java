package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_KeyBord_KeyUp_KeyDwn_Test {
	
// Keydown() ... 'Hold' the 'Ctrl' key
// Keyup() .... 'Release' the 'Ctrl' key
// These 2 methods are applicable to the following "Modifier Keys" only, "Ctrl, Alt, Shift"
	
// If the HTML tag is not of a 'SELECT' tag, but we want to select "MULTIPLE OPTIONS" from the Drop Down,
// then we should use the Above methods
// If the Tag if of a 'SELECT' tag, then using 'SELECT CLASS METHODs' we can select "MULTIPLE OPTIONS" from the Drop Down  
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
// The 'REQUIMENT' is, HOLD THE CONTROL KEY DOWN on your keyboard and select the MULTIPLE OPTIONS from the DROPDOWN
// Assuming that the above URL does not have SELECT HTML TAG
		
		Actions actions = new Actions(driver); // driver is of WebDriver parameter(see line 20)
		
		actions.keyDown(Keys.CONTROL).perform(); //after actions you should type 'KeyDown' and select it,
		// 'CONTROL'is 'Ctrl' on keyboard
		
// KeysDown is of Actions Class method not a WebElement method.
// You will see 2 options but You should select the following one, "keyDown(CharSequence.... keys)"
// In CharSequence place, type in "Keys" ctrl space bar and select "Keys with E symbol" then a 'DOT' then select ''CONTROL' option
// Keys is a 'ENUM' to represent a group of 'CONSTANTS'. You will see 'E' symbol besides 'Keys'. To invoke "Keyboard" action
// This method simulates keyboard typing action on focused or active WebElement	
		
		actions.click(driver.findElement(By.xpath("//option[text()='Volvo']"))).perform();
			// click is of 'WebElement target' parameter. On the Browser, Inspect and find element, we have tag(options tag) along with text
			// <option value="volvo">Volvo</option>
			// this is the xpath "//option[text() ='Volvo']"
		
		Thread.sleep(2000);
		
		actions.click(driver.findElement(By.xpath("//option[text()='Opel']"))).perform();
		
		Thread.sleep(2000);

		actions.click(driver.findElement(By.xpath("//option[text()='Audi']"))).perform();
		
		Thread.sleep(2000);
		
		actions.keyUp(Keys.CONTROL).perform(); // keyUp is, Release CONTROL(Ctrl)

		Thread.sleep(5000);
		
		driver.quit();

	}

}
