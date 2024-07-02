package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import com.exception.InvalidBrowserNameException;

public class Keyword {
	public static RemoteWebDriver driver;

	public void openBrowser(String browserName)throws InvalidBrowserNameException {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		} else
			throw new InvalidBrowserNameException(browserName);
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public void click(WebElement e) {
		e.click();
	}

}
