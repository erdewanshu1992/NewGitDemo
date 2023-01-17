package webSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LocationScreen {
	@Test
	public void setUp() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.yesmadam.com/");
	By locatorSetLoc = By.xpath("//button[@class=\"select_location_btn\"]");
	By locatorAddress = By.xpath("(//input[@type='text'])[1]");

	if (driver.findElements(locatorSetLoc).size() > 0) {
		if (driver.findElement(locatorSetLoc).isDisplayed()) {
			driver.findElement(locatorSetLoc).click();			
		}
	}
	if (driver.findElements(locatorAddress).size() > 0) {
		if (driver.findElement(locatorAddress).isDisplayed()) {
			driver.findElement(locatorAddress).sendKeys("Noida sector 51");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(5000);
		}
	}

}

}
