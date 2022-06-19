package com.automation;

public class JvaConstructorsEmployee {
	
	// WRITING CODE WITHOUT USING CONSTRUCTORS
	
	
	// Class belongs to package(com.automation). 'Class' is a "Reserved word or KEY word". 
		// "Employee" is the name of the class, which is called 'Identifier'
		
		// WHAT ALL CAN BE DEFINED INSIDE THE "CLASS"?
		
		// "VARIABLES" to store the Information
		
		// "CONSTRUCTORS" for Initialization
		
		// "METHODS" to Manipulate the Data
		
		// THE REQUIREMENT IS TO represent multiple EMPLOYEES DATA
		
		int id; // 'id' is a reference variable, which of 'int' type
		
		double salary; // 'salary' is a reference variable
		
		String name; // 'name' is a reference variable
		
		// THE ABOVE 3 ARE CALLED "INSTANCE VARIABLE". Trough out the METHOd we access them
		// why they are called "INSTANCE VARIABLE"?
		// Because they are defined inside the 'CLASS' and outside the 'METHOD'
		
		// METHOS IS A FUNCTION WHICH PERFORMS A SET OF ACTIONS OR TASKS 
		
		// METHOD SHOULD BE DEFINED INSIDE THE CLASS
		// 'VOID' is one of the methods name, then give name for Method(setData), called Method declaration,
		// start and end of the method({}), called Method Implementation.
		
		
		void setData(int empid, double empsalary, String empname) { 
		// 'void' is a return type
		// Inside the parethesis'()' data is called parameterised data to receive the values from the outside
		// Naming notation for method name of the first word should start with 'Lowercase' 
		// and next word should be 'upper case'(setData).
		
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
			
		// Why do you need MAIN METHOD? BECAUSE FOR THE EXECUTION POINT OF VIEW YOU HAVE TO WRITE MAIN METHOD
		
		// To access the "INSTANCE VARIABLE", you need to create an "object or instance"
		
		JvaConstructorsEmployee e1 = new JvaConstructorsEmployee();
			
		// 'JvaConstructorsEmployee is the 'Class' name, "e1" is the reference variable, 
		// "e1" holds the address of 'Object' which is JvaConstructorsEmployee(), 
		// the following are the addresses "id, salary, name", default values for these are "0, 0.0, null"
		// assignment operator '=' and 'new JvaConstructorsEmployee()' is the "object or instance".
		
		e1.setData(1111, 99999.99, "Rajasri"); 
		
		// Place cursor on 'setData' and hold 'ctrl' and a mouse click, now control transfers to 'Method'.
		// Internally the values from 'e1.setData' will be coppied into 'void setData' and display the values.
		
		e1.getData();
		
		JvaConstructorsEmployee e2 = new JvaConstructorsEmployee();
		
		e2.setData(1112, 88888.99, "Amma");
		
		e2.getData();

		}

		}

