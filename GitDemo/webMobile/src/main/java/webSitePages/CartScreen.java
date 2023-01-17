package webSitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartScreen {
	WebElement elemenet;
	WebDriver driver;
	
    	@CacheLookup
		@FindBy(xpath = "//span[@class='change_prdt']")
		WebElement ChangProduct;
    	@CacheLookup
		@FindBy(xpath = "//button[@class='done_btn']")
		WebElement Done;
    	@CacheLookup
		@FindBy(xpath = "//span[@class='remove_prdt']")
		WebElement Remove;
    	@CacheLookup
		@FindBy(xpath = "//button[@class='no_btn']")
		WebElement RemoveNo;
		
		public CartScreen(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
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
		

}
