package excelDataExtraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
		// To input UserID and Password of Mohan3 U

		// Complete Excel sheet we call it as Workbook - To handle Workbook, Java has
		// XSSFWorkbook class
		// Each tab in the excel sheet is called as Sheet - To handle Sheet, Java has
		// XSSFSheet class
		// XSSFWorkbook, XSSFSheet class are present under Apache libraries. Poi,
		// Poi-ooxml
		// We have to add Apache Poi, Poi-ooxml into maven dependencies

		// 1. Create Object of Workbook using XSSFWorkbook class
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\SeleniumTestData\\TestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// 2. Create object of sheet and locate the respective sheet using XSSFSheet
		// class
		int numOfSheets = workbook.getNumberOfSheets();

		XSSFSheet sheet = null;

		// This for loop is to select the required sheet from the list of sheets
		for (int i = 0; i < numOfSheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet2")) {
				sheet = workbook.getSheetAt(i);
			}
		}

		// 3. Fetch data from the sheet using 2 iterators

		Iterator<Row> itrRow = sheet.iterator();

		while (itrRow.hasNext()) {
			Row row = itrRow.next();

			Iterator itrCell = row.cellIterator();

			Cell cell = (Cell) itrCell.next();

			if (cell.getStringCellValue().equals("Mohan3 U")) {
				System.out.println(cell.getStringCellValue());
			} else if (cell.getCellType() == CellType.NUMERIC) {
				System.out.println(cell.getNumericCellValue());
			}
		}

	}

}
