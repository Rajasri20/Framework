package jva.AccessModifiers_Package1;

public class A {
	
	/* AccessModifiers */
	
	// AccessModifiers can be used at "Variable Level, Constructor Level and Method Level"
	
	// 1. Private AccessModifier
	// 1. Default AccessModifier
	// 1. Protected AccessModifier
	// 1. Public AccessModifier
	
	/* TO UNDERTAND THE aCCESS mODIFIERS cONEPT, CREATE 2 PACKEGES WITH 3 CLASSES*/
	// pACKAGE 1 WITH CLASS A AND CLASS B
	// PACKAGE 2 WITH CLASS C
	
	// What should be written inside the class?
	
	// "Variables" to Store the information,
	// "Constructor" for Initialization
	// "Methods" to Manipulate the Data
	
	
	// Now write a Method, using Access Modifier
	
	/*"Private Access Modifier"*/
	
	// private void m1() {
	
	// "Private Access Modifier" is limited to the same "Class only", 
	// you can not access it from another Class or Package,(i.e; from class B, package2)
	
	
	/*"Default Access Modifier*/ 
	
	// void m1() {
	
	// Try to Access the m1() method from Class B there wont be any error message 
	// because Default Access Modifier is limited to the 'Package', 
	// it can be accessed in Class A and from class B
	// because "Class A and Class B" both belong to same Package only.
	
	
	/*"Protected Access Modifier*/

	// In "Protected Method" can be accessed from "same package and other packages"
	// by using "Inheritance Concept"
		
		// You can not access the "m1()" Method from Class C
		// because it is in package1 and Class A. To access "m1()" Method,
		// you should use "Inheritance Concept", by using KEY WORD "EXTENDS"
		// 'A' is Parent and 'C' is child. 'C' is a subclass of 'A' class
	
	// protected void m1() {
	
	/*"Public Access Modifier*/
	
	// "Public Method" can be accessed from anywhere, there is no limit. Can be accessed from Class,
	// same Package or from other packages too.
	
	public void m1() {
	
		System.out.println("Private m1");
	}
	
	// To execute the "m1()" method, main method is required. Type 'main' and select that.
	
	public static void main(String[] args) {
		
	A a= new A();
	
	// "m1()" method, is an Instance method so we need to create an Instance method or Object creation 
	// then call that method
	a.m1();
	
	// now we are calling/invoking the "m1()" method by "a.m1();"  
	
	}

	}


