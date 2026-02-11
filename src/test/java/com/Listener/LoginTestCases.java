package com.Listener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTestCases {
     
	@Test
	void testcase1() {
		Assert.assertEquals(2, 4);
	}
	
	@Test
	void testcase2() {
		Assert.assertEquals(2, 4);
	}
	
	@Test
	void testcase3() {
		Assert.assertEquals(42, 4);
	}
	
	@Test
	void testcase4() {
		throw new SkipException("");
	}
}