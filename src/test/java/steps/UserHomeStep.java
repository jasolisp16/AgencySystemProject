package steps;


import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HotelPage;
import pages.UserHomePage;
import utils.DriverFactory;

public class UserHomeStep extends DriverFactory{
	
	@Then("^User is redirected to userhomepage$")
	public void userHomePage() throws Throwable{
		Thread.sleep(1450);
		new UserHomePage(driver).user_HomePageurl();
	}
	
	@And("^User clicks hotel button$")
	public void go_ToLanding() throws Throwable{
		Thread.sleep(2000);
		new UserHomePage(driver).click_Hotel();
		}

	@Then("^User is redirected$")
	public void assert_landing()throws Throwable{
		Thread.sleep(1450);
		new UserHomePage(driver).check_Landing();
		}
	
	@Then("^User should see hotel booking$")
	public void check_booking()throws Throwable{
		new UserHomePage(driver).check_Book();  
	}
}
