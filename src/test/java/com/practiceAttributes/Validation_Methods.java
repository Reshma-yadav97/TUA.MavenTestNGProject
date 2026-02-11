package com.practiceAttributes;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation_Methods {
	
	@Test
	public void testLinkEnable() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/)");
	WebElement linkprivacyPolicy  =	driver.findElement(By.linkText("Privacy Policy"));
	boolean isenabled=linkprivacyPolicy.isEnabled() ;
		Assert.assertTrue(isenabled);
		}
	@Test
	public void testcheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	WebElement femaleRedioButton= driver.findElement(By.xpath("//input[@value='FeMale']"));
	
	femaleRedioButton.click();
	boolean isSelect=femaleRedioButton.isSelected();
	System.out.println(isSelect);
	}
	@Test(enabled=true)
	public void testcheck1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
  String pageSource=driver.getPageSource();
  System.out.println(pageSource);
  Assert.assertTrue(pageSource.contains("Register"));
}
}
//https://javabykiran.in/other/CC/login