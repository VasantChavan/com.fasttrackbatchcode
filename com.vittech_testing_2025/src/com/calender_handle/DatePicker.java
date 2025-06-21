package com.calender_handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[text()='Date of Journey']")).click();

		String monthYear = "November 2025";
		String dateExp="15";

		while (true) {
			String month = driver.findElement(By.xpath("//div[@class='monthYearHolidayWrap___69b3f0']/p[1]")).getText();
			if (month.equals(monthYear)) {
				break;
			}
			driver.findElement(By.xpath("//i[@class='icon icon-arrow arrow___2dd861 right___841620 ']")).click();

		}

		List<WebElement> dates = driver.findElements(By.xpath("//ul[@class='datesWrap___add8bb']/li/div/div/span"));
		for (WebElement date : dates) {
			
			if (date.getText().endsWith(dateExp)) {
				date.click();
				break;
			}

		}
		 driver.close();

	}

}
