package com.waitsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wait_Demo {
	
	@Test
	void testwaits() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btnl")).click();
		driver.findElement(By.id("text")).sendKeys("welcome");
		
		}
	
	
	

}


