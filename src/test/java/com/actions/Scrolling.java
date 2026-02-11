package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scrolling {
	WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.get(" https://www.google.com");
        driver.manage().window().maximize();
    }

    @Test
    void testMouse() {

        Actions ac = new Actions(driver);
        //scrolling
        ac.scrollByAmount(0, 500);
        ac.scrollToElement(driver.findElement(By.xpath("//a[@class='link facebook']"))).perform();
        ac.moveToElement(driver.findElement(By.xpath("//a[@class='link facebook']"))).perform();
        ac.doubleClick(driver.findElement(By.xpath("//h1[text()='Automation Demo Site']"))).perform();
        //enter keyboard keys
        WebElement txtSearch=driver.findElement(By.name("q"));
        txtSearch.sendKeys("selenium.dev",Keys.ENTER);
        ac.sendKeys(txtSearch, Keys.ENTER);
        
        
}
}
