package com.neotech.review01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("-->Test1 is running");
	}
	
	@Test(groups="regression")
	public void test2() {
		System.out.println("-->Test2 is running");
	}
	
	@BeforeMethod
	public void beforeM() {
		System.out.println("Just before the Test Method");
	}
	
	@AfterMethod
	public void afterM() {
		System.out.println("Just after the Test Method");
	}
	
	@BeforeTest
	public void beforeT() {
		System.out.println("Just before the functionality Test");
	}
	
	@AfterTest
	public void afterT() {
		System.out.println("Just after the functionality Test");
	}
	
}
