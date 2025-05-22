package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.PropertiesUtil;

public class MyRetryAnalyzer implements IRetryAnalyzer{

	//private static final int MAX_NUMBER_OF_ATTEMPT = 3;
	private static final int MAX_NUMBER_OF_ATTEMPT = Integer.parseInt(PropertiesUtil.readProperty(Env.QA, "MAX_NUMBER_OF_ATTEMPT"));
	private static int currentAttempt = 1;
	@Override
	public boolean retry(ITestResult result) {
		
		if(currentAttempt <= MAX_NUMBER_OF_ATTEMPT) {
			currentAttempt++;
			return true;
		}

		return false;
	}

}
