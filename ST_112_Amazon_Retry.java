package com.retryanalyzer.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ST_112_Amazon_Retry implements IRetryAnalyzer {

	
		int initialCount=0;
		int retry=3;
		
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(initialCount<retry) {
			initialCount++;
			return true;
		}
		
		return false;
	}

}
