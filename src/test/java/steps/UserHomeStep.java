package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.UserHomePage;
import utils.DriverFactory;

public class UserHomeStep extends DriverFactory{
	
	@And("^User is redirected to userhomepage, clicks to hotel$")
	public void go_ToLanding() throws Throwable{
		Thread.sleep(2000);
		new UserHomePage(driver).click_Hotel();
		}

	//@Then("^User should see hotel booking$")
//	public void check_booking()throws Throwable{
	//	new  
	//}
}
