package com.learning.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.learning.reports.ExtentLogger;
import com.learning.reports.ExtentManager;
import com.learning.reports.ExtentReport;

public class TestListener implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {

		//ExtentReport.createTest(result.getName());
		//To get method description
		ExtentReport.createTest(result.getMethod().getDescription());

	}


	@Override
	public void onTestSuccess(ITestResult result) {

		ExtentLogger.pass(result.getName() + " is passed successfully");

	}






	@Override
	public void onTestFailure(ITestResult result) {

		ExtentLogger.fail(result.getName() + " is failed miserably");
		//To print the fail message in report
		//ExtentLogger.fail(result.getThrowable().getMessage());
		//To print the stacktrace in report
		//ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		//To print the stacktrace in separate line on report
		ExtentManager.getExtentTest().log(Status.FAIL, result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {

		ExtentReport.initReports();

	}

	@Override
	public void onFinish(ITestContext context) {

		ExtentReport.flushReports();

		// Code for automatically refresh and open the extentreports
		try {
			Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/index1.html").toURI());
		} catch (IOException e) {

			e.printStackTrace();
		}



	}

}
