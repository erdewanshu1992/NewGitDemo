package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import implementation.SeleniumImplementation;
import testutil.TestUtil;

public class PageObjects {
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;
	

	
	SeleniumImplementation selenium;
	TestUtil util;
	
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		util=new TestUtil();
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateLogin(String userid,String password, WebDriver driver,String expectedTitle) {
		
		selenium.setText(SetUrLocationButton, userid);
		selenium.setText(LocationSearch, password);
		//selenium.click(btnSubmit);
		String observedTitle = selenium.getTitile(driver);
		return util.validateText(expectedTitle, observedTitle);
	}

}
