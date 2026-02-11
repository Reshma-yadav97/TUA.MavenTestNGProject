package com.practiceAttributes;

import org.testng.annotations.Test;

public class Enable {
	
	
	@Test(priority= 1)
	void Register() {
		System.out.println("Register page");
	}
	@Test(priority= 2, enabled =true)
	void Login()
	{
		System.out.println("Login page");
	}
	
    @Test(priority= 3, enabled =false)
	void Home() {
		System.out.println("Home page");
		
	}
    @Test
	void Zebra() {
		System.out.println("Zebra page");
		
	}
	
			

}
