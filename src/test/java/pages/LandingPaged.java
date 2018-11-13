/**
 * 
 */
package pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class LandingPaged {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[1]/div/div[2]/a")
	private WebElement searchDiv;
	
	@FindBy(xpath = "/html/body/div[17]/div/input")
	private WebElement searchInput;
	
	@FindBy(xpath = "/html/body/div[17]/ul")
	private WebElement searchUList;
	
	@FindBy(name = "checkin")
	private WebElement checkInDateInput;
	
	@FindBy(name = "checkout")
	private WebElement checkOutDateInput;
	
	@FindBy(xpath = "/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[5]/button")
	private WebElement searchButton;
	
	public LandingPaged(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void client_searchs_for_the_hotel() throws Throwable {
		CommonUtils utilsDate = new CommonUtils();
		searchDiv.click();
		searchInput.sendKeys("4th Source");
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
		searchButton.click();
	}

}
