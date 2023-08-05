package excelDataExtraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataExtraction {
	public static void main(String[] args) throws IOException {

		// Create a workbook object using XSSFWorkbook class

		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\SeleniumTestData\\TestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis); // fis is the file input stream object

		int numOfSheets = workbook.getNumberOfSheets();

		// workbook object can access all the XSSFWorkbook class methods

		XSSFSheet sheet = workbook.getSheetAt(1);

		//

		Iterator itrRow = sheet.iterator();
		while (itrRow.hasNext()) {
			Row row = (Row) itrRow.next();
			Iterator itrCell = row.cellIterator();
			while (itrCell.hasNext()) {
				Cell cell = (Cell) itrCell.next();

				System.out.println(cell.getRichStringCellValue());

			}
		}

	}
}
