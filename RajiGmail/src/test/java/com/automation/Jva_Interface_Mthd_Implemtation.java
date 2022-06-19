package com.automation;

public class Jva_Interface_Mthd_Implemtation implements Jva_Interface_C {
	
	// UNTIL "JAVA 1.8 VERSION" METHOD IMPLEMETATION IS NOT ALLOWED BUT IN LATEST VERSIONS WE CAN
	// 'METHOD IMPLEMETATION' ALSO. BY MAKING THE METHOD TO "PRIVATE AND PUBLIC STATIC". 

	
	
	// UNTIL NOW we just DECLARED the METHODS but not IMPLEMENTED. 
	// If we can not IMPLEMENT there is NO use of DECLARATING a METHOD.
	// to IMPLEMENT the METHODS we created this NEW "CLASS" now we can IMPLEMENT METHODS
	
	// "implements" is a key word for implementation.
	// "Jva_Interface_Mthd_Implemtation" CLASS will "implements" "UNIMPLEMENTED METHODS" OF
	// Jva_Interface_C
	
	// After the CLASS NAME write the key word "implements" and copy paste "interface" "C", which is
	// "Jva_Interface_C", immediatly you will see ERROR Message under the CLASS NAME saying
	// "Add unimpemented Methods" error message. hover over the mouse and click on the "Add unimpemented Methods" then
	// all the "3 METHODS that you DECLARED EARLIER in the INTERFACE" will be displayed with the
	// Anotation "@Override". Now you can "implement" the methods.
	// Now delete // TODO Auto-generated method stub and IMPLEMENT METHODS

	@Override
	public void m1() {
		System.out.println("m1 Method Implementation"); 
		
	}

	@Override
	public void m2() {
		System.out.println("m2 Method Implementation");
		
	}

	@Override
	public void m3() {
		System.out.println("m1 Method Implementation");
		
	}
	
	// Main Method for EXECUTION point of View
	
	public static void main(String[] args) {
		
	// We can create a "REFERENCE VARIABLE" of a "interface" but 
	// We CAN NOT create an "Instance/Object Variable" for "interface", so ALWAYS create 
	// an "Object" of "Implemtation" CLASS "Object" of "Jva_Interface_C".
		
		Jva_Interface_C c = new Jva_Interface_Mthd_Implemtation();
		
		c.m1();
		c.m2();
		c.m3();
	
	}
	 

	

}
