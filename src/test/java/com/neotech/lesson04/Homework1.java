package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class Homework1 extends CommonMethods {

	@Test(dataProvider = "excelData", groups = {"homework","smoke"})
	public void addEmployee(String firstName, String lastName, String location, String username, String password) {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button")));

		click(driver.findElement(By.xpath("//span[text()='PIM']")));

		click(driver.findElement(By.xpath("//span[text()='Add Employee']")));

		waitForVisibility(By.id("first-name-box"));

		sendText(driver.findElement(By.id("first-name-box")), firstName);
		sendText(driver.findElement(By.id("last-name-box")), lastName);

		click(driver.findElement(By.xpath("//button[@class='btn']")));
		click(driver.findElement(By.linkText(location)));

		click(driver.findElement(By.xpath("//div[@class='custom-control custom-switch']")));

		sendText(driver.findElement(By.xpath("//input[@id='username']")), username);
		sendText(driver.findElement(By.xpath("//input[@id='password']")), password);
		sendText(driver.findElement(By.xpath("//input[@id='confirmPassword']")), password);

		wait(2);

		click(driver.findElement(By.id("modal-save-button")));

		// executor.executeScript("arguments[0].click();",
		// driver.findElement(By.xpath("//button[text()='Save']")));

		waitForVisibility(By.id("personal_details_tab"));

		takeScreenshot(username + ".png");

	}

	@DataProvider(name = "employees")
	public Object[][] getData() {

		Object[][] employee = { 
				{ "Ciara", "Flores", "Australian Regional HQ", "c1.flores2", "ciara@123" },
				{ "Burak", "Busche", "Australian Regional HQ", "b.busche32", "burak@123" },
				{ "Ozzy", "B.", "Australian Regional HQ", "ozzy.b12", "ozzy@123" }

		};

		return employee;
	}
	
	@DataProvider(name = "excelData")
	public Object[][] getExcelData() {
		String filePath = System.getProperty("user.dir") + "/testdata/Excel.xlsx";
		String sheetName = "Employee";
		
		return ExcelUtility.excelIntoArray(filePath, sheetName);
	}

}
