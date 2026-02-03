package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class DataProviderDemo extends CommonMethods {

	@Test(dataProvider = "userData")
	public void loginFunctionality(String username, String password) {

		sendText(driver.findElement(By.id("txtUsername")), username);
		sendText(driver.findElement(By.id("txtPassword")), password);

		click(driver.findElement(By.xpath("//button")));

	}
	
	
	@DataProvider(name="userData")
	public Object[][] getData() {
		
		Object[][] credentials = {
				{"Admin", "Neotech@123"},
				{"Burak", "Burak123"},
				{"Lawrance", "Suh@123"}
				
		};
		
		return credentials;
	}

}
