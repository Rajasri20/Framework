package com.automation;

public class Java_IfElseIf_Test {

	public static void main(String[] args) {

		// IF ELSE IF: Is Selecting 1 option from Multiple Options

		// If the Condition1 is TRUE the Statements for ‘if’ are executed. Now the
		// Control directly exits from 'If else if' conditional statement and
		// executes the statements after 'If else if'.
		// If the Condition1 is FALSE then control goes to ‘else if’ Condition2 block
		// and Statements for ‘else if’ Condition2 are executed.
		// Refer to detailed word notes

		System.out.println("Start");

		String browser = "edge";

		// Once the execution is done with 'chrome', in the statement change it to
		// 'firefox', 'edge' and 'ie', 'sarada'.
		// The output will be displayed with respective Browsers

		if (browser.equals("chrome")) {
			System.out.println("Chrome Execution");
		} else if (browser.equals("firefox")) {
			System.out.println("Firefox Execution");
		} else if (browser.equals("edge")) {
			System.out.println("Edge Execution");
		} else if (browser.equals("ie")) {
			System.out.println("IE Execution");
		} else {
			System.out.println("Invalid Broser Execution");
		}

		// After developing the programe we need to understand the flow,
		// so Eclipse provided 'Debug' feature
		// To Debug the programme you need to set the 'Line Break point' inside the main method,
		// at the start of the programme on "line 16" double click, you will see a circle
		// then click on the "Debug Icon" on the main Menu, pop up will be displayed 
		// on the the pop click on "Switch".
		// Now on your "Key Board" press "F6" to execute the Statements,
		// If you want to see 'What is the out come of the "if" condition',
		// just select the content between 'open, closed parathesis()', 
		// now right click select "inspect" or "watch", you will see output of the condition is TRUE or False. 
		// if it finds any Condition for the "edge" it will directly jump to the 'if else if' 'edge statement'
		// it will execute the script,
		// then press again F6 for 'else if closed braces '}', it will exit from 'if else if'
		// and executes the next statement that is "System.out.println("End");"
		// Now 'Terminate Debug mode(the red icon in Console or from main menu)'
		// then 'Switch to JAva mode' on top right corner you will see 'Package, java
		// icons' click on it. you will see normal screen.

		System.out.println("End");

	}

}
