package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateFBLoginPageTC {
	
	WebDriver driver;

	@BeforeTest
	public void setUP() {
		Reporter.log(" in it the chrome browser before test start",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Reporter.log(" Chrome browser is launched and navigate to Facebook login page",true);
	}

	@AfterTest
	public void tearDown() {
		Reporter.log(" close the chrome browser window after test ended",true);
		driver.quit();

	}

	@Test
	public void validateFBTitle() {
		Reporter.log(" validate Facebook title ",true);
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}

	@Test
	public void validateAUTURL() {
		Reporter.log(" validate Facebook URL ",true);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}

	@Test
	public void validateFBLogoIsDisplayed() {
		Reporter.log(" validate Facebook Logo is displayed ",true);
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed());
	}

	@Test
	public void validateFBLoginFormIsDisplayed() {
		Reporter.log(" validate Facebook form is displayed  ",true);
		Assert.assertTrue(driver.findElement(By.xpath("//form")).isDisplayed());
	}

}
