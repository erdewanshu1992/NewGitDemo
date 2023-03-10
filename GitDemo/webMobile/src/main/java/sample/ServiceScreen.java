package sample;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceScreen {
	WebDriver driver;
	WebElement element;
	@CacheLookup
	@FindBy(xpath = "//a[@class='subcat_anchor']")
	List<WebElement> CircleSubCats;
	@CacheLookup
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[3]/ul/li")
	List<WebElement> SubHeading;
//	@FindBy(xpath = "(//*[starts-with(@id, 'btn-')])[1]")
//	WebElement AddToCart;
	@CacheLookup
	@FindBy(xpath = "//div[@class='product_dtl']")
	List<WebElement> ProductDtl;
	@CacheLookup
	@FindBy(xpath = "//span[@class='addtocart']")
	List<WebElement> ViewDetails;
	@CacheLookup
	@FindBy(xpath = "//*/div[3]/div[1]/div[2]/span[3]")
	WebElement AddToCart3;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='productcount_msg'])[1]")
	WebElement MaxText;
	@CacheLookup
	@FindBy(xpath = "//*/div[2]/div[1]/div[2]/span[3]")
	WebElement AddToCart2;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='addtocart'])[3]")
	WebElement AddToCart;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='price'])[1]")
	WebElement ServicePrice;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='plus'])[1]")
	WebElement PlusButton;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='addtocart'])[1]")
	WebElement CartCount;
	@CacheLookup
	@FindBy(xpath = "(//*/div/div[1]/div/div/div[5]/div[2]/span)[2]")
	WebElement Checkout;
	@CacheLookup
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[2]/span")
	List<WebElement> CostCheckout;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='total_Cost'])[1]/b")
	WebElement Text;
	@CacheLookup
	@FindBy(xpath = "(//span[@class='total_time'])[1]")
	WebElement ServiceTime;
	@CacheLookup
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[1]/span[1]/b")
	WebElement TotalCost;
	@CacheLookup
	@FindBy(xpath = "//*[@id]/div/div[1]/div/div/div[5]/div[1]/span[2]")
	WebElement TotalTime;
	@CacheLookup
	@FindBy(xpath = "//span[@class='item_incart']")
	WebElement TotalItems;
	// @FindBy(xpath="(//*/div/div[1]/div/div/div[5]/div[2]/span)[2]") WebElement
	// Checkout;

	public ServiceScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void CircleSubCats() throws InterruptedException {
		
		String selectedServiceName = "BestSellers";
		List<WebElement> myElements = CircleSubCats;
		System.out.println("Size of List: " + myElements.size()+":"+selectedServiceName);
		WebElement e1 = null;

		for (WebElement e : myElements) {
			String CircleSubCat = e.getText();
			CircleSubCat.replaceAll("\\n", " ");
			System.out.println("Sub-Categories Name :" + CircleSubCat);

			if (CircleSubCat.contains(selectedServiceName)) {
				e1 = e;

			}
		}
		if (e1 != null) {
			Thread.sleep(5000);
			e1.click();
		}

	}

	public void ServiceSubHeading() {

		List<WebElement> myElements = SubHeading;
		System.out.println("Size of List: " + myElements.size());
		for (WebElement e : myElements) {
			String subheading = e.getText();
			subheading.replaceAll("\\n", " ");
			System.out.println("Sub-Heading Name :" + subheading);
//			 SubHeading.get(4).click();
			

		}

	}

	public void AllProductDetails() throws InterruptedException {

		List<WebElement> myElements = ProductDtl;
		System.out.println("Size of List: " + myElements.size());

		for (WebElement e : myElements) {
			String ProductDtl = e.getText();
			ProductDtl.replaceAll("\\n", " ");

			String text = e.getText() == null ? "" : e.getText().replace("VIEW DETAILS", "");
			System.out.println("Service Name :" + text);

		}

	}

	public void AddToCartButtonClicked() throws InterruptedException {
		AddToCart.click();
		// Thread.sleep(5000);
		// System.out.println(MaxText.getCssValue("class"));
		// System.out.println(AddToCart.getCssValue("id"));//1 hr 5mins and ???749/-53%
		// off???1600

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
		// System.out.println(Text.getText().split("^[0-9]", '???'));
		Text.click();

	}

	public void ServiceTimeVerify() {
		System.out.println(ServiceTime.getText());
		ServiceTime.click();
	}

	public void AddToCartButtonClicked2() throws InterruptedException {
		AddToCart2.click();
		Thread.sleep(5000);
		// System.out.println(AddToCart2.getCssValue("id"));
		// System.out.println(MaxText.getCssValue("class"));

	}

	public void AddToCartButtonClicked3() throws InterruptedException {
		AddToCart3.click();
		Thread.sleep(5000);

	}

	public void TotalTimeVerify() {
		System.out.println(TotalTime.getText());
		// System.out.println(Text.getText().split("^[0-9]", '???'));
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
 * } // WebElement element = AddToCart; // JavascriptExecutor jse =
 * (JavascriptExecutor) driver; //
 * jse.executeScript("arguments[0].scrollIntoView()", element); }
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
