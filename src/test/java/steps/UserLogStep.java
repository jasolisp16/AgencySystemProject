package steps;

import cucumber.api.java.en.And;
import pages.UserLogPage;
import utils.DriverFactory;

public class UserLogStep extends DriverFactory{
	
	@And("^User enter with email as ([^\"]*)$")
	public void signIn(String emailu)throws Throwable{
		new UserLogPage(driver).user_In(emailu);
	}
}
