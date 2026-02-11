package com.IRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	        int initialCount=0;
	        int maxCount=4;
			@Override
			public boolean retry(ITestResult result) {
				if(initialCount<maxCount) {
					initialCount++;
					return true;
					
			}
				return false;
			}
	        
}
