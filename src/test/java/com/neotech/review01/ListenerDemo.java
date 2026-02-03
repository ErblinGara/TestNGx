package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerDemo {
	
	@BeforeMethod
	public void before() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("after method");
	}
	
	@Test
	public void test1() {
		System.out.println("This is Test1");
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2 () {
		System.out.println("This is Test2");
		
		Assert.assertTrue(false);
	}

}
