/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AdminLoginPage {
	
	WebDriver driver;
	
	@FindBy(name = "email")
	private WebElement emailTextBox;
	
	@FindBy(name = "password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "/html/body/div/form[1]/button")
	private WebElement loginButton;
	
	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void user_provides_email_as(String userName) throws Throwable{
		emailTextBox.sendKeys(userName);
	}
	
	public void user_provides_password_as(String password) throws Throwable {
		passwordTextBox.sendKeys(password);
	}
	
	public void user_logs_in() throws Throwable {
		loginButton.click();
	}

}
