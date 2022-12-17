package GoogleSample;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class mobBrowserTest {
	WebDriver driver;

	@Test
	public void webBrowserlaunch() throws InterruptedException, MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("vivo");
		options.setChromedriverExecutable("/home/yesmadam/Desktop/Drivers/chromedriver");
		options.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://www.yesmadam.com/";
		driver.get(url);
		String actual = driver.getTitle();
		String expected = "Yes Madam - Salon at Home | Beauty Parlour Services at Home";
		Assert.assertEquals(actual, expected);
	}

}
