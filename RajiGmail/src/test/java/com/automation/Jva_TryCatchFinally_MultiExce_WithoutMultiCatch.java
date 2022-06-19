package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Jva_TryCatchFinally_MultiExce_WithoutMultiCatch {

	public static void main(String[] args) {


		System.out.println("Start");
		
		try {
			
			Thread.sleep(2000);
			
			File file = new File("D:\\TestData.xlsx");
			
			FileInputStream inputStream = new FileInputStream(file);
			
			// To HANDLE THE "Multiple Exceptions" WE NEED MULTIPLE "catch" blocks. BUT
			
			/* IS THERE ANY WAY TO HANDLE MULTI EXCEPTIONS WITHOUT WRITING MULTIPLE "catch" BLOCKS */ 
			
			// Yes, there is a way, WRITING SINGLE "catch" BLOCK and 
			
			// by WRITING "Exception" or "Throwable" in parenthesis
			
		}
		catch(Exception exception) {
			
			// catch(Throwable exception) {
			
		}
		
		System.out.println("End");


	}

}
