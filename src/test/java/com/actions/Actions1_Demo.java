package com.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actions1_Demo {

    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.manage().window().maximize();
    }

    @Test
    void testMouse() {

        Actions ac = new Actions(driver);

        WebElement sourceElement = driver.findElement(By.id("node"));
        WebElement targetElement = driver.findElement(By.id("droparea"));

        ac.dragAndDrop(sourceElement, targetElement).perform();
        
      WebElement sourceElement1 =driver.findElement(By.id("mango"));
    	 WebElement targetElement1 =driver.findElement(By.id("droparea"));
    	 ac.dragAndDrop(sourceElement1, targetElement1).perform();
    	 
    	//WebElement sourceElemen2 =driver.findElement(By.id("angular"));
     	// WebElement targetElement2 =driver.findElement(By.id("droparea"));
     	 //ac.dragAndDrop(sourceElemen2, targetElement2).perform();
    }
}
