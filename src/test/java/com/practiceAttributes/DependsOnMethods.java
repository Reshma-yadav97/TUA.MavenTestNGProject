package com.practiceAttributes;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(priority= 1)
	void Register() {
		System.out.println("Register page");
	}
	@Test(priority= 2,dependsOnMethods="Register")
	void Login()
	{
		System.out.println("Login page");
	}
	
    @Test
	void Home() {
		System.out.println("Home page");
		
	}
}
