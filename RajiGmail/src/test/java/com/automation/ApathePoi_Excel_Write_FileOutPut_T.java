package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ApathePoi_Excel_Write_FileOutPut_T {
	
	/* REQUIREMENT
	 * 
	 *  Programmatically WRITE SOMTHING into the EXCEL
	 *  
	 *  WRITE/ENTER New DATA into the Excel CELLS.
	 *  
	 *  'SAVE' the DATA
	 *  
	 *  BEFORE "EXECUTING" the PROGRAM "CLOSE the EXCEL FILE". It SHOULD NOT bE  OPENED.
	 *  
	 *  BUT For "READ the CONTENT", you can "KEEP the EXCEL FILE OPEN"
	 *  
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
		
			// Before CLOSING 2nd FOR LOOP give SYOUT, to PRINT DATA in DIFFERENT LINES,
			// Otherwise it will Print in SINLE LINE 
			
for(int colIndex=sheet.getRow(rowIndex).getFirstCellNum(); colIndex < sheet.getRow(rowIndex).getLastCellNum(); colIndex++) {
		
			System.out.print(sheet.getRow(rowIndex).getCell(colIndex).toString()+ "\t");
			
		}
		
			System.out.println();
	}
		
			sheet.getRow(0).createCell(7).setCellValue("ExecutionStatus");
			
			// Sheet is nothing but 'Sheet1', from Sheet1 'get' Zeroeth ROW
			
			// In Automation Point of View, to "WRITE CONTENT", we need to "CREATE a CELL",
			// which is 7th CELL in the "1st COLUMN" of "SHEET1".
			
			// And SET 'cellValue', and type is boolean, in place of 'true/false', enter your value,
			// setCellValue("ExecutionStatus");
			
			
			/* ExecutionStatus PASS/FAIL
			 * 
			 * Pass/Fail will be displayed in the TEST SCRIPT, which is in 2nd ROW
			 *  
			 *  */
			
			sheet.getRow(1).createCell(7).setCellValue("Pass");
			
			// Sheet is nothing but 'Sheet1', from Sheet1 'get' 1st ROW
			
			// WRITE the CONTENT into the CELL no 7(createCell(7)), in 2nd ROW(createCell(7))
			
			// setValue as PASS/FAIL, setCellValue("Pass");
			
			
			/* After Entering the DATA WE ARE aSKING IT TO "SAVE the DATA" 
			 * 
			 * "write" is nothing but "SAVE", there is no direct SAVE METHOD 
			 * when ever you want to SAVE/WRITE, "FieOutPutStream" OBJECT is REQUIRED. 
			 *
			 * After workbook, type in 'wri' hit ctrl space bar,
			 * write(FileOutPutStream): void - workbook, displays, clcik on it,
			 * as soon as it is selected, the parameter value becomes "null",
			 * Now DELETE the "null" and write below CODE in the Parameters,
			 * enter "new" type in 'FileOut' ans and hit ctrl space bar, select  
			 * FileOutputStream'File file - java.oi. FileOutputStream',
			 * into which 'file' you want write the CONTENT, 
			 * you have to pass the "file" REFERENCE VARIABLE which is the above FILE.
			 * 
			 * This is the 'file' "File file = new File("D:\\TestData.xlsx");.
			 * 
			 * after passing the 'file' reference variable it looks like this,
			 * 
			 * "workbook.write(new FileOutputStream(file));"
			 * 
			 * 
			 * 
			 * */
			
			workbook.write(new FileOutputStream(file));
			
		// IF YOU FORGET TO WRITE THIS STATEMENT, YOU CAN WRITE THE CONTENT INTO THE EXCEL.
			
		
			workbook.close();
		
			// Closes workbook 
		
			// RUN THE PROGRAME AND oPEN AND 
			// oPEN THE EXCE AND SEE THAT THE CONTENT WILL BE WRITTEN INTO EXCEL. 
	}


}
