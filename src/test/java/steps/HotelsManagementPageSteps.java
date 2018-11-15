/**
 * 
 */
package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HotelsManagementPage;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class HotelsManagementPageSteps extends DriverFactory {
	
	@And("^user select add hotel$")
	public void user_select_add_hotel() throws Throwable {
		new HotelsManagementPage(driver).user_select_add_hotel();
	}
	
	@Then("^the hotel was created$")
	public void hotel_was_created() throws Throwable {
		Assert.assertTrue(new HotelsManagementPage(driver).hotel_was_created());
	}
}
