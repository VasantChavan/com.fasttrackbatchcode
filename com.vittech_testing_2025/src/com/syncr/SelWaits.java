package com.syncr;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelWaits {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
	
		
		driver.manage().deleteAllCookies();
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for (Cookie cookie : cookies) {
			System.out.println(cookie);
		}
		
		
		driver.quit();
		
	}

}
