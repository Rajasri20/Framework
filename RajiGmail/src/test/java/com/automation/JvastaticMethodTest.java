package com.automation;

public class JvastaticMethodTest {

	// Methods are 4 types,

	// STATIC
	// NON STATIC OR INSTANCE
	// ABSTRACT
	// FINAL

// The below statement is the STATIC method, there is a 'static' key word before 'void'
// based on class name call that 'particular Method'

	static void m1() { // Method Body is written inside the class. 'void' can not return anything.

		System.out.println("This is m1 Method");

	}

	public static void main(String[] args) { 
		
	// 'main method' for execution point of view. Execution always starts from 'Main Method'

		JvastaticMethodTest.m1(); // 'JvastaticMethodTest' is a 'Class' name, 'm1()' is method. 
		
	// based on class name 'Method' is invoked, no need of instance creation
	}

}
