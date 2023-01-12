package webSitePages;

import org.testng.annotations.Test;

public class TestCases extends AndroidChromeTest {
	@Test
	public void navigate_to_SetUrLocation() {
		webMobileLogin ref = new webMobileLogin(driver);
		ref.SetUrLocationButton();

	}

	@Test(dependsOnMethods = { "navigate_to_SetUrLocation" })
	public void enter_userAddress() throws InterruptedException {
		locationSet ref = new locationSet(driver);
		ref.enterAddressName("B 117 Noida Sector 63");

	}

}
