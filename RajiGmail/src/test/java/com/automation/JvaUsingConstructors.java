package com.automation;

public class JvaUsingConstructors {

	// WHAT ALL CAN BE DEFINED INSIDE THE"CLASS"?

	// "VARIABLES" to store the Information

	// "CONSTRUCTORS" for Initialization

	// "METHODS" to Manipulate the Data
	
	// CONSTRUCTORS are 3 types,
	
	// Default
	// Zero argument constructor
	// Parameterized constructor
	

	// THE REQUIREMENT IS TO represent multiple EMPLOYEES DATA

	int id; // 'id' is a reference variable, which of 'int' type

	double salary; // 'salary' is a reference variable

	String name; // 'name' is a reference variable

	JvaUsingConstructors(int empid, double empsalary, String empname) {
	
	// when using the Constructor no need of 'return type(void)'. 
	// 'Method Name' must be same as 'Class Name'
		
	// WHY DO WE NEED to make CONSTRUCTOR?
	// To just initialize the values. 
	// Access modifiers(private, public, protected, default) are used in Constructors, 
	// for this we did not mention any Access modifiers so automatically it considers as default 
	
		id = empid;

		salary = empsalary;

		name = empname;
	}

	void getData() {

		System.out.println(id);

		System.out.println(salary);

		System.out.println(name);

	}

	public static void main(String[] args) {
		
	// If it is a 'Constructor' while creation of the object itself we can 'invoke' the values.
	// this is called 'parameterized Constructor'

		JvaUsingConstructors e1 = new JvaUsingConstructors(1111, 99999.99, "Rajasri");

		e1.getData();

		JvaUsingConstructors e2 = new JvaUsingConstructors(1112, 88888.99, "Amma");

		e2.getData();

	}

}
