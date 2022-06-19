package com.automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.core2.BaseSript_RootScript_FrameworkScrpt;
import com.automation.helper.ExcelHelper;
import com.automation.screens.LoginPage;
import com.automation.screens.LogoutPage;
import com.automation.screens.RegisterPage;


public class HybridFW_TC_003_CreateRecrd extends BaseSript_RootScript_FrameworkScrpt {
	/* 3. HYBRID FRAMEWORK */
	
	/* By combining both "DataDriven FrameWork"(HARD CODED OBJECT PREPERTIES) and 
	 * "Page Object Model Model(HARD CODED "VALUES OF TESTDATA") 
	 * we can Over Come the DRAWBACKS
	 * 
	 *  
	 */
	
	// Copy entire "PageObjectModel_FW_TC_002_CreateRecrd" script and paste it over here
	// In the METHOd level give the PROVISION to Accept the VALUES from OUSTSIDE and 
	// REMOVE the HARD CODED TEST DATA from "Login, CreateRecord, LogoutPage" place the
	// SAME VALUES whatever you received from outside/
	
	
	/* How to get TestData*/
	
	/* To EXECUTE this TestData is REQUIRED, so go to DataDriven_FrameWork_TC_001_CreateRecrd,
	 * COPY @DataProvider, where our Excel DATA is there, and PASTE it over here.
	 *  
	 * Now this script is the combination of Data Driven FM and HybridFM
	 *  
	 *  RUN from tesng.xml
	 *  */
	
	@Test(dataProvider = "gettestData")
	public void createRecord(String userName, String password, String firstName,
			String lastName, String gender, String date, String month, String year, 
			String Address, String mobileNumber) throws Exception{
	// Login
	LoginPage loginPage = new LoginPage(driver);
	loginPage.Login(userName, password);
	
	// CreateRecord
	RegisterPage registerPage = new RegisterPage(driver); 
	registerPage.createRecord(firstName, lastName, gender, date, month, year, Address, mobileNumber);
	
	// LogoutPage
	LogoutPage logoutPage = new LogoutPage(driver);
	logoutPage.logout();
	
	}
	
	@DataProvider(name = "getTestData")
	public Object[][] getTestData() throws Exception {
		return ExcelHelper.getTestData("D:\\FrameWorkTD.xlsx", "Sheet1");
}
}
