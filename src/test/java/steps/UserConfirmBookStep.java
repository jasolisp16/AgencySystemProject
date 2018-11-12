package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.UserConfirmBookPage;
import utils.DriverFactory;

public class UserConfirmBookStep extends DriverFactory {
	
	@Then("^User confirms booking$")
	public void confirm() throws Throwable{
		new UserConfirmBookPage(driver).confirmbook();
	}
	
}
