package com.automation;

public class Jva_CollectionsFrameWork_Notes {

	public static void main(String[] args) {
		
		/* Collections FrameWork */
		
		// "Collections" is not REALLY a FRAMEWORK, JUST name sake 
		// it is  CALLED AS "Collections FrameWork"
		
		// "Collections FrameWork" contains "Interfaces", bellow 2 are belong to "Interface"
		// All the "Interfaces" and "Implementations Classes" come from "Java.util" package.
		
		
		// 1. Collections Interface
		// 2. Map Interface
		
		
		/*1. Collections Interface */
		
		//	"Collections Interface" contains 2 "SUB INTERFACEs" 
		
		// A. List Interface
		// B. Set Interface
		
		
		/*A. List Interface*/
		
		// Nature of the "List Interface" is "ORDERED"one but it "ALLOWS DUPLICATES"
		
		//   "List Interface" contains 3 "Implementations Class"
		
		// 		a. ArrayList
		//	IN AUTOMATION POINT OF VIEW WE USE ONLY "ArrayList". Below 2 are NOT needed
		
		//		b. LinkedList
		//		c. Vector
		
		
		// "List" contains METHODS
		
		// isEmpty() size (), add(), contain(), remove(), clear()
		
		
	
		/* B. Set Interface */
		
		// Nature of the "Set Interface" is "UNORDERED"one but it "DOES NOT ALLOW DUPLICATES"
		
		//  "Set Interface" contains 2 "Implementations Class"
		
		//		a. HashSet
		//		b. TreeSet
		
		
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
		


		/*2. Map Interface */
		
		// When you want to Represent KEY VALUE BASIS we go for "Map Interface"
		
		// EX: TestScriptName .... this is called "KEY"
		//      Tc_001 ............ this is called "VALUE"
		//		UserName ......... this is called "KEY" 
		//	    Admin ............ this is called "VALUE"
		//		Password ......... this is called "KEY" 
		//		Admin123 ............ this is called "VALUE"
		
		
		// "Map Interface" contains 2 "Implementations Class"
		
		// 		a. HashMap 
		
		//	IN AUTOMATION POINT OF VIEW WE USE ONLY "HashMap". Below 2 are NOT needed
		
		//		b. TreeMap
		// 		c. HashTableMap
		
		
		
		
		
		
		
		
		
	}

}
