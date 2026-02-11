package com.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase_Demo {
	WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeMethod
	void setUp(String baseUrl,String brName) {
		if(brName.equals("chrome"))
		{
			driver=new ChromeDriver();
			}else if (brName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}  else if(brName.equals("ie"));
		{
			driver=new InternetExplorerDriver();
		}
		driver.get(baseUrl);
	}

	@Parameters({"username","password"})
	@Test
	void testRegister(String username,String password) {
		WebElement txtUsername=driver.findElement(By.name("username"));
		txtUsername.sendKeys(username);
		WebElement txtPassword=driver.findElement(By.name("password"));
		txtUsername.sendKeys(username);
		WebElement btnSubmit=driver.findElement(By.id("submit"));
		btnSubmit.click();
		
	}
}
