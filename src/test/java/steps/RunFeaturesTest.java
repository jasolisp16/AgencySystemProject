package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author JoseAdrianSolisPerez
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
		tags= {"@UserBook-InvalidCupon"},
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml"})
public class RunFeaturesTest {

}
