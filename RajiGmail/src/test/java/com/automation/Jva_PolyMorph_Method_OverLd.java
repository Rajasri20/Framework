package com.automation;

public class Jva_PolyMorph_Method_OverLd {

	/* Polymorphism */

	// Using SAME NAME to indicate a different Implementations

	// b. Method Overloading
	// Difine more than 1 Method with the "SAME NAME" in the Same CLass but with BUT with
	// DIFFRENT NUMBER or DIFFERENT TYPE of parameters or Sometimes BOTH
	
	//	EX: 1. to(String url) 
	//		2. to(URL url)
	// When you type in enter the url in CHORME driver you will both of the above 2 Methods.
	// "to(String url) and to(URL url)" belong to "to method" these are called Method Over Loaded.
	
	// EX: "Swich to frames" Methods also blong to Method Over Loaded.
	// 1. frame(int)
	// 2. frame(String)
	// 3. frame(WebElement)
	
	
	// Defining OUR OWN Method OVERLOADING
	
	/* Requirement*/
	
	// If I am passing ZERO Argument display Hello ..
	// if I am passing 1st Argument .... firstName ..... display Hello firstName 
	// if I am passing 2nd Argument .... firstNamelastName ..... display Hello firstName lastName
	
	public static void display() { 
	// Method name followed by "PARAMETERS" is called "SIGNATURE".
	// In COMPILETIME POLY MORPHISM "SIGNATURE" must be "DIFFERENT", 
	// i,e like "ZERO, ONE AND TWO ARGUMENT" but not the duplicates
	
	// "display()" Method is a over Loaded Method
	// If we "static method" without creating an Instance in "Main Method" 
	// we can INVOKE the "display Method" 
		System.out.println("Hello...");
	}
	
	public static void display(String firstName) {
		
		System.out.println("Hello..."+firstName);
	}
	public static void display(String firstName, String lastName) {
		
		System.out.println("Hello..."+firstName +" " +lastName);
	}
	
	public static void main(String[] args) {
		
		// Jva_PolyMorph_Method_OverLd.display();
		
		// If "No Parameters" are passed in "display()" method, when you run it will INVOKE "ZERO"
		// Argument method and display in Console as "Hello..."
		
		
		// Jva_PolyMorph_Method_OverLd.display("SRI RAMAKRISHNA");
		
		// If "1 Parameter" are passed in "display()" method, when you run it will INVOKE "ONE"
		// Argument method and display in Console as "Hello... SRI RAMAKRISHNA"
		
		
		Jva_PolyMorph_Method_OverLd.display("SRI RAMAKRISHNA, SARADA AMMA"); // 2 parameters
		// firstName followed by COMMA separated and followed by lastName.
		
		// If "2 Parameters" are passed in "display()" method, when you run it will INVOKE "ONE"
		// Argument method and display in Console as "Hello... SRI RAMAKRISHNA SARADA AMMA"
	}
}
