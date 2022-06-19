package com.automation;

public class Java_Condtinal_Switch_Test {

	public static void main(String[] args) {

		// SWITCH: Selecting 1 option from Multiple Options
		// Inside the expression it will accept only ‘int or char or string’.
		// Switch is a Key word or Reserved word.
		// Case is a Key word or Reserved word.
		// ‘Case1, case2, caseN’ will be replaced with the ‘int or char or string’.
		// Don’t forget to mention ‘colon (:)’ symbol and ‘break’ with a ‘;’ at the end.
		// If we mention ‘Break’ it exits from ‘Switch’ otherwise it will continue to
		// execute every statement. That’s why each and every case must have ‘Break’.
		// Drawback with ‘if else if ’ is it evaluates each and every expression until the true condition is met. But SWITCH will not evaluate each expression it directly finds TRUE condition
		// jumps to the TRUE condition.

		// Refer notes in WORD

		System.out.println("Start");

		String browser = "edge";
		
		// Once the execution is done with 'chrome', in the statement change it to 'firefox', 'edge' and 'ie', 'sarada'. 
		// The output will be displayed with respective Browsers

		switch (browser) {

		case "chrome":
			System.out.println("chrome Execution");
			break;
		case "firefox":
			System.out.println("Firefox Execution");
			break;
		case "edge":
			System.out.println("Edge Excecution");
			break;
		case "ie":
			System.out.println("IE Excution");
			break;
		default:
			System.out.println("Invalid Browser Execution");
			break;
		}
		
		// After developing the programe we need to understand the flow, so Eclipse provided 'Debug' feature
		// To Debug the programme you need to set the 'Line Break point' inside the main method,
		// at the start of the programme on "line 17" double click, you will see a circle. 
		// then click on the "Debug Icon" on the main Menu, on the the pop click on "Switch".
		// Now on your "Key Board" press "F6" to execute the Statements, 
		// if it finds any case for the "edge" it will directly jump to the 'edge case' it will execute the script, 
		// then again F6 for 'break', once it finds out 'break' it will exit from 'Switch' 
		// and executes the next statement that is "System.out.println("End");" 
		// Now 'Terminate Debug mode(the red icon in Console or from main menu)' 
		// then 'Switch to JAva mode' on top right corner you will see 'Package, java icons' click on it. you will see normal screen.
		
		System.out.println("End");
	}

}
