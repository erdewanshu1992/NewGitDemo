package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.PageObjects;

public class PageTestScript {
	WebDriver driver;
	PageObjects page;

		@BeforeTest
		public void webBrowserlaunch() throws InterruptedException, MalformedURLException {

			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("vivo");
			options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");//yesmadam setup
			//options.setChromedriverExecutable("C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");//Asus setup
			options.setCapability("browserName", "Chrome");
			//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);//Asus setup
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);//yesmadam setup
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("http://api-stage-aws.yesmadam.co.in/");
			// driver.get("https://www.yesmadam.com/");
			//String url = "https://www.yesmadam.com/";
			//driver.get(url);
			String actual = driver.getTitle();
			String expected = "Yes Madam - Salon at Home | Beauty Parlour Services at Home";
			Assert.assertEquals(actual, expected);
			page = new PageObjects(driver);

		}
		
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
//		driver = new ChromeDriver();
//		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//		driver.get("https://demo.guru99.com/test/newtours/");
//		driver.manage().window().maximize();
//		page = new PageObjects(driver);
//	}
	
	@Test
	public void verifyLogin() {
		Assert.assertTrue(page.validateLogin("test5451@gmail.com", "test5451", driver, "My account - My Store"));
	}

}
