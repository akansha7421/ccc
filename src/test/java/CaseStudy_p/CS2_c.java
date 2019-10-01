package CaseStudy_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS2_c {
	WebDriver driver=null;

	@Given("The application page is open")
	public void the_application_page_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
	}

	@When("User clicks SignIn link")
	public void user_clicks_SignIn_link() {
		driver.findElement(By.linkText("SignIn")).click();

	}

	@When("The user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("Message displays Login Successful")
	public void message_displays_Login_Successful() throws InterruptedException {
		driver.findElement(By.name("Login")).click();
		System.out.println("The title of the page is "+driver.getTitle()+"Login Successful");
		Thread.sleep(2000);
		driver.close();
	}

}
