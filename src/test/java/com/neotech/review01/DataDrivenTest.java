package com.neotech.review01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	@BeforeMethod
	public void before() {
		System.out.println("*** Before the Test Method");
	}
	
	@Test(dataProvider = "data")
	public void loginTest(String name, String company, String jobPosition) {
		System.out.println("------------------------");
		System.out.println(name + " - " + company);
		System.out.println("He/She works as -> " + jobPosition);
		System.out.println("------------------------");

			
		
	}
	
	@DataProvider(name = "data")
	public Object[][] createData() {
		Object[][]	data = {{ "Halil", "Facebook", "QA Lead"},
							{ "Ozzy", "Oracel", "QA Engineer"},
							{ "Chris", "Tesla", "Test Engineer"},
							{ "Mercedes", "Instagram", "QA Automation"}
		};
		
		return data;
	}

}
