package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatsScreen {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//span[@class='subcat_name']")
	WebElement SubCatName;

	public CatsScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SubCatClickVerify () {
		SubCatName.click();
	}

}
