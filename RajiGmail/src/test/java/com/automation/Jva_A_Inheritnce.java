package com.automation;

public class Jva_A_Inheritnce {
	
	// Inheritance is the process of "Derive New one" from the "Existing one"
	// It is also called as "IS A" Relationship
	// "extend" is the Key word to Implement Inheritance concept
	// Code re-usability is the benefit of Inheritance
	// Private Methods CAN NOT be Inherited to "SubClasses"
	// Constructors CAN NOT be Inherited to "SubClasses"
	// Java supports SINGLE lEVEL, MULTI LEVEL AND HIRARCHIAL Inheritance through CLASSES 
	// but not MULTIPLE INHERTANCE
	
	// Example: 
		//public class C extends A{
		// public class C extends B{
	
	/*HIRARCHIAL Inheritance*/
	
		// Multiple SUBCLASSES having the "SAME PARENT"
	
	 /* MULTIPLE INHERTANCE CONCEPT */
	
		// Java DOES NOT Support MULTIPLE INHERTANCE CONCEPT through CLASSES. But "MULTIPLE INHERTANCE CONCEPT 
		// through CLASSES is achieved with "Interfaces"
	
	// A class which extends more than one class at a time called "MULTIPLE INHERTANCE CONCEPT"
	
	// Example: 
		//public class C extends A,B{
	
	
	/* WHAT DO WE DEFINE INSIDE THE CLASS*/
	
		// Variables to store the information
		// Constructors for Initialization
		// Methods to manipulate the Data
	
	
	public void m1() { // Defining METHOD
		
		System.out.println("m1");
		
	}
	
	public static void main(String[] args) { // Main Method for Execution Point of View
		
	// To Invoke or Access m1() method, create an instance. For this Class name should be Written First 
		
		Jva_A_Inheritnce a= new Jva_A_Inheritnce();
		
		a.m1(); // Calling the m1() method
	
	}
}
