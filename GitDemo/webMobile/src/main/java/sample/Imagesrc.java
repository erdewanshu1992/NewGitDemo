package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagesrc {
	public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      // identify image
	      WebElement l =driver.findElement(By.xpath("//img[@title='Tutorialspoint']"));
	      //getAttribute() to get src of image
	      System.out.println("Src attribute is: "+ l.getAttribute("src"));
	      driver.quit();
	   }

}
