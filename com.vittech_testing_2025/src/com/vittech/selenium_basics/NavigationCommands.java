package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com");
		
		Navigation navigate = driver.navigate();
		navigate.to("https://www.facebook.com");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.findElement(By.linkText("Sign Up")).click();

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		//driver.navigate().back();
		navigate.back();
		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		//driver.navigate().forward();
		navigate.forward();

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

	//	driver.navigate().refresh();
		navigate.refresh();

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.navigate().back();

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.navigate().refresh();

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.close();

	}

}
