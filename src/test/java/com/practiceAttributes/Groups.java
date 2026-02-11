package com.practiceAttributes;

import org.testng.annotations.Test;

public class Groups {
	@Test(priority=1,groups="sanity")
	void Register() {
		System.out.println("Register page");
	}
	@Test(priority=2)
	
	void Login()
	{
		System.out.println("Login page");
	}
	@Test(priority=3,groups="sanity")
	void Home() {
		System.out.println("Home page");
		
}
}
