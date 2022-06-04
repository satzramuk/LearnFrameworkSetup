package com.learning.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learning.pages.HomePage;
import com.learning.pages.LoginPagePageFactoryWay;
import com.learning.reports.ExtentManager;

public class LoginHRMSecondTest extends BaseTest{
	
	@Test(description="To check title of OrangeHRM homepage title using Page Factory Way")
	public void titleValidationUsingPageFactoryWay() {
		//Code Need to removed
//	ExtentManager.getExtentTest().assignAuthor("Sathish").assignCategory("Smoke")
//	.assignCategory("Regression");
//		
		LoginPagePageFactoryWay loginPage = new LoginPagePageFactoryWay();
		
		loginPage.logintoApp();
		
		HomePage hp = new HomePage();
		String actual = hp.getHomePageTitle();
		Assert.assertEquals(actual, "OrangeHRM123","Title doesn't match");
		hp.logoutofApplication();
		
		
		
	}
	
	

}
