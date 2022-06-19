package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_AssertOrHardAssert_True_ {
	
	/* AssertOrHardAssert 
	 * 
	 * Why we call it as HARD ASSERT?
	 * 
	 * Once the ASSERT fails, it Ignores the REST of the CODE, that is why it is CALLED Hard Assert
	 * 
	 * 
	 * */
	
	
	/* REQUIREMENT 
	 * 
	 * By DEFAULT 'Individual' RADIO BUTTON button must be SELECTED 
	 * 
	 * */
	
	@Test
	
	public void test () throws Exception {
		WebDriver driver = null;
		
		Assert.assertNull(driver);
		
				// 'driver' is 'null', Assert.assertNull(driver); verified the given VALUE is NULL, 
		// So the SCRIPT will be passed
		
		// Type in 'Asse', ctlr space bar, PUT a DOT, the type in 'assertN' hit ctrl space bar
		// select assertNull(Object,Object): void, pass the 'Object' value as 'driver'
		
		
		// Assert.assertNotNull(driver);
		
		// Assert.assertNotNull, verified that 'driver' is NotNull so script failed
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		Assert.assertNotNull(driver);
		
		// 'driver' is 'notnull', Assert.assertNotNull(driver);  
		// verified that given VALUE is NotNULL, So the SCRIPT will be passed
				
		// Type in 'Asse', ctlr space bar, PUT a DOT, the type in 'assertN' hit ctrl space bar
		// select assertNotNull(Object,Object): void, pass the 'Object' value as 'driver'
		
		driver.manage().window().maximize();
		
		// driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		
		driver.get("https://www.thepancard.com/newpancard.php");
		
		Thread.sleep(2000);
		
		boolean actualValue = driver.findElement(By.id("rblCategory_0")).isSelected();
		
		// "isSelected()" method is to know the STATUS of the "RADIO BUTTON",
		// Store the VALUE in one VARIABLE which is "actualValue" 
		
		/* Assert.assertEquals */
		
		// boolean actualValue = driver.findElement(By.id("rblCategory_0")).isSelected();
		 // boolean expecteValue = true;
		 // Assert.assertEquals(actualValue, expectedValue);
		
		// "actualValue, expecteValue" are EQUAL, SCRIPT will be PASSED
		 
	 
		Assert.assertTrue(actualValue);
		
		// 'boolean' returns True or false, the "actualValue"(radio button for 'Individual') 
		// on the APPLICATION BY DEFAULT should be SELECTED. 
		
		// Assert.assertTrue(actualValue);, Verified that the RADIO BUTTON was selected, 
		// so SCRIPT will be PASSED.
		
		
		/* NOW WHILE RUNNING the SCRIPT MANUALLY change the value to 'Army' , 
		 * 
		 * TestNG Throws ERROr saying(Click on TestNG tab), 
		 * 'expected is True but found false'.
		 * 
		 * the BROWSER Won't Close Because of the ERROR
		 * 
		 */
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
