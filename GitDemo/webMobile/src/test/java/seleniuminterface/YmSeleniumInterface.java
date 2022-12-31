package seleniuminterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface YmSeleniumInterface {

	public void enterAddressName(WebElement element);

	public void SetUrLocationButton(WebElement element, String text);

	public String SalonAtHome(WebDriver driver);

	public void BestSellersVerify(WebElement element);

	public void TotalCostVerify(WebElement element, String text);

	public String PlusButtonVerify(WebDriver driver);

	public void AddToCartButtonClicked(WebElement element);

	public void PriceText(WebElement element, String text);

	public String CheckoutButtonVerify(WebDriver driver);

	public void CostOnServicePage(WebElement element);

	public void enterMobileNumber(WebElement element, String text);

	public String ClickOnSubmitButton(WebDriver driver);

	public void enterOTP(WebElement element);

	public void ChangeButtonVerify(WebElement element, String text);

	public String DoneButtonVerify(WebDriver driver);

	public void RemoveButtonVerify(WebElement element);

	public void RemoveButtonNoVerify(WebElement element, String text);

	public String CheckoutOnSchedulePageVerify(WebDriver driver);

	public void BuildingName(WebElement element);

	public void Address(WebElement element, String text);

	public String SaveButtonVerify(WebDriver driver);

	public void ChangeAddressVerify(WebElement element);

	public void BackArrowVerify(WebElement element, String text);

	public String PopUpVerify(WebDriver driver);

	public void ChangeAddressToNoida18Verify(WebElement element);

	public void ProceedButtonVerify(WebElement element, String text);

	public String SlotNoteAtButtonVerify(WebDriver driver);

	public void SavedAddressVerify(WebElement element);

	public void lostOfAllSlotsDate(WebElement element, String text);

	public String lostOfAllPrimeTimeSlotsMorVerify(WebDriver driver);

	public void lostOfAllNormalSlotsVerify(WebElement element);

	public void lostOfAllPrimeTimeSlotsEveVerify(WebElement element, String text);

}
