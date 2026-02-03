package com.neotech.lesson03;

import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {
	
	@Test(priority=3)
	public void firstMethod() {

		System.out.println("firstMethod");
	}
	
	@Test(enabled=false)
	public void firstMethod1() {

		System.out.println("firstMethod1");
	}
	
	@Test(priority=2)
	public void secondMethod() {

		System.out.println("secondMethod");
	}
	
	@Test(priority=1)
	public void thirdMethod() {

		System.out.println("thirdMethod");
	}
	
	@Test
	public void fourthMethod() {

		System.out.println("fourthMethod");
	}

}
