package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Creating WebElements as a Variables
	
	@FindBy(id = "username")
	private WebElement txtUserName = null;
	
	// WebElement is an "Interface" and "NON PREIMITIVE", so the default value of is "null"
	
	@FindBy(id = "password")
	private WebElement txtPassword = null;
	
	@FindBy(id = "Registration Desk")
	private WebElement lnkRegistration = null;
	
	@FindBy(id = "loginButton")
	private WebElement btnLogin = null;
	
	
	// Creating a "CONSTRUCTOR()" for INITIALIZing the 'driver'
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this); // New in POM FM
		
		// Access Modifier with No RETUN TYPE 
		
		// type 'initi', ctrl space bar, 
		// select the 'initElements(SearchContext SearchContext, Object page):void PageFactory
		
		// "initialize" all the WebElements with 'driver' to 'this' CLASS
		// Internally 'initElements(SearchContext SearchContext, Object page):void PageFactory
		// will find out all the above elements with the help of the 'driver', 
		// without writing this code there is no 'driver'
	}
	
	
	
	// Creating METHOD to "User Interactions"
	
	public void Login(String userName, String password) {
	
		txtUserName.sendKeys(userName);
		
		txtPassword.sendKeys(password);
		
		lnkRegistration.click();
		
		btnLogin.click();

}
}
