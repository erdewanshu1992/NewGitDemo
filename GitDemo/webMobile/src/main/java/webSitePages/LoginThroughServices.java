package webSitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.HidesKeyboard;

public class LoginThroughServices {
	WebElement element;
	WebDriver driver;
	
		@CacheLookup
		@FindBy(xpath = "//input[@class='for_mob']")
		WebElement Placeholder;
		@CacheLookup
		@FindBy(xpath = "//input[@placeholder='10 digit mobile number']")
		WebElement MobNumber;
		@CacheLookup
		@FindBy(xpath = "//button[@class='btm_pas']")
		WebElement SubmitButton;
		@CacheLookup
		@FindBy(xpath = "//input[@name='otp']")
		WebElement OTP;
		

		public LoginThroughServices(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void enterMobileNumber(String MobileNumber) throws InterruptedException {
			Placeholder.sendKeys(MobileNumber);
			((HidesKeyboard) driver).hideKeyboard();
		}

		public void ClickOnSubmitButton() {
			SubmitButton.click();
		}

		public void enterOTP(String otp) {
			OTP.sendKeys(otp);
		}


}
