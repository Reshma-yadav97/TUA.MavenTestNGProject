package com.practiceAttributes;

import org.testng.annotations.Test;

public class Description {
	@Test(priority= 1)
	void Register() {
		System.out.println("Register page");
	}
	@Test(priority= 2)
	void Login()
	{
		System.out.println("Login page");
	}
	
    @Test
	void Home() {
		System.out.println("Home page");
		
	}
    @Test(description="Searching Products")
	void Search() {
		System.out.println("Search page");
    
}

}
