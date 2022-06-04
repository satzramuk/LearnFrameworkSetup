package com.learning.testcases;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.learning.driver.Driver;
import com.learning.reports.ExtentReport;

public class BaseTest {
	
	
	
	
	@BeforeMethod
	public void setUp() {
		
		Driver.initDriver();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		Driver.quitDriver();
	}
	
	
	
	

}
