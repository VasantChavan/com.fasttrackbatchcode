package com.testng;

import org.testng.annotations.Test;

public class PriortiesTestInTestNG 
{

	@Test(priority = 1)
	public void login()
	{
		System.out.println("login() test");
	}
	
	@Test(priority = 2)
	public void create_account()
	{
		System.out.println(" create_account() test");
	}
	
	@Test(priority = 0)
	public void update_account()
	{
		System.out.println(" update_account() test");
	}
	
	@Test(priority = -1)
	public void logout()
	{
		System.out.println(" logout() test");
	}
	
	@Test
	public void deposit_amount()
	{
		System.out.println(" deposit_amount() test");
	}
	@Test
	public void withdraw_amount()
	{
		System.out.println(" withdraw_amount() test");
	}

}
