package com.automation;

public class Jva_ChkedExcepn_TryCatchFinally_T {

	public static void main(String[] args) {

		System.out.println("Start");

		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException exception) {
			
			System.out.println("exception.getmessage()"); 
			// If you want to Lock the "Exception cause" write this of code. its optional BUT
			// BETTER TO WRITE TO KNOW THE EXCEPTION CAUSE
			
			// "exception" IS "reference" A variable, which will always start with LOWERCASE
			// System.out.println(exception.getMessage());

		} finally {

			// "try" is a Reserved word or Key word followed by "Start of the try with CURLY
			// BRACES" and
			// "End of the try with CURLY BRACES".
			// In "try" block Write the code that may "RAISE THE EXCEPTION"
			// EX: Thread.sleep(2000);
			

			// "catch" is a Reserved word or Key word followed by "Start of the try with
			// CURLY BRACES" and "End of the try with CURLY BRACES"
			// In "catch" block Write the code that "  HOLDS THE EXCEPTION"
			// Mouse Hover on "Thread.sleep(2000);" you will see the Related Exception,
			// For this you will see "InterruptedException"
			// Inside the "catch Block" Write code related to Exception 
			// in the "Parenthesis" write InterruptedException give space 
			// and write a "Reference Variable of your choice"
			// "catch (InterruptedException exception) {"			
			

			// "finally" is a Reserved word or Key word followed by "Start of the try with
			// CURLY BRACES" and
			// "End of the try with CURLY BRACES"
			// "finally" block is OPTIONAL not Mandatory

			System.out.println("End");
		}
	}
}
