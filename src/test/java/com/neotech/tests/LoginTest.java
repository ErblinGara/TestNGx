package com.neotech.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test
	public void validLogin() {

		LoginPageElements loginPage = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		// send username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));

		// send password

		sendText(loginPage.password, ConfigsReader.getProperty("password"));

		// click login button
		
		click(loginPage.loginBtn);
		//or use jsClick() or Actions.click()
		
		wait(2);
		
		// verify the account name
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();
		
		//Assertion
		Assert.assertEquals(actual, expected, "Account does not match");
		
	}

}
