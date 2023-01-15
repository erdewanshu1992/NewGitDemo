package TestCases;

import org.testng.annotations.Test;
import sample.Scrolling;
import webSitePages.AndroidChromeTest;
import webSitePages.CartScreen;
import webSitePages.CatsScreen;
import webSitePages.HomeScreen;
import webSitePages.locationSet;
import webSitePages.webMobileLogin;

public class TestCases extends AndroidChromeTest {

	@Test(priority = 1)
	public void MainScreenTextVerification() {
		webMobileLogin ref = new webMobileLogin(driver);
		ref.GetAppTextVerification();
		ref.CityTextVerification();
		ref.SetUrLocationText();
		ref.AccountTextVerification();

	}

	@Test(priority = 2)
	public void navigate_to_SetUrLocation() {
		webMobileLogin ref = new webMobileLogin(driver);
		ref.SetUrLocationButton();

	}

	@Test(dependsOnMethods = { "navigate_to_SetUrLocation" })
	public void enter_userAddress() throws InterruptedException {
		locationSet ref = new locationSet(driver);
		// ref.enterAddressName("Noida Sector 51");
		ref.enterAddressName("Noida Sector 63");

	}

	@Test(priority = 3)
	public void HomeScreenVerify() {
		HomeScreen ref = new HomeScreen(driver);
		ref.lostOfAllMainCats();
		Scrolling refs = new Scrolling(driver);
		refs.scrollDown(driver);
		refs.scrollUp(driver);

	}

	@Test(priority = 4)
	public void HomeScreenMainCatVerify() {
		HomeScreen ref = new HomeScreen(driver);
		ref.SalonAtHome();
//		Scrolling refs = new Scrolling(driver);
//		refs.scrollDown(driver);
//		refs.scrollUp(driver);
//	
	}

	@Test(priority = 5)
	public void SubCatsVerify() {
		CatsScreen ref = new CatsScreen(driver);
		ref.ClickBesSellers();

	}

	@Test(priority = 6)
	public void CircleSubCatsVerify() {
		CartScreen ref = new CartScreen(driver);
		ref.CircleSubCats();

	}

	@Test(priority = 7)

	public void ServiceSubHeadingVerify() {
		CartScreen ref = new CartScreen(driver);
		ref.ServiceSubHeading();
	}

	@Test(priority = 8)

	public void AllProductDetailsVerify() {
		CartScreen ref = new CartScreen(driver);
		ref.AllProductDetails();
	}

	@Test(priority = 9)

	public void AddToCartButtonClicked() {
		CartScreen ref = new CartScreen(driver);
		ref.AddToCartButtonClicked();
		// ref.ServiceTimeVerify();// particular service time
		// ref.ServicePriceVerify();// particular service price

	}

	@Test(priority = 10)

	public void AddToCartButtonClicked3() {
		CartScreen ref = new CartScreen(driver);
		ref.AddToCartButtonClicked3();
		// ref.ServiceTimeVerify();// particular service time
		// ref.ServicePriceVerify();// particular service price

	}

	@Test(priority = 9)

	public void AddToCartButtonClicked2() {
		CartScreen ref = new CartScreen(driver);
		ref.AddToCartButtonClicked2();
		// ref.ServiceTimeVerify();// particular service time
		// ref.ServicePriceVerify();// particular service price

	}

	@Test(priority = 10)

	public void TotalCostVerify() throws InterruptedException {
		CartScreen ref = new CartScreen(driver);
		ref.TotalCostVerify();
	}

	@Test(priority = 11)

	public void TotalTimeVerify() throws InterruptedException {
		CartScreen ref = new CartScreen(driver);
		ref.TotalTimeVerify();
		ref.TotalItemsVerify();// Items Quantity

	}

}
