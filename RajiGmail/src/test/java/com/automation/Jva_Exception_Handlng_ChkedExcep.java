package com.automation;

public class Jva_Exception_Handlng_ChkedExcep {

	public static void main(String[] args) throws InterruptedException {
	
		
		/* Exception */
		
		/* Exception is a "UNEXPECTED EVENT" which occurs during the execution of the Program  */
		/* Exception is a "UNEXPECTED EVENT" which can be HANDLED by the PROGARAMMER */
		
		/* Exception of 2 types */
		
		// 1. Checked Exception or Compile time Exception
		// 2. Unchecked Exception or Runtime Exception
		
		
		/* 1. Checked Exception or Compile time Exception */
		
		// "IneruptedException" is example of Checked Exception or Compile time Exception
		// Ex: Thread.sleep();
		
		System.out.println("Start");
		
		Thread.sleep(1000); // Pause execution for few seconds
		// Run the program with out clearing the ERROR, you will get "InterruptedException"  
		// To clear the ERROR, in the METHOD declaration after "args)" 
		// type in "throws" keyword and again type in 'Inter', hit ctrl space bar 
		// and select "InterruptedException". ERROR will be Resolved
		
		System.out.println("End");
		
		
		 
	}

}
