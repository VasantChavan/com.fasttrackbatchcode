package com.actionsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropActions {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		
				
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		
//		dragAndDropActions(driver, Washington, UnitedStates);
//		dragAndDropActions(driver, Seoul, SouthKorea);
//		dragAndDropActions(driver, Rome, Italy);
		
		
		//Drag and drop 
//		Actions action=new Actions(driver);
//		action.dragAndDrop(Washington, UnitedStates).build().perform();
		
		
		//Click and hold
		
		Actions action=new Actions(driver);
//		
//		action.clickAndHold(Washington).moveToElement(UnitedStates).release().build().perform();
		
//		clickAndHold(driver, Rome, Italy);
//		clickAndHold(driver, Washington, UnitedStates);
//		clickAndHold(driver, Seoul, SouthKorea);
		
		
		//action.contextClick().perform();
		//action.doubleClick().perform();
				
	}
	
	static void dragAndDropActions(WebDriver driver,WebElement source,WebElement target)
	{
		new Actions(driver).dragAndDrop(source, target).build().perform();
	}
	
	static void clickAndHold(WebDriver driver,WebElement source,WebElement target)
	{
		new Actions(driver).clickAndHold(source).moveToElement(target).release().build().perform();
	}
	
}
