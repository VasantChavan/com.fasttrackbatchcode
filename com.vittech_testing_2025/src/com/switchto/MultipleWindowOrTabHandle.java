package com.switchto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowOrTabHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		

		Thread.sleep(3000);

		String parentWinId = driver.getWindowHandle();
		System.out.println(parentWinId);

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();

		Thread.sleep(3000);

		Set<String> winIds = driver.getWindowHandles();
		for (String wind : winIds) {
			if (!parentWinId.equals(wind)) {
				driver.switchTo().window(wind);
				System.out.println(wind);
				System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(parentWinId);		
		System.out.println(parentWinId);
		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		 driver.close();
		//driver.quit();

	}

}
