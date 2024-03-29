package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//In this file generic mehtods will be stored
// To Read the data from prpoerty file
// To Read the data from excel file
// To write the data to excel file
public class Filelibclass {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/commondata.property");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		String data=p.getProperty(key);
		
		return data;
	}
	
	public String getExcelData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		String s=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return s;
	}
	
}
