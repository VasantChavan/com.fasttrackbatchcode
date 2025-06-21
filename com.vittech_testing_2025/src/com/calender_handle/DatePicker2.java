package com.calender_handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@aria-label='Flight Bookings']")).click();
		driver.findElement(By.xpath("//div[@class='+tJkyA']")).click();
		
		Thread.sleep(3000);

		String monthYear = "October 2025";
		String dateExp="15";

		while (true) {
			String month = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[1]/thead/tr[1]/th[2]/div")).getText();
			if (month.equals(monthYear)) {
				break;
			}
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[2]/thead/tr[1]/th[3]/div/button")).click();

		}

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='RYl+NW']/tbody/tr/td/div/button"));
		for (WebElement date : dates) {
			
			if (date.getText().endsWith(dateExp)) {
				date.click();
				break;
			}

		}
		
		Thread.sleep(5000);
		 driver.close();

	}

}
