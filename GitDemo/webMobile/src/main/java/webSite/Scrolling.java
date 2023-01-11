package webSite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Scrolling {

	public Scrolling(WebDriver driver) {
	}

	public void scrollDown(WebDriver driver) {
		try {
			int i = 0;
			for (; i <= 100; i++) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
			for (; i > 0; i--) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
		} catch (WebDriverException wde) {
		} catch (Exception e) {
		}
	}

	/**
	 * scrollUp() method scrolls up the page.
	 *
	 * @return void
	 */
	public void scrollUp(WebDriver driver) {
		try {
			int i = 0;
			for (; i > -100; i--) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
			for (; i < 0; i++) {
				((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			}
		} catch (WebDriverException wde) {
		} catch (Exception e) {
		}
	}

}
