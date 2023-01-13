package webSitePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartScreen {
	WebDriver driver;
	WebElement element;
	@FindBy(xpath = "//a[@class='subcat_anchor']")
	List<WebElement> CircleSubCats;
//	@FindBy(xpath = "(//*[starts-with(@id, 'btn-')])[1]")
//	WebElement AddToCart;
	@FindBy(xpath = "//div[@class='product_dtl']")
	List<WebElement> AllAddToCart;
	// @FindBy(xpath="//span[@class='addtocart']")List<WebElement> AllAddToCart;
//	@FindBy(xpath = "//*[@id=\"prdt_sec\"]/div[1]/div[1]/div[2]/span[3]")
//	WebElement AddToCart;
	@FindBy(xpath = "//span[@class='addtocart']")
	WebElement AddToCart;
	@FindBy(xpath = "(//span[@class='productcount_msg'])[1]")
	WebElement MaxText;
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

		List<WebElement> myElements = CircleSubCats;
		System.out.println("Size of List: " + myElements.size());
		for (WebElement e : myElements) {
			String CircleSubCat = e.getText();
			CircleSubCat.replaceAll("\\n", " ");
			System.out.println("Sub-Categories Name :" + CircleSubCat);
		}

	}

	public void AllAddToCartButtonClicked() {

		List<WebElement> myElements = AllAddToCart;
		System.out.println("Size of List: " + myElements.size());
		for (WebElement e : myElements) {
			String CircleSubCat = e.getText();
			CircleSubCat.replaceAll("\\n", " ");
			System.out.println("Service Name :" + e.getText());
			if (e.getText().equals("Waxology - Rica (Full Arms, Full Legs & Underarms)")) {
				AddToCart.click();
			}

		}

	}

	public void AddToCartButtonClicked() {
		AddToCart.click();
		System.out.println(AddToCart.getCssValue("class"));

	}

	public void PlusButtonVerify() {
		for (int i = 0; i < 5; i++) {
			PlusButton.click();

		}
	}

	public void MaxTestVerift() {
		System.out.println(MaxText.getCssValue("class"));

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

































/*
 * List<WebElement> myElements = AllAddToCart;
 * System.out.println("Size of List: "+myElements.size()); for(WebElement e :
 * myElements) { String CircleSubCat = e.getText();
 * CircleSubCat.replaceAll("\\n", " "); System.out.println("Service Name :"
 * +e.getText()); //System.out.print("Services name :" +e.getText()+"\t");
 * //System.out.print("Text within the Anchor tab :" +e.getText());
 * //System.out.println("Anchor: "+e.getAttribute("href"));
 * //System.out.println("Anchor: "+e.getAttribute("class"));
 * //System.out.println("Anchor: "+e.getAttribute("h4"));
 * if(e.getText().equals("Waxology - Rica (Full Arms, Full Legs & Underarms)"))
 * { AddToCart.click(); }
 * 
 * }
 * 
 * }
 * 
 * // public void AddToCartButtonClicked2() { // WebElement element =
 * AddToCart2; // JavascriptExecutor jse = (JavascriptExecutor)driver; //
 * jse.executeScript("arguments[0].scrollIntoView()", element); //
 * AddToCart2.click(); // System.out.println(AddToCart2.getCssValue("class"));
 * // // }
 * 
 * // List<WebElement> allElements= AllAddToCart; // // for(WebElement ele
 * :allElements) { // System.out.println("Name + Number===>"+ele.getText()); //
 * String s=ele.getText(); // s=s.substring(s.indexOf("(")+1, s.indexOf(")"));
 * // System.out.println("Number==>"+s); // }
 * 
 * //System.out.print("Text within the Anchor tab :" +e.getText()+"\t");
 * //System.out.print("Text within the Anchor tab :" +e.getText());
 * //System.out.println("Anchor: "+e.getAttribute("href")); } //List<WebElement>
 * allCats = CircleSubCats; //System.out.println(allCats.size());
 * 
 * // for (WebElement CircleSubCats : allCats) { // String CircleSubCat =
 * CircleSubCats.getText(); // CircleSubCat.replaceAll("\\n", " "); //
 * System.out.println("Sub-Categories Name :" +CircleSubCat); // // }
 * 
 * 
 * // // if(i==5) { // System.out.println(MaxText.getText()); // }
 * 
 * 
 * 
 */
