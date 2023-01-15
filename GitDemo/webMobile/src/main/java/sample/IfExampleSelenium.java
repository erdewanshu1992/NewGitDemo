package sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IfExampleSelenium {
	@Test
	public void testPageTitle() {
		System.out.println("Launching Chrome browser..");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");

		// verifying the page title
		String expPageTitle = "Google";
		boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(expPageTitle)) {
			flag = true;
			// This method will return True when the page title matches with specified string
			System.out.println("Yeah... Page title matched");
		}
		Assert.assertTrue(flag, "Page title is not matching with expected");
	}

}
