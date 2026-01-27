package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setUp () {
		ConfigsReader.readProperties(Constant.CONFIGURATION_FILEPATH);

		String browser = ConfigsReader.getProperty("browser");

		driver = null;
		switch (browser.toLowerCase()) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			driver = new FirefoxDriver();
			break;
		}
		default:
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.IMPLICIT_WAIT_TIME));
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
		
	}
	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
