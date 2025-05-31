package com.syncr;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsInSel {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.name("email")).sendKeys("vasant@facebook.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pass")).sendKeys("vasant@facebook.com");
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.linkText("Sign Up")).click();
//		
//		System.out.println(driver.getCurrentUrl()+"  "+driver.getTitle());
//		
//		Thread.sleep(2000);
		
	
		//driver.close();
		
		driver.quit();
	}
	

}
