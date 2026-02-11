package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Demo {
	WebDriver driver;
	
	@BeforeMethod
    void setUp() {
		driver= new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");
		}
	@Test
	void testExecutor() {
	WebElement email=driver.findElement(By.id("login-username"));
	WebElement password = driver.findElement(By.id("login-password"));
	WebElement login = driver.findElement(By.xpath("//button[@name='submit']"));
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0], value='Reshma';",email);
	js.executeScript("arguments[0], value='Reshma@123';",password);
	js.executeScript("arguments[0].click();",login);
	
	js.executeScript("window.scrollBy(0,500)");
	}
}
