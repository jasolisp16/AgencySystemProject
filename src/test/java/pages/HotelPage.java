package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[5]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[3]/a/button")
	private WebElement hdetails;
	
	public HotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public void enter_Hotel()throws Throwable{
		hdetails.click();
	}
}
	
