package pom_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pf_demoweb {
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT, using="Log in") WebElement login;
	@FindBy(how=How.NAME, using="Email") WebElement username;
	@FindBy(how=How.NAME, using="Password") WebElement Pass;
	@FindBy(how=How.LINK_TEXT, using="Log in") WebElement pagelogin;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input") WebElement loggout;


	public pf_demoweb(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginMethod(String uid, String pwd)
	{
		login.click();
		username.sendKeys(uid);
		Pass.sendKeys(pwd);
		pagelogin.click();
		loggout.click();
		driver.close();
	}

}
