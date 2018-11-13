/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
import pages.AdminHomePage;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AdminHomePageSteps extends DriverFactory {
	
	@And("^user select the hotel tab$")
	public void user_select_the_hotel_tab() throws Throwable {
		Thread.sleep(10000);
		new AdminHomePage(driver).user_selects_hotels_option();
	}
	
	@And("^user select rooms option")
	public void user_select_rooms_option() throws Throwable {
		Thread.sleep(10000);
		new AdminHomePage(driver).user_selects_rooms_option();
	}
	
	@And("^admin user logs out$")
	public void admin_user_logs_out() throws Throwable {
		Thread.sleep(5000);
		new AdminHomePage(driver).admin_user_logs_out();
	}

}
