package com.automation;

public class JvaNonstaticMethod {
	
	// To perform an action or Task of a group of statements is called a 'Method' 
	
		// Methods are 4 types,
	
				// STATIC
				// NON STATIC OR INSTANCE
				// ABSTRACT
				// FINAL
	
		// NON STATIC OR INSTANCE METHOD
		
		// The below statement is the NON STATIC OR INSTANCE method,
		// there is no key word before 'void'
		// Create an 'Instance and call that particular Method'
		
		// Return values are "void, primitive, non primitive". always "void" will be used.

		public void m1() { // Method Body is written inside the class. 'public' is a 'Access modifier'
			
			System.out.println("This is m1 Method");
			
			}
		
		public static void main(String[] args) {
			
			JvaNonstaticMethod test = new JvaNonstaticMethod(); 
			// to invoke the method, Instance is created
			
			test.m1(); // calling the particular method 
		}

}
