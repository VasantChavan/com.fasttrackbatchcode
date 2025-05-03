package com.switchto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleIFrameWithoutSwitchToCommnads {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");

		int iFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of iframe on the webpage are " + iFrames);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='Rich Text Area']")));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		WebElement txt_area = driver.findElement(By.xpath("//body[@id='tinymce']/p"));

		System.out.println(txt_area.getText());
		driver.quit();
	}

}
