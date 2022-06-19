package com.automation;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ApathePoi_Excel_GetEntireTestData_ {
	
	/* REQUIREMENT
	 * 
	 * Assume that "ENTIRE Number of ROWS in the EXCELL", How will you Handle?
	 * 
	 * The Answer is we have to USE 'NESTED FOR LOOP".
	 * 
	 *  for(int rowIndex = 0; rowIndex <=6; rowIndex++){ This METHOD is not RECOMMENDEd,
	 *  All the VALUES are HARD CODED, for "ENTIRE Number of ROWS in the EXCELL"
	 *  this METHOD is not RECOMMENDEd.
	 *  
	 *   REMOVE the "HARD CODED VALUES" and PROGARMATICALLY SPECIFY 
	 *   "1ST ROW and Last ROW NUMBERs, 1ST ROW CELL NUMBER, LAST ROW CELL NUMBER AS WELL", see below 
	 *   
	 *   for(int rowIndex= sheet.getFirstRowNum(); rowIndex <= sheet.getLastRowNum(); rowIndex++){
		
		for(int colIndex=sheet.getRow(0).getFirstCellNum(); colIndex < sheet.getRow(0).getLastCellNum(); colIndex++) {
		
			System.out.print(sheet.getRow(rowIndex).getCell(colIndex).toString()+ "\t");
			
		}
		
		System.out.println();
	}
	   */
	
	@Test
	public void read() throws Exception {
		File file = new File("D:\\TestData.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		
		Sheet sheet =   workbook.getSheet("Sheet1"); 
		
		// 'getSheet' RETURNS the Programmer as 'Sheet'. 
		// Type in 'getSh' and select "getSheet()String name): sheet - workbook", Specift "Sheet" NAme
		// To CAPTURE the Reference, On the LEFT SIDE of the CODE write, 
		// 'Sheet', and create Reference Variable, which is "sheet"
		
		
		
		/* Using " Nested for Loop" Get the ENTIRE "Data" from Sheet1 
		 */
		
		for(int rowIndex= sheet.getFirstRowNum(); rowIndex <= sheet.getLastRowNum(); rowIndex++){
		
			// Before CLOSING 2nd FOR LOOP give SYOUT, to PRINT in DIFFERENT LINES,
			// Otherwise it will Print in SINLE LINE 
			
for(int colIndex=sheet.getRow(0).getFirstCellNum(); colIndex < sheet.getRow(0).getLastCellNum(); colIndex++) {
		
			System.out.print(sheet.getRow(rowIndex).getCell(colIndex).toString()+ "\t");
			
		}
		
		System.out.println();
	}
		
			/* ESCAPE SEQUENCE */
		
			// PRINT THE CONTENT AND GIVE SOMESPACE,DO NOT GO THE NEXT LINE. 
			
			// fROM "System.out.println" TAKE OUT ''ln' and at the end of the "toString()",
			// In Double quotes WRITE PLUS SIGN with BACKWARD SLASH "+ \t", 't' means "TAB" 
			// this is called PRINT THE CONTENT AND GIVE SOMESPACE. 
			// It will DISPLAY the CONTENT in SAME LINE,
			// "+ \t", SAYS DO NOT GO THE NEXT LINE,
			// BUT "System.out.println" will display ALL the HEADERS in the DIFFERENT LINES
			
		/* NOTE */
		
		// If you don't give the "System.out.println();" OUT SIDE OF 'if' BLOCK,
		
		// it will PRINT All the 3 rows in in SINGLE LINE,
		
		// So give "System.out.println();" OUT SIDE OF 'if' BLOCK,
		
		
		workbook.close();
		
		// Closes workbook 
		
	}
	
	
	

}
