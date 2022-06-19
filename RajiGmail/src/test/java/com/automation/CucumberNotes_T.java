package com.automation;

public class CucumberNotes_T {
	
	/* Cucumber Features 
	 * 
	 * When a SCRIPT FAILS, it will show you EXACT STEP and exact ERROR MESSAGE, 
	 * anyone can understand easily
	 * 
	 * Cucumber is a "Behavior Driven Development Frame Work"(BDD)
	 * 
	 * Open Source n Free Ware on Internet
	 * 
	 * Supports different Operating Systems, like Window, Linex, Mac
	 * 
	 * Supports different Operating Languages, Like, Java, Java Script, Ruby etc;
	 * 
	 * Cucumber helps in WRITING TestSCRIPTS which are easily understandable by anyone
	 *  
	 * can be INTEGRATED with SELENIUM, APACHE POI 
	 * 
	 * 
	 * */
	
	
	
	
	/* CUCUMBER DEPENDENCIES
	 * 
	 *  need 2 dependencies
	 * 
	 * Cucumber-java set of dependencies  
	 * Cucumber-testng set of dependencies
	 * 
	 * 
	 * Cucumber-java set of dependencies 
	 * 
	 * Go to "mvnrepository" website,
	 * search for cucumber-java,
	 * there are multiple links but Choose the Cucumber with "io.cucumber", click on 
	 * Cucumber JVM: Java
	 * click on the latest version, 7.1.0, 
	 * COPY the dependencies and PASTE in the "pom.xml" file
	 * 
	 * 
	 * Cucumber-testng set of dependencies
	 * 
	 * Go to "mvnrepository" website,
	 * search for cucumber-testng,
	 * there are multiple links but Choose the Cucumber with "io.cucumber"click on 
	 * Cucumber JVM: TestNG 
	 * click on the latest version, 7.1.0,
	 * COPY the dependencies and PASTE in the "pom.xml" file
	 * 
	 * once we are done, it will CONNECT to the CENTRAL REPOSITORY and 
	 * DOWNLOADS REQUIRED set of DEPENDENCIES
	 * 
	 * Go to "Package Explorer", click on Maven Dependencies, look for Cucumber Dependencies
	 * 
	 * */
	
	/* ECLIPSE CUCUMBER PLUGIN 
	 * 
	 * To WRITE and EXECUTE the CUCUMBER related Script we need this PLUGIN,
	 * 
	 * Follow the PDF notes to how to add this plugin or follow below STEPS
	 * 
	 * On top of the Eclipse, click on HELP, then select ECLIPSE MARKET PLACE,
	 * In SEARCH, type CUCUMBER and click on SEARCH, 2 Plugins will be displayed,
	 * Select the 1st one, "Cucumber Plugin", click on FINISH 
	 * click on Install, if you want you can Install also  
	 * 2nd one, "Natural" but better go with "Cucumber Plugin" 
	 * Accept Terms and Conditions
	 * on pop up click on 'Anyway Install', then complete the Steps, and Eclipse restarts.
	 * "Cucumber Plugin" installed.
	 * 
	 * To see whether it is SUCCessfully installed or not, 
	 * GO to Windows and click on PREFERENCES, 
	 * you will see CUCUMBER NODE, that means it is SUCCessfully down loaded, close the Window 
	 * 
	 * */
	
	
	
