package com.neotech.lesson02;

import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class DependsDemo extends CommonMethods {
	
	@Test
	public void firstMethod() {

		System.out.println("firstTest");
	}
	
	@Test
	public void secondMethod() {

		System.out.println("secondTest");
	}
	
	@Test(dependsOnMethods= {"firstMethod", "secondMethod"})
	public void thirdMethod() throws Exception {

		System.out.println("thirdTest");
		throw new Exception();
	}
	
	@Test(dependsOnMethods = "thirdMethod")
	public void fourthMethod() {

		System.out.println("fourthTest");
	}

}
