package com.vittech.selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com"); // It will navigate to the application under test

		driver.manage().window().maximize();

		String fb_title = driver.getTitle();
		System.out.println(fb_title);

		String appUrl = driver.getCurrentUrl();
		System.out.println(appUrl);

		driver.manage().window().minimize();

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();

		// driver.close();
		 driver.quit();
	}

}
