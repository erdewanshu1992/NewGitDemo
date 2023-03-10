package sample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locationSet {
	WebDriver driver;

	@CacheLookup
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;

	public locationSet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterAddressName(String enterUrLocation) throws InterruptedException {
		WebElement searchBox = LocationSearch;

		if (searchBox.isEnabled()) {
			System.out.println("Search box is enabled. Return: " + searchBox.isEnabled());
		} else {
			System.out.println("Search box is disabled. Return: " + searchBox.isEnabled());
		}
		// Enter text in the “Text Search” box.
		LocationSearch.sendKeys(enterUrLocation);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(LocationSearch.getAttribute("value"));

	}

}
