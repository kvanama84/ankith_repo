package com.readexcel;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class WriteExcel {
	public static FileOutputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static WebDriver driver;
	//public static File file;
  
  public static void write(String usrname,String password)   {
	  try {
		//  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  System.out.println("Loading Excel File");
		  file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\TestData.xlsx");
			XSSFWorkbook  wb=new XSSFWorkbook();
			XSSFSheet sh=wb.createSheet("a3");
			sh.createRow(0).createCell(0,1).setCellValue(usrname);
			sh.createRow(1).createCell(0,2).setCellValue(password);

			wb.write(file);
			wb.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	  
	  
	  
  }
}
