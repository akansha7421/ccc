package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_again {
	WebDriver driver=null;
	@Given("The login page is open")
	public void the_login_page_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@When("the user enters {string} as username and {string} as password")
	public void the_user_enters_as_username_and_as_password(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");


	   
	}

	@When("The user clicks on Login Button")
	public void the_user_clicks_on_Login_Button() {
		driver.findElement(By.name("Login")).click();

	    
	}

	@Then("The user will find a TestMeApp Home page")
	public void the_user_will_find_a_TestMeApp_Home_page() {
		System.out.println("The title of the page is "+driver.getTitle());

	}

}
