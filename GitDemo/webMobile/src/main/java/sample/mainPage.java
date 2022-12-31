package sample;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {
	WebDriver driver;

	// Main Page Elements
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;
	// Home Page Element
	@FindBy(xpath = "//div[@class='cat_card']")
	List<WebElement> MainCats;
	@FindBy(xpath = "(//div[@class='cat_card'])[1]")
	WebElement SalonAtHome;
//	@FindBy(xpath = "//div[@class='cat_card']")
//	List<WebElement> AllCats;
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[3]/span[2]/a[1]/div/img")
	WebElement BestSeller;
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

	public void scrollDown(WebDriver driver) {
		try {
			int i = 0;
			for (; i <= 100; i++) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
			for (; i > 0; i--) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
		} catch (WebDriverException wde) {
		} catch (Exception e) {
		}
	}

	/**
	 * scrollUp() method scrolls up the page.
	 *
	 * @return void
	 */
	public void scrollUp(WebDriver driver) {
		try {
			int i = 0;
			for (; i > -100; i--) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
			for (; i < 0; i++) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
		} catch (WebDriverException wde) {
		} catch (Exception e) {
		}
	}

	public void lostOfAllMainCats() {
		List<WebElement> allCats = MainCats;
		System.out.println(allCats.size());

		for (WebElement lostOfAllMainCats : allCats) {
			String CatLists = lostOfAllMainCats.getText();
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
			System.out.println(CircleSubCat);
	}
//	public void ClickBesSellers() {
//		BestSeller.click();
//
//	}

	}
}
