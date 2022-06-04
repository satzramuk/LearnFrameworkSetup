package com.learning.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.learning.enums.Modes;
import com.learning.utils.PropertyUtils;

public final class Driver {
	
	private Driver() {}
	
	
	
	public static void initDriver() {
		
		if(DriverManager.getDr()==null) {
			
		String mode = PropertyUtils.getValue("mode");
			
        WebDriver driver = DriverFactory.getDr(Modes.valueOf(mode.toUpperCase()));
        DriverManager.setDriver(driver);
        
		DriverManager.getDr().manage().window().maximize();
		DriverManager.getDr().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DriverManager.getDr().get(PropertyUtils.getValue("produrl"));
		
		}
	}
	
	public static void quitDriver() {	
		
		if(DriverManager.getDr()!=null){
			
		DriverManager.getDr().quit();
		DriverManager.setDriver(null);
		}
	}

}
