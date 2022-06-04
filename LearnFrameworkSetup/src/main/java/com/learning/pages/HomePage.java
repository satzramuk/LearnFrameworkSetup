package com.learning.pages;

import org.openqa.selenium.By;

import com.learning.driver.DriverManager;
import com.learning.enums.WaitType;
import com.learning.utils.SeleniumUtils;

public class HomePage {
	
	private static final By BTN_WELCOME_LINK = By.xpath("//*[text()='Welcome Paul']");
	private static final By BTN_LOGOUT_LINK = By.xpath("//*[text()='Logout']");
	
	public String getHomePageTitle() {
		
		return DriverManager.getDr().getTitle();
	}
	
	
	public void logoutofApplication() {
		
		SeleniumUtils.click(BTN_WELCOME_LINK, WaitType.CLICKABLE, "WelcomeLink");
		SeleniumUtils.click(BTN_LOGOUT_LINK, WaitType.CLICKABLE, "Logout");
		
	}

}
