package com.learning.pages;

import org.openqa.selenium.By;

import com.learning.driver.DriverManager;
import com.learning.enums.WaitType;
import com.learning.reports.ExtentLogger;
import com.learning.utils.SeleniumUtils;

public class LoginPage {


	/*
	 * 3 Ways of doing Object segretion
	 * 
	 * 1. By locator Way 2. Page Factory 3. Dynamic String locator
	 */

	//By Locator Way

	private static final By TXBOX_USERNAME = By.name("txtUsername");
	private static final By TXBOX_PASSWORD = By.name("txtPassword");
	private static final By BTN_LOGIN = By.id("btnLogin");
	
	
	public LoginPage setUserName(String username) {

		DriverManager.getDr().findElement(TXBOX_USERNAME).sendKeys("admin");
		ExtentLogger.pass("Username is entered successfully");
		return this;
	}

	public LoginPage setPassword(String password) {

		DriverManager.getDr().findElement(TXBOX_PASSWORD).sendKeys("admin123");
		SeleniumUtils.sendKeys(TXBOX_PASSWORD, "admin123", "Password");

		return this;
	}

	//Method Chaining
	public HomePage setLogin() {

		//DriverManager.getDr().findElement(BTN_LOGIN).click();
		SeleniumUtils.click(BTN_LOGIN, WaitType.PRESENCE, "Login Button");
		return new HomePage();
		
	}

	
	public HomePage logintoApplication(String username,String password) {
		setUserName(username);
		setPassword(password);
		setLogin();
		return new HomePage();
		
	}

	





}
