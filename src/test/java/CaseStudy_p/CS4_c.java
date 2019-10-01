package CaseStudy_p;

//import java.util.NoSuchElementException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS4_c {
	WebDriver driver=null;
	@Given("ALex has opened TestMeApp")
	public void alex_has_opened_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
		 
	}

	@When("Alex search for particular project")
	public void alex_search_for_particular_project() throws InterruptedException {
		WebElement search=driver.findElement(By.id("myInput"));
		  Actions act1=new Actions(driver);
		  act1.sendKeys(search,"bag").perform();
		  Thread.sleep(5000);
		  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  Thread.sleep(5000);

		
	   
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		
				
	   try
	   {
		   driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	   }
	   catch(NoSuchElementException e)
	   {
		   System.out.println("No cart icon displayed");
	   }
	}

	@Then("Testme doesnt display the cart icon")
	public void testme_doesnt_display_the_cart_icon() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div/div[2]/center/a")).click();
		   driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
			  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
			  Thread.sleep(2000);

			  WebElement r2=driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div"));
			  r2.click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(" //*[@id=\"btn\"]")).click();	
			  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123457");
			  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@457");
			  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@457");
			  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
			  
		
		driver.close();
	
	}


}
