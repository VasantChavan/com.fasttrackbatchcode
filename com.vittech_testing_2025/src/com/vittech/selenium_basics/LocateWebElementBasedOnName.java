package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnName {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// Locate Based on name
		
		WebElement email_txt = driver.findElement(By.name("email"));		
		WebElement pass_txt = driver.findElement(By.name("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		System.out.println(email_txt.getAttribute("placeholder"));
		System.out.println(pass_txt.getAttribute("placeholder"));
		
		email_txt.sendKeys("vasant@facebook.com");
		pass_txt.sendKeys("vasant@15435$%");
		System.out.println(driver.getTitle());
		
		
		System.out.println(email_txt.getAttribute("value"));
		System.out.println(pass_txt.getAttribute("value"));
		
		loginBtn.click();
		
		System.out.println(driver.getTitle());
		
		
		driver.close();
	}

}
