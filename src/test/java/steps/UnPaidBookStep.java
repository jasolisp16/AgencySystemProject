package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.UnpaidBookPage;
import utils.DriverFactory;

public class UnPaidBookStep extends DriverFactory{

	@Then("User goes to landing")
	private void go_ToLanding()throws Throwable{
		new UnpaidBookPage(driver).go_ToLanding();
	}
	
	@Then("^User should view ticket$")
	private void view_Ticket() throws Throwable{
		new UnpaidBookPage(driver).view_Ticket();
	}
	

}
