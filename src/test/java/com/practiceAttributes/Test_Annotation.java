package com.practiceAttributes;

import org.testng.annotations.Test;

public class Test_Annotation {
	@Test
	void Register() {
		System.out.println("Register page");
	}
	void Login()
	{
		System.out.println("Login page");
	}
	@Test
	void Home() {
		System.out.println("Home page");
		
}
}
