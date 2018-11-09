package pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class HotelDetailsStep extends DriverFactory {
	
	@And("^User selects availvable room$")
	public void sel_Room() throws Throwable{
		new HotelDetailsPage(driver).check_Box();
	}

}
