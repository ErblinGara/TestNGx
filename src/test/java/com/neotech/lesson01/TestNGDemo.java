package com.neotech.lesson01;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(groups = "smoke")
	public void testOne() {
		System.out.println("This is the first test method!");
	}
	
	
	@Test
	public void testTwo() {
		System.out.println("This is the second test method");
	}
	
	@Test(groups = "smoke")
	public void testThree() {
		System.out.println("This is the third test method!");
	}
}
