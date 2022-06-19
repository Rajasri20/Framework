package com.automation;

public class Java_ForEachLoop_Test {

	public static void main(String[] args) {

		// For each Loop: it is applicable to “Arrays and Collections”. 
		// WHENEVER YOU WANT TO ITERATE OVER AN ARRY USE 'FOR EACH' OR 'ENHANCED FOR LOOP'.
		// It is also called “Enhanced for loop”.
		// In syntax you will write only ‘for’, see below

		// SYNTAX for 'for each'
		
		// for(DataType VariableName:Array or Collection){ // 'FOR EACH' IS 'COLON(:)' SEPARATED
		// }
		
		// THE REQUIREMENT IS I WANT TO RETEIVE ALL THE 500 VALUES FROM AN ARRAY
		
		System.out.println("Start");
		
		String[] name = new String[500]; 
		// 'name' is an Array, it will store 'String' type of values. 
		// TO create a String 'assignment operator' and 'new', 500 values will be stored in the 'String' 
		// 'String'is a non primitive, its default value is 'null'.
		
		name[0] = "Amma"; // Storing the information in Array. 'At zero'th location is 'amma'
		
		name[499] = "Sri Ramakrishna"; // Storing the information in Array. 'At '499'th location is 'Sri'
		
		for(String strrrr:name) {
		// DataType = String, VariableName = strrrr(any name you wish) or also called 'Alias Name', 
		// Array = name
	
		System.out.println(strrrr);
	}
		
		System.out.println("End");
	}
}
// The output is
//Start
//Amma
//null
//null
//null
//null
//Sri Ramakrishna
//End

	
	

