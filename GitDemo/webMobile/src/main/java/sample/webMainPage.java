package sample;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.HidesKeyboard;

public class webMainPage {
//extends AndroidChromeTest
	WebDriver driver;

	// Main Page
	@FindBy(xpath = "//button[@class=\"select_location_btn\"]")
	WebElement SetUrLocationButton;
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement LocationSearch;

	// MainCatSalonAtHome"(//*[starts-with(@id, 'btn-')])[1]")
	@FindBy(xpath = "(//div[@class='cat_card'])[1]")
	WebElement SalonAtHome;
	@FindBy(xpath = "(//div[@class='subcat_img'])[1]")
	WebElement BestSellers;
//	@FindBy(xpath = "(//*[starts-with(@id, 'btn-')])[1]")
//	WebElement AddToCart;
	@FindBy(xpath = "//*[@id=\"prdt_sec\"]/div[1]/div[1]/div[2]/span[3]")
	WebElement AddToCart;
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
	@FindBy(xpath = "(//span[@class='total_time'])[34]")
	WebElement TotalTime;
	@FindBy(xpath = "//span[@class='item_incart']")
	WebElement TotalItems;

	// login page
	@FindBy(xpath = "//input[@class='for_mob']")
	WebElement Placeholder;
	@FindBy(xpath = "//input[@placeholder='10 digit mobile number']")
	WebElement MobNumber;
	@FindBy(xpath = "//button[@class='btm_pas']")
	WebElement SubmitButton;
	@FindBy(xpath = "//input[@name='otp']")
	WebElement OTP;

	// CartPage
	@FindBy(xpath = "//span[@class='change_prdt']")
	WebElement ChangProduct;
	@FindBy(xpath = "//button[@class='done_btn']")
	WebElement Done;
	@FindBy(xpath = "//span[@class='remove_prdt']")
	WebElement Remove;
	@FindBy(xpath = "//button[@class='no_btn']")
	WebElement RemoveNo;

	// SchedulePage
	@FindBy(xpath = "//*[@id]/div/div/div/div[5]/div[2]/div[2]/span")
	WebElement CheckoutOnSchedulePage;
	@FindBy(xpath = "//span[@class='change_address']")
	WebElement ChangAddress;
	@FindBy(xpath = "//i[@class='fa fa-angle-left']")
	WebElement Back;
	@FindBy(xpath = "(//div[@class='address_card'])[4]")
	WebElement Noida18;
	@FindBy(xpath = "//span[@class='btn_section']")
	WebElement Proceed;
	@FindBy(xpath = "//button[@class='yes_btn']")
	WebElement POPUP;
	@FindBy(xpath = "//span[@class='slot_note']")
	WebElement SlotNoteAtBottom;
	@FindBy(xpath = "//div[@class='address_sec']")
	WebElement SavedAddress;
	@FindBy(xpath = "/div[@class='date_section'] ")
	List<WebElement> AvailableDate;
	@FindBy(xpath = "(//div[@class='slots_flex'])[1]")
	List<WebElement> TimeSlotsList;
	@FindBy(xpath = "(//div[@class='slots_flex'])[2]")
	List<WebElement> NormalSlots;
	@FindBy(xpath = "(//div[@class='slots_flex'])[3]")
	List<WebElement> PrimeTimeSlotsEve;

	// Location Building name page
	@FindBy(xpath = "//input[@name='building']")
	WebElement BuildingName;
	@FindBy(xpath = "//input[@name='addressName']")
	WebElement AddressName;
	@FindBy(xpath = "//button[@class='save_add_btn']")
	WebElement SaveButton;

