package com.learning.reports;

import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.learning.utils.ScreenshotUtils;

public final class ExtentLogger {

	private ExtentLogger() {}


	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);

	}


	public static void fail(String message) {
		ExtentManager.getExtentTest().fail(message);
		ExtentManager.getExtentTest().fail(message
				,MediaEntityBuilder
				.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());

	}

	public static void info(String message) {
		ExtentManager.getExtentTest().info(message);

	}


//	public static void fail(Throwable throwable,ITestResult iTestResult) {
//		ExtentManager.getExtentTest().log(Status.FAIL,iTestResult.getThrowable());		
//	}


	
	


}
