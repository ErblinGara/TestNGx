package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class SoftAssertDemo extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void logoAndLoginValidation() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		boolean logoIsDisplayed = logo.isDisplayed();

		logoIsDisplayed = false;

		SoftAssert soft = new SoftAssert();

		// i am using an object, and even if this assertion fails, still we continue
		// with the execution above.
		soft.assertTrue(logoIsDisplayed);

		// Login validation
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button")));

		String expected = "Jacqueline Whit";
		String actual = driver.findElement(By.id("account-name")).getText();

		soft.assertEquals(actual, expected, "Account name is not " + expected);
		
		//at the end of a test, i want to collect all the soft assertions and deide whether the test failed or passed.
		soft.assertAll();
		
		//if test case failed, execution stop at assertAll();

	}

}
