package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class TitleAndLogoValidation extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void titleValidation() {
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title validation passed!");
		} else {
			System.out.println("Title validation failed!");
			throw new RuntimeException("Title validation failed!!");
		}
	}
	
	@Test
	public void logoValidation() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		
		if(logo.isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}
	}
	
	@Test
	public void loginValidation() {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button")));
		
		WebElement userPic = driver.findElement(By.xpath("//div[@id='menu-profile']/img"));
		
		if(userPic.isDisplayed()) {
			System.out.println("Test passed, user logged in!");
		} else {
			System.out.println("Test faild!!!");
			throw new RuntimeException("Test failed!!");
		}
	}
	
}
