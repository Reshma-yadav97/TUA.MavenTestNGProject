package com.IRetry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeLoginTestCase {
	@Test
	void test1() {
		Assert.assertEquals(1, 3);
	}
	
	@Test(retryAnalyzer = Retry.class)
	void test2() {
		Assert.assertEquals(2, 3);
		
	}
	@Test
	void test3() {
		Assert.assertEquals(3, 3);
	}
	@Test
	void test4() {
		Assert.assertEquals(4, 3);
	}
	@Test
	void test5() {
		Assert.assertEquals(4, 3);
	}
	@Test
	void test6() {
		Assert.assertEquals(5, 3);
	}
	@Test
	void test7() {
		Assert.assertEquals(6, 3);
	}
	@Test
	void test8() {
		Assert.assertEquals(7, 3);
	}
	@Test
	void test9() {
		Assert.assertEquals(1, 31);
	}
	@Test
	void test10() {
		Assert.assertEquals(2, 2);
	}
	
	

}
