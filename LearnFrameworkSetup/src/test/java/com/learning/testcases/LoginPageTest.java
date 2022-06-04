package com.learning.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.learning.driver.Driver;
import com.learning.driver.DriverManager;

public class LoginPageTest extends BaseTest{
	
	//1. Never hardcode any values.
	//2. Keeping right things in right place.
	//3. Reusability 
	
	//class or interface ---> Sathish
	//final constant values -->SATHISH or SATHISH_KUMAR
	//method name -->sathisH or sathish
	//package name --> com.learning.testcases 
	
	
	@Test
	public void test1() {
		
		
		DriverManager.getDr().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
        
		
	
	}
	
	@Test(enabled =false)
	public void test2() {
		
		
		DriverManager.getDr().findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
        
		
	
	}
	
	
	
	
	
	
	

}