	/* HOW TO CONVERT THE "PROJECT" AS A CUCUMBER "PROJECT" 
	 * 

	 * Go to "Navigator Deprecated", 
	 * Right Click on the "PROJECT"(RajiGmail), select 'Configure',
	 * select "convert to cucumber project", the "PROJECT" will be converted to CUCUMBER
	 * "NAVIGATE" to "STEP TO STEP DEFINITION" Feature will be ENABLED
	 * 
	 * Without CONVERTING the PROJECT to CUCUMBER, 
	 * you CAN NOT "NAVIGATE" to "STEP TO STEP DEFINITION", meaning, in "Feature File"
	 * when you "hold ctrl and Click" it will be "Navigated" to "Selenium Java code"     
	 *     
	 *	"convert to cucumber project" is not a MANDATORY but one FEATURE called 
	 *  Shows EXACT ERROR MESSAGE in the REPORT 
	 * 	will be EANABLED
	 * 
	 * "Without Converting also we can write and Execute the Script"
	 * 
	 * */
	
	
	/* GHERKIN or CUCUMBER KEY WORDS
	 * 
	 * Using Gherkin or Cucumber KEY WORDS only we can write a CODE in CUCUMBER.
	 * 
	 * All the KEY WORDS MUST START with UPPERCASE LETTERS
	 * 
	 * 1. Feature	
	 * 	To Represent, One END 2 END FUNCTIONALITY or which FUNCTIONALITY 
	 * 	we are going to Test 
	 * 
	 * 2. Scenario
	 *  Represents ONE MANUAL or ONE FUNCTIONAL TEST CASE	
	 * 	
	 * 3. Given
	 * 	To Represent a PRE-CONDITION
	 * 
	 * 4. When
	 * 	Represents CONDITION or Action
	 * 
	 * 5. Then
	 * 	To Represent a POST CONDITION
	 * 
	 * 6. And
	 * 	To Represent ADDTIONAL CONDITION to "Given" or "When" or "Then" 
	 * 
	 * 7. Scenario Outline
	 *	To Implement  "DATA DRIVE" Testing, meaning same SCRIPT with MULTIPLE times
	 *	with different  sets of DATA.
	 * 	using "Examples" we can PASS the DATA to "Scenario Outline" 
	 * 
	 * 8. Examples
	 * 	using "Examples" we can PASS the DATA to "Scenario Outline"
	 * 
	 * 9. Background
	 * 	Any STEPS which are COMMON across the SCENARIOS
	 * 
	 *   Background: openBrowser and login are commonn three Scenario so Delete them put in Background
    Background
    Given openBrowser
    When login

  @AddEmployee
  Scenario: AddEmployee
    When addEmployee
    When logout
    When closeBrowser

  @EditEmployee
  Scenario: EditEmployee
    When editEmployee
    When logout
    When closeBrowser

  @DeleteEmployee
  Scenario: DeleteEmployee
    When deleteEmployee
    When logout
    When closeBrowser
	 * 
	 * 10. Tags
	 * 	 By using the "Tags" we can easily access that SCENARIO
	 * 
	 * */
	
	
	/* HOW TO WRITE A SCRIPT IN CUCUMBER 
	 * 
	 * 1st you need to understand the MANUAL Test CASE,
	 *  
	 * Then you have to Re- WRITE as a 'Scenario' inside the 'Feature File'
	 * 'Feature[Scenario]' file, 
	 * once we Run the 'Scenario', it will generate the 'StepDefinitions',
	 * inside the 'StepDefinitions' you have to write 'Selenium' CODE 
	 * 
	 * Feature[Scenario]->Run->StepDefinitions->Selenium
	 */
	
	// Manual or Functional Test case is the BASE
	
		/* PRE-REQUISITS TO WRITE A "CUCUMBER CODE" */
		
		/* Go to your RajiGmail Project,
		 * Click on "src", then click on 'test',  
		 * then RIGHT CLICK on 'resources' folder, select, 'New', then click on 'Folder' 
		 * Folder window displays, give a meaningful NAME, like 'features', then click on Finish.
		 * Now Inside the new 'features' folder, create a 'Features' file,
		 * RIGHT CLICK on 'features' folder select, 'New', then click on 'File',
		 * 'File' window displays, give File NAME followed by ".feature" EXTENTION, 
		 * EX: 'Orange HRM.feature'
		 * 
		 * like which Application your working for "OrangeHRM.feature", 
		 * DO NOT forget to mention the ".feature" EXTENTION  
		 * then click on Finish. 
		 * we Added Cucumber plugin thats why iT GENERATES FEATURE TEMPLATE, 
		 * based on this you have to write feature file or you can   
		 * Remove this and write your own CODE
		 *  
		 * 
		 * */
	
	

}
