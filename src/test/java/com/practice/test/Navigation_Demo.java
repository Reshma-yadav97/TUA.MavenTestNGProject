package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigation_Demo {
	WebDriver driver;
	@BeforeMethod
	void setUp() {
		driver= new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		}
    @Test
    void testNavigate() {
    	WebElement linktext=driver.findElement(By.linkText("Privacy Policy"));
    	linktext.click();
    	Navigation nv=driver.navigate();
    	nv.back();
    	nv.forward();
    	nv.refresh();
    }
}
