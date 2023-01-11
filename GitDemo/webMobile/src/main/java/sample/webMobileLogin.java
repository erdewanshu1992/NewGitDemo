package sample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webMobileLogin {
	WebDriver driver;

	// Main Page Elements
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;
	
	public webMobileLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SetUrLocationButton() {
		SetUrLocationButton.click();

	}

	public void enterAddressName(String enterUrLocation) throws InterruptedException {
		LocationSearch.sendKeys(enterUrLocation);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(LocationSearch.getAttribute("value"));

	}

}
