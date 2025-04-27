package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertionInTestNG 
{
	
	@Test
	public void test1()
	{
		System.out.println("Before assert");
		Assert.assertTrue(true);
		System.out.println("After assert");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Before assert");
		Assert.assertTrue(false);
		System.out.println("After assert");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Before assert");
		Assert.assertFalse(true);
		System.out.println("After assert");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Before assert");
		Assert.assertFalse(false);
		System.out.println("After assert");
	}
	
	@Test
	public void test5()
	{
		String exp="Facebook";
		String act="facebook";
		
		Assert.assertEquals(act, exp,"Expected is not matched with actual text");
	}
	
	@Test
	public void test6()
	{
		String exp="Facebook";
		String act="Facebook";
		
		Assert.assertEquals(act, exp,"Expected is not matched with actual text");
	}


}
