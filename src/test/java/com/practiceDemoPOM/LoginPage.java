package com.practiceDemoPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username") WebElement txtUsername;
	@FindBy(id="password") WebElement txtPassword;
	@FindBy(id="remember-me")WebElement checkRememberMe;
	@FindBy(xpath="//*[@id=\"login-btn\"]") WebElement btnLogin;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void username(String username) {
		
		txtUsername.sendKeys(username);
		}
	public void password(String password) {
		
		txtPassword.sendKeys(password);
       }
	public void remember() {
		checkRememberMe.click();
       }
	public void login() {
		btnLogin.click();
}
}