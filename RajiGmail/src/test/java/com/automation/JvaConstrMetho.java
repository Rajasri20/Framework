package com.automation;

public class JvaConstrMetho {
	
	public void m1() { // Method Body is written inside the class. 'public' is a 'Access modifier'
		
		System.out.println("This is m1 Method");
		
		}
	
	public static void main(String[] args) {
		
		// DEFINING CONSTRUCTOR
		
		// Constructor name must be same as Class name
		
		JvaConstrMetho test = new JvaConstrMetho(); // This is called Instance creation
		
		test.m1();
		
		// 'JvaConstrMetho()' is a default constructor.
		// A constructor which is added by the 'Compiler', 
		// when there is no constructor in our code we call it as a 'default constructor'.
		// Internally compilation of our Java progarme, "compiler converts the .java file into .class file" 
		// ".java file -> compiler->.class"
		// 'compiler' will check for constructor while 'compiling',
		// if there is no constructor in our programe, 'compiler' will add a constructor, 
		// this is default "JvaConstrMetho()"
		
		// a constructor, which a progarmmer writes explicitly inside the class 
		// is called zero argument constructor
		
		// public JvaConstrMetho(){
		// } 
		
		// a constructor, which a progarmmer writes explicitly inside the class
		// is called parameterized constructor
		
		// public JvaConstrMetho(JvaUsingConstructors(int empid, double empsalary, String empname)){
		// }
	 
		
	}

}
