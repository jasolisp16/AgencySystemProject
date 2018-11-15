package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailsPage {
	
	private WebDriver driver;
	JavascriptExecutor je;
	
	
	@FindBy(xpath="/html/body/div[5]/div[4]/section/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div")
	private WebElement checkbox;
	@FindBy(xpath="/html/body/div[5]/div[4]/section/div/button")
	private WebElement booknow;
	
	public HotelDetailsPage(WebDriver driver){
		this.driver=driver;
		je  = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	public void check_Box() throws Throwable{
		Thread.sleep(500);
		je.executeScript("arguments[0].scrollIntoView()", checkbox);
		Thread.sleep(500);
	    checkbox.click();
	}
	
	public void go_confirm() throws Throwable{
		booknow.click();
	}
	
	public boolean hotel_is_visible_for_client() throws Throwable {
		return booknow.isDisplayed();
	}
}
