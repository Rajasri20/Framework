package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Jva_ChkedExcepn_MultipleExceptinHandling {

	 public static void main(String[] args) throws FileNotFoundException,InterruptedException  {
		 
		 /* OR */
		 
		 // public static void main(String[] args) throws Exception {
		 
	// "throws Exception" can HOLD OR HANDLE ANYTYPE OF  EXCEPTIONS OR MULTIPLE EXCEPTIONS at a time. 
	// "NO NEED TO MENTION EACH "EXCEPTIONS SEPARATELY FOLLOWED BY COMMA"
		 
		 /* OR */
		 
		 // public static void main(String[] args) Throwable {
		 
	// "throws Exception" can HOLD OR HANDLE ANYTYPE OF  EXCEPTIONS OR MULTIPLE EXCEPTIONS at a time. 
	// "NO NEED TO MENTION EACH "EXCEPTIONS SEPARATELY FOLLOWED BY COMMA"
	
		/* 1. Checked Exception or Compile time Exception */

		// 2. EX: "FileNotFoundException"

		System.out.println("Satrt");

		// WHY DO WE NEED TO CREATE A "File" OBJECT?

		// To "READ THE CONTENT" from "File"

		File file = new File("D:\\TestData.xlsx");
		
		// Type in capital 'F'and 'il' should be lower case, hit ctrl space bar, "File: jav.io",
		// then followed by reference variable, then '=' then assignment operator'new', then 
		// Type in capital 'F'and 'il' should be lower case, hit ctrl space bar select 
		// "File(String PathName)-java.io.file". Give path of the File located, looks like below
		// File file = new File("D:\\TestData.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		

		// To "READ THE CONTENT" from above "File" a FILE "FileInputStearm" is required
		
		// Type in "FileIn", hit ctrl space bar, select "FileInputStream-java.io"
		// Create an Object, after 'new' Type in "FileIn" hit ctrl space bar, 
		// select "FileInputStream(File file)-java.io.FileInputStream" 
		// "FileInputStream(File file)-java.io.FileInputStream" is CONSTRUCTOR which is 
		// expecting "FILE" type of PARAMETER, select the same "FILE" which is displayed in the parameter
		// Hover over the MOUSE on "FileInputStream(file);" you will 
		// "unhandled exception type FileNotFounException". 
		// To clear the ERROR, go to METHOD declaration after "args)" 
		// type "throws" keyword and again type in 'Filenot', hit ctrl space bar 
		// and select "FileNotFounException-java.io". ERROR will be ResolvedGo to "Method"
		
		
		/* MULTIPLE EXCEPTIONS HANDLING IN A SINGLE PROGRAM*/
		
		// MULTIPLE EXCEPTIONS WILL BE HANDLIED BY (,) COMMA SEPARATED BETWEEN 2 EXCEPTIONS
		// See in the Method 
		
		Thread.sleep(1000);
		
		// To clear the ERROR, in the METHOD declaration after "args)" 
		// type "throws" keyword and again type in 'Inter', hit ctrl space bar 
		// and select "InterruptedException". ERROR will be Resolved

		System.out.println("End");

	}

}
