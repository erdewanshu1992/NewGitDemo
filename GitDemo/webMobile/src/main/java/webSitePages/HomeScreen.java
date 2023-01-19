package webSitePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//div[@class='cat_card']")
	List<WebElement> MainCats;
	@CacheLookup
	@FindBy(xpath = "(//div[@class='cat_card'])[1]")
	WebElement SalonAtHome;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void lostOfAllMainCats() throws InterruptedException {
		List<WebElement> myElements = MainCats;
        System.out.println("Size of List: "+myElements.size());
        WebElement e1 = null;
        for(WebElement e : myElements) 
        {        
        	String CatLists = e.getText();
			CatLists = CatLists.replaceAll("\\n", " ");
            //System.out.print("Main Categories Name :" +e.getText()+"\t");
            if (CatLists.contains("Salon At Home"))
            {
            	System.out.println("***************Inside**********");
            	e1 = e;
            	
            }
			System.out.println("Main Categorie Name :" +CatLists);
            
        }
        
		if (e1 != null) {
			Thread.sleep(5000);
			e1.click();
		}
//		List<WebElement> allCats = MainCats;
//		System.out.println(allCats.size());
//
//		for (WebElement lostOfAllMainCats : allCats) {
//			String CatLists = lostOfAllMainCats.getText();
//			CatLists = CatLists.replaceAll("\\n", " ");
//			System.out.println(CatLists);
//		}

	}

//	public void SalonAtHome() {
//		SalonAtHome.click();

//	}

}
