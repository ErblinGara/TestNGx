package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework extends CommonMethods {
	
	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}
	
	@AfterMethod 
	public void quitBrowser() {
		tearDown();
	}
	
	@Test
	public void errormsgPasswordEmpty () {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		
		click(driver.findElement(By.xpath("//button")));
		
		WebElement errorMsg = driver.findElement(By.id("txtPassword-error"));
		
		
		if(errorMsg.isDisplayed()) {
			System.out.println("Test passed, message is displayed!");
		} else {
			System.out.println("Test failed, message is NOT displayed!!");
			throw new RuntimeException("Test failed, message is NOT displayed!!");
		}
	}

}
