package com.vittech.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnXpath {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.
//				xpath("/html/body/div[1]/div[1]/div[1]/div/div"
//						+ "/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).
//		sendKeys("vasant@facebook.com");
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/"
//				+ "div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"))
//		.sendKeys("vasant@124##$");
		
		
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vasant@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vasant@134%");
//		
//		
//		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		//input[@name='email'] ----> cssSelector input[name='email']
		
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vasant@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vasant@134%");		
		
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='_6ltg']/a")).getText());
		driver.quit();
	}

}
