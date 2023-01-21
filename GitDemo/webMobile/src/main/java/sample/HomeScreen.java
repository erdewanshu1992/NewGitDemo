package sample;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//div[@class='cat_card']")
	List<WebElement> MainCats;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void listOfAllMainCats() throws InterruptedException {
		String selectedMainCatName = "Salon At Home";
		List<WebElement> myElements = MainCats;
		System.out.println("Size of List: " + myElements.size() + ":" + selectedMainCatName);
		WebElement e1 = null;
		for (WebElement e : myElements) {
			String mainCatLists = e.getText();
			mainCatLists = mainCatLists.replaceAll("\\n", " ");
			System.out.println("Main Categorie Name :" + mainCatLists);

			if (mainCatLists.contains(selectedMainCatName)) {
				e1 = e;

			}

		}

		if (e1 != null) {
			Thread.sleep(5000);
			e1.click();
		}

	}

}
