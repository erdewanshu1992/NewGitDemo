package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import implementation.SeleniumImplementation;
import testutil.TestUtil;

public class LoginPageObjects {
	@FindBy(xpath="//input[@name='userName']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwd;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement btnSubmit;
	
	SeleniumImplementation selenium;
	TestUtil util;
	
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		util=new TestUtil();
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateLogin(String userid,String password, WebDriver driver,String expectedTitle) {
		
		selenium.setText(email, userid);
		selenium.setText(passwd, password);
		selenium.click(btnSubmit);
		String observedTitle = selenium.getTitile(driver);
		return util.validateText(expectedTitle, observedTitle);
	}
	

}
