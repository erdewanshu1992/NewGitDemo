package webSitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class webMobileLogin {
	WebDriver driver;

	@CacheLookup
	@FindBy(xpath = "//*/div/div[2]/div[1]/div[2]/div/div[1]/span")
	WebElement GetTheAppText;
	@CacheLookup
	@FindBy(xpath = "//span[@class='city_available']")
	WebElement CityText;
	@CacheLookup
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationText;
	@CacheLookup
	@FindBy(xpath = "//*/div/div[2]/div[1]/div[2]/div/div[3]/span[2]")
	WebElement AccountText;
	@CacheLookup
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;

	public webMobileLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void GetAppTextVerification() {
		String expPageText = "Get the app";
		boolean flag = false;
		if (GetTheAppText.getText().equalsIgnoreCase(expPageText)) {
			flag = true;
			System.out.println("Yeah dewanshu... Expected text matched good luck :-) ");
		}
	    	Assert.assertTrue(flag, "Expected text is not matching with expected");
	//2nd assertions 
		boolean status = GetTheAppText.isDisplayed();
	    	if (status) {
			System.out.println(GetTheAppText.getText());
		} else {
			System.out.println("Displayed Text is hidden");
		}
	}

	public void CityTextVerification() {
		String expPageCityText = "Live in 30+ Cities";
		boolean flag = false;
		if (CityText.getText().equalsIgnoreCase(expPageCityText)) {
			flag = true;
			System.out.println("Yeah dewanshu... Expected City text matched good luck :-) ");
		}
	    	Assert.assertTrue(flag, "Expected City text is not matching with expected");
	
		boolean status = CityText.isDisplayed();
		  if (status) {
			System.out.println(CityText.getText());
		} else {
			System.out.println("Displayed Text is hidden");
		}
	}

	public void SetUrLocationText() {
		String expPageButtonText = "SET YOUR LOCATION";
		boolean flag = false;
		if (SetUrLocationText.getText().equalsIgnoreCase(expPageButtonText)) {
			flag = true;
			System.out.println("Yeah dewanshu... Expected Button text matched good luck :-) ");
		}
	    	Assert.assertTrue(flag, "Expected Button text is not matching with expected");
	    	//2nd Assertions
		boolean status = SetUrLocationText.isDisplayed();
		  if (status) {
			System.out.println(SetUrLocationText.getText());
		} else {
			System.out.println("Displayed Text is hidden");
		}
	}

	public void AccountTextVerification() {
		String expPageLoginText = "Have an account? Login";
		boolean flag = false;
		    if (AccountText.getText().equalsIgnoreCase(expPageLoginText)) {
			flag = true;
			System.out.println("Yeah dewanshu... Expected Login text matched good luck :-) ");
		}
	    	Assert.assertTrue(flag, "Expected Login text is not matching with expected");
	    	
		boolean status = AccountText.isDisplayed();
		    if (status) {
			System.out.println(AccountText.getText());
			System.out.println("Hey Dewanshu, All is OK in this Page..");
			// System.out.println(Text.getAttribute("class"));
		} else {
			System.out.println("Displayed Text is hidden");
		}
	}
	
	public void SetUrLocationButton() {
		SetUrLocationButton.click();
	}

}
