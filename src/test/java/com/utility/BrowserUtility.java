package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.constants.Browser;

public abstract class BrowserUtility {
	
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public BrowserUtility(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.err.println("Invalid browser name");
		}	
	}
	
	public BrowserUtility(Browser browserName) {
		if(browserName == Browser.CHROME) {
			driver = new ChromeDriver();
		}
		else if (browserName == Browser.EDGE) {
			driver = new EdgeDriver();
		}
		else {
			System.err.println("Invalid browser name");
		}	
	}

	public void goToWebsite(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void clickOn(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}
	
	public void enterText(By locator, String  textToEnter) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(textToEnter);
	}
	
	public String getVisibleText(By locator) {
		WebElement element = driver.findElement(locator);
		return element.getText();
		
	}
}
