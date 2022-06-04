package com.learning.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

	private ExtentManager() {}

	private static final ThreadLocal<ExtentTest> threadlocal = new ThreadLocal<>();

	public static ExtentTest getExtentTest() {
		return threadlocal.get();
	}

	public static void setExtentTest(ExtentTest test) {
		threadlocal.set(test);
	}

	public static void unload() {
		threadlocal.remove();
	}




}
