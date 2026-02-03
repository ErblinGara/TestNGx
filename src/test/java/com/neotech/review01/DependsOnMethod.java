package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(dependsOnMethods = "secondMethod")
	public void addEmployeeMethod() {
		System.out.println("The add employee Test Method");
	}
	
	@Test
	public void loginMethod() {
		System.out.println("The Login Test Method");
		
		Assert.assertEquals("A", "B");//we are failing this test on purpose
	}

}
