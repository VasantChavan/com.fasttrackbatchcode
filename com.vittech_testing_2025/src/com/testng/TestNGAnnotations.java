package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void test1() {
		System.out.println(" TestNG Test test1() method");
	}
	@Test
	public void test2() {
		System.out.println(" TestNG Test test2() method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" TestNG beforeSuite() ");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" TestNG afterSuite() ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" TestNG beforeTest() ");

	}

	@AfterTest
	public void afterTest() {
		System.out.println(" TestNG afterTest() ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" TestNG beforeClass() ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" TestNG afterClass() ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" TestNG beforeMethod() ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" TestNG afterMethod() ");
	}

}
