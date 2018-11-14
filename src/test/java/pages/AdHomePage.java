package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdHomePage {
	
	WebDriver driver;
	
	@FindBy(css = "a[href='https://www.phptravels.net/admin/coupons/']")
	private WebElement couponButton;
	
	public AdHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_continues_to_Coupon_menu() throws Throwable {
		couponButton.click();
	}

}
