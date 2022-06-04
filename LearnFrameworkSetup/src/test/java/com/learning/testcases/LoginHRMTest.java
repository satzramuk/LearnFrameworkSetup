package com.learning.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learning.pages.HomePage;
import com.learning.pages.LoginPage;
import com.learning.pages.LoginPagePageFactoryWay;
import com.learning.pages.TopMenuComponent;
import com.learning.utils.DataProviderUtils;

public class LoginHRMTest extends BaseTest {
	
	
	

	@Test(description="To check title of OrangeHRM homepage title using By Locator Way"
			,dataProvider ="getData",dataProviderClass = DataProviderUtils.class)
	public void titleValidationTestUsingByLocatorWay(String username,String password,String expectedTitle) {
		

		LoginPage loginpage = new LoginPage();
		String actualtitle = loginpage
				.logintoApplication(username,password)
				.getHomePageTitle();
		Assert.assertEquals(actualtitle, expectedTitle,"Title doesn't match");
		
		TopMenuComponent tp = new TopMenuComponent();
		tp.clickMenuOptionsUsingDynamicWay();
		



	}
	
	
	@Test(description="To check title of OrangeHRM homepage title using Page Factory Way")
	public void titleValidationUsingPageFactoryWay() {
		
		LoginPagePageFactoryWay loginPage = new LoginPagePageFactoryWay();
		
		loginPage.logintoApp();
		
		HomePage hp = new HomePage();
		String actual = hp.getHomePageTitle();
		Assert.assertEquals(actual, "OrangeHRM","Title doesn't match");
		
		
		
	}

}
