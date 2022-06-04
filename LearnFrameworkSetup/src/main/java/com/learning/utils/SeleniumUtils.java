package com.learning.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.learning.driver.DriverManager;
import com.learning.enums.WaitType;
import com.learning.reports.ExtentLogger;

public class SeleniumUtils {
	
	
	public static void click(By by,String elementName) {
		WebElement element = waitUntilElementPresent(by);
		element.click();
		ExtentLogger.pass(elementName + " is clicked successfully");
	}
	
	
	public static void sendKeys(By by,String value,String elementName) {
		WebElement element = waitUntilElementPresent(by);
		element.clear();
		element.sendKeys(value);
		ExtentLogger.pass(value + " is entered "+" successfully in "+elementName);
	}
	
	public static void click(By by, WaitType waitType, String elementname) {
		WebElement element = null;
		
		if(waitType == WaitType.PRESENCE) {
			element = waitUntilElementPresent(by);
		} else if(waitType == WaitType.CLICKABLE) {
			element = waitUntilElementToBeClickable(by);
		} else if(waitType == WaitType.VISIBLE) {
			element = waitUntilElementToBeVisible(by);
			
		}
		
		element.click();
		ExtentLogger.pass(elementname + " is clicked successfully");
		
		
		
	}
	

	
	
	
	
	
	private static WebElement waitUntilElementPresent(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDr(),Long.parseLong(PropertyUtils.getValue("timeout")));
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	
	private static WebElement waitUntilElementToBeClickable(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDr(),Long.parseLong(PropertyUtils.getValue("timeout")));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private static WebElement waitUntilElementToBeVisible(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDr(),Long.parseLong(PropertyUtils.getValue("timeout")));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
