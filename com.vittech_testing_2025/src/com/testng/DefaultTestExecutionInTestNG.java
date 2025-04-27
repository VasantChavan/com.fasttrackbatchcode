package com.testng;

import org.testng.annotations.Test;

public class DefaultTestExecutionInTestNG 
{

	@Test
	public void login()
	{
		System.out.println("login() test");
	}
	
	@Test
	public void create_account()
	{
		System.out.println(" create_account() test");
	}
	
	@Test
	public void update_account()
	{
		System.out.println(" update_account() test");
	}
	
	@Test
	public void logout()
	{
		System.out.println(" logout() test");
	}

}
