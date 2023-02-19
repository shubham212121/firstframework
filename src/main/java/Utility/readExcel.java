package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class readExcel {
	public static String readpropfile(String value) throws IOException
	{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Eclips\\FrameWorkProject\\src\\test\\resources\\DataFiles\\config.property");
	prop.load(fis);
	return prop.getProperty(value) ;
	}
	
	public static String readexcelfile(int row , int clm) throws EncryptedDocumentException, IOException
	{
		String path = ("C:\\Eclips\\FrameWorkProject\\src\\test\\resources\\DataFiles\\Book111.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Sheet excel = WorkbookFactory.create(fis).getSheet("pract");
		String value = excel.getRow(row).getCell(clm).getStringCellValue();
		return value;
	}


	
}
