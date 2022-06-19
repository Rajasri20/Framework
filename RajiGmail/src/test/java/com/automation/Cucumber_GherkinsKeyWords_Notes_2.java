package com.automation;

public class Cucumber_GherkinsKeyWords_Notes_2 {
	
	// Manual or Functional Test case is the BASE
	
	/* PRE-REQUISITS TO WRITE A "CUCUMBER CODE" */
	
	/* Go to your RajiGmail Project,
	 * Click on "src", then click on 'test',
	 * Go to "resources" Folder, For the "1stTIME", we nee to create a 'features' folder   
	 * then RIGHT CLICK on 'resources' folder, select, 'New', then click on 'Folder' 
	 * Folder window displays, give a meaningful NAME, like 'features', then click on Finish.
	 * Now Inside the new 'features' folder, create a 'Features' file,
	 * RIGHT CLICK on 'features' folder select, 'New', then click on 'File',
	 * 'File' window displays, give File NAME followed by ".feature" EXTENTION,
	 *  EX: "OrangeHRM.feature" 
	 * like which Application your working for "OrangeHRM.feature", 
	 * DO NOT forget to mention the ".feature EXTENTION"  
	 * then click on Finish. 
	 * we Added Cucumber plugin thats why iT GENERATES FEATURE TEMPLATE, 
	 * based on this you have to write feature file or you can   
	 * Remove this and write your own CODE
	 *  
	 * 
	 * */
	
	
	/* CUCUMBER TEST CASE  
	 * 
	 * Feature: Orange HRM Application
	 * One END 2 END FUNCTIONALITY or which FUNCTIONALITY 
	 * we are going to Test
	 * 
	 * AFTER COLON(:), YOU MUST GIVE SPACE OTHERWISE IT CAN NOT RECOGNIZE THE 'Feature and Scenario' 
	 * 
	 * @Login
	 *  it is a "Tag Name", not a ANNOTATION. Give SHORT NAME 
	 *  
	  Scenario: Login 
	  ONE MANUAL or ONE FUNCTIONAL TEST CASE
	  
	   	Given OpenBrowser and Enter the url
	   	Pre-condition
	   	
	   	"OpenBrowser and Enter the url" is called as a 'STEP'
	   	 
	    When Enter UserName and PassWord, Hit on Login
	    Condition/Action
	    
	    Then Welcome page displayed
	    Post Condition/Verification
	    
	    When Hit on Logout
	    Condition/Action
	    
	   	And Close the Browser
	    ADDTIONAL CONDITION to "Given" or "When" or "Then"
	    
	    Once you SAVE the 'Feature file' it will give some WARNING MESSAGES yellow COLOR
	    
	     Place CURSOR on the Program, Right Click, click on "Pretty Format" for Alignment.
	     
	     RUN the 'Feature file', "STEP DEFINITIONS" will be GENERATEd in Console 
	     
	     */
	
	
	/* STEP DEFINITIONS 
	 * 
	 * From the Cucumber 'Feature File' hit on RUN button, 
	 * Each and every STEP will be converted as "STEP DEFINITIONS" 
	 * "STEP DEFINITIONS" will be GENERATEd in Console
	 * COPY the "STEP DEFINITIONS" from CONSOLE,
	 * To Integrate with SELENIUM,
	 * Go to "Java" node, in your 'com,automation' folder create a "Class file" and
	 * PASTE the "STEP DEFINITIONS" inside the CLASS, REMOVE the COMMENT and Exception,
	 * 
	 * // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	 * 
	 * On the TGAS you will see ERRORS, HOVER OVER the MOUSE and IMPORT the LIBRARies
	 * Now WRITE SELENIUM CODE for LOGIN.
	 * 
	 * Go to 'Feature file' hold 'ctrl' and click with mouse, 
	 * 'CONTROL' TRANSFERES FROM 'Feature file' STEP TO ""STEP DEFINITIONS"" IN jAVA FILE.
	 * 
	 *  "THIS FEATURE WILL BE ENABLED WHEN YOU COVERT YOUR PROJECT TO CUCUMBER PROJECT"
	 *  
	 * Give a Meaningful "TAG NAME" to the "Scenario", These Tags are NOT ANNOTATIONS 
	 * EX: @Login   
	 * Main Usage of the "TAGS" is to IDENTIFY the "Scenarios" easily
	 * 
	 * IN CUCUMBER WE CAN NOT WRITE THE CODE ACTUAL CODE TO OPEN THE BROWSER,
	 * BY USING THE "STEP DEFINITIONS" WE HAVE TO INTEGRATE WITH SELENIUM 
	 * TO RUN ON THE REAL APPLICATION
	 * 
	 * When you HIT on RUN from "Feature File", the "PIECE of CODE" in "STEP DEFENITIONS"
	 * will be EXECUTED
	 *  
	 * */
	
	/* SAME SCRIPT with MULTIPLE SETS of DATA
	 * 
	 * in the feature file USERNAME AND PASSWORD SHOULD BE ENCLOSED WITH
	 * "tags and with double quotes", like this
	 * "<username>" and "<password>"
	 * 
	 * DATA SHOULD BE PASSED USING "Examples", see below
	 *  
	 *  |username|password|
	 *  |Admin|admin123|
	 *  |Admin|admin12|
	 *  
	 *  Feture file won't give you any WARNING MESSAGE because we already implemented this 
	 *  methods using "@Parameters", if ctrl clcik on,
	 *  
	 *  When enter "<username>" and "<password>", click on login 
	 *  it will take you to the "@Parameters" Step Definitions method
	 *  
	 *   now Run, it will RUN 2 times because we gave 2 sets of DATA
	 *  
	 *   
	 * 
	 * */
	
	
	/* CUCUMBER HOOKS 
	 * 
	 * 1. @Before -> Scenario level hook
	 * 2. @BeforeStep -> Step level hook
	 * 3. @AfterStep -> Step level hook
	 * 4. @After -> Scenario level hook
	 * 
	 * 
	 * */
	

}
