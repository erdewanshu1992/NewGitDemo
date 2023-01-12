package webSitePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatsScreen {
	WebDriver driver;
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[3]/span[2]/a[1]/div/img")
	WebElement BestSeller;
	@FindBy(xpath = "//a[@class='subcat_anchor']")
	List<WebElement> CircleSubCats;

	public CatsScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickBesSellers() {
		BestSeller.click();
	}

}
