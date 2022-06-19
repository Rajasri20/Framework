package com.automation;

public class Jva_RunTime_PolyMrph_OverRiding_B extends Jva_RunTime_PolyMrph_OverRiding_A { 
	// "Extends" is key word used for "Inheritance Concept", 'A' Class will be availble to 'B' Class
	// SUPER CLASS(A) is available to SUB CLASS(B)
	
	// A Method Redefined in its SUB CLASS is called Overriding
	 
	// Overriding "Increases the Felexibilty of the Programe"
	// Overriding is Involves in Super Class and Sub Class
	
	@Override
	public void m1() {
		System.out.println("B Class m1 Method Implementation");
	}
	
	// If you are not ok with systems "Super Class" then you can Imeplement your own Method
	// then we will use "Override" Annotation. Type in m1 hit ctrl space bar and
	// select "m1(): void Overid method in Jva_RunTime_PolyMrph_OverRiding_A "
	// make sure to select super class, whic is "Jva_RunTime_PolyMrph_OverRiding_A" 
	// "Override" displays, now remove the 2 lines and enter the info that you want
	// this the your own Implementation "System.out.println("B Class m1 Method Implementation");"
	// Now it displays YOUR OWN IMPLEMENTATION, which is "System.out.println("B Class m1 Method Implementation");"
	
	public static void main(String[] args) { // Main Method for excutution
		
		Jva_RunTime_PolyMrph_OverRiding_B b = new Jva_RunTime_PolyMrph_OverRiding_B();
		
		b.m1();
		
		// If you run the above, it displays 'A' class m1() method
		
		   
	}
	

}
