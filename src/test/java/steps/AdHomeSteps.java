package steps;

import cucumber.api.java.en.And;
import pages.AdHomePage;
import utils.DriverFactory;

public class AdHomeSteps extends DriverFactory{

	@And("^he continues to Coupons menu$")
	public void he_continues_to_Coupon_menu() throws Throwable {
		new AdHomePage(driver).he_continues_to_Coupon_menu();
	}
}
