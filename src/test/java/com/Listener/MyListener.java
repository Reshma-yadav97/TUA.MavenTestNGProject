package com.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Execution Stared !!! ="+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed successfully !!! ="+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Got failed !!! ="+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped !!! ="+result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test cases Executed");
	}
	
	
   
}