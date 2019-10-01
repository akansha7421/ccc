package StepDef_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class para_Login {
	
	WebDriver driver=null;
	
	@Given("Open the application")
	public void open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
	}

	@When("User click SignIn link")
	public void user_click_SignIn_link() {
		driver.findElement(By.linkText("SignIn")).click();

	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		driver.findElement(By.name("Login")).click();
		System.out.println("The title of the page is "+driver.getTitle()+"Login Successful");
	    
	}


}
