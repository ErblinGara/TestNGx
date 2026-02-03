package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {
	
	@Test
	public void HardAssertTest() {
		
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		
		String expectedAccount = "Jacqueline";
		String actualAccount = "Aaron";
		
		Assert.assertEquals(actualAccount, expectedAccount, "This account is wrong");
		
		//after hard assert fails, the test method will stop executing
		
		System.out.println("Step4");
	}
	
	@Test
	public void softAssertTest() {
		SoftAssert soft = new SoftAssert();
		
		System.out.println("Step1");
		
		String expectedGOAT = "Ronaldo";
		String actualGOAT = "Messi";
		
		soft.assertEquals(actualGOAT,expectedGOAT);//This assertion will fail
		
		System.out.println("Step2");
		
		soft.assertTrue(true);
		
		System.out.println("Step3");
		
		soft.assertEquals(960, 1000);
		
		//this assertAll() method will collect all soft assertions
		//and will decide if the Test Method will pass or fail
		//If all assertions pass, the Test Method will pass
		//if one of the assertions fails, the Test MEthod will fail
		soft.assertAll();
		
		System.out.println("Step4");
	}

}
