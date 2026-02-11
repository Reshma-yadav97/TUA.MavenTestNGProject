package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCase {
	 WebDriver driver;
	 LoginPage lp;
	 @BeforeMethod
	 void setup() {
		 driver =new ChromeDriver();
		 driver.get("https://javabykiran.in/other/CC/login");
		 lp= new LoginPage(driver);	 
	 }
	 @Test
	 void testvalid() {
		 lp.email("reshma3@gmail.com");
		 lp.password("reshu@123");
		 lp.remeber();
		 lp.submit();
		  }
	 @Test
	 void testInvalidUsername() {
		 lp.email("@gmail.comReshma");
		 lp.password("reshu@123");
		 lp.remeber();
		 lp.submit();
	 }
    @Test
    void testInvalidPassword() {
    	lp.email("reshma3@gmail.com");
		 lp.password("@@123456");
		 lp.remeber();
		 lp.submit();
    }
    @Test
    void testBothInvalid() {
    lp.email("@gmail.comReshma");
	 lp.password("@@123456");
	 lp.remeber();
	 lp.submit();
}
    
    }

