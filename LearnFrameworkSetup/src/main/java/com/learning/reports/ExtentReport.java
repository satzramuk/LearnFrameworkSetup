package com.learning.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {
	
	private ExtentReport() {}
	
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	public static void initReports() {
		//Initializing part for Extent Report
		if(Objects.isNull(extent)) {
		 extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/index1.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Automation Report");
		spark.config().setDocumentTitle("Checking");
		extent.attachReporter(spark);
		}
	}
	
	public static void flushReports() {
		if(Objects.nonNull(extent)) {
			extent.flush();

		}
	}
	
	public static void createTest(String testcasename) {
		extentTest = extent.createTest(testcasename);
		ExtentManager.setExtentTest(extentTest);
		
		
	}
	

}
