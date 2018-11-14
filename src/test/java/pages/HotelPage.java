package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HotelPage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[5]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[3]/a/button")
	private WebElement hdetails;
	@FindBy(xpath="/html/body/div[5]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[2]/div/ul")
	private WebElement facilitiesdis;
	
	public HotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public void enter_Hotel()throws Throwable{
			hdetails.click();
		
	}
	
	public boolean find_createdHotel()throws Throwable{
		return driver.findElement(By.cssSelector("a[href='https://www.phptravels.net/hotels/detail/merida/4th-source-premier-inn']")).isDisplayed();
	}
	
	public void view_Hotel()throws Throwable{
		//assertelementpresent
	}
	public boolean view_Facilities()throws Throwable{
		//verifyelementpresent
	        Thread.sleep(800);
	        return facilitiesdis.isDisplayed();
	    
		}
	
}
	
