package com.ui.test;

import static com.constants.Browser.*;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest {

	HomePage homePage;
	
	@BeforeMethod(description = "Load the HomePage of the website")
	public void setup() {
		homePage = new HomePage(CHROME);
	}
	
	@Test (description = "verifies with the valid user is able to login ", groups = {"e2e", "sanity"},
			retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginTest() {
		assertEquals(homePage.goToLoginPage().doLoginWith("kunaltest@test.com", "password").getUserName(), "Kunal B");
	}
}
