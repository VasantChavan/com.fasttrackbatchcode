package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnClassName {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// Locate based on class-name
		
		//inputtext _58mg _5dba _2ph-
		//WebElement email_txt = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		//email_txt.sendKeys("asant@facebook.com");
		
		WebElement visibleTxt = driver.findElement(By.className("_8eso"));
		System.out.println(visibleTxt.isDisplayed());
		
		System.out.println(visibleTxt.getText());
		
		System.out.println(driver.findElement(By.className("_9vtf")).isDisplayed());
		
		driver.close();
	}

}
