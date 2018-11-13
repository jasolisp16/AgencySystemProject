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
public class HotelsManagementPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/form/button")
	private WebElement addHotelButton;
	
	public HotelsManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void user_select_add_hotel() throws Throwable {
		addHotelButton.click();
	}

}
