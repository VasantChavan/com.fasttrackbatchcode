package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnCssSelector {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("vasant@facebook.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("vasant@123$#@$");
		
		
		System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());
		
		driver.close();
	}
}
