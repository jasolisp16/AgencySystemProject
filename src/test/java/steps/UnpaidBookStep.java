package steps;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UnpaidBookPage;
import utils.DriverFactory;

public class UnpaidBookStep extends DriverFactory{
	
	@And("^User should view ticket$")
	public void view_Ticket() throws Throwable{
		new UnpaidBookPage(driver).view_Btickets();
	}

	@Then("User goes to landing")
	public void go_ToLanding()throws Throwable{
		new UnpaidBookPage(driver).go_ToLanding();
	}
	


}
