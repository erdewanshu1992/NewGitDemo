package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniuminterface.SeleniumInterface;

public class SeleniumImplementation implements SeleniumInterface{

	@Override
	public void click(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}

	@Override
	public void setText(WebElement element, String text) {
		// TODO Auto-generated method stub
		element.sendKeys(text);
	}

	@Override
	public String getTitile(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

}
