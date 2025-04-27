package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnPartialLinkText {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("a Page")).click();
		System.out.println(driver.getTitle()+"<====>"+driver.getCurrentUrl());
		
		driver.close(); 
		
	}

}
