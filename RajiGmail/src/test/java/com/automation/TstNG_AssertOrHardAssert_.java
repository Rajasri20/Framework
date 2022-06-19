package com.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TstNG_AssertOrHardAssert_ {
	
	/* AssertOrHardAssert 
	 * 
	 * Why we call it as HARD ASSERT?
	 * 
	 * Once the ASSERT fails, it Ignores the REST of the CODE, that is why it is CALLED Hard Assert
	 * 
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
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		Assert.assertNotNull(driver);
		
		// 'driver' is 'notnull', Assert.assertNotNull(driver);  
		// verified that given VALUE is NotNULL, So the SCRIPT will be passed
				
		// Type in 'Asse', ctlr space bar, PUT a DOT, the type in 'assertN' hit ctrl space bar
		// select assertNotNull(Object,Object): void, pass the 'Object' value as 'driver'
		
		driver.manage().window().maximize();
		
		// driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		
		Thread.sleep(2000);
		
		String actualValue = driver.getTitle();
		
		// 'getTitle' is a "actualValue" which is coming from 'APPLICATION'
		// 'getTitle' is a "String"
		
		// String expecteValue = "OrangeHRM";
		
		String expecteValue = "Orange HRM";
		
		// "expecteValue" is always from your "Manual or Functional TEST CASE"
		
		Assert.assertEquals(actualValue, expecteValue);
		
		// Assert.assertEquals Verifies that is the "actualValue is EQUALS TO expecteValue" 
		// then pass the STEP other wise Fail the SCRIPT.
		
		// "assertEquals" Verified that the the "actual and expected" are EQUALS,
		
		// so SCRIPT will be PASSED.
		
		// NOW CHANGE THE 'EXPECTED VALUE' TO "Orange HRM"(Given space between the words),
		// then it will throw ERROr because, "actual and expected" are NOT EQUALS,
		// there is a SPACE between the words
		// String expecteValue = "OrangeHRM";
		
		
		/* NOW RUN the SCRIPT, 
		 * 
		 * TestNG Throws ERROr saying(Click on TestNG tab), 
		 * 'expected [Orange HRM]  but found [OrangeHRM]'.
		 * 
		 * Once the Assertion fails, it will LOG the MESSAGE and REST of the CODE will be IGNORED
		 * 
		 * that is why BROWSER Won't Close Because of the ERROR
		 * 
		 */
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	

}
