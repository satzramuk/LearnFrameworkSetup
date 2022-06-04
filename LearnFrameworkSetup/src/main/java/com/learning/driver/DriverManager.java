package com.learning.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	
private DriverManager() {}
	
	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	
		

	public static WebDriver getDr() {
		return threadLocalDriver.get();
	}

	public static void setDriver(WebDriver driverref) {
		
		threadLocalDriver.set(driverref);
	}
	
	public static void unload() {
		threadLocalDriver.remove();
	}
	
	
	


}
