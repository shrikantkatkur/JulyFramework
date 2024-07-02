package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.base.Keyword;



public class LogInPage extends Base {
	
	public LogInPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement userName;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	@FindBy(xpath = "//button[@id=\"submit\"]")
	WebElement submit;
	@FindBy(xpath = "//h1[text()='Logged In Successfully']")
	WebElement msg;
	
	public void enterUserName(String text) {
		userName.sendKeys(text);
	}
	public void enterPassword(String text) {
		password.sendKeys(text);
	}
	public void clickSubBtn() {
		submit.click();
	}
	
	public String getSucessMsg() {
		return msg.getText();
	}
}
