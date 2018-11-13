/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
import pages.AddNewHotelPage;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AddNewHotelPageSteps extends DriverFactory {
	
	@And("^user fill general info$")
	public void user_fill_general_info() throws Throwable {
		new AddNewHotelPage(driver).select_elements("General");
	}
	
	@And("^user fill facilities info$")
	public void user_fill_facilities_info() throws Throwable {
		new AddNewHotelPage(driver).select_elements("Facilities");
	}
	
	@And("^user fill meta info$")
	public void user_fill_meta_info() throws Throwable {
		new AddNewHotelPage(driver).select_elements("Meta Info");
	}
	
	@And("^user fill policy info$")
	public void user_fill_policy_info() throws Throwable {
		new AddNewHotelPage(driver).select_elements("Policy");
	}
	
	@And("^user fill contac info$")
	public void user_fill_contact_info() throws Throwable {
		new AddNewHotelPage(driver).select_elements("Contact");
	}
	
	@And("^user fill translate info$")
	public void user_fill_translate_info() throws Throwable {
		new AddNewHotelPage(driver).select_elements("Translate");
	}
	
	@And("^user submit hotel info$")
	public void user_submit_hotel_info() throws Throwable {
		new AddNewHotelPage(driver).user_submit_hotel_info();
	}
}
