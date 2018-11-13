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
public class RoomManagementPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/form/button")
	private WebElement addRoomButton;
	
	public RoomManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void user_select_add_room() throws Throwable {
		addRoomButton.click();
	}

}
