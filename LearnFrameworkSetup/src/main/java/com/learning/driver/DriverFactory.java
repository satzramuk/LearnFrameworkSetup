package com.learning.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.learning.enums.Modes;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverFactory {
	
	private DriverFactory() {}


	
	public static WebDriver getDr(Modes mode) {

		WebDriver driver = null;

		if(mode.equals(Modes.LOCALCHROME)) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			

		}
		else if(mode.equals(Modes.LOCALFIREFOX)) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else if(mode.equals(Modes.LOCALEDGE)) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		else {
			System.out.println("No mode is selected");
		}
		return driver;
	
		
		
		

		


	}

}
