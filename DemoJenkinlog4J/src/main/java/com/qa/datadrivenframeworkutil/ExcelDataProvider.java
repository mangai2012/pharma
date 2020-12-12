package com.qa.datadrivenframeworkutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	static WebDriver driver=null;

	@BeforeMethod
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C:/Program Files/Selenium_2.40/Driverclassfiles/chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
	@Test(dataProvider="test1data")
	public void test1(String Username, String Password) throws Exception {
		System.out.println(Username+" | "+Password);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		//driver.findElement(By.xpath("//input{name="emailt"))
		Thread.sleep(2000);
			
		
	}
	
	
	
	
		@DataProvider(name = "test1data")
	    public Object[][] getData() {
		    String excelPath = "C:\\Users\\VijayGanesan\\git\\pharma\\DemoJenkinlog4J\\excel\\testdata.xlsx";
		    Object data[][] = testData(excelPath, "Dev");
		    return data;
		
	}
		public Object[][] testData(String excelPath,  String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName );
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object [rowCount-1][colCount];
		for(int i=1; i<rowCount; i++ ) {
			for(int j=0; j<colCount; j++) {
			    
				String cellData = excel.getCellDataString(i, j);
				// System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
				
			}
			System.out.println();
		}
		return data;
				
	}
@AfterMethod
public void teardown(){
	driver.quit();
	}
}
