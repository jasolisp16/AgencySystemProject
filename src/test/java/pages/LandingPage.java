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
	
	@FindBy (xpath="/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[1]/div/div[2]/a")
	private WebElement hotelButton;	
	@FindBy (xpath="/html/body/div[17]/div/input")
	private WebElement hotelin;
	@FindBy (xpath="/html/body/div[17]/ul/li/ul/li[1]")
	private WebElement midhotel;
	
	@FindBy (xpath="/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[2]/div/input")
	private WebElement checkinButton;
	@FindBy (xpath="/html/body/div[9]/div[1]/table/tbody/tr[2]/td[6]")
	private WebElement datein;
	@FindBy (xpath="/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[3]/div/input")
	private WebElement checkoutButton;
	@FindBy(xpath="/html/body/div[10]/div[1]/table/tbody/tr[2]/td[7]")
	private WebElement dateout;
	
	@FindBy (xpath ="/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[5]")
	private WebElement search;
	
	
	
	 public LandingPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	public void click_To_UserLogin() throws Throwable{
		myaccount.click();
		login.click();
		
	}
	
	public void input_city()throws Throwable{
		hotelButton.click();
		hotelin.sendKeys("Merida");
		Thread.sleep(1490);
		midhotel.click();
	}

	public void input_Date() throws Throwable{
		checkinButton.click();
		datein.click();
		checkoutButton.click();
	}
	
	public void go_ToSearchHotel() throws Throwable{
		Thread.sleep(250);
		search.click();
	}
}
