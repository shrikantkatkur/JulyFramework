package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.pageobjects.LogInPage;
import com.utility.Config;


public class LoginPageTc extends Base {
	Config con=new Config();
	LogInPage lp= new LogInPage();
	@Test
	public void loginFunctionality() {
		lp.enterUserName(con.getUserName());
		lp.enterPassword(con.getPassword());
		lp.clickSubBtn();
		String actMsg=lp.getSucessMsg();
		String expMsg="Logged In Successfully";
		Assert.assertEquals(actMsg, expMsg);
	
	}

}
