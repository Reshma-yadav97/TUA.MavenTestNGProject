package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigation_validationPractice {
	WebDriver driver;
	
	@BeforeMethod
	
	void setUp() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		}
	@Test
	void NavigateTitleValidation() {
		WebElement linkText = driver.findElement(By.linkText("Privacy Policy"));
        linkText.click();
        
       
        String privacyTitle = driver.getTitle();
       Assert.assertEquals(privacyTitle, "Privacy Policy", "Privacy policy title is incorrect");
      
      driver.navigate().back();
      Assert.assertTrue(driver.getTitle().contains("Login"),"Login page is incorrect");
      
      driver.navigate().forward();
      Assert.assertEquals(driver.getTitle(), "Privacy Policy",
    	        "Forward navigation title mismatch");

	}
	@AfterMethod
	void tearDown() {
	    driver.quit();
	}


}
