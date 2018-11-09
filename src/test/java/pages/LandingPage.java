package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	@FindBy (xpath= "/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")
	private WebElement myaccount;
	@FindBy (xpath = "/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[1]/a")
	private WebElement login;
	
	 public LandingPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	public void click_To_UserLogin() throws Throwable{
		myaccount.click();
		login.click();
	}

}
