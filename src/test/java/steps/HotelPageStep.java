package steps;

import cucumber.api.java.en.And;
import pages.HotelPage;
import utils.DriverFactory;

public class HotelPageStep extends DriverFactory{
	
	@And("^User selects hotel$")
	public void sel_Hotel() throws Throwable{
		new HotelPage(driver).enter_Hotel();
	}

}
