package com.automation;

public class FrameWorks_Notes   {
	
	
	
	/* FrameWorks */
	
	/* A Structured reusable approach is called as Framework. */
	
	
	/* 1. DataDriven FrameWork 
	 * 
	 * By using "DataDriven FrameWork" we SEPARATE the "TESTDATA" from the "SCRIPT" 
	 * 
	 * There are no HARD CODED Test Data, and we are RETEIVING MULTIPLE SETS of DATA 
	 * from Excel, we call it as a "DataDriven FrameWork"
	 * 
	 * ex: driver.findElement(By.id("userName")).sendKeys(userName);
	 * 
	 *  ".sendKeys(userName)"; called TEST DATA
	 *   
	 *  but in the DataDriven FrameWork the DRAW BACK is HARD CODED "OBJECT PROPERTIES", 
	 *  "OBJECT PROPERTIES" nothing but "WEBELEMTS or CONTROLS"
	 *  
	 *  If any CHANGES RELATED to the "OBJECT PROPERTIES" go to each and every SCRIPT and  
	 *  change the CODE, there might be N-NUMBER OF SCRIPTS so which is NOT RECOMMENDED. 
	 *  
	 *  
	 *  ex: driver.findElement(By.id("userName")).sendKeys(userName);
	 *  
	 *  in the ABOVE EXAMPLE "driver.findElement(By.id("userName"))" is called "OBJECT PROPERTIES"
	 *  
	 *  ".sendKeys(userName)"; called TEST DATA
	 */
	
	
	 /*  HOW TO OVERCOME HARD CODED "OBJECT PROPERTIES"?
	 *  
	 *  By USING 'Page Object Model' we can REMOVE the "HARD CODED OBJECT PROPERTIES" from
	 *  SCRIPT. This is the ADVANTAGE of the 'Page Object Model'  
	 * 
	 * */
	
	
	/* 2. Page Object Model(POM)
	 * 
	 * DRAW BACK of the Page Object Model(POM)IS HARD CODED "VALUES OF TESTDATA", 
	 * 
	 * EX: loginPage.Login("Admi", "Admin123");
	 * 
	 * TWO NEW STATEMENTS ARE ADDED TO THIS FRAME WORK
	 * 
	 * In  Page Object Model(POM) every page is REPRESENTED as a CLASS FILE  
	 * 
	 * In POM we CREATE SEPARATE CLASS FILE for each and every "PAGE or SCREEN"
	 * 
	 *  "CLASS FILE" is CENTRALISED repository, in COMING RELEASE if the "cONTROL" OR
	 *  "OBJECT PROPERTY" CHANGES, YOU CAN JUST TO THE CLASS FILE AND CHANGE.
	 * 
	 * Each and every "WEB ELEMENT" is REPRESENTED as "VARIABLE" 
	 * 
	 * "private webElement txtUserName = null;", this whole code is called as "VARIABLE" 
	 * 
	 * "private" is ENCAPSULATION, ENCAPSULATION is USED for SECURITY Purpose
	 * 
	 * 
	 * "'@findBy' ANNOTATION"
	 * 
	 * Go to Web page right clik INSPECT find the CONTROL, and
	 * ABOVE the VARIABLE write a '@findBy' ANNOTATION for the WEBELEMENT,
	 * 
	 * @findBy(id = "username")
	 * private webElement txtUserName = null; 
	 * 
	 * '@findBy' a NEW ANNOTATION for Page Object Model(POM) 
	 * 
	 * 
	 * "USER INTERACTIONS"
	 * 
	 * EX: Enter the DATA into the "username" field 
	 * 
	 * "USER INTERACTIONS" are REPRESENTED as METHODS
	 * 
	 * public void login(){
	 * 
	 * txtUserName.sendKeys("Admin")
	 * }
	 * 
	 * To IDENTIFY ALL THESE "CONTROLS" WE NEED A "driver", you NEED to 'INITIALIZE' the
	 * "driver" through the "CONSTRUCTOR", "CONSTRUCTOR" will RECEIVE the VALUES from outside 
	 * 
	 * public LoginPage(WebDrive driver){
	 * 	pagefactory.initElements(driver,this);
	 * }
	 * 
	 * public is ACCESS MODIFIER, LoginPage is a class name 
	 * 
	 * "initElements()" internally sELENIUM finds out the ELEMENTS with the HELP of 'driver'
	 * 
	 * USER INTERACTION method is an "INSTANCE" METHOD, COPY the CLASS NAME from Loginpage class,
	 * which is "loginPage" 
	 * 
	 * now go to PageObjectModel_FW_TC_002_CreateRecrd, create an "INSTANCE" for 'loginPage" 
	 * 
	 * loginPage login = new LoginPage(driver);
	 * login.loginPage();
	 * 
	 * "ctrl click" on loginPage();, it will naviagte you to the "loginPage Class File Script"
	 * 
	 *  "ANY OBJECT PROPERTIES RELATED TO THE "LoginPage", you can change over here
	 * 
	 * */
	
	
	/* 3. HYBRID FRAMEWORK */
	
	/* By combining both "DataDriven FrameWork"(OBJECT PREPERTIES) and 
	 * "Page Object Model Model(HARD CODED "VALUES OF TESTDATA") 
	 * we can Over Come the DRAWBACKS
	 * 
	 *  
	 */
	
}

