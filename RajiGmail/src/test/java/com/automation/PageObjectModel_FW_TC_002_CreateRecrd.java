package com.automation;

import org.testng.annotations.Test;

import com.automation.core2.BaseSript_RootScript_FrameworkScrpt;

import com.automation.screens.LoginPage;
import com.automation.screens.LogoutPage;
import com.automation.screens.RegisterPage;


public class PageObjectModel_FW_TC_002_CreateRecrd extends BaseSript_RootScript_FrameworkScrpt {
	
	@Test
	public void createRecord() throws Exception{
	// Login
	LoginPage loginPage = new LoginPage(driver);
	loginPage.Login("Admi", "Admin123");
	
	// CreateRecord
	RegisterPage registerPage = new RegisterPage(driver); 
	registerPage.createRecord("RFT", "LFT", "Male", "11", "April", "1991", "Hyderabad", "9999999");
	
	// LogoutPage
	LogoutPage logoutPage = new LogoutPage(driver);
	logoutPage.logout();
	}
}
