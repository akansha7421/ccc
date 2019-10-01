package pom_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import page_obj_model.page_demowebshop;

@Test
public class test_pf_demoweb {
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	pf_demoweb locateElements=PageFactory.initElements(driver,pf_demoweb.class);
	locateElements.loginMethod("ariya7421@gmail.com","qwerty");
	
	}
 
}
