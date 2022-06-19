package com.automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ApathePoi_Excel_ReadTestData_ {
	
	// WorkbookFactory, Workbook, Sheet, Cell/Row, Column are Interfaces. 
	
	// WHEN YOU COME TO THE "DATE DRIVEN FRAME WORK", 
	// "1st Cell, 1st Row AND Last cell, Last Row NUMBERS" are required

	@Test
	public void read() throws Exception {
		File file = new File("D:\\TestData.xlsx");
		
		/* "File" to REPRESENT the "File"(jav.io), create an Object for "File".
		 * give File path File(String path java.io)
		 * File("D:\\TestData.xlsx");
		 * 
		 * */
		
		FileInputStream inputStream = new FileInputStream(file);
		
		/* "FileInputStream"(jav.io) is to READ the CONTENT from the FILE, 
		 * create an object and in the constructor pass the parameter as "file"
		 * You will see Exception error, go method declaration and write Exception 
		 * 
		 */ 
		
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		
		/* To READ the CONTENT we need to OPEN the EXCEL FILE,
		 * we need "WorkbookFactory", select related to 'org.apache poi.ss.usermodel'
		 * 'org.apache poi.ss.usermodel', in this '.ss' means "Spread Sheet"
		 * 
		 * "create" is nothing but OPEN, select the one with "(inputStream inp): Work book" 
		 * "create" is nothing but OPEN, OPEN the ABOVE FILE in READ ONLY MODE 
		 * 
		 * "create" RETURNs "(inputStream inp): WorkBook" 
		 * "Internally" what happens is work will be Opened and ADDRESS or REFERENCE of the
		 * complete "WorkBook" will be RETURNED to the 'Programmer',
		 * On the LEFT SIDE of the CODE write "Workbook and a Reference Variable",
		 * Address of the "Workbook(Excel sheet)" will be Stored 
		 * in the "Reference Variable" 'workbook'. 
		 * 
		 * DO NOT WRITE 'new',"After the reference variable which is 'workbook'. 
		 * otherwise it will be tread as Object 
		 * 
		 * */
		
		
		/* NumberOfSheets */
		
		System.out.println(workbook.getNumberOfSheets());
		
		// ".getNumberOfSheets" will get "NumberOfSheets" in the Excel, and print in Console 
		
		
		/* PhysicalNumberOfRows, FirstRowNumber and LastRowNumber for the Rows which have Data*/

		Sheet sheet =   workbook.getSheet("Sheet1"); 
		
		// 'getSheet' RETURNS the Programmer as 'Sheet'. 
		// Type in 'getSh' and select "getSheet()String name): sheet - workbook", Specift "Sheet" NAme
		// To CAPTURE the Reference, On the LEFT SIDE of the CODE write, 
		// 'Sheet', and create Reference Variable, which is "sheet"
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		// Index Point of view 1st Row is a 'Zeroth' row
		
		System.out.println(sheet.getFirstRowNum());
		
		System.out.println(sheet.getLastRowNum());
		
		
		/*PhysicalNumberOf Cells/Rows */
		
		
		Row row = sheet.getRow(0);
		
		// Gets 1st Row, which is '0' and Returns the Programmer as "Row", so WRITE in the LEFT SIDE
		
		System.out.println(row.getPhysicalNumberOfCells());
		
		System.out.println(row.getFirstCellNum());
		
		System.out.println(row.getLastCellNum());
		
		// My ACTUAL CELLS in Sheet are '6' but the "Output" shows as '7', because
		// For Internal Usage and for APIs point of View they wrote the Program as '6+1'
		// the Output shows as 7 not 6  
		
		
		/* Get the SINGLE "HEADER" or SINGLE "ROW" from Sheet1 */
		
		System.out.println(sheet.getRow(0).getCell(0).toString());
		
		// I already have SHEET OBJECT, Get 1st ROW which is ZERO, Get 1st Cell, 
		// which is again a ZERO. 
		
		// Convert BOTH into STRING METHOD, which is OPTIONAL
		
		// The OUT PUT will be "TestScriptName" 
		
		System.out.println(sheet.getRow(0).getCell(1).toString());
		
		// 1st Row Only but 2nd COLUMN
		
		
		/* Using "for Loop" Get the ENTIRE "HEADER" or ENTIRE "ROW" from Sheet1 
		 * 
		 * SAME STATEMENT Repeat 7 Times*/
		
		for(int colIndex=0; colIndex<7; colIndex++) {
		
			System.out.print(sheet.getRow(0).getCell(colIndex).toString()+ "\t");
			
		}
		
		System.out.println();
		
		for(int colIndex=0; colIndex<7; colIndex++) {
		
			System.out.print(sheet.getRow(1).getCell(colIndex).toString()+ "\t"); 
			
			// dISPLYS 2nd Row Content
			
		}
		
		System.out.println();
		
		for(int colIndex=0; colIndex<7; colIndex++) {
			
			System.out.print(sheet.getRow(2).getCell(colIndex).toString()+ "\t");
			
			// dISPLYS 3rd Row Content
			
		}
		
			// 'int' type,reference is 'colIndex'(colIndex=0), STRAT from ZERO,
			// "colIndex<7" not Include 7, because for Internal usage they wrote it as 6+1,
			// see note above.
			// We can also WRITE colIndex<6 also
			
			/* ESCAPE SEQUENCE */
		
			// PRINT THE CONTENT AND GIVE SOMESPACE,DO NOT GO THE NEXT LINE. 
			
			// fROM "System.out.println" TAKE OUT ''ln' and at the end of the "toString()",
			// In Double quotes WRITE PLUS SIGN with BACKWARD SLASH "+ \t", 't' means "TAB" 
			// this is called PRINT THE CONTENT AND GIVE SOMESPACE. 
			// It will DISPLAY the CONTENT in SAME LINE,
			// "+ \t", SAYS DO NOT GO THE NEXT LINE,
			// BUT "System.out.println" will display ALL the HEADERS in the DIFFERENT LINES
			
			// System.out.prinln(sheet.getRow(0).getCell(colIndex).toString());
		
		
		/* NOTE */
		
		// If you don't give the "System.out.println();" OUT SIDE OF 'if' BLOCK,
		
		// it will PRINT All the 3 rows in in SINGLE LINE,
		
		// So give "System.out.println();" OUT SIDE OF 'if' BLOCK,
		
		
		workbook.close();
		
		// Closes workbook 
		
	}

}
