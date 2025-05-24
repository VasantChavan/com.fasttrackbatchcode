package com.actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCommands {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		Actions action = new Actions(driver);
		//action.contextClick().perform();
		
		//driver.findElement(By.id("email")).sendKeys("selenium");
		
		//action.click(driver.findElement(By.xpath("//button[text()='Log in']"))).perform();
		//action.doubleClick(driver.findElement(By.xpath("//button[text()='Log in']"))).perform();
		
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.ENTER).perform();
	}

}
