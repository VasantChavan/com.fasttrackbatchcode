package com.vittech.hadleselect_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HanldeSelectDropdownUtility {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD= driver.findElement(By.name("birthday_day"));
		WebElement monthDD= driver.findElement(By.name("birthday_month"));
		WebElement yearDD= driver.findElement(By.name("birthday_year"));
		WebElement pronounDD = driver.findElement(By.name("preferred_pronoun"));
		
		selectDropdownOptions(dayDD,10);
		selectDropdownOptions(monthDD, 5);
		selectDropdownOptions(yearDD,20);
		
		Thread.sleep(3000);
		
		selectDropdownOptions(dayDD,"22");
		selectDropdownOptions(monthDD,"Aug");
		selectDropdownOptions(yearDD,"2000");
		
		Thread.sleep(3000);
		
		selectDropdownOptions("26",dayDD);
		selectDropdownOptions("12",monthDD);
		selectDropdownOptions("2019",yearDD);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='-1']")).click();
		Thread.sleep(3000);
		
		selectDropdownOptions(pronounDD, 1);
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	static void selectDropdownOptions(WebElement ele, int index)
	{
		new Select(ele).selectByIndex(index);
	}
	
	static void selectDropdownOptions(WebElement ele, String visible)
	{
		new Select(ele).selectByVisibleText(visible);
	}
	
	static void selectDropdownOptions(String value,WebElement ele)
	{
		new Select(ele).selectByValue(value);
	}

}
