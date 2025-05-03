package com.switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alert= driver.switchTo().alert();
		alert.sendKeys("Welcome back on js prompt");
		System.out.println(alert.getText());
		
		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		driver.switchTo().alert();
		
	//	driver.quit();
		
	}
}
