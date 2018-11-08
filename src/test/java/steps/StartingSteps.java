/**
 * 
 */
package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import utils.DriverFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class StartingSteps {
	
	private WebDriver driver;
	private DriverFactory df;
	
	@Before
	public void beforeScenario() {
		driver = df.getDriver();
	}
	

}
