package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelDataProvider {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	public ExcelDataProvider() {
		try {
			File src = new File("./TestData/LoveCalculator.xlsx");
			FileInputStream fis = new FileInputStream(src);
			workbook = new XSSFWorkbook(fis);
		}
		catch (Exception e) {
	    	System.out.println("Unable to load Excel File : " + e.getMessage());
		}
	}
	public String getData(String sheetName, int row, int column) {
		sheet = workbook.getSheet(sheetName);
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(sheet.getRow(row).getCell(column));
	}
	public int getRowCount(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		return sheet.getLastRowNum();
	}
}
