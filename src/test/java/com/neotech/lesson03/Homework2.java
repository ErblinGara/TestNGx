package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void employeeVerification() {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button")));

		click(driver.findElement(By.xpath("//span[text()='PIM']")));

		click(driver.findElement(By.xpath("//span[text()='Add Employee']")));

		WebElement fullNameLabel = driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
		boolean nameLabelisDisplayed = fullNameLabel.isDisplayed();

		WebElement idLabel = driver.findElement(By.xpath("//label[text()='Employee Id']"));
		boolean idLabelisDisplayed = idLabel.isDisplayed();

		WebElement locationLabel = driver.findElement(By.xpath("//label[text()='Location']"));
		boolean locationLabelisDispalyed = locationLabel.isDisplayed();

		SoftAssert soft = new SoftAssert();

		soft.assertTrue(nameLabelisDisplayed);
		soft.assertTrue(idLabelisDisplayed);
		soft.assertTrue(locationLabelisDispalyed);

		sendText(driver.findElement(By.id("first-name-box")), "John");
		sendText(driver.findElement(By.id("last-name-box")), "KAQIKU");

		click(driver.findElement(By.xpath("//button[@class='btn']")));
		click(driver.findElement(By.xpath("//div[@class='inner show']/ul/li[8]/a")));
		click(driver.findElement(By.id("modal-save-button")));

		// executor.executeScript("arguments[0].click();",
		// driver.findElement(By.xpath("//button[text()='Save']")));

		WebElement personalDetailsTab = driver.findElement(By.id("personal_details_tab"));
		boolean detailsTabisDisplayed = personalDetailsTab.isDisplayed();

		soft.assertTrue(detailsTabisDisplayed);

	}

}
