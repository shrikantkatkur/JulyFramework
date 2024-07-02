package com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.exception.InvalidBrowserNameException;
import com.utility.Config;

public class Base {
	Keyword keyword = new Keyword();
	Config con = new Config();

	@BeforeMethod
	public void setUp() throws InvalidBrowserNameException {
		keyword.openBrowser(con.getbrowserName());
		keyword.launchUrl(con.getUrl());
	}

	@AfterMethod
	public void tearDown() {
		keyword.closeBrowser();
		keyword.quitBrowser();
	}

}
