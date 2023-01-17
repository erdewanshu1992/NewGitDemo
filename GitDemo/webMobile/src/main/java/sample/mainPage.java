package sample;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {
	WebDriver driver;

	@CacheLookup
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;
	@CacheLookup
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;
	@CacheLookup
	@FindBy(xpath = "//div[@class='cat_card']")
	List<WebElement> MainCats;
	@CacheLookup
	@FindBy(xpath = "(//div[@class='cat_card'])[1]")
	WebElement SalonAtHome;
//	@FindBy(xpath = "//div[@class='cat_card']")
//	List<WebElement> AllCats;
	@CacheLookup
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[3]/span[2]/a[1]/div/img")
	WebElement BestSeller;
	@CacheLookup
	@FindBy(xpath = "//a[@class='subcat_anchor']")
	List<WebElement> CircleSubCats;

	public mainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SetUrLocationButton() {
		SetUrLocationButton.click();

	}

	public void enterAddressName(String enterUrLocation) throws InterruptedException {
		LocationSearch.sendKeys(enterUrLocation);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		System.out.println(LocationSearch.getAttribute("value"));

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

//	public void lostOfAllCat() {
//		List<WebElement> allCats = AllCats;
//		System.out.println(allCats.size());
//
//		for (WebElement lostOfAllCat : allCats) {
//			String CatLists = lostOfAllCat.getText();
//			System.out.println(CatLists);
//		}

	public void ClickBesSellers() {
		BestSeller.click();
	}

	public void CircleSubCats() {
		List<WebElement> allCats = CircleSubCats;
		System.out.println(allCats.size());

		for (WebElement CircleSubCats : allCats) {
			String CircleSubCat = CircleSubCats.getText();
			CircleSubCat.replaceAll("\\n", " ");
			System.out.println(CircleSubCat);

		}

	}
}
