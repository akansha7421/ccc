package CaseStudy_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS1_c {
	WebDriver driver=null;

	@Given("the Signup page is opened")
	public void the_Signup_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignUp")).click();
	 }

	@When("user enters all the details")
	public void user_enters_all_the_details() {
		 driver.findElement(By.name("userName")).sendKeys("Anki11");
		 driver.findElement(By.name("firstName")).sendKeys("Ankita");
		 driver.findElement(By.name("lastName")).sendKeys("K");
		 driver.findElement(By.name("password")).sendKeys("qwerty");
		 driver.findElement(By.name("confirmPassword")).sendKeys("qwerty");
		 WebElement r1=driver.findElement(By.xpath("//input[@value='Female']"));
		  r1.click();
		 driver.findElement(By.name("emailAddress")).sendKeys("abc123@gmail.com");
		 driver.findElement(By.name("mobileNumber")).sendKeys("9876543210");
		 driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("09/18/2019");
		 driver.findElement(By.name("address")).sendKeys("Bangalore");
		 Select pob=new Select(driver.findElement(By.name("securityQuestion")));
		 pob.selectByIndex(2);//("What is your Pet Name?");
		 driver.findElement(By.name("answer")).sendKeys("nope");

		



	}

	@Then("user clicks Register button")
	public void user_clicks_Register_button() {
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
		 driver.findElement(By.name("userName")).sendKeys("Anki11");
		  driver.findElement(By.name("password")).sendKeys("qwerty");
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
		 

	}

	@Then("TestMeApp homepage opens")
	public void testmeapp_homepage_opens() {
		System.out.println("The title of the page is "+driver.getTitle());
		driver.close();

	}


}
