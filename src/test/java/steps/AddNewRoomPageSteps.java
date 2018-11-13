/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.AddNewRoomPage;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AddNewRoomPageSteps extends DriverFactory {
	
	@And("^user fill room general info$")
	public void user_fill_room_general_info() throws Throwable {
		new AddNewRoomPage(driver).select_elements("General");
	}
	
	@And("^user fill room amenities info$")
	public void user_fill_room_amenities_info() throws Throwable {
		new AddNewRoomPage(driver).select_elements("Amenities");
	}
	
	@And("^user fill room translate info$")
	public void user_fill_room_translate_info() throws Throwable {
		new AddNewRoomPage(driver).select_elements("Translate");
	}
	
	@When("^user submit room info$")
	public void user_submit_room_info() throws Throwable {
		new AddNewRoomPage(driver).user_submit_room_info();
	}

}
