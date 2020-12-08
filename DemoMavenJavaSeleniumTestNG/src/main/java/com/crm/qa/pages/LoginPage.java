package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.baseclass.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	/* @FindBy(xpath="//form[@id='loginForm']/button(contains(., 'Login')") 
	    WebElement loginButton;*/
	 
	 
	@FindBy(xpath="//div[contains(@class,'ui fluid large blue submit button')]")
	 WebElement loginButton;
	
	@FindBy(linkText = "https://api.cogmento.com//register")
	WebElement SignUpBtn;
}
