package com.practiceDemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCase {
     WebDriver driver;
     LoginPage lp;
     
     @BeforeMethod
     void setUp(){
    	 driver= new ChromeDriver();
    	 driver.get("https://www.qaplayground.com/bank");
    	 lp =new LoginPage(driver);
    	 }
     @Test
     void testValid() {
    	 lp.username("admin");
    	 lp.password("admin123");
    	 lp.remember();
    	 lp.login();
    	 }
     @Test
     void testInvalidUsername() {
    	 lp.username("@reshma");
    	 lp.password("admin123");
    	 lp.remember();
    	 lp.login(); 
     }
     @Test
     void testInvalidPassword() {
    	 lp.username("admin");
    	 lp.password("@reshu");
    	 lp.remember();
    	 lp.login();
          
     }
     
}
