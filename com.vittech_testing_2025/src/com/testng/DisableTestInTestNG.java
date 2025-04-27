package com.testng;

import org.testng.annotations.Test;

public class DisableTestInTestNG {

	@Test(enabled = true)
	public void test1() {
		System.out.println(" test1() method");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println(" test2() method");
	}

	@Test
	public void test3() {
		System.out.println(" test3() method");
	}

	@Test(enabled = false)
	public void test4() {
		System.out.println(" test4() method");
	}

	@Test
	public void test5() {
		System.out.println(" test5() method");
	}

}
