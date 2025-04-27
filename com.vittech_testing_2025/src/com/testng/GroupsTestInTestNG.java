package com.testng;

import org.testng.annotations.Test;

public class GroupsTestInTestNG 
{

	@Test(groups = "Regression")
	public void regressionTest()
	{
		System.out.println("  regressionTest() ");
	}
	@Test(groups = "Smoke")
	public void smokeTest()
	{
		System.out.println("  smokeTest() ");
	}
	@Test(groups = "Sanity")
	public void sanityTest()
	{
		System.out.println("  sanityTest() ");
	}
	
	@Test(groups = {"Sanity","E2E"})
	public void endToEndTest()
	{
		System.out.println("  endToEndTest() ");
	}
	
	
}
