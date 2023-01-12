package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPageObjects;

public class LoginPageTestScript {

	WebDriver driver;
	LoginPageObjects page;
	
	@BeforeTest
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		page = new LoginPageObjects(driver);
	}
	
	@Test
	public void verifyLogin() {
		Assert.assertTrue(page.validateLogin("test5451@gmail.com", "test5451", driver, "My account - My Store"));
	}
}
 