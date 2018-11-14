package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class StartingStepsCupon extends DriverFactory{
	
	@Before
	public void presetup() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^the user is on admin login page$")
	public void setup() throws Throwable {
		driver.get(adminPage);
		driver.manage().window().maximize();
	}

}
