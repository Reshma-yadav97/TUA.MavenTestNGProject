package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot_Demo {
	
	 WebDriver driver;
	 @BeforeMethod
	 void setup() {
		 driver =new ChromeDriver();
		 driver.get("https://javabykiran.in/other/CC/login");
}
	 @Test
	 void testCaptureScreenShot() throws IOException {
//		 TakesScreenshot tks = (TakesScreenshot) driver;
//		 File sourceFile=tks.getScreenshotAs(OutputType.FILE);
//		 File targetFile= new File("C:\\Users\\\\AJINKYA\\\\Downloads\\\\selenium-java-4.39.0\\\\TUA.MavenTestNGProject\\\\target\\\\LoginPage.png");
//		 FileHandler.copy(sourceFile, targetFile);
//		 
//		 
	WebElement btn	= driver.findElement(By.name("submit"));
	File sourceFile=btn.getScreenshotAs(OutputType.FILE);
	File targetFile=new File("C:\\Users\\AJINKYA\\Downloads\\selenium-java-4.39.0\\TUA.MavenTestNGProject\\target\\Btn.png");
	FileHandler.copy(sourceFile, targetFile);	 
		 
	 }
}