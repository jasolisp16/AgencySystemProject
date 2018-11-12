package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HotelDetailsPage;
import utils.DriverFactory;

public class HotelDetailsStep extends DriverFactory {
	
	@And("^User selects availvable room$")
	public void sel_Room() throws Throwable{
		new HotelDetailsPage(driver).check_Box();
	}
	
	@Then("^User is redirected to confirmPage$")
	public void go_ToConfirm() throws Throwable{
		new HotelDetailsPage(driver).go_confirm();
		
	}

}
