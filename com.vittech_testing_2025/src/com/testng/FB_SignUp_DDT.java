package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FB_SignUp_DDT
{
	static WebDriver driver;
	
	
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(dataProvider = "fbSignUpData")
	public void createFBAccount(String fname,String lname, String dob, String dom,String doy,String gender,
			String email,String newPassword,String custDDOption)
	{
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement date = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement customradioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
		WebElement reg_email = driver.findElement(By.name("reg_email__"));
		WebElement reg_passwd = driver.findElement(By.name("reg_passwd__"));
		firstName.clear();
		firstName.sendKeys(fname);
		lastName.clear();
		lastName.sendKeys(lname);
		
		selectDropdownOptions(date, dob);
		selectDropdownOptions(month, dom);
		selectDropdownOptions(year, doy);
		
		if(gender.equals("Male"))
		{
			maleRadioBtn.click();
			
		}
		else if(gender.equals("Female"))
		{
			femaleRadioBtn.click();
		}
		else if(gender.equals("Custom"))
		{
			customradioBtn.click();
			WebElement customDD = driver.findElement(By.name("preferred_pronoun"));
			if(custDDOption.equals("She: \"Wish her a happy birthday!\"")) {
				selectDropdownOptions(customDD, custDDOption);
				WebElement custom_gender = driver.findElement(By.name("custom_gender"));
				custom_gender.clear();
				custom_gender.sendKeys("Female");
			}
			else if(custDDOption.equals("He: \"Wish him a happy birthday!\""))
			{
				selectDropdownOptions(customDD, custDDOption);
				WebElement custom_gender = driver.findElement(By.name("custom_gender"));
				custom_gender.clear();
				custom_gender.sendKeys("Male");
			}
			else if(custDDOption.equals("They: \"Wish them a happy birthday!\""))
			{
				selectDropdownOptions(customDD, custDDOption);
				WebElement custom_gender = driver.findElement(By.name("custom_gender"));
				custom_gender.clear();
				custom_gender.sendKeys("Custom");
			}
		}
		reg_email.clear();
		reg_email.sendKeys(email);
		reg_passwd.clear();
		reg_passwd.sendKeys(newPassword);
	}
	
	@DataProvider
	public String [][] fbSignUpData()
	{
		String[][] fbData= {
				{"vasant","chavan","22","Apr","1990","Male","vasant@gmail.com","Vasant@123$",""},
				{"Vaishali","Rane","8","Jul","1997","Female","Vaishali@gmail.com","Vaishali@123$",""},
				{"Vaishali","Rathod","8","Jul","1997","Custom","Vaishali@gmail.com","Vaishali@123$","She: \\\"Wish her a happy birthday!\\\""},
				{"Kaislash","Pawar","8","Jul","1997","Custom","Kailash@gmail.com","Kailash@123$","They: \"Wish them a happy birthday!\""}
				
		};
		return fbData;
	}
	
	static void selectDropdownOptions(WebElement ele,String option)
	{
		new Select(ele).selectByVisibleText(option);
	}

}
