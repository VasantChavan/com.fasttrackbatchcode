package com.actionsdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=10854085908741941151&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9179682&hvtargid=kwd-311187680635&hydadcr=5841_2362028&mcid=8bf9681923ba38bda77ae6b4cb57468f");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(20000);
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='User Management '] "))).click().build().perform();
		
//		action.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']")))
//		.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link nav-item']/span[text()='Your Account']"))).click().build().perform();
	
		action.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).perform();
		
		
		
		List<WebElement> yourLists = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/ul/li/a/span"));
		for(WebElement ele: yourLists)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("Discover Your Style"))
			{
				ele.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
