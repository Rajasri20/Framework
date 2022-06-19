package com.automation;

public class Jva_B_Inheritnce extends Jva_A_Inheritnce  { // Single Level Inheritance(A extends B), 
														// which is not a a subclass to any other class

	public void m2() {
		
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		
		Jva_B_Inheritnce b= new Jva_B_Inheritnce();
		
		b.m1(); 
	// To Access the m1() method from Class this Class(Jva_B_Inheritnce), using the "extends" KEY WORD
	// we can Access m1() method from Jva_A_Inheritnce Class. A "extend" B
	// A is a Parent or SuperClass and B is a Child Class or SubClass
	// SUPERCLASS MEMBERS ARE AUTOMATICALLY AVAILABLE TO THE SUBCLASS MEMBERS, meaning
	// VARIBLES AND METHODS are also available to SUBCLASS but not Constructors. 
	// Constructors belong to that particular class only
		
		b.m2();
	}
}