	public webMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterAddressName(String enterUrLocation) throws InterruptedException {
		LocationSearch.sendKeys(enterUrLocation);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);

	}

	public void SetUrLocationButton() {
		String getheadertext = SetUrLocationButton.getText().trim();
		SetUrLocationButton.click();
		assertEquals("SET YOUR LOCATION", getheadertext);
	}

	public void SalonAtHome() {
		SalonAtHome.click();
	}

	public void BestSellersVerify() {
		BestSellers.click();

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

//		int i = 0;
//		while (i < 2) {
//			try {
			PlusButton.click();
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		i++;
//
		}
	}

	public void AddToCartButtonClicked() {
		// System.out.println(AddToCart.getAttribute("id").split("-")[1]);
		System.out.println(AddToCart.getCssValue("class"));
		AddToCart.click();
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

	public void CostOnServicePage() throws InterruptedException {
		List<WebElement> element = CostCheckout;
		for (WebElement web : element) {
			String amount = web.getText();
			int length = amount.length();
			String price = amount.substring(1, length);
			System.out.println("Amount : " + price);
			Thread.sleep(1000);
		}
	}

	public void enterMobileNumber(String MobileNumber) throws InterruptedException {
		Placeholder.sendKeys(MobileNumber);
		((HidesKeyboard) driver).hideKeyboard();
	}

	public void ClickOnSubmitButton() {
		SubmitButton.click();
	}

	public void enterOTP(String otp) {
		OTP.sendKeys(otp);
	}

	public void ChangeButtonVerify() {
		ChangProduct.click();
	}

	public void DoneButtonVerify() {
		Done.click();
	}

	public void RemoveButtonVerify() {
		Remove.click();
	}

	public void RemoveButtonNoVerify() {
		RemoveNo.click();
	}

	public void CheckoutOnSchedulePageVerify() {
		CheckoutOnSchedulePage.click();
	}

	public void BuildingName(String ValidAddressName) {
		BuildingName.sendKeys("ValidAddressName");
		((HidesKeyboard) driver).hideKeyboard();
	}

	public void Address(String ValidAddress) {
		AddressName.sendKeys("ValidAddress");
		((HidesKeyboard) driver).hideKeyboard();
	}

	public void SaveButtonVerify() {
		SaveButton.click();

	}

	public void ChangeAddressVerify() {
		ChangAddress.click();

	}

	public void BackArrowVerify() {
		Back.click();

	}

	public void PopUpVerify() {
		POPUP.click();
	}

	public void ChangeAddressToNoida18Verify() {
		Noida18.click();

	}

	public void ProceedButtonVerify() {
		Proceed.click();

	}

	public void SlotNoteAtButtonVerify() {
		System.out.println(SlotNoteAtBottom.getText());

	}

	public void SavedAddressVerify() {
		System.out.println(SavedAddress.getText());

	}

	public void lostOfAllSlotsDate() {
		List<WebElement> allDates = AvailableDate;
		System.out.println(allDates.size());

		for (WebElement lostOfAllSlotsDate : allDates) {
			String date = lostOfAllSlotsDate.getText();
			System.out.println(date);
		}

	}

	public void lostOfAllPrimeTimeSlotsMorVerify() {
		List<WebElement> allSlotsTime = TimeSlotsList;
		System.out.println(allSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}

	}

	public void lostOfAllNormalSlotsVerify() {
		List<WebElement> allNormalSlotsTime = NormalSlots;
		System.out.println(allNormalSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allNormalSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}

	}

	public void lostOfAllPrimeTimeSlotsEveVerify() {
		List<WebElement> allPrimeEveSlotsTime = PrimeTimeSlotsEve;
		System.out.println(allPrimeEveSlotsTime.size());

		for (WebElement lostOfAllSlotsDate : allPrimeEveSlotsTime) {
			String time = lostOfAllSlotsDate.getText();
			System.out.println(time);
		}
	}

}

//	public void TotalItemsVerify() {
//		System.out.println(TotalItems.getText());
//		TotalItems.click();		
//	}
//}

//ignore below

//public void PrimeTimeSlotsEveVerify() {
//	System.out.println(driver.findElement(PrimeTimeSlotsEve).getText());
//
//}

//public void NormalSlotsVerify() {
//	System.out.println(driver.findElement(NormalSlots).getText());
//
//}

//int count = 1;
//while (count <=5) {
//	PlusButton.click();
//    System.out.println("Count is: " + count);
//    count++;
//}
//}

//The following are two exception handlers for the writeList method:
//try {
//
//} catch (IndexOutOfBoundsException e) {
//System.err.println("IndexOutOfBoundsException: " + e.getMessage());
//} catch (IOException e) {
//System.err.println("Caught IOException: " + e.getMessage());
//}
//catch (IOException|SQLException ex) {
//logger.log(ex);
//throw ex;
//}

//public void AddToCartButtonClicked() {
//	System.out.println(AddToCart.getAttribute("id").split("-")[1]);
//	for(int i = 0; i < 2; i++) {
//		AddToCart.click();
//	}
