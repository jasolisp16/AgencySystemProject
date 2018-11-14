/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AdminHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/aside/div/div[6]/div/ul/li[7]/a")
	private WebElement hotelOpLi;	
	
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void user_selects_hotels_option() throws Throwable {
		hotelOpLi.click();
		driver.findElement(By.cssSelector("a[href='https://www.phptravels.net/admin/hotels']")).click();
	}
	
	public void user_selects_rooms_option() throws Throwable {
		hotelOpLi.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='https://www.phptravels.net/admin/hotels/rooms']")).click();
	}
	
	public void admin_user_logs_out() throws Throwable {
		driver.findElement(By.cssSelector("a[href='https://www.phptravels.net/admin/logout']")).click();
	}

}
