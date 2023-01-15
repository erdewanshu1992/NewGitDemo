package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedIfExample {
	@Test
	public void testNestedIfExample() {
	System.out.println("Launching Chrome browser..");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://facebook.com");
	By locator = By.id("email");
	By locator2 = By.id("pass");

	if (driver.findElements(locator).size() > 0) {
		if (driver.findElement(locator).isDisplayed()) {
			driver.findElement(locator).sendKeys("Hello Dewanshu");
			
		}
	}
	if (driver.findElements(locator2).size() > 0) {
		if (driver.findElement(locator2).isDisplayed()) {
			driver.findElement(locator2).sendKeys("Hello Dewanshu pass");
		}
	}

}
}
