/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
import pages.RoomManagementPage;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class RoomManagementPageSteps extends DriverFactory {
	
	@And("^user select add room$")
	public void user_select_add_room() throws Throwable {
		new RoomManagementPage(driver).user_select_add_room();
	}

}
