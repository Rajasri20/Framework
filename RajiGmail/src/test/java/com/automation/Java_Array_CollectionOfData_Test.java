package com.automation;

public class Java_Array_CollectionOfData_Test {

	public static void main(String[] args) {

// Entering Collection of Data Using Arrays Concept. Requirement enter below data by using Array concept
		
// empid = 1111, empid = 1112, empid = 1113, empid = 1114, empid = 1115
		
		int[] empid = new int[5]; 
//Creation and declaration of an Array. length or Size of an Array is five[5]
	
		System.out.println(empid.length);
		
// 'int' represents whole numbers. 'empid' is a reference variable or Array Name
// 'new' is a assignment operator, when you specify 'new' only JVM allocates space for Array. here your storing 'int' type of data
// i.e, 'int[5]'. 
// Default value of 'int' is 'Zero'. Default 'Index value is Zero'
		
		empid[0] = 1111; //'empid' is a Array Name and [0] represents 'Index'
// empid '1111' is stored at 'zero eth' location, in 'Index'point of view 'empid[0]' meaning at Zero(0th)' location.
		
		empid[1] = 1112;
		
		empid[2] = 1113;
		
		empid[3] = 1114;
		
		empid[4] = 1115;
		
// [0], [1], [2], [3], [4] will store the information of an Array. these are all 'Indexes'. 
		
		System.out.println(empid[0]); // These statements will retrieve the information. 
		//Always mention Array name along with the 'Index name'. i.e, empid[0]
		
		System.out.println(empid[1]);
		
		System.out.println(empid[2]);
		
		System.out.println(empid[3]);
		
		System.out.println(empid[4]);
		

	}

}
