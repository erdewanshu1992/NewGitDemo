package sample;

import org.testng.annotations.Test;

public class mainPageTC extends AndroidChromeTest {
	@Test
	public void navigate_to_SetUrLocation() {
		mainPage MainPage = new mainPage(driver);
		MainPage.SetUrLocationButton();

	}

	@Test(dependsOnMethods = { "navigate_to_SetUrLocation" })
	public void enter_userAddress() throws InterruptedException {
		mainPage mainPage = new mainPage(driver);
		mainPage.enterAddressName("B117 Noida Sector 63");

	}

	@Test(priority = 2)
	public void Scrolling() {
		Scrolling ref = new Scrolling(driver);
		ref.scrollDown(driver);
		ref.scrollUp(driver);

	}

	@Test(priority = 4)
	public void lostOfAllMainCats() {
		mainPage mainPage = new mainPage(driver);
		mainPage.lostOfAllMainCats();
		

	}

	@Test(priority = 5)
	public void SalonAtHome() {
		mainPage mainPage = new mainPage(driver);
		mainPage.SalonAtHome();
		Scrolling ref = new Scrolling(driver);
		ref.scrollDown(driver);
		ref.scrollUp(driver);
	}

	@Test(priority = 6)
	public void BesSellerClick() {
		mainPage mainPage = new mainPage(driver);
		mainPage.ClickBesSellers();
		
	}

	@Test(priority = 7)
	public void CircleSubCats() {
		mainPage mainPage = new mainPage(driver);
		mainPage.CircleSubCats();
		Scrolling ref = new Scrolling(driver);
		ref.scrollDown(driver);
		ref.scrollUp(driver);
		

	}
}

//@Test(priority = 3)
//public void scrollUp() {
//	mainPage mainPage = new mainPage(driver);
//	mainPage.scrollUp(driver);
//
//}
