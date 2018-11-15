package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HotelDetailsPage;
import utils.DriverFactory;

public class HotelDetailsStep extends DriverFactory {
	
	@And("^User selects availvable room$")
	public void sel_Room() throws Throwable{
		Thread.sleep(2000);
		new HotelDetailsPage(driver).check_Box();
	}
	
	@Then("^User is redirected to confirmPage$")
	public void go_ToConfirm() throws Throwable{
		new HotelDetailsPage(driver).go_confirm();
		
	}
	
	@Then("^hotel should be visible for client$")
	public void hotel_should_be_visible_for_client() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(new HotelDetailsPage(driver).hotel_is_visible_for_client());
	}

}
