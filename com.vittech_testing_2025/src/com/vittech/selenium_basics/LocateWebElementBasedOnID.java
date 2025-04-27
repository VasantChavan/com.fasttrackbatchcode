package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnID {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// Locate Based on name

		WebElement email_txt = driver.findElement(By.id("email"));
		WebElement pass_txt = driver.findElement(By.id("pass"));

		email_txt.sendKeys("vasant@gmail.com");
		pass_txt.sendKeys("vasant@1324##$");

		email_txt.clear();
		pass_txt.clear();

		email_txt.sendKeys("vaishali@gmail.com");
		pass_txt.sendKeys("vaishali@1324##$");

		email_txt.clear();
		pass_txt.clear();

		email_txt.sendKeys("varsha@gmail.com");
		pass_txt.sendKeys("varsha@1324##$");

		driver.close();
	}

}
