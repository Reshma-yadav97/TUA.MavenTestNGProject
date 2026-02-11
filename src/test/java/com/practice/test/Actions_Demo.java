package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actions_Demo {

    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
    }

    @Test
    void testMouse() {

        Actions ac = new Actions(driver);

        WebElement txtFirstName =driver.findElement(By.xpath("//input[@placeholder='First Name']"));

        // normal sendKeys
        txtFirstName.sendKeys("Reshma");

        // OR using Actions class
        ac.click(txtFirstName).sendKeys("Reshma");
          
         
         
    }
}
