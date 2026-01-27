package com.neotech.lesson01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void Test1() {
		System.out.println("This is test method1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test method2");
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
		
		@Test
		public void test3() {
			System.out.println("This is test method3");
			System.out.println("This is a new test method");
			System.out.println("It can be used to test a new feature");
			System.out.println();
		}
	}


