package excelDataExtraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;

public class DataFromExcel {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\SeleniumTestData\\TestData1.xls");
		
		Workbook wb = Workbook.getWorkbook(fis);
		
		Sheet sheet = wb.getSheet(1);
		
		System.out.println(sheet.getCell(0,0).getContents());
		
		

	}

}
