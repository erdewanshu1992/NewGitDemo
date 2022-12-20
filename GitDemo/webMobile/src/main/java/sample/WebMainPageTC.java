package sample;

import org.testng.annotations.Test;

public class WebMainPageTC extends AndroidChromeTest {
	@Test
	public void navigate_to_homepage_click_on_SetUrLocation() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.SetUrLocationButton();

	}

	@Test(dependsOnMethods = { "navigate_to_homepage_click_on_SetUrLocation" })
	public void enter_userAddress() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.enterAddressName("Noida sector 51");

	}

	@Test(priority = 2)
	public void MainCatSalonAtHome() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.SalonAtHome();
	}

	@Test(priority = 3)
	public void BestSellersVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.BestSellersVerify();

	}

	@Test(dependsOnMethods = { "BestSellersVerify" })
	public void AddToCartButtonClicked() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.AddToCartButtonClicked();

	}

	@Test(dependsOnMethods = { "AddToCartButtonClicked" })
	public void CheckoutButtonVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.CheckoutButtonVerify();

	}

	@Test(priority = 4)
	public void enterMobileNumber() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.enterMobileNumber("9855566677");

	}

	@Test(priority = 5)
	public void ClickOnSubmitButton() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.ClickOnSubmitButton();
	}

	@Test(priority = 6)
	public void enterOTP() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.enterOTP("2222");
	}

	@Test(priority = 7)
	public void ChangeButtonVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.ChangeButtonVerify();
	}

	@Test(priority = 8)
	public void DoneButtonVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.DoneButtonVerify();
	}

	@Test(priority = 9)
	public void RemoveButtonVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.RemoveButtonVerify();
	}

	@Test(priority = 10)
	public void RemoveButtonNoVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.RemoveButtonNoVerify();
	}

	@Test(priority = 11)
	public void CheckoutOnSchedulePageVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.CheckoutOnSchedulePageVerify();
	}

	@Test(priority = 12)
	public void BuildingName() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.BuildingName("B117");
	}

	@Test(priority = 13)
	public void Address() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.Address("Sector 11");
	}

	@Test(priority = 14)
	public void SaveButtonVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.SaveButtonVerify();
	}

	@Test(priority = 15)
	public void ChangeAddressVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.ChangeAddressVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 16)
	public void BackArrowVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.BackArrowVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 17)
	public void SlotNoteAtButtonVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.SlotNoteAtButtonVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 18)
	public void SavedAddressVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.SavedAddressVerify();
	}

	@Test(priority = 19)
	public void lostOfAllSlotsDate() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.lostOfAllSlotsDate();
		Thread.sleep(5000);
	}

	@Test(priority = 20)
	public void lostOfAllPrimeTimeSlotsMorVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.lostOfAllPrimeTimeSlotsMorVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 21)
	public void lostOfAllNormalSlotsVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.lostOfAllNormalSlotsVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 22)
	public void lostOfAllPrimeTimeSlotsEveVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.lostOfAllPrimeTimeSlotsEveVerify();
		Thread.sleep(5000);
	}

	@Test(priority = 23)
	public void ProceedButtonVerify() {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.ProceedButtonVerify();
	}

	@Test(priority = 24)
	public void PopUpVerify() throws InterruptedException {
		webMainPage webMainPage = new webMainPage(driver);
		webMainPage.PopUpVerify();
		Thread.sleep(5000);
	}

}
