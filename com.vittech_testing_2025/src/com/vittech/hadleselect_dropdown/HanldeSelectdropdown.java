package com.vittech.hadleselect_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HanldeSelectdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD= driver.findElement(By.name("birthday_day"));
		WebElement monthDD= driver.findElement(By.name("birthday_month"));
		WebElement yearDD= driver.findElement(By.name("birthday_year"));
		
		
		// By using index
		
		Select day = new Select(dayDD); // select day from the dropdown based on index
		day.selectByIndex(3); // it will select day as 10
		
		Select month = new Select(monthDD);
		month.selectByIndex(0);
		
		Select year = new Select(yearDD);
		year.selectByIndex(120);
		
		Thread.sleep(2000);
		// By using visible text
		
		day.selectByVisibleText("22");
		month.selectByVisibleText("Apr");
		year.selectByVisibleText("2022");
		
		
		Thread.sleep(2000);
		
		// based on value
		
		day.selectByValue("15");
		month.selectByValue("8");
		year.selectByValue("2019");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
