package com.learning.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.learning.driver.Driver;
import com.learning.driver.DriverManager;

public class HomePageTest extends BaseTest{

	
	@Test
	public void test3() {

		
		DriverManager.getDr().findElement(By.name("q")).sendKeys("Marvel",Keys.ENTER);
        
		
	
	}

}
