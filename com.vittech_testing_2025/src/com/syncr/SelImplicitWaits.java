package com.syncr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelImplicitWaits {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//implicitly wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
	}

}
