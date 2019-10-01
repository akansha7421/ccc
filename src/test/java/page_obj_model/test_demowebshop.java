package page_obj_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_demowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		page_demowebshop Pobj=new page_demowebshop(driver);
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Pobj.clicklink();
		String username=null;
		Pobj.type_uname(username);
		String password=null;

		Pobj.type_pass(password);
		
		Pobj.click_login();
		System.out.println("The title of the page is "+driver.getTitle());
		
		Pobj.loggout();
		driver.close();
		
		

	}

}
