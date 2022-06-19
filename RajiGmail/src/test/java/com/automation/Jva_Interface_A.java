package com.automation;

public interface Jva_Interface_A {
	
	/* Interface*/
	
	// In Selenium we don't create any *Interfaces* but we use *Interfaces*, below are the EXAMPLES 
	
	// EX: for *Interface*
	
	// 1. WebDriver
	// 2. TakesScreenshot
	// 3. Alert
	// 4. WebElement
	// 5. JavaScriptExecutor
	
	// Java doesn't Support "MULTIPLE INHERITANCE CONCEPT", so it will be Achieved Through "INTERFACE"
	// "Interface" is a key word to define the 'interface',
	// right click on the package, select 'interface'
	
	// 'interface' have "NO" "instance creation or Methods or Constructors"
	// 'interface' CONTAINS ONLY "METHOD DECLARATION BUT NOT IMPLEMETATION", IF YOU DON'T PROVIDE
	// CURLY BRACE({) AT THE BEGGINNING OF THE METHOD THEN ITS CALLED "ABSTACT METHOD DECLARATION".
	// AFTER METHOD DECLARATION JUST ADD "SEMI COLON(;).
	// EX: public void m1();
	
	// UNTIL "JAVA 1.8 VERSION" METHOD IMPLEMETATION IS NOT ALLOWED BUT IN LATEST VERSIONS WE CAN
	// 'METHOD IMPLEMETATION' ALSO. BY 
	// MAKING THE METHOD TO "PRIVATE AND PUBLIC STATIC".
	
	// ALL THE VARIABLE OF THE 'interface' ARE BY DEFAULT "PUBLIC STATIC FINAL" but these are if you
	// want to you can mention otherwise they are applicable "BY DEFAULT". A fter 
	// declaring a VALUE if yopu try to change it, you will get ann ERROR message because "BY DEFAULT"
	// the VALUE is FINAL.
	
	// Ex: When "A extends B,C" You will get ERROR MESSAGE in "C" Classs. 
	// This error will be resolved through "interface" only  
	
	// IF YOUR IN the 'Class' that you have created to write a programme, 
	// REMOVE word 'class' and type in "interface". This CHANGE should be done in 'B and C' also.
	
	public void m1(); 
	
	// This METHOD DECLARATION is called "ABSTRACT OR UNIMPLEMENTED METHOD", 
	// becasue there is NO CURLY BRACE({) AT THE BEGGINNING OF THE METHOD 
	// that is why it is CALLED as "ABSTACT METHOD DECLARATION"

}
