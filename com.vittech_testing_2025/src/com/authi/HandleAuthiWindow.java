package com.authi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthiWindow {

	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		// By using Robot class
		
		Robot robot = new Robot();
		
		StringSelection sel = new StringSelection("Admin");
		
	
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}
}
