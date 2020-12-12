package com.qa.datadrivenframeworkutil;

public class ExcelUtilsDemo {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"\\excel\\testdata.xlsx", "Dev");
		excel.getRowCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumber(1,1);
	}

}
