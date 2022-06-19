package com.automation;

import java.util.HashMap;
import java.util.Map;

public class Jva_Collections_Map_T {

	public static void main(String[] args) {
		
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
		
		// Map has methods too,
		// isEmpty(), map.size(), put(), get(), remove() 
		
		/* a. HashMap */

		/* REQUIREMENT */
		
		//	TestScriptName ... this is called "KEY"
		//  Tc_001 ........... this is called "VALUE"
		//	UserName ......... this is called "KEY" 
		//	Admin ............ this is called "VALUE"
		//	Password ......... this is called "KEY" 
		//	Admin123 ......... this is called "VALUE"
		//	FirstName 
		//	Srikrishna
		
		Map<String, String> map = new HashMap<String, String>(); 
		
		// Map, hit ctrl space bar, select 'Map'(java.util). It displays like this,
		// Map<k, v>, 'k' stands for "KEY", 'v' stands for "VALUE".
		// In the above Requirement both 'k, v' are "Strings". If the requirement says
		// 'int' then values will be 'int'
		// 'map' is a Reference Variable. 
		// Type in 'Hashm' hit ctrl space bar, select 'HashMap', our 
		// both 'Key and Value' are Strings so enter them 
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		map.put("TestScriptName", "TC_001");
		
		// If you want to store the values use "put()" method not 'add()' method
		// Type in 'Pu' hit ctrl space bar and select "put(String key, String value): map string"
		
		map.put("UserName", "Admin");
		
		map.put("Password", "Admin123");
		
		map.put("FirstName", "Srikrishna");
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		System.out.println(map.get("TestScriptName"));
		
		// To get the 'key' values we use "get()" method. 
		// When you select, select the get(String key: String Map
		
		System.out.println(map.get("UserName"));
		
		System.out.println(map.get("Password"));
		
		System.out.println(map.get("FirstName"));
		
		System.out.println(map);
		
		// Before going to "REMOVE" ant entry Print the info in Console
		// displays like this, 
		// {UserName=Admin, FirstName=Srikrishna, TestScriptName=TC_001, Password=Admin123}
		
		map.remove("FirstName");
		
		System.out.println(map);
		
		// Prints the info after 'Removing' the "FirstName"
		// displays like this,
		// {UserName=Admin, TestScriptName=TC_001, Password=Admin123}
		
		

	}

}
