package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogPage {
	
	WebDriver driver; 
	
	@FindBy(name="username")
	private WebElement emailin;
	@FindBy (name="password")
	private WebElement passin;
	@FindBy (xpath ="/html/body/div[5]/div[1]/div[1]/form/button")
	private WebElement loginb;
	
	
	public UserLogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public void user_In(String emailu)throws Throwable{
		emailin.sendKeys(emailu);
		passin.sendKeys("demouser");
		loginb.click();
	}
	
}
