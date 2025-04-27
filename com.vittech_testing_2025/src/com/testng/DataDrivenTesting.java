package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	
	
	@Test(dataProvider = "TestData")
	public void getTestData(String username,String password, String msg)
	{
		System.out.println(username+"  "+password+"  "+msg);
	}
	
	@DataProvider(name="TestData")
	public String [][] createTestData()
	{
		// 2 -d array rows and column
		
		String [][] data= new String[4][3];
		data[0][0]= "vasant@gmail.com";
		data[0][1]= "vasant@123$";
		data[0][2]= "Succesfully logged in";
		
		data[1][0]= "Vaishali@gmail.com";
		data[1][1]= "Vaishali@123$";
		data[1][2]= "Error msg should be displayed";
		
		data[2][0]= "vasant@gmail2.com";
		data[2][1]= "vasant@123$";
		data[2][2]= "Error msg should be displayed";
		
		data[3][0]= "Vaishali@gmail.com";
		data[3][1]= "Vaishali@123$";
		data[3][2]= "Succesfully logged in";
		return data;
	}
	
	
	@Test(dataProvider = "setTestData")
	public void testObjData(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		System.out.println(obj1+"  "+obj2+"  "+obj3+"  "+obj4+" "+obj5);
	}
	@DataProvider
	public Object[][] setTestData()
	{
		
		Object[][] obj= {
				{"Vasant@gmail.com","Vasant@213$","Logged In Success",true,123456},
				{"Ankita@gmail.com","Ankita@213$","Logged In Failed",false,1212134}
				
				};
		
		return obj;
	}

}
