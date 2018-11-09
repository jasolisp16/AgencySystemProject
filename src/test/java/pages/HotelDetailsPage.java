package pages;


import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailsPage {
	
	private WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	/*@FindBy(xpath="/html/body/div[5]/div[4]/section/div/table/tbody/tr[3]/td/div[2]/div[2]/div/div[3]/div/label/div")
	private WebElement xcb;*/
	
	@FindBy(name="rooms[]")
	private List<WebElement> checkbox;
	
	public HotelDetailsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void check_Box() throws Throwable{
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,250)", "");
		//jse2.executeScript("arguments[0].scrollIntoView()", myelement)
		//"window.scrollBy(0,250)", "")
		 Random room = new Random();
	        int idx = room.nextInt(checkbox.size());
	        checkbox.get(idx).click();
	
	}
}
