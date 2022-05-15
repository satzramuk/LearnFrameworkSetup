package com.learning.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

	
	@Test
	public void test3() {
		
		
        driver.findElement(By.name("q")).sendKeys("Marvel",Keys.ENTER);
        
		
	
	}

}
