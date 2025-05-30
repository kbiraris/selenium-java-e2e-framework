package com.ui.test;

import static org.testng.Assert.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ com.ui.listeners.MyTestListener.class })
public class LoginTest extends TestBase {

	/*
	 * @Test (description = "verifies with the valid user is able to login ", groups
	 * = {"e2e", "sanity"}, retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	 * public void loginTest() {
	 * assertEquals(homePage.goToLoginPage().doLoginWith("kunaltest@test.com",
	 * "password").getUserName(), "Kunal B"); }
	 * 
	 * @Test (description = "verifies with the valid user is able to login ", groups
	 * = {"e2e", "sanity"}, retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	 * public void loginTestCopy() {
	 * assertEquals(homePage.goToLoginPage().doLoginWith("kunaltest@test.com",
	 * "password").getUserName(), "Kunal B"); }
	 */

	@Test(description = "verifies with the valid user is able to login ", groups = { "e2e",
			"sanity" }, retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginTestCopy1() {
		System.out.println("Start test");
		assertEquals(homePage.goToLoginPage().doLoginWith("kunaltest@test.com", "password").getUserName(), "Kunal B");
		System.out.println("End test");
	}
}
