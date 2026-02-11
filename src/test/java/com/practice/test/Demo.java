package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	 WebDriver driver;
	@BeforeMethod
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");
	}
	@AfterMethod
	void end() {
		driver.close();
	}
	@Test
	void EmailPass() {
	WebElement txtemailAddress	=driver.findElement(By.name("username"));
	txtemailAddress.sendKeys("");
	}
}
