package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnLinkText {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Meta Pay")).click();
		System.out.println(driver.getTitle()+"<====>"+driver.getCurrentUrl());
		
		//driver.close(); It will close the browser window where the driver instance is present
		
		driver.quit(); // It will close all the browser window which is opened by the driver instance.
	}

}
