package webSitePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='cat_card']")
	List<WebElement> MainCats;
	@FindBy(xpath = "(//div[@class='cat_card'])[1]")
	WebElement SalonAtHome;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void lostOfAllMainCats() {
		List<WebElement> allCats = MainCats;
		System.out.println(allCats.size());

		for (WebElement lostOfAllMainCats : allCats) {
			String CatLists = lostOfAllMainCats.getText();
			CatLists = CatLists.replaceAll("\\n", " ");
			System.out.println(CatLists);
		}

	}

	public void SalonAtHome() {
		SalonAtHome.click();

	}

}
