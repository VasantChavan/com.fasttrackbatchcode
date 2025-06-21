package com.calhandle;

import java.time.Duration;
import java.time.YearMonth;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.redbus.in/");
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[4]/div/div/div/div")).click();
		
		//driver.findElement(By.xpath("//div[@class='dojWrapper___1f3d15']")).click(); redbus click on departure date to open the calendar
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div")).click();
		
		String expMonth = "September 2025";
		//June 2025
		String day="20";
		
		
//		String monthYearXpath = "//p[@class='monthYear___2b924f']";
//		String nextArrowXpath= "//i[@class='icon icon-arrow arrow___2dd861 right___841620 ']";
//		String dateListsXpath = "//ul[@class='datesWrap___add8bb']/li/div/div/span";
//		
		//selectDate(expMonth, day, driver,monthYearXpath,nextArrowXpath,dateListsXpath);
		
		
		
//		while(true)
//		{
//			String actualMonth = driver.findElement(By.xpath("//p[@class='monthYear___2b924f']")).getText();
//			if(actualMonth.equals(expMonth))
//			{
//				break;
//			}
//			
//			driver.findElement(By.xpath("//i[@class='icon icon-arrow arrow___2dd861 right___841620 ']")).click();
//		}
//		
//		
//		List<WebElement> dates = driver.findElements(By.xpath("//ul[@class='datesWrap___add8bb']/li/div/div/span"));
//		
//		for (WebElement date : dates) {
//			
//			//System.out.println(date.getText());
//			if(day.equals(date.getText()))
//			{
//				date.click();
//				break;
//			}
//			
//		}
		
		
		String monthYearXpath="//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[1]/thead/tr[1]/th[2]/div";
		
		String nextArrowXpath="//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[2]/thead/tr[1]/th[3]/div/button";
		String listDates="(//tbody)[1]/tr/td/div/button";
		
		selectDate(expMonth,day,driver,monthYearXpath,nextArrowXpath,listDates);
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	static void selectDate(String expMonthYear,String day,WebDriver driver,String monthYear,String nextArrow,String datesList)
	{
		
		while(true)
		{
			String actualMonth = driver.findElement(By.xpath(monthYear)).getText();
			if(actualMonth.equals(expMonthYear))
			{
				break;
			}
			
			driver.findElement(By.xpath(nextArrow)).click();
		}
		
		
		List<WebElement> dates = driver.findElements(By.xpath(datesList));
		
		for (WebElement date : dates) {
			
			//System.out.println(date.getText());
			if(day.equals(date.getText()))
			{
				date.click();
				break;
			}
			
		}
	}

}
