package com.DataProviderPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LOginPage {
	      @FindBy (id="login-username") WebElement txtEmail;
	      @FindBy (name="password") WebElement txtPassword;
	      @FindBy (name="remember") WebElement checkRemember;
	      @FindBy (xpath="//button[@name='submit']") WebElement btnLogin;
	      @FindBy(id="login-username-error") WebElement emailErrorText;
	      @FindBy(xpath="//li[text()='Invalid username or password']") WebElement passwordErrorText;
	      public LOginPage(WebDriver driver) {
			  PageFactory.initElements(driver, this);
		  }

           public void email(String emailid) {
	    	  txtEmail.sendKeys(emailid);
	      }
	      public void password(String pass) {
	    	  txtPassword.sendKeys(pass);
	      }
	      public void remember1() {
	    	  checkRemember.click();
	      }
	      public void submit() {
	    	  btnLogin.click();
	      }
		  public String errorEmail() {
			
			return emailErrorText.getText();
		  }
		  
           public String passwordError() {
			  return passwordErrorText.getText();
		  }

		   public void remember() {
			// TODO Auto-generated method stub
			
		   }


		 
	}


