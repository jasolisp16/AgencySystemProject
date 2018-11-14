package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[2]/a/span")
	private WebElement hotelb;
	@FindBy(xpath="/html/body/div[5]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
	private WebElement book1;
	
	public UserHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void click_Hotel()throws Throwable{
		hotelb.click();
	}

	 
}

