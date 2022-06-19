package com.automation;

public class Java_Uchkd_Excep_ArithemticExcep {

	public static void main(String[] args) {
		
		/* Exception */
		
		/* Exception is a "UNEXPECTED EVENT" which occurs during the execution of the Program  */
		/* Exception is a "UNEXPECTED EVENT" which can be HANDLED by the PROGARAMMER */
		
		/* Exception of 2 types */
		
		// 1. Checked Exception or Compile time Exception
		// 2. Unchecked Exception or Runtime Exception
		
		/* 2. Unchecked Exception or Runtime Exception */
		
		// TO SOLVE THE EXCEPTIONS IN "UNCHECKED EXCEPTION" METHOD WE SHOULD ALWAYS USE
		// "try catch finally" mechanism only.
		
		// EX: 1. ArthemeticException
		// 	   2. ArrayIndexOutOfBoundsException
		
		
		System.out.println("Start");
		
		// int a = 100/0;
		
		
	// Now RUN the Program, you will get "ArithmeticException", because 100 can not be divided by zero.  
	// This is called "Abnormal Termination" because program has a START but 
	// there is NO END of the program , got an Error, which is not recommended.
		
	/* How Resolve the "UNCHECKED EXCEPTION" */
		
		// It is Possible Only through "try catch finally" mechanism.
		
		try {
		
			int a = 100/0;
		}
		catch(ArithmeticException exception){
			
			System.out.println(exception.getMessage());
			
			// 'exception' is a "reference variable" and put a dot and 'getm' ctrl space bar
			// select "getMessage()"
			// It displays why Program got terminated abnormally. We MUST write this. Otherwise we
			// Don't know what is the cause for 'Exception'. 
			// And continue the REST of the PROGRAM, which is NORMAL TERMINATION, recommended.
			
			
			// ANY "EXCEPTION" THAT OCCURS IN "try" BLOCK THEN CONTROL GOES TO "catch" BLOCK AND 
			// "LOG THE EXCEPTION" AND CONTINUE WITH THE REST(finally) and 'END' OF THE PROGRAME.  
			//  This is NORMAL TERMINATION, which is recommended.
			
			// If there is NO "EXCEPTION" in "try" BLOCK THEN CONTROL ignores the "catch" BLOCK and
			// control goes to "finally" block and END of the program.
			
			// EX: int a= 100/10
			// 100 can be divided by 10 so NO "EXCEPTION" will be displayed
			
			/*"finally" block will be executed in both "EXCEPTION" and in "NO EXCEPTION"*/
			
		}
		finally{
			
			System.out.println("Finally");
			
			// Purpose of the "finally" block is what are the RESOURCES ALLOWCATED in "try" block are
			// DE ALLOWCATED in "finally" block.
			
			// EX; While execution of the DATA BASE QUERY  we got an EXCEPTION. Here in "try" block we gave 
			// DATA BASE connection, while execution of the query we got an EXCEPTION 
			// so the control goes to "catch" block to handle it, 
			// but once we are done with the Execution, 
			// we have to de-allocate or disconnect from the DATA BASE, 
			// that piece of CODE will be written in "finally" block.
			
		}
		
		System.out.println("End");
		
		
	}

}
