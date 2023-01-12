package webSitePages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartScreen {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='subcat_anchor']")
	List<WebElement> CircleSubCats;
//	@FindBy(xpath = "(//*[starts-with(@id, 'btn-')])[1]")
//	WebElement AddToCart;
	@FindBy(xpath = "//*[@id=\"prdt_sec\"]/div[1]/div[1]/div[2]/span[3]")
	WebElement AddToCart;
	@FindBy(xpath = "//*[@id=\"prdt_sec\"]/div[2]/div[1]/div[2]/span[3]")
	WebElement AddToCart2;
	@FindBy(xpath = "(//span[@class='price'])[1]")
	WebElement ServicePrice;
	@FindBy(xpath = "(//span[@class='plus'])[1]")
	WebElement PlusButton;
	@FindBy(xpath = "(//span[@class='addtocart'])[1]")
	WebElement CartCount;
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")
	WebElement Checkout;
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")
	List<WebElement> CostCheckout;
	@FindBy(xpath = "(//span[@class='total_Cost'])[1]/b")
	WebElement Text;
	@FindBy(xpath = "(//span[@class='total_time'])[1]")
	WebElement ServiceTime;
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[1]/span[1]/b")
	WebElement TotalCost;
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[1]/span[2]")
	WebElement TotalTime;
	@FindBy(xpath = "//span[@class='item_incart']")
	WebElement TotalItems;

	public CartScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

	public void TotalCostVerify() {
		System.out.println(Text.getText());
		// System.out.println(Text.getText().split("^[0-9]", '₹'));
		Text.click();

	}

	public void ServiceTimeVerify() {
		System.out.println(ServiceTime.getText());
		// System.out.println(Text.getText().split("^[0-9]", '₹'));
		ServiceTime.click();
	}

	public void TotalTimeVerify() {
		System.out.println(TotalTime.getText());
		// System.out.println(Text.getText().split("^[0-9]", '₹'));
		TotalTime.click();
	}

	public void TotalItemsVerify() {
		System.out.println(TotalItems.getText());
		TotalItems.click();
	}

	public void PlusButtonVerify() {
		for (int i = 0; i < 2; i++) {

			PlusButton.click();

		}
	}

	public void AddToCartButtonClicked() {
		WebElement elementToClick = AddToCart;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", elementToClick);
		// System.out.println(AddToCart.getAttribute("id").split("-")[1]);
		AddToCart.click();
		System.out.println(AddToCart.getCssValue("class"));

	}

	public void AddToCartButtonClicked2() {
		WebElement elementToClick = AddToCart2;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", elementToClick);
		AddToCart2.click();
		System.out.println(AddToCart2.getCssValue("class"));

	}

	public void ServicePriceVerify() {
		System.out.println(ServicePrice.getText());
		ServicePrice.click();
	}

	public void PriceText() {
		Text.getText();
	}

	public void CheckoutButtonVerify() {
		Checkout.click();
	}

}
