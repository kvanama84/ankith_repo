package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static File file;

	//**************************************************************//
			/*
			 * Method Name := loadexcelfile()
			 * 
			 * Input Parameter := Test-Data_Path
			 * 
			 * OutPut Parameter :=  
			 * 
			 * Designer #:= kiran
			 * 
			 * Sprint #:=
			 */
		public static   void loadexcelfile(){
			System.out.println("Loading Excel File");
			String path=System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";
			boolean status=verifyFileExist(path);
			if(status) {
				try {
					FileInputStream finput=new FileInputStream(file);
					try {
						book=new XSSFWorkbook(finput);
					} catch (IOException e) {
						
						System.out.println("Work book can't opened");
						}
					System.out.println("File Loaded Successfully");
					
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				
			}
			else {
				System.out.println("No file available under specified path "+path);
			}
			
						
				
				
		}

		//**************************************************************//
			/*
			 * Method Name := verifyFileExist()
			 * 
			 * Input Parameter := Test-Data_Path
			 * 
			 * OutPut Parameter :=  status
			 * 
			 * Designer #:= kiran
			 * 
			 * Sprint #:=
			 */
		public static   boolean verifyFileExist(String path) {
			boolean status=false;
			try {
				 file=new File(path);
				status=true;
			}catch(Exception e) {
				System.out.println("File not Existed in path "+path);
			}
			
			return status;
				
		}

		//**************************************************************//
			/*
			 * Method Name := getRowCountt()
			 * 
			 * Input Parameter := sheetName
			 * 
			 * OutPut Parameter :=  Total Row count
			 * 
			 * Designer #:= kiran
			 * 
			 * Sprint #:=
			 */
		public static  int getRowCountt(String sheetname) {
			int rowcount=0;
			try {
				 sheet=book.getSheet(sheetname);
				 rowcount=sheet.getPhysicalNumberOfRows();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return rowcount;
				
		}

		//**************************************************************//
			/*
			 * Method Name := getColumnCountt()
			 * 
			 * Input Parameter := sheetName
			 * 
			 * OutPut Parameter :=  Total Column count
			 * 
			 * Designer #:= kiran
			 * 
			 * Sprint #:=
			 */
		public static  int getColumnCountt(String sheetname) {
			int columncount=0;
			try {
				 
				columncount=sheet.getRow(0).getPhysicalNumberOfCells();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return columncount;
				
		}
		//*******************************************************************************//


}
