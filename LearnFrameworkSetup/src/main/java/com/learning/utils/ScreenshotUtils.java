package com.learning.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.learning.driver.DriverManager;

public final class ScreenshotUtils {
	
	private ScreenshotUtils() {}
	
	
    public static String getScreenshot(){
        return ((TakesScreenshot) DriverManager.getDr()).getScreenshotAs(OutputType.BASE64);
    }

	
	

}
