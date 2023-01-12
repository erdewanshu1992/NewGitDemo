package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import implementation.SeleniumImplementation;
import testutil.TestUtil;

public class PageObjects {
	//@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;
	//@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;
	

	
	SeleniumImplementation selenium;
	TestUtil util;
	
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		util=new TestUtil();
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateLoginPage(String enterUrLocation,String enterAddressName, WebDriver driver,String expectedTitle) throws InterruptedException {
			SetUrLocationButton.click();
			//LocationSearch.sendKeys(enterUrLocation);
//			Actions act = new Actions(driver);
//			act.sendKeys(Keys.DOWN).perform();
//			act.sendKeys(Keys.ENTER).perform();
//			Thread.sleep(5000);
//			System.out.println(LocationSearch.getAttribute("value"));
		//selenium.setText(SetUrLocationButton, userid);
		//selenium.setText(LocationSearch, password);
		//selenium.click(btnSubmit);
		String observedTitle = selenium.getTitile(driver);
		return util.validateText(expectedTitle, observedTitle);
	}

	public void enterAddressName(String enterUrLocation, String enterAddressName, WebDriver driver) {
		LocationSearch.sendKeys(enterUrLocation);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(LocationSearch.getAttribute("value"));
		
	}

	public void SetUrLocationButton() {
		// TODO Auto-generated method stub
		
	}


}
