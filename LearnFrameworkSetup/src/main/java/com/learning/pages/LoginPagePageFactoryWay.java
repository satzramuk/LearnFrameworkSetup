package com.learning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.learning.driver.DriverManager;

public class LoginPagePageFactoryWay {
	
	@FindBy(name="txtUsername")
	private WebElement textUsername;
	
	@FindBy(name="txtPassword")
	private WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	
	public LoginPagePageFactoryWay() {
		
		PageFactory.initElements(DriverManager.getDr(),this);
		
	}
	
	
	public void logintoApp() {
		
		textUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
		
	}
	
	
	
	
	
	
	
	

}
