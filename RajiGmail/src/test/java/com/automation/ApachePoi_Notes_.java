package com.automation;

public class ApachePoi_Notes_ {
	
	/* Apache POI
	 * 
	 * Suppose you HARD CODED THE DATA in the SCRIPT, when you want to CHANGE the DATA 
	 * you need to go to each and every script and change, WHICH is NOT RECOMMENDED.
	 * 
	 * EX: Username, Password, FirstName, LastNAme, Phone number.
	 * 
	 * WHILE CREATING tEST DATA IN "eEXCEL", 
	 * if you have to CREATE "NUMERIC VALUES", to KEEP them in the 
	 * "SAME FORMAT" we should 1st WRITE "APOSTOPHE"(') and write THE NUmeric values
	 * EX: '5732020562    
	 * 
	 *  In this RELEASE it might be the same names but in COMING RELEAS it might be different
	 * 
	 *  That is why you need to separate the TEST DATA from Script 
	 *  and  put the data in the EXCEL it it will be EASY to change.
	 * 
	 */
	
	/* Apache POI Role
	 * 
	 * To READ the CONTENT from Excel, that means to Automate Excel
	 * 
	 * When ever you want to Automate "Excel file" we use Apache POI 
	 * 
	 * 
	 * Features
	 * 
	 * 1. Open Source and Free ware on internet
	 * 2. Supports Microsoft Office, Excel, Word and Power Point too 
	 * 3. In Automation Point of View we place the data in the Excel file, 
	 * 	  we are going to use Excel only, to READ the CONTENT and WRITE the CONTENT. 
	 * 
	 * 4. It supports 2 formats of Excel, ".xlsx, .xls"
	 * 5. It can be integrated with "Maven, TestNg, Jenkins"
	 * 
	 */
	
	/* Apache POI Dependencies
	 * 
	 * Go to mvnrepository.com 
	 * search for Apache POI 
	 * you will see multiple links but choose "poi-ooxml" one, click on 
	 * download the latest version, copy dependencies and paste in 'pom.xml' file and save it
	 *  
	 */
	
	/* Apache POI Classes
	 * 
	 * 1. File
	 * 		To Represent a File, File is one of the Class which is coming Java.io
	 * 		You need to CREATE FILE OBJECT, to READ the CONTENT from FILE.
	 * 
	 * 2. FileInputStream
	 * 		To READ the CONTENT from a FILE you need "FileInputStream" object 
	 * 
	 * 3. FileOutputStream
	 * 		To WRITE CONTENT into a FILE you need "FileOutputStream" object
	 *
	 */
	
	/* Apache POI Interfaces
	 * 
	 * 1. Workbook Interface
	 * 	
	 * 2. Sheet Interface
	 * 
	 * 3. Row Interface
	 * 
	 * 4. Cell Interface
	 * 
	 * Using the above Interfaces ".xlsx and xls" Implementation Classes will be supported
	 * No need to write Implementation Classes, just for Knowledge purpose only.
	 * 
	 */
	
	
	/* Implementation Classes for Above
	 * 
	 * 1. Implementation Classes for "Workbook Interface"
	 * 
	 * 	a. HSSFWorkBook -> Horrible Spread Sheet Format Work Book -> Supports(.xls which is a old format) 
	 *	b. XSSFWorkBook -> Xml Spread Sheet Format Work Book -> Supports(.xlsx which is a NEW format) 
	 * 
	 * 2. Implementation Classes for "Sheet Interface"
	 *  
	 *  a. HSSFWorkSheet -> Horrible Spread Sheet Format Sheet -> Supports(.xls which is a old format) 
	 *	b. XSSFWorkSheet -> Xml Spread Sheet Format Sheet -> Supports(.xlsx which is a NEW format) 
	 * 
	 * 3. Implementation Classes for "Row Interface"
	 * 
	 * a. HSSFRow -> Horrible Spread Sheet Format Row -> Supports(.xls which is a old format) 
	 * b. XSSFRow -> Xml Spread Sheet Format Row -> Supports(.xlsx which is a NEW format) 
	 * 
	 * 4.Implementation Classes for "Cell Interface"
	 * 
	 * a. HSSFCell -> Horrible Spread Sheet Format Cell -> Supports(.xls which is a old format) 
	 * b. XSSFCell -> Xml Spread Sheet Format Cell -> Supports(.xlsx which is a NEW format)
	 * 
	 * */
	
	 /* HOW TO CREATE A "TEST DATA EXCEL SHEET"? 
	  * 
	  * Go to My PC, in any drive Create a "EXCEL WORKBOOK" with file extension ".xlsx"
	  * 
	  * Now open the "EXCEL WORKBOOK",  file click on "SAVE AS",
	  * on the "SAVE AS" window, in "Save as type" select "Excel 97-2003 Workbook",
	  * click to 'Save', work book is saved as in ".xls" format, which is a older version 
	  * 
	  * */
	
	
	
	
	
	

}
