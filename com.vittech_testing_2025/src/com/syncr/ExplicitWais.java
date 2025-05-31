package com.syncr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWais {
	
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Up")))).click();
		
	}

}
