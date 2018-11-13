/**
 * 
 */
package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.LandingPaged;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class LandingPagedSteps extends DriverFactory {
	
	@And("^user visits landing page as a client$")
	public void user_visits_landing_page_as_a_client() throws Throwable {
		driver.get(userPage);
		driver.manage().window().maximize();
	}
	
	@When("^client searchs for the hotel$")
	public void client_searchs_for_the_hotel() throws Throwable {
		Thread.sleep(10000);
		new LandingPaged(driver).client_searchs_for_the_hotel();
	}

}
