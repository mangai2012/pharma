package com.pagetesting;
//checkin edit option with detail
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenPage {
	WebDriver driver;

	@BeforeMethod
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	
}
	@Test
	public void login(){
		driver.get("https://www.gmail.com");
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
