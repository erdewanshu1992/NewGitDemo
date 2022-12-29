package seleniuminterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SeleniumInterface {

	public void click(WebElement element);
	public void setText(WebElement element,String text);
	public String getTitile(WebDriver driver);
	
	
}
