/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.AdminLoginPage;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AdminLoginPageSteps extends DriverFactory {
	
	@Given("^the user is on login page$")
	public void user_is_in_login_page() throws Throwable {
		driver.get(adminPage);
		driver.manage().window().maximize();
	}
	
	@And("^user provides email as ([^\"]*)$")
	public void user_provides_email_as(String email) throws Throwable {
		new AdminLoginPage(driver).user_provides_email_as(email);
	}
	
	@And("^user provides password as ([^\\\"]*)$")
	public void user_provides_password_as(String password) throws Throwable {
		new AdminLoginPage(driver).user_provides_password_as(password);
	}
	
	@When("^user logs in$")
	public void user_logs_in() throws Throwable {
		new AdminLoginPage(driver).user_logs_in();
	}
	

}
