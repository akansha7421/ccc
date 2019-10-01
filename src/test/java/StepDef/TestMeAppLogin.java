package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppLogin {
	WebDriver driver=null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters Lalitha as username")
	public void user_enters_Lalitha_as_username() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
	    
	}

	@When("user enters Password{int} as password")
	public void user_enters_Password_as_password(Integer int1) {
		driver.findElement(By.name("password")).sendKeys("Password123");

	    
	}

	@Then("user will find TestMeApp Homepage")
	public void user_will_find_TestMeApp_Homepage() {
		driver.findElement(By.name("Login")).click();
		System.out.println("The title of the page is "+driver.getTitle());

	    
	}


}
