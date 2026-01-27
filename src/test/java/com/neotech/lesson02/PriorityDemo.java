package com.neotech.lesson02;

import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class PriorityDemo extends CommonMethods {
	
	
	@Test(priority=1)
	public void firstMethod() {

		System.out.println("firstTest");
	}
	
	@Test(priority=2)
	public void secondMethod() {

		System.out.println("secondTest");
	}
	
	@Test
	public void thirdMethod() {

		System.out.println("thirdTest");
	}
	
	@Test(priority=10)
	public void fourthMethod() {

		System.out.println("fourthTest");
	}

}
