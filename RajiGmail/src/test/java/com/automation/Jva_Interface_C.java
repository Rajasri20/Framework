package com.automation;

public interface Jva_Interface_C extends Jva_Interface_A,Jva_Interface_B    {
	
	// Java doesn't Support "MULTIPLE INHERITANCE CONCEPT", so it will be Achieved Through "INTERFACE"
	// When "A extends B,C" You will get ERROR MESSAGE in "C" Classs. 
	// This error will be resolved through "interface" only  
			
	// Now in the 'Class' that you have created to write a programme, 
	// REMOVE word 'class' and type in "interface". 

	public void m3();
	
	// This METHOD DECLARATION is called "ABSTRACT OR UNIMPLEMENTED METHOD", 
	// "m3" Contains 2 more methods, m1() and m2(), (click CTRL O) you will see m3 methods 
	// here we just DECLARED the METHODS but not IMPLEMENTED. If we can not IMPLEMENT there is NO
	// use of DECLARATING a METHOD.
	// To IMPLEMENT the METHODS we need to create A NEW "CLASS" and then IMPLEMENT
}

