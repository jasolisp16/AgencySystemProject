package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserConfirmBookPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[1]/div/div[3]/button")
	private WebElement confirmbook;

	
	public UserConfirmBookPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void confirmbook() throws Throwable{
		confirmbook.click();
	}
	

}
