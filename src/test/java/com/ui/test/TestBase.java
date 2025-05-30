package com.ui.test;

import static com.constants.Browser.CHROME;

import org.testng.annotations.BeforeMethod;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;

public class TestBase {

	protected HomePage homePage;
	
	@BeforeMethod(description = "Load the HomePage of the website")
	public void setup() {
		homePage = new HomePage(CHROME, true);
	}
	
	public BrowserUtility getInstance() {
		return homePage;
	}
}
