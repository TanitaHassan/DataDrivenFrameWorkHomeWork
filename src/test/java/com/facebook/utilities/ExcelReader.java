package com.facebook.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String filePath;
	public String sheetName;

	public ExcelReader(String filePath, String sheetName) { // here make constructor use of generate
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	public String getStringCellValue(int rowNum, int columnName) { // create a method
		String celldata = null;
		try {
			FileInputStream fis = new FileInputStream(filePath); // formula of fileinputstream fis
			Workbook registrationBook = new XSSFWorkbook(fis); // poi dependency for memorise
			Sheet sheet = registrationBook.getSheet(sheetName);// sheet come registrationbook
			Row row = sheet.getRow(rowNum);// row come sheet
			Cell column = row.getCell(columnName);// cell column come row
			celldata = column.getStringCellValue();// celldata come column
			System.out.println(celldata);
			registrationBook.close();
			fis.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return celldata;

	}

	public double getNumericCellValue(int rowNum, int columnName) {
		double celldata = 0.0; // flag
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook registrationBook = new XSSFWorkbook(fis);
			Sheet sheet = registrationBook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(columnName);
			celldata = column.getNumericCellValue();
			System.out.println(celldata);
			registrationBook.close();
			fis.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return celldata;
	}

	public static void main(String[] args) {
		String file = "src/test/resources/registration.xlsx";
		ExcelReader er = new ExcelReader(file, "Sheet1");
		er.getStringCellValue(0, 0);
		er.getStringCellValue(1, 0);
		er.getStringCellValue(1, 3);

		ExcelReader er1 = new ExcelReader(file, "Sheet3");
		er1.getNumericCellValue(1, 0);
		er1.getNumericCellValue(1, 1);
	}

}
