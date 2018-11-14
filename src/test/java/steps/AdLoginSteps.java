package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.AdLoginPage;
import utils.DriverFactory;

public class AdLoginSteps extends DriverFactory{
	
	@And("^he provides the email as ([^\"]*)$")
	public void he_provides_the_email_as(String email) throws Throwable {
		new AdLoginPage(driver).he_provides_the_email_as(email);
	}
	
	@And("^he provides the password as ([^\"]*)$")
	public void he_provides_the_password_as(String password) throws Throwable {
		new AdLoginPage(driver).he_provides_the_password_as(password);
	}
	
	@When("^he chooses to login$")
	public void he_chooses_to_login() throws Throwable {
		new AdLoginPage(driver).he_chooses_to_login();
	}

}
