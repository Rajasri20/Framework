package com.automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ApathePoi_Excel_GetEntireTestData_PlacedDifferently {
	
	/* REQUIREMENT
	 * 
	 * Assume that "ENTIRE Number of ROWS in the EXCELL Placed after 10 ROWS, See Excel",
	 * How will you Handle?
	 * 
	 * The Answer is we have to USE 'NESTED FOR LOOP", We SHOULD NOT SPECIFY "rowIndex as Zero",
	 * if you give it as ZERO then it will SEARCH for "1st ROW" and THROWS "Null Pointer Error", 
	 * our DATA is in Some where in 10th line
	 * 
	 * and it will DYNAMICALLY TAKES THE DATA that LINE.
	 * 
	 *  Below METHOD is not RECOMMENDEd,
	 *  
	 *  for(int rowIndex= sheet.getFirstRowNum(); rowIndex <= sheet.getLastRowNum(); rowIndex++){
	 *  for(int colIndex=sheet.getRow(0).getFirstCellNum(); colIndex < sheet.getRow(0).getLastCellNum(); colIndex++) {
	 *  System.out.print(sheet.getRow(rowIndex).getCell(colIndex).toString()+ "\t");
	 *  }
	 *  System.out.println();
	 *  }
	 *  
	 *  
	 *  All the VALUES are HARD CODED, for "ENTIRE Number of ROWS in the EXCELL"
	 *  this METHOD is not RECOMMENDEd.
	 *  
	 *   REMOVE the "HARD CODED VALUES" and PROGARMATICALLY SPECIFY 
	 *  "1ST ROW and Last ROW NUMBERs, 1ST ROW CELL NUMBER, LAST ROW CELL NUMBER AS WELL",
	 *  
	 *   From 2nd FOR LOOP, "for(int colIndex=sheet.getRow(0).getFirstCellNum(); colIndex < sheet.getRow(0).getLastCellNum();" ,
	 *   
	 *   Remove ZERO from '.getRow(0)' and Replace it with getRow(rowIndex)
	 *   
	 *   Remove ZERO from '.getRow(0)' and Replace it with getRow(rowIndex) for "LastCellNumber" too
	 *    
	 *    see below
	 *    
	 *   for(int rowIndex= sheet.getFirstRowNum(); rowIndex <= sheet.getLastRowNum(); rowIndex++){
	 *   
	 *   for(int colIndex=sheet.getRow(rowIndex).getFirstCellNum(); colIndex < sheet.getRow(rowIndex).getLastCellNum(); colIndex++) {
	 *   
	 *   
	 */
	
	@Test
	public void read() throws Exception {
		File file = new File("D:\\TestDataDifferentlyPlaced.xlsx");
		
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
			
for(int colIndex=sheet.getRow(rowIndex).getFirstCellNum(); colIndex < sheet.getRow(rowIndex).getLastCellNum(); colIndex++) {
		
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
