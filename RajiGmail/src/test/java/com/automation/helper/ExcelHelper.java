package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {
	
	/* WHY "ExcelHelper" CLASS FILE IS CREATED IN 'NEW PACKAGE AND NEW CLASS'?
	 * 
	 * PURPOSE of the BELOW CODE is to RETRIEVE the data from "Excel",
	 * 
	 * this is "Excel" related stuff so create a CLASS and place in "core2" package or
	 *  
	 * CREATE 'NEW PACKAGE AND NEW CLASS' 
	 * COPY from BASESRIPT and PASTE it in newly created package. 
	 *  
	 *  
	 *  */

	public static Object[][] getTestData(String filePath, String sheetName) throws Exception {

		// 'Object[][]' is an INSTANCE method so make it as 'static' method and call this
		// Particular METHOD. Based on the CLASS NAME we can ACCESS this method.
		
		// REMOVE '@Dataprovider' from the CODE, because this CODE just only to READ the DATA
		// from EXCEL
		
		

		// REMOVE the HARD CODED file path value "D:\\TestDataFrameWork.xlsx", in the Method 
		// give a provision to ACCEPT the VALUE from OUTSIDE and 
		// MAKE it as PARAMETERIZED mETHOD write 'String filePath',  
		// Remove HARD CODED of "sheet1" and write 'String sheetName'
		// public static Object[][] getTestData(String filePath, String sheetName) throws Exception {
		
		/*  hOW TO GET THIS 'EXCELDATA' FROM HERE TO 'DataDriven_FrameWork_TC_001_CreateRecrd' */
		
		// TO GET THIS DATA FROME HERE,nOW GO YOUR DataDriven_FrameWork_TC_001_CreateRecrd
		// AND WRITE THE CODE, to go to EXCEL, 'CTRL CLICK' ON 'getTestData'
		// IT WILL NAVIAGTE HERE TO THIS SCRIPT
		// AND GOES TO THE PARTICULAR FILE AND GOES TO THE PARTICULAR SHEET AND WILL
		// CAPTURE THE ENTIRE DATA AND IT IS GOING TO RETURN AS 2 DIMENTIONAL ARRAY 
		// THAT 2 DIMENTIONAL ARRAY WE HAVE TO PROVIDE TO THE 'getTestData', you have to 
		// USE 'return' statement. 
		// return ExcelHelper.getTestData("D:\\TestDataFrameWork.xlsx", "Sheet1");
		
		Object[][] data = null;
		
		File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		
		Sheet sheet = workbook.getSheet(sheetName);
	
		data = new Object[sheet.getPhysicalNumberOfRows()- 1][sheet.getRow(0).getPhysicalNumberOfCells()];
		
		for (int rowIndex = sheet.getFirstRowNum()+ 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
		
		for (int colIndex = sheet.getRow(0).getFirstCellNum(); colIndex < sheet.getRow(0).getLastCellNum(); colIndex++) {
		
			data[rowIndex- 1][colIndex] = sheet.getRow(rowIndex).getCell(colIndex).toString();
	}	
		}
		
	workbook.close();
		
		return data;
		
		// data = new Object[sheet.getPhysicalNumberOfRows()- 1], meaning 
		// DO NOT get the HEADERS DATA, MINUS the FIRST ROW and Just GET only the REALDATA.
		
		// for (int rowIndex = sheet.getFirstRowNum()+ 1, meaning GET the DATA only which 
		// AFTER the HEADINGS, SO INDEX point of view 1st ROW NUMBER is ZERO, so 0+1 =1, so 
		// get the DATA AFTER the HEADINGS, which is 'Admin, Admin123, etc;'
		
	}
		}
