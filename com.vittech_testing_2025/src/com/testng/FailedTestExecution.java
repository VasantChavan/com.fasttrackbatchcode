package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FailedTestExecution {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Vasant","Vasant");
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("Vasant","Vasant");
	}
	
	@Test
	public void test5()
	{
		Assert.assertFalse(false);
	}
	
	@Test
	public void test6()
	{
		Assert.assertFalse(false);
	}

}
