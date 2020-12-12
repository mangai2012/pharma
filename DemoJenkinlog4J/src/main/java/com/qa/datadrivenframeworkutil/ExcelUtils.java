package com.qa.datadrivenframeworkutil;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath  ;
	static XSSFWorkbook workbook ; 
	static XSSFSheet sheet ;
	public ExcelUtils(String excelPath, String SheetName) {
		try {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(SheetName);
	} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount=0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}
	public static int getColCount() {
		int colCount=0;
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Coloms : "+colCount);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}
	public static String getCellDataString(int rownum, int colnum) {
		String cellData=null;
		try {
			cellData =  sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println(cellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;

	}
	public static void getCellDataNumber(int rowNum, int colNum) {
		try {
			double cellData =  sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}


}
