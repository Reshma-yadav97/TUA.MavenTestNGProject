package com.practice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Window_Demo {
	
	WebDriver driver;
	@BeforeMethod
	void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.flipKart.com/");
		driver.manage().window().maximize();
		}

	@Test
	public void testWindows() {
		driver.findElement(By.linkText("Myntra")).click();
		
		//String flipcartWindowId=driver.getWindowHandle();
		
	Set<String>allWindowIds	=driver.getWindowHandles();
	System.out.println(allWindowIds);
	
	List<String>arrList=new ArrayList<String>(allWindowIds);
	String mytraWindowId=arrList.get(1);
	
	driver.switchTo().window(mytraWindowId);
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shoes for women");
	
	String FlicartWindowId=arrList.get(0);
    driver.switchTo().window(FlicartWindowId);
	System.out.println(driver.getTitle());
	
	
	}
}
