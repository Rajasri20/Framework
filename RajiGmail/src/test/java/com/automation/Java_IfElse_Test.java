package com.automation;

public class Java_IfElse_Test {

	public static void main(String[] args) {
		
		// CONDITIONAL STATEMENTS
		
		// 'if else'
		
// 'if else' is a 2 way CONDITION
		
// SYNTAX
		
   // if(Condition){
	 // Statements for if
//	}else{
	 // Statements for else
// }		
		
// "Condition" is type OF Boolean(True or False)
		
// 'if' the condition is true execute the statement,
// 'else'(if the 1st condition is false)execute the next statement 
		
// THE REQUIREMENT IS, 'IF' THE INPUT EQUALS TO 'CHROME' THEN EXECUTE THE SCRIPT ON 'CHROME BROWESER'
// 'ELSE' OTHER THAN 'CHROME BROWSER', i.e, Firefox|IE|Edge then EXECUTE THE SCRIPT ON 'FIREFOX BROWSER'.

		System.out.println("Start");
		
		String input = "chrome"; // The input is equals to 'chrome', so the output is "Execute Script on Chrome Browser"
	
		// String input = "firefox";
		// String input = "ie";
		// String input = "edge";
// The input is not equals to 'chrome' so the control goes to 'else' block
// so the output is "Execute Script on firefox Browser"
		
		if(input.equals("chrome")){ // the condition is true so the control goes inside the and 'if' statement is executed after this control goes after the 'else' block
		
		System.out.println("Execute Script on Chrome Browser");	
		
		}else{
		
			System.out.println("Execute Script on firefox Browser");
			
		}
		
		System.out.println("End");
	}

}
