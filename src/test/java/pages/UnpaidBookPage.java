package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnpaidBookPage {
	
	private WebDriver driver;
	//@FindBy(css="li.text-center:nth-child(1) > a:nth-child(1)")
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[1]/a")
	private WebElement landing;
	
	
	public UnpaidBookPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void go_ToLanding()throws Throwable{
		Thread.sleep(1200);
		landing.click();
	}
	
	public void view_Btickets() throws Throwable{
		Thread.sleep(10000);
		//Assert.assertTrue(driver.getTitle().contains("My Account"));
		Assert.assertTrue(driver.getTitle().contains("Invoice"));	
	}
}
