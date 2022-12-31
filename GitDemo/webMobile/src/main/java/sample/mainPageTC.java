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
		public void scrollDown() throws InterruptedException {
			mainPage mainPage = new mainPage(driver);
			mainPage.scrollDown(driver);

		}

		@Test(priority = 3)
		public void scrollUp() throws InterruptedException {
			mainPage mainPage = new mainPage(driver);
			mainPage.scrollUp(driver);

		}

		@Test(priority = 4)
		public void lostOfAllMainCats() throws InterruptedException {
			mainPage mainPage = new mainPage(driver);
			mainPage.lostOfAllMainCats();

		}
	}

