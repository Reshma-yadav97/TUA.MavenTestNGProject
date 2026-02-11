package com.select_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Select_Demo {
	
	WebDriver driver;
	@BeforeMethod
	void setUp() {
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window();
		}
	@Test(enabled=false)
	void testDropdownList() {
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		Select sc = new Select(skillDropdown);
		//sc.selectByIndex(1);
		//sc.selectByValue("Android");
		sc.deselectByVisibleText("Content Management System (CMS)");
		
		WebElement selectedValue =sc.getFirstSelectedOption();
        System.out.println(selectedValue.getText());
		List<WebElement>allOption=sc.getOptions();
		
		for (WebElement webElement : allOption){
			 System.out.println(webElement.getText());
			 }
		}
	@Test
	void testMultiSelect() {
		WebElement multiDropdown = driver.findElement(By.id("msdd"));
		multiDropdown.click();
	Select sc= new Select(multiDropdown);
		sc.selectByIndex(5);
		List<WebElement> allOptions=driver.findElements(By.xpath("//ul[contains(@class,'ul-widget-content')]/li/a"));
		for (WebElement option : allOptions) {
			String textOptions=option.getText();
			if(textOptions.contains("Hindi")||textOptions.contains("English")||textOptions.contains("German")){
					
				option.click();
				
					}
				
			}
			}
}