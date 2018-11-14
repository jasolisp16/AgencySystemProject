/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
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
}
