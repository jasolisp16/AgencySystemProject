package steps;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.LandingPage;
import utils.DriverFactory;

public class LandingPageStep extends DriverFactory {
	

	 
	@Given("^User enters to landingPage$")
	public void setup() throws Throwable{
		driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
	}
	
	@And("^User access UserLogPage$")
	public void move_ToUserPage() throws Throwable{
		new LandingPage(driver).click_To_UserLogin();
	}
	

}
