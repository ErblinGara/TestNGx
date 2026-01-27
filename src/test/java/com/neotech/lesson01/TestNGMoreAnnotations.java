package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMoreAnnotations {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This method runs once before any test methods in the entire test suits");
		System.out.println("It is used for setup tasks that are common to all tests in the suit");
		System.out.println("For example, initializing global resources or setting up configs");
		System.out.println();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This method runs once after all test methods in the entire test suit");
		System.out.println("It is used for cleanup tasks that are common to all tests in the suit");
		System.out.println("For example, releasing global resources and resetting configurations");
		System.out.println();
	}
	
	
	@Test
	public void testOne() {
		System.out.println("Test1");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This method runs once before any test methods in this class");
		System.out.println("It is used to setup tasks that are common to all tests in the class");
		System.out.println("Fir example, initializing resources or setting up configurations");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This method runs once after all test methods in this class");
		System.out.println("It is used to cleanup tasks that are common to all tests in this class");
		System.out.println("For example, releasing resources or resetting configuration");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs before the test method");
		System.out.println("It is usually used for setup tasks");
		System.out.println("For example, opening the browser and going to the URL");
		System.out.println();
		
	}
	
		@AfterMethod
		public void afterMethod() {
			System.out.println("This method runs after the test method");
			System.out.println("It is usually used for cleanup tasks");
			System.out.println("For example, closing the browser and resetting variables");
			System.out.println();
		}
	
	
}
