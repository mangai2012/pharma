package com.qa.demologintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoSkillsTestClass {
	WebDriver driver;

	@BeforeMethod
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C:/Program Files/Selenium_2.40/Driverclassfiles/chromedriver.exe");
	 driver = new ChromeDriver();
	
}
	@Test
	public void login(){
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("testng.sampletest");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		/*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sapani123@");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();*/
		
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
