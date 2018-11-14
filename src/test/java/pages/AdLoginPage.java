package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdLoginPage {

WebDriver driver;
	
	@FindBy(name = "email")
	private WebElement emailTextBox;
	@FindBy(name = "password")
	private WebElement passwordTextBox;
	@FindBy(xpath = "/html/body/div/form[1]/button")
	private WebElement loginButton;
	
	public AdLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_provides_the_email_as(String email) throws Throwable {
		emailTextBox.sendKeys(email);
	}
	
	public void he_provides_the_password_as(String password) throws Throwable {
		passwordTextBox.sendKeys(password);
	}
	
	public void he_chooses_to_login() throws Throwable {
		loginButton.click();
	}
}
