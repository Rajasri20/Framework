package com.automation;

public class Java_UchkdExcep_MutpleExcep_AtAtime {

	public static void main(String[] args) {
		
		// The Requirement is "STORE 10 EMPLOYEE IDs"

				System.out.println("Start");
				
					
				try {
					
					int a = 100/10; // No exception on this line
					int[] id = new int[5]; // Create an array of 5 for 5 employees
					System.out.println(id[0]); // Retrieve the value at 0th location
					System.out.println(id[5]); // Retrieve the value at 5th location, 
					// you will get "EXCEPTION", which is "ArrayIndexOutOfBoundsException"
					// Because index point of view its 6th location not the 5th location. 
					// so we need a 'catch block' 
					Thread.sleep(2000);
				}
				catch(Exception exception){
					
					System.out.println(exception.getMessage());
					
					// "exception" is "Reference" aS variable, which will always start with LOWERCASE
					// System.out.println(exception.getMessage());
				}
				
			// To handle multiple Exceptions in a single "catch" block 
			// USE the Key Word "Exception" or "Throwable" in "catch" block.
			// Both "Exception" or "Throwable" and Key Words should star with CAPITAL LETTERS 
				
				finally{
					
				System.out.println("Finally");
					
		}
				
				System.out.println("End");

			}


	}


