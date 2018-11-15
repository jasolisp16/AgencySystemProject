package pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;

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
	@FindBy (xpath="/html/body/div[9]/div[1]/table/tbody/tr[5]/td[4]")
	private WebElement datein;
	@FindBy (xpath="/html/body/div[10]/div[1]/table/tbody/tr[6]/td[6]")
	private WebElement checkoutButton;
	@FindBy(xpath="/html/body/div[10]/div[1]/table/tbody/tr[2]/td[7]")
	private WebElement dateout;
	
	@FindBy (xpath ="/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[5]")
	private WebElement search;
	
	@FindBy(xpath = "/html/body/div[17]/ul")
	private WebElement searchUList;
	
	@FindBy(name = "checkin")
	private WebElement checkInDateInput;
	
	@FindBy(name = "checkout")
	private WebElement checkOutDateInput;
	
	
	
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
	

  public void client_searchs_for_the_hotel() throws Throwable {
		CommonUtils utilsDate = new CommonUtils();
		hotelButton.click();
		hotelin.sendKeys("4th Source");
		Thread.sleep(2000);
		List<WebElement> searchResults = searchUList.findElements(By.tagName("li"));
		searchResults.get(0).click();
		Date idate = utilsDate.getRandomInitDate();
		Date edate = utilsDate.getRandomEndDate(idate);
		
		checkInDateInput.sendKeys(utilsDate.convertDateToString(idate));
		checkInDateInput.click();
		checkOutDateInput.sendKeys(utilsDate.convertDateToString(edate));
		checkOutDateInput.click();
		Thread.sleep(2000);
		search.click();
	}
}
