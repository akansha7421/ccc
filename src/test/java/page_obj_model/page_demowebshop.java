package page_obj_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_demowebshop {
	WebDriver driver;
	By Lin=By.linkText("Log in");
	By uname=By.name("Email");
	By pass=By.name("Password");
	By lin1=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By lout=By.linkText("Log out");
	public page_demowebshop(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clicklink()
	{
		driver.findElement(Lin).click();
	}
	public void type_uname(String username)
	{
		driver.findElement(uname).sendKeys("ariya7421@gmail.com");
		
	}
	public void type_pass(String password)
	{
		driver.findElement(pass).sendKeys("qwerty");
		
	}
	public void click_login()
	{
		driver.findElement(lin1).click();
		
	}
	public void loggout()
	{
		driver.findElement(lout).click();
	}
	

}
