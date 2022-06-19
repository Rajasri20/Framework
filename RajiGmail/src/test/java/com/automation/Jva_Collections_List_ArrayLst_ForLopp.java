package com.automation;

import java.util.ArrayList;


public class Jva_Collections_List_ArrayLst_ForLopp {

	public static void main(String[] args) {

/*1. Collections Interface */
		
		//	"Collections Interface" contains 2 "SUB INTERFACEs" 
		
		// A. List Interface
		// B. Set Interface
		
		// If you want to "Represent a Group of Objects"  as a "SINGLE ENTITY" then we go for
				// "Collections Interface"
				// EX: I don't know how many "Employee" IDs I am going to store, then we use "Collections Interface"
				
				// If we know FIXED NUMBER of Employee IDs then we use "ARRAYS" concept
				// EX: 5 Employees or 100 or 500
				
				// DIRECTLY WE CAN NOT USE THE "INTERFACES" SO WE NEED "SUB INTERFACE".
				// "List AND Set" are "SUB INTERFACES"
				
				// "SUB INTERFACES" need "Implementations Classes" because WE CANNOT DIRECLTLY CREATE
				// "OBJECT OR INSTANCE" OF "INTERFACES AND SUB INTERFACES" FIND "OBJECT OR INSTANCE" AND 
				// CAN CREATE "OBJECT OR INSTANCE" OF "Implementations Classes"
		
		
		/*A. List Interface*/
		
		// Nature of the "List Interface" is "ORDERED"one but it "ALLOWS DUPLICATES"
		
		//   "List Interface" contains 3 "Implementations Class"
		
		// 		a. ArrayList
		//	IN AUTOMATION POINT OF VIEW WE USE ONLY "ArrayList". Below 2 are NOT needed
		
		//		b. LinkedList
		//		c. Vector
		
		
		// "List" contains METHODS
		
		// isEmpty() size (), add(), contain(), remove(), clear()
		
		
		/* REQUIREMENT */
		
		// STORE AUTOMATION TOOLS LIST 
		// QTP, UFT, SELENIUM, REST ASSURED, RFT, LFT
		
				
		
		ArrayList<String> list = new ArrayList<String>(); // "Object/Instance" creation
		
		// List<String> list = new ArrayList<String>(); you can write like this also
		
		// We can not create the "Object/Instance" of the "Interface", find the
		// "Implementation Class" and create an "Object/Instance" for the "Implementation Class"  
		
		// "ArrayList" is the "Implementation Class" of the "List"
		
		System.out.println(list.isEmpty());
		
		// Print the Info in Console. "list" is REFERENCE VARIABLE 
		// Type in 'Lis' ctrl space bar select "list:ArrayList<jav.lang.String>" and 
		// PUT a DOT and type in 'isEm' select "isEmpty()" method. 
		// "isEmpty()" return a "boolean" value, TRUE or FALSE. Is the "list" empty or not
		
		System.out.println(list.size()); 
		
		// To know size of the ArrayList. But we don't know the size yet 
		// because we did not mention the size.
		
		list.add("QTP");
		
		// "add()" is a method to store the values. We are storing STRING values
		
		list.add("UFT");
		
		list.add("SELENIUM");
		
		list.add("QTP");
		
		list.add("REST ASSURED");
		
		System.out.println(list.isEmpty());
		
		// list is not EMPTY, the output is FALSE
		
		System.out.println(list.size());
		
		// list size 5

		System.out.println(list);
		
		// Print all the List of values, output is "[QTP, UFT, SELENIUM, QTP, REST ASSURED]" 
		
		System.out.println(list.contains("Rajasri"));
		
		// "contains" meaning FINDS OUT and prints the mentioned one in the "list".
		// it gives a "boolean" value, it prints as 'False' in Console, there is No Rajasri
		
		list.remove("REST ASSURED");
		
		// Removes Mentioned (REST ASSURED) one from the list
		
		System.out.println(list);
		
		/* For Loop */
		
		// "Enhanced For Loop" not only used in "Arrays" but also be used in "Collections" as well.
		
		
		// If you want to "Retrieve" all the values from the "list", 
		// we can use "For Loop" to display "list" of all
		
		for(String str:list){
			
			// We stored values in 'list', and they are "String" type of values.
			// give any Name for "String", which is "str" here
			
			System.out.println(str);
			
			// prints the list output one by one like below
			
			// QTP
			// UFT
			// SELENIUM
			// QTP
		}
		

	}

}
