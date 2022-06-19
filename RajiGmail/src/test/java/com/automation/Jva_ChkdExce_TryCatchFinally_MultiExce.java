package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Jva_ChkdExce_TryCatchFinally_MultiExce {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			
			Thread.sleep(2000);
			
			File file = new File("D:\\TestData.xlsx");
			
			FileInputStream inputStream = new FileInputStream(file);
			
			// To HANDLE THE "Multiple Exceptions" WE NEED MULTIPLE "catch" blocks
			
			// To HANDLE THE "FileNotFoundException" WE NEED ONE MORE "catch" block
		}
		catch(InterruptedException exception) {
			
		}
		catch(FileNotFoundException exception) {
			
		}
		
		System.out.println("End");

	}

}
