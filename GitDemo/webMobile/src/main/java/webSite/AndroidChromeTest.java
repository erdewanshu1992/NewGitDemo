package webSite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidChromeTest {
	protected WebDriver driver;
	@BeforeTest
	public void webBrowserlaunch() throws InterruptedException, MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("vivo");
		options.setDeviceName("samsung");
		//options.setDeviceName("x8rwh6skrolrjvdy");//Redmi Note 10T 5G
		//options.setDeviceName("Redmi Note 10T 5G");//Redmi Note 10T 5G
		options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");//yesmadam setup
		//options.setChromedriverExecutable("C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");//Asus setup
		options.setCapability("browserName", "Chrome");
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);//Asus setup
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);//yesmadam setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("http://api-stage-aws.yesmadam.co.in/");
		driver.get("https://www.yesmadam.com/");
		//String url = "https://www.yesmadam.com/";
		//driver.get(url);
		String actual = driver.getTitle();
		String expected = "Yes Madam - Salon at Home | Beauty Parlour Services at Home";
		Assert.assertEquals(actual, expected);
	}

}
