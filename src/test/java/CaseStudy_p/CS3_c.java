package CaseStudy_p;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS3_c {
	WebDriver driver=null;

	
	@Given("The TestMeApp is open")
	public void the_TestMeApp_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("The user enters Lalitha as username and Password{int} as password")
	public void the_user_enters_Lalitha_as_username_and_Password_as_password(Integer int1) {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
	}

	@Then("The user logins")
	public void the_user_logins() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("the user searches headphones as search item")
	public void the_user_searches_headphones_as_search_item() throws InterruptedException {
		  WebElement search=driver.findElement(By.id("myInput"));
		  Actions act1=new Actions(driver);
		  act1.sendKeys(search,"bag").perform();
		  Thread.sleep(5000);
		  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  Thread.sleep(5000);

	}

	@Then("the user clicks on Find Details")
	public void the_user_clicks_on_Find_Details() throws InterruptedException {
		//driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		  Thread.sleep(5000);

		driver.close();
	}


}
