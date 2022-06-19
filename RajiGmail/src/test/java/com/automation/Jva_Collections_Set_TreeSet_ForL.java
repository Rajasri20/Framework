package com.automation;


import java.util.Set;
import java.util.TreeSet;

public class Jva_Collections_Set_TreeSet_ForL {

	public static void main(String[] args) {

		/* 1. Collections Interface */

		// "Collections Interface" contains 2 "SUB INTERFACEs"

		// A. List Interface
		// B. Set Interface

		// If you want to "Represent a Group of Objects" as a "SINGLE ENTITY" then we go
		// for
		// "Collections Interface"
		// EX: I don't know how many "Employee" IDs I am going to store, then we use
		// "Collections Interface"

		// If we know FIXED NUMBER of Employee IDs then we use "ARRAYS" concept
		// EX: 5 Employees or 100 or 500

		// DIRECTLY WE CAN NOT USE THE "INTERFACES" SO WE NEED "SUB INTERFACE".
		// "List AND Set" are "SUB INTERFACES"

		// "SUB INTERFACES" need "Implementations Classes" because WE CANNOT DIRECLTLY CREATE
		// "OBJECT OR INSTANCE" OF "INTERFACES AND SUB INTERFACES" FIND 
		// "OBJECT OR INSTANCE" AND CAN CREATE "OBJECT OR INSTANCE" OF "Implementations Classes"

// * B. Set Interface */

		// Nature of the "Set Interface" is "UNORDERED"one and it "DOES NOT ALLOW DUPLICATES"

		// "Set Interface" contains 2 "Implementations Class"

		// a. HashSet
		// b. TreeSet

		// "Set" contains METHODS

		// isEmpty() size (), add(), contain(), remove(), clear()

		/* REQUIREMENT */

		// STORE AUTOMATION TOOLS LIST
		// QTP, UFT, SELENIUM, REST ASSURED, RFT, LFT
		
		
		/* b. TreeSet */
		
		// "TreeSet" Prints the "list in Alphabetical Order"
		

		Set<String> list = new TreeSet<String>(); // "Object/Instance" creation

		// We can not create the "Object/Instance" of the "Interface", find the
		// "Implementation Class" and create an "Object/Instance" for the
		// "Implementation Class"

		// "HashSet" is the "Implementation Class" of the "Set"

		System.out.println(list.isEmpty());

		// Print the Info in Console. "list" is REFERENCE VARIABLE
		// Type in 'Lis' ctrl space bar select "list:set<jav.lang.String>" and
		// PUT a DOT and type in 'isEm' select "isEmpty()" method.
		// "isEmpty()" return a "boolean" value, TRUE or FALSE. Is the "list" empty or
		// not? yes the list is empty and the put is TRUE

		System.out.println(list.size());

		// To know size of the ArrayList. But we don't know the size yet
		// because we did not mention the size so the output is zero here

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

		// Print all the List of values, output is "[UFT, REST ASSURED, QTP, SELENIUM]" 
		// "Set" does not allow "Duplicates". So QTP is printed only one time
		
		list.remove("REST ASSURED");
		
		// Removes Mentioned (REST ASSURED) one from the list
		
		System.out.println(list);
		
		// list.clear();
		
		// Clears the whole list, the output is "0" zero 
		
		System.out.println(list.size());
		
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

	}

}
}
