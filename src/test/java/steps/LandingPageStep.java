package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LandingPage;
import utils.DriverFactory;

public class LandingPageStep extends DriverFactory {
	

	
	@Given("^User enters to landingPage$")
	public void setup() throws Throwable{
		driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
	}
	
	@When("^User access UserLogPage$")
	public void move_ToUserPage() throws Throwable{
		new LandingPage(driver).click_To_UserLogin();
	}
	
	@And("^User enters city$")
	public void sel_city()throws Throwable{
		Thread.sleep(200);
		new LandingPage(driver).input_city();
	}

	@And("^User picks check in and check out date$")
	public void sel_date() throws Throwable{
		new LandingPage(driver).input_Date();
	}
	
	@Then("^User searches hotel$")
	public void search()throws Throwable{
		new LandingPage(driver).go_ToSearchHotel();
	}

}
