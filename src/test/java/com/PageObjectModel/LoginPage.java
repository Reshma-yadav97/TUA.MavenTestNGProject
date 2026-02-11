package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
      @FindBy (id="login-username") WebElement txtEmail;
      @FindBy (name="password") WebElement txtPassword;
      @FindBy (name="remember") WebElement checkRemember;
      @FindBy (xpath="//button[@name='submit']") WebElement btnLogin;
      public LoginPage(WebDriver driver) {
    	  PageFactory.initElements(driver, this);
    	   }
      public void email(String emailid) {
    	  txtEmail.sendKeys(emailid);
      }
      public void password(String pass) {
    	  txtPassword.sendKeys(pass);
      }
      public void remeber() {
    	  checkRemember.click();
      }
      public void submit() {
    	  btnLogin.click();
      }
}
