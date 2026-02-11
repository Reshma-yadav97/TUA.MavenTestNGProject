package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNg {
	
	 WebDriver driver;

	@BeforeMethod
	void setup() {
		driver= new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");
	}
       
	@AfterMethod
	void end() {
		driver.close();
	}
	
	@Test
	void EmailPass() {
		
		WebElement txtEmailAddress= driver.findElement(By.name("username"));
		txtEmailAddress.clear();
		txtEmailAddress.sendKeys("");
		
		WebElement txtPassword= driver.findElement(By.name("password"));
		txtPassword.clear();
		txtPassword.sendKeys("");
		
		WebElement btnSubmit=driver.findElement(By.name("submit"));
		btnSubmit.click();
		
		
		WebElement errormsg = driver.findElement(By.id("login-username-error"));
		Assert.assertTrue(errormsg.isDisplayed());
		
		String actualText=errormsg.getText();
		String expectedText="Please enter a valid email address.";
		Assert.assertEquals(actualText, expectedText,"Text Mismatched");
		
		WebElement errormsg2=driver.findElement(By.id("login-password-error"));
		Assert.assertTrue(errormsg2.isDisplayed());
		
		String actualTextpass=errormsg2.getText();
		String expectedTextpass="Please enter a password.";
		Assert.assertEquals(actualTextpass,expectedTextpass,"password mismatched");
	
		
		
	}
	
	
}
