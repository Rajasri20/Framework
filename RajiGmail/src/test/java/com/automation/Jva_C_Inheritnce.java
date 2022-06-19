package com.automation;

public class Jva_C_Inheritnce extends Jva_B_Inheritnce { // Multi Level Inheritance, 
// Class B extends Class C And already Class A extends Class B. 
// So both m1() and m2()methods are available to Class C 
		
	public void m3() {
		
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		
		Jva_C_Inheritnce c = new Jva_C_Inheritnce();
		
		c.m1();
		c.m2();
		c.m3();
	}

}
