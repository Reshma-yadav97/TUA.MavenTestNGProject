package com.DataProviderPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestcase {
	WebDriver driver;
	LOginPage lp;
	
	@BeforeMethod
	void setUp() {
		driver =new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");
		lp =new LOginPage(driver);
		}
	@AfterMethod
	void tearDown() {
		driver.quit();
		
	}
	
	@Test(dataProvider ="Logintd")
	void testLoginPage(String email,String password,String isTrue) {
		lp.email(email);
		lp.password(password);
		lp.remember1();
		lp.submit();
		
		
		if (isTrue.equals("1")) 
		{
			Assert.assertEquals(driver.getTitle(), "Welcome","Title mismatches");
		}else if(isTrue.equals("2")) 
		{
			Assert.assertEquals(lp.errorEmail(),"Please enter a valid email address");
		}else if(isTrue.equals("3")) 
		{
			Assert.assertEquals(lp.passwordError(), "Invalid username or password");
		}else if(isTrue.equals("4"))
{
			Assert.assertEquals(lp.errorEmail(), "Invalid username or password");
		}
		
		
	}
	@DataProvider(name="Logintd")
	public String[][] LoginTestData() {
		String data[] []= new String[4] [3];
		
		// Set 1
		data[0] [0]="reshma3@gmail.com";
		data [0] [1]="reshu@123";
		data[0][2]="1";
		
		//set 2
		data[1] [0]="@gmail.comReshma";
		data[1][1]="reshu@123";
		data[1][2]="2";
		
		//set 3
		data[2] [0]="reshma3@gmail.com";
	    data[2][1]="@@123456";
	    data[2][2]="3";
	    
		// set 4
	    data[3] [0]="@gmail.comReshma";
	    data[3][1]="@@123456";
	    data[3][2]="4";
		return data;
	}

}
