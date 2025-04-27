package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class HardVsSoftAssert {
	
	
	
	
	@Test
	public void hardAssert()
	{
		System.out.println("statement before assertion fail");
		Assert.assertTrue(false);
		System.out.println("statement after assertion fail");
	}
	
	@Test
	public void softAssert()
	{
		SoftAssert softAssert=new SoftAssert();
		System.out.println("statement before soft assert pass");
		softAssert.assertTrue(true);
		System.out.println("statement after soft assert pass");
		
		System.out.println("statement before soft assert fail");
		softAssert.assertTrue(false);
		System.out.println("statement after soft assert fail");
		
		softAssert.assertAll();
	}

}
