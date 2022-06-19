package jva_AccessModifiers_Package2;

import jva.AccessModifiers_Package1.A;

public class C extends A {
	
	// In "Private" You can not access the "m1()" Method from Class C because it is limited to that 
	// particular Class only.
	
// In "Default" You can not access the "m1()" Method from Class C because it is limited to that 
	// particular Package only.

	// In "Protected Method" can be accessed from "same package and other packages"
	// by using "Inheritance Concept"
	
	// You can not access the "m1()" Method from Class C
	// because it is in package1 and Class A. To access "m1()" Method,
	// you should use "Inheritance Concept", by using KEY WORD "EXTENDS"
	// 'A' is Parent and 'C' is child. 'C' is a subclass of 'A' class
	
	public static void main(String[] args) {
		
		C c= new C(); // You need to create subclass Instance 
		
		c.m1();
	}
	
	

}
