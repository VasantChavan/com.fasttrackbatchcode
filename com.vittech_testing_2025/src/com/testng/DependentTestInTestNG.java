package com.testng;

import org.testng.annotations.Test;


public class DependentTestInTestNG 
{

	@Test
	public void login()
	{
		System.out.println("login() test");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void create_account()
	{
		System.out.println(" create_account() test");
	}
	
	@Test(dependsOnMethods = {"login","create_account"})
	public void update_account()
	{
		System.out.println(" update_account() test");
	}
	
	@Test(dependsOnMethods ="update_account" )
	public void logout()
	{
		System.out.println(" logout() test");
	}

}
