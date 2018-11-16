package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserConfirmBookPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[1]/div/div[3]/button")
	private WebElement confirmbook;
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[1]/div/form/div[3]/div[2]/div[2]/div[2]/input")
	private WebElement ccode;
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[1]/div/form/div[3]/div[2]/div[2]/div[3]/span")
	private WebElement acode;

	
	public UserConfirmBookPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void confirmbook() throws Throwable{
		confirmbook.click();
	}
	
	public void cupon_inCode()throws Throwable{
		Thread.sleep(1500);
		ccode.sendKeys("4THSRC");
		acode.click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	
	
	public void cupon_Code()throws Throwable{
		Thread.sleep(1500);
		ccode.sendKeys("4THSRC");
		acode.click();
	}
	
	

}
