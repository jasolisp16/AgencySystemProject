package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import pages.HotelPage;
import utils.DriverFactory;

public class HotelPageStep extends DriverFactory{
	
	
	@And("^User views facilities$")
	public void facilities()throws Throwable{
		Assert.assertTrue(new HotelPage(driver).view_Facilities());
	}
	
	@And("^User views hotel$")
	public void search_Hotel()throws Throwable{
		Assert.assertTrue(new HotelPage(driver).view_Hotel());
	}
	
	@And("^User selects hotel$")
	public void sel_Hotel() throws Throwable{
		new HotelPage(driver).enter_Hotel();
	}

	
}
