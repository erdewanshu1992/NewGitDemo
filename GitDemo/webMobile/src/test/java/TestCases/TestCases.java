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
	@Test(priority =1)
	public void navigate_to_SetUrLocation() {
		webMobileLogin ref = new webMobileLogin(driver);
		ref.SetUrLocationButton();

	}

	@Test(dependsOnMethods = { "navigate_to_SetUrLocation" })
	public void enter_userAddress() throws InterruptedException {
		locationSet ref = new locationSet(driver);
		ref.enterAddressName("Noida Sector 51");

	}
	@Test(priority = 2)
	public void HomeScreenVerify() {
		HomeScreen ref = new HomeScreen(driver);
		ref.lostOfAllMainCats();
		Scrolling refs = new Scrolling(driver);
		refs.scrollDown(driver);
		refs.scrollUp(driver);
		
	}
	@Test(priority = 3)
	public void HomeScreenMainCatVerify() {
		HomeScreen ref = new HomeScreen(driver);
		ref.SalonAtHome();
		Scrolling refs = new Scrolling(driver);
		refs.scrollDown(driver);
		refs.scrollUp(driver);
	
	}
	@Test(priority = 4)
	public void SubCatsVerify() {
		CatsScreen ref = new CatsScreen(driver);
		ref.ClickBesSellers();
		
	}
	@Test(priority = 5)
	public void CircleSubCatsVerify() {
		CartScreen ref = new CartScreen(driver);
		ref.CircleSubCats();
		
	}
	//@Test(dependsOnMethods = { "BestSellersVerify" })
	@Test(priority = 6)

	public void AddToCartButtonClicked() {
		CartScreen ref = new CartScreen(driver);
		ref.AddToCartButtonClicked();
		ref.ServiceTimeVerify();// particular service time
		ref.ServicePriceVerify();// particular service price

	}

	//@Test(dependsOnMethods = { "AddToCartButtonClicked" })
	@Test(priority = 7)

	public void PlusButtonVerify() {
		CartScreen ref = new CartScreen(driver);
		ref.PlusButtonVerify();

	}
	@Test(priority = 6)

	public void AddToCartButtonClicked2() {
		CartScreen ref = new CartScreen(driver);
		ref.AddToCartButtonClicked2();
		ref.ServiceTimeVerify();// particular service time
		ref.ServicePriceVerify();// particular service price

	}

	//@Test(dependsOnMethods = { "PlusButtonVerify" })
	@Test(priority = 8)

	public void TotalCostVerify() throws InterruptedException {
		CartScreen ref = new CartScreen(driver);
		ref.TotalCostVerify();
		// webMainPage.TotalTimeVerify();

	}

	//@Test(dependsOnMethods = { "TotalCostVerify" })
	@Test(priority = 9)

	public void TotalTimeVerify() throws InterruptedException {
		CartScreen ref = new CartScreen(driver);
		ref.TotalTimeVerify();
		ref.TotalItemsVerify();// Items Quantity

	}

}
